package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEdgeCloudRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgecloud_id")

    @JacksonXmlProperty(localName = "edgecloud_id")

    private String edgecloudId;

    public DeleteEdgeCloudRequest withEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
        return this;
    }

    /**
     * 边缘业务ID。
     * @return edgecloudId
     */
    public String getEdgecloudId() {
        return edgecloudId;
    }

    public void setEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEdgeCloudRequest deleteEdgeCloudRequest = (DeleteEdgeCloudRequest) o;
        return Objects.equals(this.edgecloudId, deleteEdgeCloudRequest.edgecloudId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgecloudId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEdgeCloudRequest {\n");
        sb.append("    edgecloudId: ").append(toIndentedString(edgecloudId)).append("\n");
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
