/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTableRequestBodyPrimaryKeySchema
 *
 * @since 2022-11-18
 */
public class PrimaryKeySchema {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KeySchema")

    private KeySchema keySchema;

    /**
     * withKeySchema
     *
     * @param keySchema keySchema
     * @return CreateTableRequestBodyPrimaryKeySchema
     */
    public PrimaryKeySchema withKeySchema(
        KeySchema keySchema) {
        this.keySchema = keySchema;
        return this;
    }

    /**
     * withKeySchema
     *
     * @param keySchemaSetter keySchemaSetter
     * @return CreateTableRequestBodyPrimaryKeySchema
     */
    public PrimaryKeySchema withKeySchema(
        Consumer<KeySchema> keySchemaSetter) {
        if (this.keySchema == null) {
            this.keySchema = new KeySchema();
            keySchemaSetter.accept(this.keySchema);
        }

        return this;
    }

    /**
     * Get keySchema
     *
     * @return keySchema
     */
    public KeySchema getKeySchema() {
        return keySchema;
    }

    public void setKeySchema(KeySchema keySchema) {
        this.keySchema = keySchema;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        PrimaryKeySchema createTableRequestBodyPrimaryKeySchema =
            (PrimaryKeySchema) object;
        return Objects.equals(this.keySchema, createTableRequestBodyPrimaryKeySchema.keySchema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keySchema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequestBodyPrimaryKeySchema {\n");
        sb.append("    keySchema: ").append(toIndentedString(keySchema)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     * @return String
     * @param object object
     */
    private String toIndentedString(Object object) {
        if (object == null) {
            return "null";
        }
        return object.toString().replace("\n", "\n    ");
    }
}
