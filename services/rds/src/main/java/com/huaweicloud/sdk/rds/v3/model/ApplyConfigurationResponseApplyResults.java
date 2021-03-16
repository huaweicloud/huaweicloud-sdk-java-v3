package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApplyConfigurationResponseApplyResults
 */
public class ApplyConfigurationResponseApplyResults  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restart_required")
    
    private Boolean restartRequired;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private Boolean success;

    public ApplyConfigurationResponseApplyResults withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ApplyConfigurationResponseApplyResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    public ApplyConfigurationResponseApplyResults withRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
        return this;
    }

    


    /**
     * 实例是否需要重启。  - “true”需要重启。 - “false”不需要重启。
     * @return restartRequired
     */
    public Boolean getRestartRequired() {
        return restartRequired;
    }

    public void setRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
    }

    

    public ApplyConfigurationResponseApplyResults withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    


    /**
     * 参数模板是否应用成功。  - “true”表示参数模板应用成功。 - “false”表示参数模板应用失败。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyConfigurationResponseApplyResults applyConfigurationResponseApplyResults = (ApplyConfigurationResponseApplyResults) o;
        return Objects.equals(this.instanceId, applyConfigurationResponseApplyResults.instanceId) &&
            Objects.equals(this.instanceName, applyConfigurationResponseApplyResults.instanceName) &&
            Objects.equals(this.restartRequired, applyConfigurationResponseApplyResults.restartRequired) &&
            Objects.equals(this.success, applyConfigurationResponseApplyResults.success);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, restartRequired, success);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyConfigurationResponseApplyResults {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    restartRequired: ").append(toIndentedString(restartRequired)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

