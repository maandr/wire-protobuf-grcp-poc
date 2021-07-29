package com.mms.fiscas.wire.poc

import io.grpc.ServerBuilder

class InvoiceServerApp {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            ServerBuilder
                .forPort(50051)
                //.addService(InvoiceServer())
                .build()
            .start()
            .awaitTermination()
        }
    }
}
