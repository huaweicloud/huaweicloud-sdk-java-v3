package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteComputingResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_id")

    @JacksonXmlProperty(localName = "computing_resource_id")

    private String computingResourceId;

    public DeleteComputingResourceRequest withComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
        return this;
    }

    /**
     * 计算资源ID。
     * @return computingResourceId
     */
    public String getComputingResourceId() {
        return computingResourceId;
    }

    public void setComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteComputingResourceRequest deleteComputingResourceRequest = (DeleteComputingResourceRequest) o;
        return Objects.equals(this.computingResourceId, deleteComputingResourceRequest.computingResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computingResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteComputingResourceRequest {\n");
        sb.append("    computingResourceId: ").append(toIndentedString(computingResourceId)).append("\n");
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
