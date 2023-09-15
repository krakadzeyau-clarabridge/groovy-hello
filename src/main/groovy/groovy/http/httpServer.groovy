package groovy.http

import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpServer

import java.time.LocalDateTime

final int PORT = 8080

HttpServer.create(new InetSocketAddress(PORT), 0).with { HttpServer server ->
    println "Server is listening on port [${PORT}]. Press Ctrl+C to exit."

    createContext("/") { HttpExchange http ->
        http.responseHeaders.add("Content-type", "text/plain")
        http.sendResponseHeaders(200, 0)
        http.responseBody.withWriter { Writer out ->
            out << LocalDateTime.now()
        }
        println "Request from [${http.remoteAddress.hostName}:${http.remoteAddress.port}]."
    }

    start()
}
