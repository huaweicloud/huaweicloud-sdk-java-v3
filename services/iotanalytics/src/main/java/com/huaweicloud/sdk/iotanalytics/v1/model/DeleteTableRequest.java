package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    @JacksonXmlProperty(localName = "table_id")

    private String tableId;

    public DeleteTableRequest withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTableRequest deleteTableRequest = (DeleteTableRequest) o;
        return Objects.equals(this.tableId, deleteTableRequest.tableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTableRequest {\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
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
