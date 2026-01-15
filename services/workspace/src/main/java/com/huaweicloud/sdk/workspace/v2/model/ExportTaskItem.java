package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 导出任务item。
 */
public class ExportTaskItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    /**
     * 导出任务的状态，取值为 CREATING, SUCCESS, FAIL, EXPIRED; CREATING为进行中，SUCCESS为成功，FAIL为失败，EXPIRED为过期。
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");

        /**
         * Enum EXPIRED for value: "EXPIRED"
         */
        public static final StatusEnum EXPIRED = new StatusEnum("EXPIRED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAIL", FAIL);
            map.put("EXPIRED", EXPIRED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_download")

    private Boolean isDownload;

    public ExportTaskItem withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 导出任务id。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ExportTaskItem withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 导出文件名。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ExportTaskItem withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 导出任务的状态，取值为 CREATING, SUCCESS, FAIL, EXPIRED; CREATING为进行中，SUCCESS为成功，FAIL为失败，EXPIRED为过期。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExportTaskItem withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 任务失败的原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public ExportTaskItem withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 任务失败错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ExportTaskItem withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 导出任务的开始时间, utc时间：yyyy-MM-dd'T'HH:mm:ss.SSSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ExportTaskItem withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 导出任务的结束时间, utc时间：yyyy-MM-dd'T'HH:mm:ss.SSSZ。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ExportTaskItem withIsDownload(Boolean isDownload) {
        this.isDownload = isDownload;
        return this;
    }

    /**
     * 是否已下载。
     * @return isDownload
     */
    public Boolean getIsDownload() {
        return isDownload;
    }

    public void setIsDownload(Boolean isDownload) {
        this.isDownload = isDownload;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTaskItem that = (ExportTaskItem) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.isDownload, that.isDownload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, fileName, status, failReason, errorCode, createTime, endTime, isDownload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTaskItem {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    isDownload: ").append(toIndentedString(isDownload)).append("\n");
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
