package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppliedHistoriesResult
 */
public class AppliedHistoriesResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_result")
    
    
    private String applyResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="applied_at")
    
    
    private String appliedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;

    public AppliedHistoriesResult withInstanceId(String instanceId) {
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

    

    public AppliedHistoriesResult withInstanceName(String instanceName) {
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

    

    public AppliedHistoriesResult withApplyResult(String applyResult) {
        this.applyResult = applyResult;
        return this;
    }

    


    /**
     * 应用状态 (SUCCESS | FAILED)。
     * @return applyResult
     */
    public String getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    

    public AppliedHistoriesResult withAppliedAt(String appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    


    /**
     * 应用时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return appliedAt
     */
    public String getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(String appliedAt) {
        this.appliedAt = appliedAt;
    }

    

    public AppliedHistoriesResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 失败原因错误码，如DBS.280005。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppliedHistoriesResult appliedHistoriesResult = (AppliedHistoriesResult) o;
        return Objects.equals(this.instanceId, appliedHistoriesResult.instanceId) &&
            Objects.equals(this.instanceName, appliedHistoriesResult.instanceName) &&
            Objects.equals(this.applyResult, appliedHistoriesResult.applyResult) &&
            Objects.equals(this.appliedAt, appliedHistoriesResult.appliedAt) &&
            Objects.equals(this.errorCode, appliedHistoriesResult.errorCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, applyResult, appliedAt, errorCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppliedHistoriesResult {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    applyResult: ").append(toIndentedString(applyResult)).append("\n");
        sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

