/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTableRequestBodyPrimaryKeySchemaKeySchema
 *
 * @since 2022-11-18
 */
public class KeySchema {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ShardKeyFieldName")

    private ShardKeyFieldName shardKeyFieldName;

    /**
     * withShardKeyFieldName
     *
     * @param shardKeyFieldName shardKeyFieldName
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchema
     */
    public KeySchema withShardKeyFieldName(
        ShardKeyFieldName shardKeyFieldName) {
        this.shardKeyFieldName = shardKeyFieldName;
        return this;
    }

    /**
     * withShardKeyFieldName
     *
     * @param shardKeyFieldNameSetter shardKeyFieldNameSetter
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchema
     */
    public KeySchema withShardKeyFieldName(
        Consumer<ShardKeyFieldName> shardKeyFieldNameSetter) {
        if (this.shardKeyFieldName == null) {
            this.shardKeyFieldName = new ShardKeyFieldName();
            shardKeyFieldNameSetter.accept(this.shardKeyFieldName);
        }

        return this;
    }

    /**
     * Get shardKeyFieldName
     *
     * @return shardKeyFieldName
     */
    public ShardKeyFieldName getShardKeyFieldName() {
        return shardKeyFieldName;
    }

    public void setShardKeyFieldName(
        ShardKeyFieldName shardKeyFieldName) {
        this.shardKeyFieldName = shardKeyFieldName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        KeySchema createTableRequestBodyPrimaryKeySchemaKeySchema =
            (KeySchema) object;
        return Objects.equals(this.shardKeyFieldName,
            createTableRequestBodyPrimaryKeySchemaKeySchema.shardKeyFieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shardKeyFieldName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequestBodyPrimaryKeySchemaKeySchema {\n");
        sb.append("    shardKeyFieldName: ").append(toIndentedString(shardKeyFieldName)).append("\n");
        sb.append("}");
        return sb.toString();
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
}
