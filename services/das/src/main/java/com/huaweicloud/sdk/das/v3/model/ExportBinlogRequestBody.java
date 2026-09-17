package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出binlog解析结果请求体
 */
public class ExportBinlogRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private ExportFilterInfo info;

    public ExportBinlogRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ExportBinlogRequestBody withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * binlog解析任务ID
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public ExportBinlogRequestBody withInfo(ExportFilterInfo info) {
        this.info = info;
        return this;
    }

    public ExportBinlogRequestBody withInfo(Consumer<ExportFilterInfo> infoSetter) {
        if (this.info == null) {
            this.info = new ExportFilterInfo();
            infoSetter.accept(this.info);
        }

        return this;
    }

    /**
     * Get info
     * @return info
     */
    public ExportFilterInfo getInfo() {
        return info;
    }

    public void setInfo(ExportFilterInfo info) {
        this.info = info;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportBinlogRequestBody that = (ExportBinlogRequestBody) obj;
        return Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, taskId, info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportBinlogRequestBody {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
