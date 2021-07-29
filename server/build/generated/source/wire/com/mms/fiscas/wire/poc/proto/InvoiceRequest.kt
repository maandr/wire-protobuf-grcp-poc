// Code generated by Wire protocol buffer compiler, do not edit.
// Source: com.mms.fiscas.wire.poc.proto.InvoiceRequest in invoice.proto
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

public class InvoiceRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REQUIRED
  )
  public val invoiceId: String,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<InvoiceRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is InvoiceRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (invoiceId != other.invoiceId) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + invoiceId.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    result += """invoiceId=${sanitize(invoiceId)}"""
    return result.joinToString(prefix = "InvoiceRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(invoiceId: String = this.invoiceId, unknownFields: ByteString =
      this.unknownFields): InvoiceRequest = InvoiceRequest(invoiceId, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<InvoiceRequest> = object : ProtoAdapter<InvoiceRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      InvoiceRequest::class, 
      "type.googleapis.com/com.mms.fiscas.wire.poc.proto.InvoiceRequest", 
      PROTO_2, 
      null
    ) {
      public override fun encodedSize(`value`: InvoiceRequest): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.invoiceId)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: InvoiceRequest): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.invoiceId)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): InvoiceRequest {
        var invoiceId: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> invoiceId = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return InvoiceRequest(
          invoiceId = invoiceId ?: throw missingRequiredFields(invoiceId, "invoiceId"),
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: InvoiceRequest): InvoiceRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}