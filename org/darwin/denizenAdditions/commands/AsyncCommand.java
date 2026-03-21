    // <--[command]
    // @Name Async
    // @Syntax async [<commands>]
    // @Required 0
    // @Maximum 1
    // @Short Runs commands asynchronously (in a separate thread).
    // @Group queue
    // @Warning Experimental! Use only with commands known to be thread-safe.
    // @Description
    // Runs all commands inside the following block asynchronously in a worker thread.
    // The block inherits definitions and context from the current queue.
    // If the calling entry used ~waitable, the parent entry will wait until the async block finishes.
    // -->

