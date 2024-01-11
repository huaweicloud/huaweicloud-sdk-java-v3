package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExceptionOpersOfTable
 */
public class ExceptionOpersOfTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprocessed_opers")
    @BsonProperty(value = "unprocessed_opers")

    private List<Integer> unprocessedOpers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_opers")
    @BsonProperty(value = "failed_opers")

    private List<Fail> failedOpers = null;

    public ExceptionOpersOfTable withTableName(String tableName) {
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

    public ExceptionOpersOfTable withUnprocessedOpers(List<Integer> unprocessedOpers) {
        this.unprocessedOpers = unprocessedOpers;
        return this;
    }

    public ExceptionOpersOfTable addUnprocessedOpersItem(Integer unprocessedOpersItem) {
        if (this.unprocessedOpers == null) {
            this.unprocessedOpers = new ArrayList<>();
        }
        this.unprocessedOpers.add(unprocessedOpersItem);
        return this;
    }

    public ExceptionOpersOfTable withUnprocessedOpers(Consumer<List<Integer>> unprocessedOpersSetter) {
        if (this.unprocessedOpers == null) {
            this.unprocessedOpers = new ArrayList<>();
        }
        unprocessedOpersSetter.accept(this.unprocessedOpers);
        return this;
    }

    /**
     * 未处理的操作列表。 - 数组元素：未处理的操作标识。
     * @return unprocessedOpers
     */
    public List<Integer> getUnprocessedOpers() {
        return unprocessedOpers;
    }

    public void setUnprocessedOpers(List<Integer> unprocessedOpers) {
        this.unprocessedOpers = unprocessedOpers;
    }

    public ExceptionOpersOfTable withFailedOpers(List<Fail> failedOpers) {
        this.failedOpers = failedOpers;
        return this;
    }

    public ExceptionOpersOfTable addFailedOpersItem(Fail failedOpersItem) {
        if (this.failedOpers == null) {
            this.failedOpers = new ArrayList<>();
        }
        this.failedOpers.add(failedOpersItem);
        return this;
    }

    public ExceptionOpersOfTable withFailedOpers(Consumer<List<Fail>> failedOpersSetter) {
        if (this.failedOpers == null) {
            this.failedOpers = new ArrayList<>();
        }
        failedOpersSetter.accept(this.failedOpers);
        return this;
    }

    /**
     * 失败的操作列表，可以是多个。
     * @return failedOpers
     */
    public List<Fail> getFailedOpers() {
        return failedOpers;
    }

    public void setFailedOpers(List<Fail> failedOpers) {
        this.failedOpers = failedOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExceptionOpersOfTable that = (ExceptionOpersOfTable) obj;
        return Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.unprocessedOpers, that.unprocessedOpers)
            && Objects.equals(this.failedOpers, that.failedOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, unprocessedOpers, failedOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceptionOpersOfTable {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    unprocessedOpers: ").append(toIndentedString(unprocessedOpers)).append("\n");
        sb.append("    failedOpers: ").append(toIndentedString(failedOpers)).append("\n");
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
