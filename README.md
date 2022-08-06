WarmRoast
=========

WarmRoast is an easy-to-use CPU sampling tool for JVM applications, but particularly suited for Minecraft servers/clients.

* Adjustable sampling frequency.
* Supports loading MCP mappings for deobfuscating class and method names.
* Web-based — perform the profiling on a remote server and view the results in your browser.
 * Collapse and expand nodes to see details.
 * Easily view CPU usage per method at a glance.
 * Hover to highlight all child methods as a group.
 * See the percentage of CPU time for each method relative to its parent methods.
 * Maintains style and function with use of "File -> Save As" (in tested browsers).
 
Java 17 and above is required to use current fork of WarmRoast.

Screenshots
-----------

![Sample output](http://i.imgur.com/Iy7kJ7f.png)

Usage
-----

1. Note the path of your JDK.

2. Download WarmRoast.

3. Replace `PATH_TO_JDK` in the following commands with the path to your JDK and execute the program.

**Note:** The example command line below includes `--thread "Server thread"`, which filters all threads but the main server thread. You can remove it to show all threads.

**Modded/vanilla servers:** If you are using a modded server, get a copy of [MCP](http://mcp.ocean-labs.de/index.php/MCP_Releases) for your server's Minecraft version, copy the files from conf/ somewhere, and point WarmRoast to it with `--mappings path/to/folder`. This helps readability a lot. Bukkit uses its own mapping, so a pure non-modded Bukkit server can't use MCP mappings.

### How to Run ###

    java WarmRoast-1.0-SNAPSHOT.jar com.sk89q.warmroast.WarmRoast --thread "Server thread"

* Or execute this command with thread is set by default to "Server thread"


    java -jar WarmRoast-1.0-SNAPSHOT.jar

Parameters
----------

    Usage: warmroast [options]
      Options:
        --bind
           The address to bind the HTTP server to
           Default: 0.0.0.0
           
        -h, --help
           Default: false
           
        --interval
           The sample rate, in milliseconds
           Default: 100
           
        -m, --mappings
           A directory with joined.srg and methods.csv
           
        --name
           The name of the VM to attach to
           
        --pid
           The PID of the VM to attach to
           
        -p, --port
           The port to bind the HTTP server to
           Default: 23000
           
        -t, --thread
           Optionally specify a thread to log only
           
        --timeout
           The number of seconds before ceasing sampling (optional)

Hint: `--thread "Server thread"` is useful for Minecraft servers.

License
-------

The project is licensed under the GNU General Public License, version 3.
