    // <--[command]
    // @Name Run_async
    // @Syntax run_async [<script>] (path:<name>) (def:<element>|.../defmap:<map>/def.<name>:<value>) (id:<name>) (delay:<value>)
    // @Required 1
    // @Maximum -1
    // @Short Runs a script in a new async queue.
    // @Guide https://guide.denizenscript.com/guides/basics/run-options.html
    // @Group queue
    //
    // @Warning Experimental! Use with extreme caution!
    // @Warning Most commands are not compatible with async execution.
    //
    // @Description
    // Runs a script in a new async queue.
    //
    // You must specify a script object to run.
    //
    // Optionally, use the "path:" argument to choose a specific sub-path within a script.
    //
    // Optionally, use the "def:" argument to specify definition values to pass to the script,
    // the definitions will be named via the "definitions:" script key on the script being ran,
    // or numerically in order if that isn't specified (starting with <[1]>).
    //
    // Alternately, use "defmap:<map>" to specify definitions to pass as a MapTag, where the keys will be definition names and the values will of course be definition values.
    //
    // Alternately, use "def.<name>:<value>" to define one or more  named definitions individually.
    //
    // Optionally, use the "delay:" argument to specify a delay time before the script starts running.
    //
    // Optionally, specify the "id:" argument to choose a custom queue ID to be used.
    // If none is specified, a randomly generated one will be used. Generally, don't use this argument.
    //
    // The run command is ~waitable. Refer to <@link language ~waitable>.
    //
    // @Tags
    // <entry[saveName].created_queue> returns the queue that was started by the run command.
    //
    // @Usage
    // Use to run a task script named 'MyTask'.
    // - run_async MyTask
    //
    // @Usage
    // Use to run a task script named 'MyTask' that isn't normally instant, instantly.
    // - run_async MyTask instantly
    //
    // @Usage
    // Use to run a local subscript named 'alt_path'.
    // - run_async <script> path:alt_path
    //
    // @Usage
    // Use to run 'MyTask' and pass 3 definitions to it.
    // - run_async MyTask def:A|Second_Def|Taco
    //
    // @Usage
    // Use to run 'MyTask' and pass 3 named definitions to it.
    // - run_async MyTask def.count:5 def.type:Taco def.smell:Tasty
    //
    // @Usage
    // Use to run 'MyTask' and pass a list as a single definition.
    // - run_async MyTask def:<list_single[<list[a|big|list|here]>]>
    // # MyTask can then get the list back by doing:
    // - define mylist <[1]>
    //
    // -->

