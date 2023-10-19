package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExceptItem
 */
public class ExceptItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "UnprocessedOpers")
    @BsonProperty(value = "UnprocessedOpers")

    private List<Integer> unprocessedOpers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FailedOpers")
    @BsonProperty(value = "FailedOpers")

    private List<Fail> failedOpers = null;

    public ExceptItem withTableName(String tableName) {
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

    public ExceptItem withUnprocessedOpers(List<Integer> unprocessedOpers) {
        this.unprocessedOpers = unprocessedOpers;
        return this;
    }

    public ExceptItem addUnprocessedOpersItem(Integer unprocessedOpersItem) {
        if (this.unprocessedOpers == null) {
            this.unprocessedOpers = new ArrayList<>();
        }
        this.unprocessedOpers.add(unprocessedOpersItem);
        return this;
    }

    public ExceptItem withUnprocessedOpers(Consumer<List<Integer>> unprocessedOpersSetter) {
        if (this.unprocessedOpers == null) {
            this.unprocessedOpers = new ArrayList<>();
        }
        unprocessedOpersSetter.accept(this.unprocessedOpers);
        return this;
    }

    /**
     * Get unprocessedOpers
     * @return unprocessedOpers
     */
    public List<Integer> getUnprocessedOpers() {
        return unprocessedOpers;
    }

    public void setUnprocessedOpers(List<Integer> unprocessedOpers) {
        this.unprocessedOpers = unprocessedOpers;
    }

    public ExceptItem withFailedOpers(List<Fail> failedOpers) {
        this.failedOpers = failedOpers;
        return this;
    }

    public ExceptItem addFailedOpersItem(Fail failedOpersItem) {
        if (this.failedOpers == null) {
            this.failedOpers = new ArrayList<>();
        }
        this.failedOpers.add(failedOpersItem);
        return this;
    }

    public ExceptItem withFailedOpers(Consumer<List<Fail>> failedOpersSetter) {
        if (this.failedOpers == null) {
            this.failedOpers = new ArrayList<>();
        }
        failedOpersSetter.accept(this.failedOpers);
        return this;
    }

    /**
     * Get failedOpers
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
        ExceptItem that = (ExceptItem) obj;
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
        sb.append("class ExceptItem {\n");
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
