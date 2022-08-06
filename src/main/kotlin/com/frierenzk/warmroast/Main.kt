package com.frierenzk.warmroast

import com.sk89q.warmroast.WarmRoast
import kotlinx.coroutines.coroutineScope

suspend fun main(args: Array<String>) = coroutineScope {
    if ((!args.contains("--thread")) && (!args.contains("-t")))
        WarmRoast.main(args + arrayOf("--thread", "Server thread"))
    else WarmRoast.main(args)
}