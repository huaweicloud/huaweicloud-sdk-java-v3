package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrimaryKeySchema
 */
public class PrimaryKeySchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_key_fields")
    @BsonProperty(value = "shard_key_fields")

    private List<Field> shardKeyFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_mode")
    @BsonProperty(value = "shard_mode")

    private String shardMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key_fields")
    @BsonProperty(value = "sort_key_fields")

    private List<Field> sortKeyFields = null;

    public PrimaryKeySchema withShardKeyFields(List<Field> shardKeyFields) {
        this.shardKeyFields = shardKeyFields;
        return this;
    }

    public PrimaryKeySchema addShardKeyFieldsItem(Field shardKeyFieldsItem) {
        if (this.shardKeyFields == null) {
            this.shardKeyFields = new ArrayList<>();
        }
        this.shardKeyFields.add(shardKeyFieldsItem);
        return this;
    }

    public PrimaryKeySchema withShardKeyFields(Consumer<List<Field>> shardKeyFieldsSetter) {
        if (this.shardKeyFields == null) {
            this.shardKeyFields = new ArrayList<>();
        }
        shardKeyFieldsSetter.accept(this.shardKeyFields);
        return this;
    }

    /**
     * 分区键字段名数组，顺序组合。
     * @return shardKeyFields
     */
    public List<Field> getShardKeyFields() {
        return shardKeyFields;
    }

    public void setShardKeyFields(List<Field> shardKeyFields) {
        this.shardKeyFields = shardKeyFields;
    }

    public PrimaryKeySchema withShardMode(String shardMode) {
        this.shardMode = shardMode;
        return this;
    }

    /**
     * 分区模式。
     * @return shardMode
     */
    public String getShardMode() {
        return shardMode;
    }

    public void setShardMode(String shardMode) {
        this.shardMode = shardMode;
    }

    public PrimaryKeySchema withSortKeyFields(List<Field> sortKeyFields) {
        this.sortKeyFields = sortKeyFields;
        return this;
    }

    public PrimaryKeySchema addSortKeyFieldsItem(Field sortKeyFieldsItem) {
        if (this.sortKeyFields == null) {
            this.sortKeyFields = new ArrayList<>();
        }
        this.sortKeyFields.add(sortKeyFieldsItem);
        return this;
    }

    public PrimaryKeySchema withSortKeyFields(Consumer<List<Field>> sortKeyFieldsSetter) {
        if (this.sortKeyFields == null) {
            this.sortKeyFields = new ArrayList<>();
        }
        sortKeyFieldsSetter.accept(this.sortKeyFields);
        return this;
    }

    /**
     * 排序键字段名数组，顺序组合。
     * @return sortKeyFields
     */
    public List<Field> getSortKeyFields() {
        return sortKeyFields;
    }

    public void setSortKeyFields(List<Field> sortKeyFields) {
        this.sortKeyFields = sortKeyFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrimaryKeySchema that = (PrimaryKeySchema) obj;
        return Objects.equals(this.shardKeyFields, that.shardKeyFields)
            && Objects.equals(this.shardMode, that.shardMode) && Objects.equals(this.sortKeyFields, that.sortKeyFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shardKeyFields, shardMode, sortKeyFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrimaryKeySchema {\n");
        sb.append("    shardKeyFields: ").append(toIndentedString(shardKeyFields)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    sortKeyFields: ").append(toIndentedString(sortKeyFields)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
