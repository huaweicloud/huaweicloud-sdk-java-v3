/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * Response Object
 *
 * @since 2022-11-18
 */
public class CreateTableResponse extends SdkBsonDocResponse {

    // 创表的请求和响应的body是同一个数据结构
    private CreateTableRequestBody body;
    @Override
    public String toString() {
        String sb = "class CreateTableResponse {\n" +
                "    body: " + toIndentedString(body) + "\n" +
                "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param object object
     * @return String
     */
    private String toIndentedString(Object object) {
        if (object == null) {
            return "null";
        }
        return object.toString().replace("\n", "\n    ");
    }

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(CreateTableRequestBody.class).decode(reader, DecoderContext.builder().build());
    }

    public void setBody(CreateTableRequestBody body) {
        this.body = body;
    }

    public CreateTableRequestBody getBody() {
        return body;
    }

}
