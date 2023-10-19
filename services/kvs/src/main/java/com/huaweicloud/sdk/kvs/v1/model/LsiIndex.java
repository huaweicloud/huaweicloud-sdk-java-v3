package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LsiIndex
 */
public class LsiIndex {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IndexName")
    @BsonProperty(value = "IndexName")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SortKeyFields")
    @BsonProperty(value = "SortKeyFields")

    private List<Field> sortKeyFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "AbstractFields")
    @BsonProperty(value = "AbstractFields")

    private List<String> abstractFields = null;

    public LsiIndex withIndexName(String indexName) {
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

    public LsiIndex withSortKeyFields(List<Field> sortKeyFields) {
        this.sortKeyFields = sortKeyFields;
        return this;
    }

    public LsiIndex addSortKeyFieldsItem(Field sortKeyFieldsItem) {
        if (this.sortKeyFields == null) {
            this.sortKeyFields = new ArrayList<>();
        }
        this.sortKeyFields.add(sortKeyFieldsItem);
        return this;
    }

    public LsiIndex withSortKeyFields(Consumer<List<Field>> sortKeyFieldsSetter) {
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

    public LsiIndex withAbstractFields(List<String> abstractFields) {
        this.abstractFields = abstractFields;
        return this;
    }

    public LsiIndex addAbstractFieldsItem(String abstractFieldsItem) {
        if (this.abstractFields == null) {
            this.abstractFields = new ArrayList<>();
        }
        this.abstractFields.add(abstractFieldsItem);
        return this;
    }

    public LsiIndex withAbstractFields(Consumer<List<String>> abstractFieldsSetter) {
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
        LsiIndex that = (LsiIndex) obj;
        return Objects.equals(this.indexName, that.indexName) && Objects.equals(this.sortKeyFields, that.sortKeyFields)
            && Objects.equals(this.abstractFields, that.abstractFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, sortKeyFields, abstractFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LsiIndex {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
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
