package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单个表的所有kv操作。
 */
public class TableBatch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_opers")
    @BsonProperty(value = "kv_opers")

    private List<OperItem> kvOpers = null;

    public TableBatch withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名，仓内唯一。 - 长度：[3, 63] - 取值字符限制：[a-z0-9_-]+
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TableBatch withKvOpers(List<OperItem> kvOpers) {
        this.kvOpers = kvOpers;
        return this;
    }

    public TableBatch addKvOpersItem(OperItem kvOpersItem) {
        if (this.kvOpers == null) {
            this.kvOpers = new ArrayList<>();
        }
        this.kvOpers.add(kvOpersItem);
        return this;
    }

    public TableBatch withKvOpers(Consumer<List<OperItem>> kvOpersSetter) {
        if (this.kvOpers == null) {
            this.kvOpers = new ArrayList<>();
        }
        kvOpersSetter.accept(this.kvOpers);
        return this;
    }

    /**
     * kv操作数组。
     * @return kvOpers
     */
    public List<OperItem> getKvOpers() {
        return kvOpers;
    }

    public void setKvOpers(List<OperItem> kvOpers) {
        this.kvOpers = kvOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableBatch that = (TableBatch) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.kvOpers, that.kvOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, kvOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableBatch {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    kvOpers: ").append(toIndentedString(kvOpers)).append("\n");
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
