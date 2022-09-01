package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteStoredQueryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    @JacksonXmlProperty(localName = "query_id")

    private String queryId;

    public DeleteStoredQueryRequest withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 查询ID
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteStoredQueryRequest deleteStoredQueryRequest = (DeleteStoredQueryRequest) o;
        return Objects.equals(this.queryId, deleteStoredQueryRequest.queryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteStoredQueryRequest {\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
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
