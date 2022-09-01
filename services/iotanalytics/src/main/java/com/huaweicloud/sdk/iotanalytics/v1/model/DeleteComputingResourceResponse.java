package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteComputingResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_id")

    @JacksonXmlProperty(localName = "computing_resource_id")

    private String computingResourceId;

    public DeleteComputingResourceResponse withComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
        return this;
    }

    /**
     * 被删除计算资源ID。
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
        DeleteComputingResourceResponse deleteComputingResourceResponse = (DeleteComputingResourceResponse) o;
        return Objects.equals(this.computingResourceId, deleteComputingResourceResponse.computingResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computingResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteComputingResourceResponse {\n");
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
