package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GlobalSecondaryIndex
 */
public class GlobalSecondaryIndex {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")
    @BsonProperty(value = "index_name")

    private String indexName;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abstract_fields")
    @BsonProperty(value = "abstract_fields")

    private List<String> abstractFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioned_throughput")
    @BsonProperty(value = "provisioned_throughput")

    private ProvisionedThroughput provisionedThroughput;

    public GlobalSecondaryIndex withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 二级索引名称，表内唯一。
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public GlobalSecondaryIndex withShardKeyFields(List<Field> shardKeyFields) {
        this.shardKeyFields = shardKeyFields;
        return this;
    }

    public GlobalSecondaryIndex addShardKeyFieldsItem(Field shardKeyFieldsItem) {
        if (this.shardKeyFields == null) {
            this.shardKeyFields = new ArrayList<>();
        }
        this.shardKeyFields.add(shardKeyFieldsItem);
        return this;
    }

    public GlobalSecondaryIndex withShardKeyFields(Consumer<List<Field>> shardKeyFieldsSetter) {
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

    public GlobalSecondaryIndex withShardMode(String shardMode) {
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

    public GlobalSecondaryIndex withSortKeyFields(List<Field> sortKeyFields) {
        this.sortKeyFields = sortKeyFields;
        return this;
    }

    public GlobalSecondaryIndex addSortKeyFieldsItem(Field sortKeyFieldsItem) {
        if (this.sortKeyFields == null) {
            this.sortKeyFields = new ArrayList<>();
        }
        this.sortKeyFields.add(sortKeyFieldsItem);
        return this;
    }

    public GlobalSecondaryIndex withSortKeyFields(Consumer<List<Field>> sortKeyFieldsSetter) {
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

    public GlobalSecondaryIndex withAbstractFields(List<String> abstractFields) {
        this.abstractFields = abstractFields;
        return this;
    }

    public GlobalSecondaryIndex addAbstractFieldsItem(String abstractFieldsItem) {
        if (this.abstractFields == null) {
            this.abstractFields = new ArrayList<>();
        }
        this.abstractFields.add(abstractFieldsItem);
        return this;
    }

    public GlobalSecondaryIndex withAbstractFields(Consumer<List<String>> abstractFieldsSetter) {
        if (this.abstractFields == null) {
            this.abstractFields = new ArrayList<>();
        }
        abstractFieldsSetter.accept(this.abstractFields);
        return this;
    }

    /**
     * 摘要字段名数组。
     * @return abstractFields
     */
    public List<String> getAbstractFields() {
        return abstractFields;
    }

    public void setAbstractFields(List<String> abstractFields) {
        this.abstractFields = abstractFields;
    }

    public GlobalSecondaryIndex withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    public GlobalSecondaryIndex withProvisionedThroughput(Consumer<ProvisionedThroughput> provisionedThroughputSetter) {
        if (this.provisionedThroughput == null) {
            this.provisionedThroughput = new ProvisionedThroughput();
            provisionedThroughputSetter.accept(this.provisionedThroughput);
        }

        return this;
    }

    /**
     * Get provisionedThroughput
     * @return provisionedThroughput
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalSecondaryIndex that = (GlobalSecondaryIndex) obj;
        return Objects.equals(this.indexName, that.indexName)
            && Objects.equals(this.shardKeyFields, that.shardKeyFields)
            && Objects.equals(this.shardMode, that.shardMode) && Objects.equals(this.sortKeyFields, that.sortKeyFields)
            && Objects.equals(this.abstractFields, that.abstractFields)
            && Objects.equals(this.provisionedThroughput, that.provisionedThroughput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, shardKeyFields, shardMode, sortKeyFields, abstractFields, provisionedThroughput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalSecondaryIndex {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    shardKeyFields: ").append(toIndentedString(shardKeyFields)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    sortKeyFields: ").append(toIndentedString(sortKeyFields)).append("\n");
        sb.append("    abstractFields: ").append(toIndentedString(abstractFields)).append("\n");
        sb.append("    provisionedThroughput: ").append(toIndentedString(provisionedThroughput)).append("\n");
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
