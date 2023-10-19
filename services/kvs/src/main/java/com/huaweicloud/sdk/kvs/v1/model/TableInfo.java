package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * TableInfo
 */
public class TableInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableStatus")
    @BsonProperty(value = "TableStatus")

    private String tableStatus;

    public TableInfo withTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
        return this;
    }

    /**
     * Get tableStatus
     * @return tableStatus
     */
    public String getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableInfo that = (TableInfo) obj;
        return Objects.equals(this.tableStatus, that.tableStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableInfo {\n");
        sb.append("    tableStatus: ").append(toIndentedString(tableStatus)).append("\n");
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
