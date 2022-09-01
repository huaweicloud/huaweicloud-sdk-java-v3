package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ExpandEdgecloudRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    @JacksonXmlProperty(localName = "deployment_id")

    private String deploymentId;

    public ExpandEdgecloudRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 部署计划ID。  约束： - 该接口只能执行指定边缘业务ID（id）创建的部署计划。
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandEdgecloudRequest expandEdgecloudRequest = (ExpandEdgecloudRequest) o;
        return Objects.equals(this.deploymentId, expandEdgecloudRequest.deploymentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deploymentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandEdgecloudRequest {\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
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
