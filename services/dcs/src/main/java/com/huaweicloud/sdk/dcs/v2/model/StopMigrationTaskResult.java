package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StopMigrationTaskResult
 */
public class StopMigrationTaskResult {

    /**
     * 下发停止迁移任务操作结果。
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
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultEnum(value);
            }
            return result;
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    public StopMigrationTaskResult withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 下发停止迁移任务操作结果。
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public StopMigrationTaskResult withTaskId(String taskId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopMigrationTaskResult stopMigrationTaskResult = (StopMigrationTaskResult) o;
        return Objects.equals(this.result, stopMigrationTaskResult.result)
            && Objects.equals(this.taskId, stopMigrationTaskResult.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopMigrationTaskResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
