package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckRdsConnectionResqVO
 */
public class CheckRdsConnectionResqVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_instance_id")

    private String rdsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private String success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public CheckRdsConnectionResqVO withRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }

    /**
     * **参数解释**：  rds实例ID，此参数是实例的唯一标识。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，后缀为in01，长度为36个字符。  **默认取值**：  不涉及。
     * @return rdsInstanceId
     */
    public String getRdsInstanceId() {
        return rdsInstanceId;
    }

    public void setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
    }

    public CheckRdsConnectionResqVO withSuccess(String success) {
        this.success = success;
        return this;
    }

    /**
     * success
     * @return success
     */
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public CheckRdsConnectionResqVO withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * **参数解释**：  错误码。  **参数范围**：  不涉及。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public CheckRdsConnectionResqVO withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释**：  错误信息。  **参数范围**：  不涉及。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRdsConnectionResqVO that = (CheckRdsConnectionResqVO) obj;
        return Objects.equals(this.rdsInstanceId, that.rdsInstanceId) && Objects.equals(this.success, that.success)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rdsInstanceId, success, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRdsConnectionResqVO {\n");
        sb.append("    rdsInstanceId: ").append(toIndentedString(rdsInstanceId)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
