package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DeleteThumbnailResult
 */
public class DeleteThumbnailResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 删除状态。  取值如下： - DELETED：已删除。 - FAILED：删除失败。 - UNKNOW：未知原因
     */
    public static final class StatusEnum {

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final StatusEnum UNKNOW = new StatusEnum("UNKNOW");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FAILED", FAILED);
            map.put("DELETED", DELETED);
            map.put("UNKNOW", UNKNOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public DeleteThumbnailResult withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 删除截图结果对应的媒资id
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public DeleteThumbnailResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 删除截图结果对应的任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public DeleteThumbnailResult withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 删除状态。  取值如下： - DELETED：已删除。 - FAILED：删除失败。 - UNKNOW：未知原因
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteThumbnailResult that = (DeleteThumbnailResult) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, taskId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteThumbnailResult {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
