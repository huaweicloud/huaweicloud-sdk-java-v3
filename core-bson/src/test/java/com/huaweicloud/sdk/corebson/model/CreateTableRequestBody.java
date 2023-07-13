/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTableRequestBody
 *
 * @since 2022-11-18
 */
public class CreateTableRequestBody {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PrimaryKeySchema")

    private PrimaryKeySchema primaryKeySchema;

    /**
     * withTableName
     *
     * @param tableName tableName
     * @return CreateTableRequestBody
     */
    public CreateTableRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get tableName
     *
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * withPrimaryKeySchema
     *
     * @param primaryKeySchema primaryKeySchema
     * @return CreateTableRequestBody
     */
    public CreateTableRequestBody withPrimaryKeySchema(PrimaryKeySchema primaryKeySchema) {
        this.primaryKeySchema = primaryKeySchema;
        return this;
    }

    /**
     * withPrimaryKeySchema
     *
     * @param primaryKeySchemaSetter primaryKeySchemaSetter
     * @return CreateTableRequestBody
     */
    public CreateTableRequestBody withPrimaryKeySchema(
        Consumer<PrimaryKeySchema> primaryKeySchemaSetter) {
        if (this.primaryKeySchema == null) {
            this.primaryKeySchema = new PrimaryKeySchema();
            primaryKeySchemaSetter.accept(this.primaryKeySchema);
        }

        return this;
    }

    /**
     * Get primaryKeySchema
     *
     * @return primaryKeySchema
     */
    public PrimaryKeySchema getPrimaryKeySchema() {
        return primaryKeySchema;
    }

    public void setPrimaryKeySchema(PrimaryKeySchema primaryKeySchema) {
        this.primaryKeySchema = primaryKeySchema;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        CreateTableRequestBody createTableRequestBody = (CreateTableRequestBody) object;
        return Objects.equals(this.tableName, createTableRequestBody.tableName)
            && Objects.equals(this.primaryKeySchema, createTableRequestBody.primaryKeySchema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, primaryKeySchema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKeySchema: ").append(toIndentedString(primaryKeySchema)).append("\n");
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
