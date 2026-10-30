// Theme switching, search and anchor flashing for the static docs pages.
// The flashing follows DenizenMetaWebsite's flasher.js (MIT License, Copyright (c) 2021-2026 The Denizen Script Team).
(function () {
    var THEMES = {
        dark: {
            bootstrap: "https://cdn.jsdelivr.net/npm/bootswatch@4.5.3/dist/darkly/bootstrap.min.css",
            colors: "css/theme/colors_dark.css",
            footer: "Theme: Standard Dark, created by Alex 'mcmonkey' Goodwin. Made using the <a href=\"https://bootswatch.com/darkly/\">Darkly Bootstrap Theme</a> by Thomas Park (MIT License)."
        },
        light: {
            bootstrap: "https://cdn.jsdelivr.net/npm/bootswatch@4.6.0/dist/litera/bootstrap.min.css",
            colors: "css/theme/colors_light.css",
            footer: "Theme: Quite Light, created by Alex 'mcmonkey' Goodwin. Made using the <a href=\"https://bootswatch.com/litera/\">Litera Bootstrap Theme</a> by Thomas Park (MIT License)."
        }
    };
    var root = document.documentElement.getAttribute("data-root") || "";
    var currentTheme = "dark";

    function storedTheme() {
        try {
            return localStorage.getItem("meta_theme") === "light" ? "light" : "dark";
        }
        catch (e) {
            return "dark";
        }
    }

    function applyTheme(name) {
        var theme = THEMES[name];
        currentTheme = name;
        document.getElementById("bootstrap_css").href = theme.bootstrap;
        document.getElementById("theme_css").href = root + theme.colors;
        var footer = document.getElementById("theme_footer");
        if (footer) {
            footer.innerHTML = theme.footer;
        }
    }

    // Runs from <head>, right after the stylesheet links, so a stored light theme loads before the first paint.
    applyTheme(storedTheme());

    window.changetheme = function (name) {
        try {
            localStorage.setItem("meta_theme", name);
        }
        catch (e) {
        }
        applyTheme(name);
    };

    function doFlashFor(id) {
        var element = document.getElementById(id);
        if (!element) {
            return;
        }
        var flasher = document.createElement("span");
        flasher.className = "flasher_tool flash";
        element.appendChild(flasher);
        setTimeout(function () {
            flasher.remove();
        }, 2100);
        setTimeout(function () {
            window.scroll(0, element.getBoundingClientRect().top + window.pageYOffset - window.innerHeight / 2);
        }, 10);
    }
    window.doFlashFor = doFlashFor;

    function flashHash() {
        var target = decodeURIComponent(window.location.hash.substring(1));
        if (target) {
            doFlashFor(target);
        }
    }

    function bindSearch(id, target) {
        var bar = document.getElementById(id);
        if (!bar) {
            return;
        }
        bar.addEventListener("keydown", function (e) {
            if (e.key === "Enter") {
                document.location.href = target + "?q=" + encodeURIComponent(bar.value.trim());
            }
        });
    }

    function getNames(entry) {
        return entry.getAttribute("data-names").split("|");
    }

    // Like the meta website: an exact name match shows only that, otherwise anything whose name or text contains the query.
    function filterEntries() {
        var entries = Array.prototype.slice.call(document.querySelectorAll(".meta_entry"));
        var counter = document.getElementById("shown_count");
        if (!counter) {
            return;
        }
        var isSearchPage = document.body.hasAttribute("data-search-page");
        var query = (new URLSearchParams(window.location.search).get("q") || "").trim().toLowerCase();
        var pageBar = document.getElementById(isSearchPage ? "top_search_bar" : "search_bar");
        if (pageBar && query) {
            pageBar.value = query;
        }
        var shown;
        if (!query) {
            shown = isSearchPage ? [] : entries;
        }
        else {
            shown = entries.filter(function (entry) {
                return getNames(entry).indexOf(query) !== -1;
            });
            if (shown.length === 0) {
                shown = entries.filter(function (entry) {
                    return getNames(entry).some(function (name) {
                        return name.indexOf(query) !== -1;
                    }) || entry.getAttribute("data-text").indexOf(query) !== -1;
                });
            }
        }
        entries.forEach(function (entry) {
            entry.hidden = shown.indexOf(entry) === -1;
        });
        var visibleCategories = 0;
        document.querySelectorAll(".meta_category").forEach(function (category) {
            category.hidden = !category.querySelector(".meta_entry:not([hidden])");
            if (!category.hidden) {
                visibleCategories++;
            }
            var link = document.querySelector(".category_link[data-category=\"" + category.getAttribute("data-category") + "\"]");
            if (link) {
                link.hidden = category.hidden;
            }
        });
        // A single category needs no header, as on the meta website.
        document.querySelectorAll(".categories_box, .category_header").forEach(function (element) {
            element.hidden = visibleCategories <= 1;
        });
        document.querySelectorAll(".meta_type_section").forEach(function (section) {
            section.hidden = !section.querySelector(".meta_entry:not([hidden])");
        });
        var total = counter.getAttribute("data-total");
        var noun = counter.getAttribute("data-noun");
        if (isSearchPage) {
            counter.textContent = query ? "Found " + shown.length + " results for '" + query + "'" : "Type something in the search bar at the top.";
        }
        else {
            counter.textContent = query ? "Showing " + shown.length + " out of " + total + " " + noun + "..." : "Showing all " + total + " " + noun + "...";
        }
    }

    document.addEventListener("click", function (e) {
        var toggle = e.target.closest(".dropdown-toggle");
        document.querySelectorAll(".dropdown-menu.show").forEach(function (menu) {
            if (!toggle || menu !== toggle.nextElementSibling) {
                menu.classList.remove("show");
            }
        });
        if (toggle) {
            e.preventDefault();
            toggle.nextElementSibling.classList.toggle("show");
        }
    });

    document.addEventListener("DOMContentLoaded", function () {
        applyTheme(currentTheme);
        bindSearch("top_search_bar", root + "Docs/Search.html");
        bindSearch("search_bar", window.location.pathname);
        filterEntries();
        flashHash();
    });
    window.addEventListener("hashchange", flashHash);
})();
