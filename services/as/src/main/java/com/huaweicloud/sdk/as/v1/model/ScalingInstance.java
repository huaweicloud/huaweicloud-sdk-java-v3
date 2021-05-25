package com.huaweicloud.sdk.as.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 伸缩实例。
 */
public class ScalingInstance  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed_reason")
    
    private String failedReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed_details")
    
    private String failedDetails;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_config")
    
    private String instanceConfig;

    public ScalingInstance withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 云服务器名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    public ScalingInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 云服务器id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ScalingInstance withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    


    /**
     * 实例伸缩失败原因。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    

    public ScalingInstance withFailedDetails(String failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    


    /**
     * 实例伸缩失败详情。
     * @return failedDetails
     */
    public String getFailedDetails() {
        return failedDetails;
    }

    public void setFailedDetails(String failedDetails) {
        this.failedDetails = failedDetails;
    }

    

    public ScalingInstance withInstanceConfig(String instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }

    


    /**
     * 实例配置信息。
     * @return instanceConfig
     */
    public String getInstanceConfig() {
        return instanceConfig;
    }

    public void setInstanceConfig(String instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingInstance scalingInstance = (ScalingInstance) o;
        return Objects.equals(this.instanceName, scalingInstance.instanceName) &&
            Objects.equals(this.instanceId, scalingInstance.instanceId) &&
            Objects.equals(this.failedReason, scalingInstance.failedReason) &&
            Objects.equals(this.failedDetails, scalingInstance.failedDetails) &&
            Objects.equals(this.instanceConfig, scalingInstance.instanceConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceName, instanceId, failedReason, failedDetails, instanceConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingInstance {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedDetails: ").append(toIndentedString(failedDetails)).append("\n");
        sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
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

