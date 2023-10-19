package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchWriteKvRequestBody
 */
public class BatchWriteKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableOpers")
    @BsonProperty(value = "TableOpers")

    private List<TableBatch> tableOpers = null;

    public BatchWriteKvRequestBody withTableOpers(List<TableBatch> tableOpers) {
        this.tableOpers = tableOpers;
        return this;
    }

    public BatchWriteKvRequestBody addTableOpersItem(TableBatch tableOpersItem) {
        if (this.tableOpers == null) {
            this.tableOpers = new ArrayList<>();
        }
        this.tableOpers.add(tableOpersItem);
        return this;
    }

    public BatchWriteKvRequestBody withTableOpers(Consumer<List<TableBatch>> tableOpersSetter) {
        if (this.tableOpers == null) {
            this.tableOpers = new ArrayList<>();
        }
        tableOpersSetter.accept(this.tableOpers);
        return this;
    }

    /**
     * Get tableOpers
     * @return tableOpers
     */
    public List<TableBatch> getTableOpers() {
        return tableOpers;
    }

    public void setTableOpers(List<TableBatch> tableOpers) {
        this.tableOpers = tableOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchWriteKvRequestBody that = (BatchWriteKvRequestBody) obj;
        return Objects.equals(this.tableOpers, that.tableOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchWriteKvRequestBody {\n");
        sb.append("    tableOpers: ").append(toIndentedString(tableOpers)).append("\n");
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
