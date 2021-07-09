package com.huaweicloud.sdk.ddm.v1.model;




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
public class UpdateReadAndWriteStrategyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private Boolean success;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;

    public UpdateReadAndWriteStrategyResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    


    /**
     * 操作是否成功。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    

    public UpdateReadAndWriteStrategyResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * DDM实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateReadAndWriteStrategyResponse updateReadAndWriteStrategyResponse = (UpdateReadAndWriteStrategyResponse) o;
        return Objects.equals(this.success, updateReadAndWriteStrategyResponse.success) &&
            Objects.equals(this.instanceId, updateReadAndWriteStrategyResponse.instanceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(success, instanceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReadAndWriteStrategyResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

