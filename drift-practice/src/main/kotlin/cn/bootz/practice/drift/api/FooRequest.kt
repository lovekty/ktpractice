package cn.bootz.practice.drift.api

import io.airlift.drift.annotations.ThriftField
import io.airlift.drift.annotations.ThriftStruct

@ThriftStruct
class FooRequest {

    @set:ThriftField(value = 1, requiredness = ThriftField.Requiredness.REQUIRED)
    @get:ThriftField
    var prefix: String? = null

    @set:ThriftField(value = 2, requiredness = ThriftField.Requiredness.REQUIRED)
    @get:ThriftField
    var foo: String? = null

    override fun toString(): String {
        return "FooRequest(foo=$foo)"
    }

}