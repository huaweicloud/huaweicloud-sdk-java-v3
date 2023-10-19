package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GsiIndex
 */
public class GsiIndex {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IndexName")
    @BsonProperty(value = "IndexName")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ShardKeyFields")
    @BsonProperty(value = "ShardKeyFields")

    private List<Field> shardKeyFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ShardMode")
    @BsonProperty(value = "ShardMode")

    private String shardMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SortKeyFields")
    @BsonProperty(value = "SortKeyFields")

    private List<Field> sortKeyFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "AbstractFields")
    @BsonProperty(value = "AbstractFields")

    private List<String> abstractFields = null;

    public GsiIndex withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * Get indexName
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public GsiIndex withShardKeyFields(List<Field> shardKeyFields) {
        this.shardKeyFields = shardKeyFields;
        return this;
    }

    public GsiIndex addShardKeyFieldsItem(Field shardKeyFieldsItem) {
        if (this.shardKeyFields == null) {
            this.shardKeyFields = new ArrayList<>();
        }
        this.shardKeyFields.add(shardKeyFieldsItem);
        return this;
    }

    public GsiIndex withShardKeyFields(Consumer<List<Field>> shardKeyFieldsSetter) {
        if (this.shardKeyFields == null) {
            this.shardKeyFields = new ArrayList<>();
        }
        shardKeyFieldsSetter.accept(this.shardKeyFields);
        return this;
    }

    /**
     * Get shardKeyFields
     * @return shardKeyFields
     */
    public List<Field> getShardKeyFields() {
        return shardKeyFields;
    }

    public void setShardKeyFields(List<Field> shardKeyFields) {
        this.shardKeyFields = shardKeyFields;
    }

    public GsiIndex withShardMode(String shardMode) {
        this.shardMode = shardMode;
        return this;
    }

    /**
     * Get shardMode
     * @return shardMode
     */
    public String getShardMode() {
        return shardMode;
    }

    public void setShardMode(String shardMode) {
        this.shardMode = shardMode;
    }

    public GsiIndex withSortKeyFields(List<Field> sortKeyFields) {
        this.sortKeyFields = sortKeyFields;
        return this;
    }

    public GsiIndex addSortKeyFieldsItem(Field sortKeyFieldsItem) {
        if (this.sortKeyFields == null) {
            this.sortKeyFields = new ArrayList<>();
        }
        this.sortKeyFields.add(sortKeyFieldsItem);
        return this;
    }

    public GsiIndex withSortKeyFields(Consumer<List<Field>> sortKeyFieldsSetter) {
        if (this.sortKeyFields == null) {
            this.sortKeyFields = new ArrayList<>();
        }
        sortKeyFieldsSetter.accept(this.sortKeyFields);
        return this;
    }

    /**
     * Get sortKeyFields
     * @return sortKeyFields
     */
    public List<Field> getSortKeyFields() {
        return sortKeyFields;
    }

    public void setSortKeyFields(List<Field> sortKeyFields) {
        this.sortKeyFields = sortKeyFields;
    }

    public GsiIndex withAbstractFields(List<String> abstractFields) {
        this.abstractFields = abstractFields;
        return this;
    }

    public GsiIndex addAbstractFieldsItem(String abstractFieldsItem) {
        if (this.abstractFields == null) {
            this.abstractFields = new ArrayList<>();
        }
        this.abstractFields.add(abstractFieldsItem);
        return this;
    }

    public GsiIndex withAbstractFields(Consumer<List<String>> abstractFieldsSetter) {
        if (this.abstractFields == null) {
            this.abstractFields = new ArrayList<>();
        }
        abstractFieldsSetter.accept(this.abstractFields);
        return this;
    }

    /**
     * Get abstractFields
     * @return abstractFields
     */
    public List<String> getAbstractFields() {
        return abstractFields;
    }

    public void setAbstractFields(List<String> abstractFields) {
        this.abstractFields = abstractFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GsiIndex that = (GsiIndex) obj;
        return Objects.equals(this.indexName, that.indexName)
            && Objects.equals(this.shardKeyFields, that.shardKeyFields)
            && Objects.equals(this.shardMode, that.shardMode) && Objects.equals(this.sortKeyFields, that.sortKeyFields)
            && Objects.equals(this.abstractFields, that.abstractFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, shardKeyFields, shardMode, sortKeyFields, abstractFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GsiIndex {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    shardKeyFields: ").append(toIndentedString(shardKeyFields)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    sortKeyFields: ").append(toIndentedString(sortKeyFields)).append("\n");
        sb.append("    abstractFields: ").append(toIndentedString(abstractFields)).append("\n");
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
