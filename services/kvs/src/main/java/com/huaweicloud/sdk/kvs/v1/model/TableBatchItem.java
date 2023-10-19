package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableBatchItem
 */
public class TableBatchItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvArray")
    @BsonProperty(value = "KvArray")

    private List<KvItem> kvArray = null;

    public TableBatchItem withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get tableName
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TableBatchItem withKvArray(List<KvItem> kvArray) {
        this.kvArray = kvArray;
        return this;
    }

    public TableBatchItem addKvArrayItem(KvItem kvArrayItem) {
        if (this.kvArray == null) {
            this.kvArray = new ArrayList<>();
        }
        this.kvArray.add(kvArrayItem);
        return this;
    }

    public TableBatchItem withKvArray(Consumer<List<KvItem>> kvArraySetter) {
        if (this.kvArray == null) {
            this.kvArray = new ArrayList<>();
        }
        kvArraySetter.accept(this.kvArray);
        return this;
    }

    /**
     * Get kvArray
     * @return kvArray
     */
    public List<KvItem> getKvArray() {
        return kvArray;
    }

    public void setKvArray(List<KvItem> kvArray) {
        this.kvArray = kvArray;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableBatchItem that = (TableBatchItem) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.kvArray, that.kvArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, kvArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableBatchItem {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    kvArray: ").append(toIndentedString(kvArray)).append("\n");
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
