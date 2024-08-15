package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BatchRestartMigrationTaskResult
 */
public class BatchRestartMigrationTaskResult {

    /**
     * 下发重启迁移任务操作结果。
     */
    public static final class ResultEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final ResultEnum SUCCESS = new ResultEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ResultEnum FAILED = new ResultEnum("failed");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultEnum(value));
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public BatchRestartMigrationTaskResult withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 下发重启迁移任务操作结果。
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public BatchRestartMigrationTaskResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 数据迁移任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public BatchRestartMigrationTaskResult withErrorMsg(String errorMsg) {
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

    public BatchRestartMigrationTaskResult withErrorCode(String errorCode) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRestartMigrationTaskResult that = (BatchRestartMigrationTaskResult) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, taskId, errorMsg, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRestartMigrationTaskResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
