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
public class BatchGetKvOfTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_kv_opers")
    @BsonProperty(value = "get_kv_opers")

    private List<GetOper> getKvOpers = null;

    public BatchGetKvOfTable withTableName(String tableName) {
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

    public BatchGetKvOfTable withGetKvOpers(List<GetOper> getKvOpers) {
        this.getKvOpers = getKvOpers;
        return this;
    }

    public BatchGetKvOfTable addGetKvOpersItem(GetOper getKvOpersItem) {
        if (this.getKvOpers == null) {
            this.getKvOpers = new ArrayList<>();
        }
        this.getKvOpers.add(getKvOpersItem);
        return this;
    }

    public BatchGetKvOfTable withGetKvOpers(Consumer<List<GetOper>> getKvOpersSetter) {
        if (this.getKvOpers == null) {
            this.getKvOpers = new ArrayList<>();
        }
        getKvOpersSetter.accept(this.getKvOpers);
        return this;
    }

    /**
     * 行操作数组，行操作类型可以是多个文档的get。
     * @return getKvOpers
     */
    public List<GetOper> getGetKvOpers() {
        return getKvOpers;
    }

    public void setGetKvOpers(List<GetOper> getKvOpers) {
        this.getKvOpers = getKvOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchGetKvOfTable that = (BatchGetKvOfTable) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.getKvOpers, that.getKvOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, getKvOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchGetKvOfTable {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    getKvOpers: ").append(toIndentedString(getKvOpers)).append("\n");
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
