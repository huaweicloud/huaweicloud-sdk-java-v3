package com.huaweicloud.sdk.aos.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ApplyExecutionPlanResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deployment_id")
    
    
    private String deploymentId;

    public ApplyExecutionPlanResponse withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    


    /**
     * 部署生成的唯一ID，由资源编排服务生成
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
        ApplyExecutionPlanResponse applyExecutionPlanResponse = (ApplyExecutionPlanResponse) o;
        return Objects.equals(this.deploymentId, applyExecutionPlanResponse.deploymentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deploymentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyExecutionPlanResponse {\n");
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

