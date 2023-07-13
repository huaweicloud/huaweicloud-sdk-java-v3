/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.corebson.SdkBsonDocRequest;

import org.bson.BsonWriter;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 *
 * @since 2022-11-18
 */
public class CreateTableRequest extends SdkBsonDocRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateTableRequestBody body;

    /**
     * withBody
     *
     * @param body body
     * @return CreateTableRequest
     */
    public CreateTableRequest withBody(CreateTableRequestBody body) {
        this.body = body;
        return this;
    }

    /**
     * withBody
     *
     * @param bodySetter bodySetter
     * @return CreateTableRequest
     */
    public CreateTableRequest withBody(Consumer<CreateTableRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTableRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     *
     * @return body
     */
    public CreateTableRequestBody getBody() {
        return body;
    }

    public void setBody(CreateTableRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        CreateTableRequest createTableRequest = (CreateTableRequest) object;
        return Objects.equals(this.body, createTableRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param object o
     * @return String
     */
    private String toIndentedString(Object object) {
        if (object == null) {
            return "null";
        }
        return object.toString().replace("\n", "\n    ");
    }
    @Override
    protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
        codecRegistry.get(CreateTableRequestBody.class).encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}
