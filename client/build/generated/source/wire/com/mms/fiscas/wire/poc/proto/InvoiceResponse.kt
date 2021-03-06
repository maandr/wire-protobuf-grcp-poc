// Code generated by Wire protocol buffer compiler, do not edit.
// Source: com.mms.fiscas.wire.poc.proto.InvoiceResponse in invoice.proto
package com.mms.fiscas.wire.poc.proto

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.missingRequiredFields
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmField
import okio.ByteString

public class InvoiceResponse(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REQUIRED
  )
  public val invoiceId: String,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.REQUIRED
  )
  public val amount: Long,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<InvoiceResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is InvoiceResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (invoiceId != other.invoiceId) return false
    if (amount != other.amount) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + invoiceId.hashCode()
      result = result * 37 + amount.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    result += """invoiceId=${sanitize(invoiceId)}"""
    result += """amount=$amount"""
    return result.joinToString(prefix = "InvoiceResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(
    invoiceId: String = this.invoiceId,
    amount: Long = this.amount,
    unknownFields: ByteString = this.unknownFields
  ): InvoiceResponse = InvoiceResponse(invoiceId, amount, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<InvoiceResponse> = object : ProtoAdapter<InvoiceResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      InvoiceResponse::class, 
      "type.googleapis.com/com.mms.fiscas.wire.poc.proto.InvoiceResponse", 
      PROTO_2, 
      null
    ) {
      public override fun encodedSize(`value`: InvoiceResponse): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.invoiceId)
        size += ProtoAdapter.INT64.encodedSizeWithTag(2, value.amount)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: InvoiceResponse): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.invoiceId)
        ProtoAdapter.INT64.encodeWithTag(writer, 2, value.amount)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): InvoiceResponse {
        var invoiceId: String? = null
        var amount: Long? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> invoiceId = ProtoAdapter.STRING.decode(reader)
            2 -> amount = ProtoAdapter.INT64.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return InvoiceResponse(
          invoiceId = invoiceId ?: throw missingRequiredFields(invoiceId, "invoiceId"),
          amount = amount ?: throw missingRequiredFields(amount, "amount"),
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: InvoiceResponse): InvoiceResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
