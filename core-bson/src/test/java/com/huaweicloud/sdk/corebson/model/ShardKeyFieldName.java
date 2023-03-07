/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.BsonJavaScript;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;

import java.util.Objects;

/**
 * CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
 *
 * @since 2022-11-18
 */
public class ShardKeyFieldName {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objectid_value")

    private ObjectId objectidValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "byte_value")

    private Byte byteValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_value")

    private BsonRegularExpression regexValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jscode_value")

    private BsonJavaScript jscodeValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_value")

    private BsonTimestamp timestampValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minkey_value")

    private MinKey minkeyValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxkey_value")

    private MaxKey maxkeyValue;

    /**
     * withObjectidValue
     *
     * @param objectidValue objectidValue
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
     */
    public ShardKeyFieldName withObjectidValue(ObjectId objectidValue) {
        this.objectidValue = objectidValue;
        return this;
    }

    /**
     * Get objectidValue
     *
     * @return objectidValue
     */
    public ObjectId getObjectidValue() {
        return objectidValue;
    }

    public void setObjectidValue(ObjectId objectidValue) {
        this.objectidValue = objectidValue;
    }

    /**
     * withByteValue
     *
     * @param byteValue byteValue
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
     */
    public ShardKeyFieldName withByteValue(Byte byteValue) {
        this.byteValue = byteValue;
        return this;
    }

    /**
     * Get byteValue
     *
     * @return byteValue
     */
    public Byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(Byte byteValue) {
        this.byteValue = byteValue;
    }

    /**
     * withRegexValue
     *
     * @param regexValue regexValue
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
     */
    public ShardKeyFieldName withRegexValue(BsonRegularExpression regexValue) {
        this.regexValue = regexValue;
        return this;
    }

    /**
     * Get regexValue
     *
     * @return regexValue
     */
    public BsonRegularExpression getRegexValue() {
        return regexValue;
    }

    public void setRegexValue(BsonRegularExpression regexValue) {
        this.regexValue = regexValue;
    }

    /**
     * withJscodeValue
     *
     * @param jscodeValue jscodeValue
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
     */
    public ShardKeyFieldName withJscodeValue(
        BsonJavaScript jscodeValue) {
        this.jscodeValue = jscodeValue;
        return this;
    }

    /**
     * Get jscodeValue
     *
     * @return jscodeValue
     */
    public BsonJavaScript getJscodeValue() {
        return jscodeValue;
    }

    public void setJscodeValue(BsonJavaScript jscodeValue) {
        this.jscodeValue = jscodeValue;
    }

    /**
     * withTimestampValue
     *
     * @param timestampValue timestampValue
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
     */
    public ShardKeyFieldName withTimestampValue(
            BsonTimestamp timestampValue) {
        this.timestampValue = timestampValue;
        return this;
    }

    /**
     * Get timestampValue
     *
     * @return timestampValue
     */
    public BsonTimestamp getTimestampValue() {
        return timestampValue;
    }

    public void setTimestampValue(BsonTimestamp timestampValue) {
        this.timestampValue = timestampValue;
    }

    /**
     * withMinkeyValue
     *
     * @param minkeyValue minkeyValue
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
     */
    public ShardKeyFieldName withMinkeyValue(MinKey minkeyValue) {
        this.minkeyValue = minkeyValue;
        return this;
    }

    /**
     * Get minkeyValue
     *
     * @return minkeyValue
     */
    public MinKey getMinkeyValue() {
        return minkeyValue;
    }

    public void setMinkeyValue(MinKey minkeyValue) {
        this.minkeyValue = minkeyValue;
    }

    /**
     * withMaxkeyValue
     *
     * @param maxkeyValue maxkeyValue
     * @return CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName
     */
    public ShardKeyFieldName withMaxkeyValue(MaxKey maxkeyValue) {
        this.maxkeyValue = maxkeyValue;
        return this;
    }

    /**
     * Get maxkeyValue
     *
     * @return maxkeyValue
     */
    public MaxKey getMaxkeyValue() {
        return maxkeyValue;
    }

    public void setMaxkeyValue(MaxKey maxkeyValue) {
        this.maxkeyValue = maxkeyValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        ShardKeyFieldName ShardKeyFieldName = (ShardKeyFieldName) object;
        if ((Objects.equals(this.objectidValue,ShardKeyFieldName.objectidValue)
                && Objects.equals(this.byteValue, ShardKeyFieldName.byteValue)
                && Objects.equals(this.regexValue, ShardKeyFieldName.regexValue))) {
            if (Objects.equals(this.jscodeValue, ShardKeyFieldName.jscodeValue)
                    && Objects.equals(this.timestampValue, ShardKeyFieldName.timestampValue)
                    && Objects.equals(this.minkeyValue, ShardKeyFieldName.minkeyValue)) {
                if(Objects.equals(this.maxkeyValue, ShardKeyFieldName.maxkeyValue)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(objectidValue, byteValue, regexValue, jscodeValue, timestampValue, minkeyValue, maxkeyValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequestBodyPrimaryKeySchemaKeySchemaShardKeyFieldName {\n");
        sb.append("    objectidValue: ").append(toIndentedString(objectidValue)).append("\n");
        sb.append("    byteValue: ").append(toIndentedString(byteValue)).append("\n");
        sb.append("    regexValue: ").append(toIndentedString(regexValue)).append("\n");
        sb.append("    jscodeValue: ").append(toIndentedString(jscodeValue)).append("\n");
        sb.append("    timestampValue: ").append(toIndentedString(timestampValue)).append("\n");
        sb.append("    minkeyValue: ").append(toIndentedString(minkeyValue)).append("\n");
        sb.append("    maxkeyValue: ").append(toIndentedString(maxkeyValue)).append("\n");
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
