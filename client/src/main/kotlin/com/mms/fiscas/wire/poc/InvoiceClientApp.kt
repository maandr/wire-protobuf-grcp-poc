package com.mms.fiscas.wire.poc

import com.mms.fiscas.wire.poc.proto.GrpcInvoiceServiceClient
import com.mms.fiscas.wire.poc.proto.InvoiceRequest
import com.squareup.wire.GrpcClient
import okhttp3.OkHttpClient
import okhttp3.Protocol

class InvoiceClientApp {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val serverUrl = "http://localhost:50051"
            val grpcClient = GrpcClient.Builder()
                .client(OkHttpClient.Builder().protocols(listOf(Protocol.H2_PRIOR_KNOWLEDGE)).build())
                .baseUrl(serverUrl)
                .build()

            val request = InvoiceRequest(invoiceId = "foo")
            println("Sending an invoice request $request to $serverUrl")
            val response = GrpcInvoiceServiceClient(grpcClient)
                .GetInvoice()
                .executeBlocking(request)
            println("Received response $response from $serverUrl")
        }
    }
}
