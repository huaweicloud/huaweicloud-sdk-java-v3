package com.huaweicloud.sdk.ces.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BatchCreateInvocationInfo
 */
public class BatchCreateInvocationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_id")

    private String invocationId;

    /**
     * 任务结果, successful成功，error失败
     */
    public static final class RetStatusEnum {

        /**
         * Enum SUCCESSFUL for value: "successful"
         */
        public static final RetStatusEnum SUCCESSFUL = new RetStatusEnum("successful");

        /**
         * Enum ERROR for value: "error"
         */
        public static final RetStatusEnum ERROR = new RetStatusEnum("error");

        private static final Map<String, RetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RetStatusEnum> createStaticFields() {
            Map<String, RetStatusEnum> map = new HashMap<>();
            map.put("successful", SUCCESSFUL);
            map.put("error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RetStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RetStatusEnum(value));
        }

        public static RetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RetStatusEnum) {
                return this.value.equals(((RetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_status")

    private RetStatusEnum retStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public BatchCreateInvocationInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 机器id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchCreateInvocationInfo withInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }

    /**
     * 任务id
     * @return invocationId
     */
    public String getInvocationId() {
        return invocationId;
    }

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    public BatchCreateInvocationInfo withRetStatus(RetStatusEnum retStatus) {
        this.retStatus = retStatus;
        return this;
    }

    /**
     * 任务结果, successful成功，error失败
     * @return retStatus
     */
    public RetStatusEnum getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(RetStatusEnum retStatus) {
        this.retStatus = retStatus;
    }

    public BatchCreateInvocationInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BatchCreateInvocationInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateInvocationInfo that = (BatchCreateInvocationInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.invocationId, that.invocationId)
            && Objects.equals(this.retStatus, that.retStatus) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, invocationId, retStatus, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateInvocationInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
        sb.append("    retStatus: ").append(toIndentedString(retStatus)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
