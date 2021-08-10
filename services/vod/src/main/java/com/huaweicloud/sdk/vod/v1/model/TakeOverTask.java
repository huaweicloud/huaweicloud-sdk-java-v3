package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** TakeOverTask */
public class TakeOverTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private Integer hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_bucket")

    private String outputBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_path")

    private String outputPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix")

    private List<String> suffix = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_group_name")

    private String templateGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /** 任务状态。 */
    public static final class StatusEnum {

        /** Enum PROCESSING for value: "PROCESSING" */
        public static final StatusEnum PROCESSING = new StatusEnum("PROCESSING");

        /** Enum SUCCEED for value: "SUCCEED" */
        public static final StatusEnum SUCCEED = new StatusEnum("SUCCEED");

        /** Enum FAILED for value: "FAILED" */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "exec_desc")

    private String execDesc;

    public TakeOverTask withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /** 桶名。
     * 
     * @return bucket */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public TakeOverTask withObject(String _object) {
        this._object = _object;
        return this;
    }

    /** 目录/文件名。
     * 
     * @return _object */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public TakeOverTask withHostType(Integer hostType) {
        this.hostType = hostType;
        return this;
    }

    /** 托管类型。 取值如下： - 0：表示存储到点播桶 - 1：表示存储在租户桶 - 2：表示存储到租户OBS桶中，且输出目录与源文件的存储目录相同。
     * 
     * @return hostType */
    public Integer getHostType() {
        return hostType;
    }

    public void setHostType(Integer hostType) {
        this.hostType = hostType;
    }

    public TakeOverTask withOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }

    /** 输出桶 。
     * 
     * @return outputBucket */
    public String getOutputBucket() {
        return outputBucket;
    }

    public void setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
    }

    public TakeOverTask withOutputPath(String outputPath) {
        this.outputPath = outputPath;
        return this;
    }

    /** 输出路径 。
     * 
     * @return outputPath */
    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public TakeOverTask withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务ID。
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TakeOverTask withSuffix(List<String> suffix) {
        this.suffix = suffix;
        return this;
    }

    public TakeOverTask addSuffixItem(String suffixItem) {
        if (this.suffix == null) {
            this.suffix = new ArrayList<>();
        }
        this.suffix.add(suffixItem);
        return this;
    }

    public TakeOverTask withSuffix(Consumer<List<String>> suffixSetter) {
        if (this.suffix == null) {
            this.suffix = new ArrayList<>();
        }
        suffixSetter.accept(this.suffix);
        return this;
    }

    /** 托管文件类型。
     * 
     * @return suffix */
    public List<String> getSuffix() {
        return suffix;
    }

    public void setSuffix(List<String> suffix) {
        this.suffix = suffix;
    }

    public TakeOverTask withTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }

    /** 转码模板组 。
     * 
     * @return templateGroupName */
    public String getTemplateGroupName() {
        return templateGroupName;
    }

    public void setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
    }

    public TakeOverTask withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间。
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TakeOverTask withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public TakeOverTask withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 任务状态。
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TakeOverTask withExecDesc(String execDesc) {
        this.execDesc = execDesc;
        return this;
    }

    /** 媒资的任务执行描述汇总。
     * 
     * @return execDesc */
    public String getExecDesc() {
        return execDesc;
    }

    public void setExecDesc(String execDesc) {
        this.execDesc = execDesc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TakeOverTask takeOverTask = (TakeOverTask) o;
        return Objects.equals(this.bucket, takeOverTask.bucket) && Objects.equals(this._object, takeOverTask._object)
            && Objects.equals(this.hostType, takeOverTask.hostType)
            && Objects.equals(this.outputBucket, takeOverTask.outputBucket)
            && Objects.equals(this.outputPath, takeOverTask.outputPath)
            && Objects.equals(this.taskId, takeOverTask.taskId) && Objects.equals(this.suffix, takeOverTask.suffix)
            && Objects.equals(this.templateGroupName, takeOverTask.templateGroupName)
            && Objects.equals(this.createTime, takeOverTask.createTime)
            && Objects.equals(this.endTime, takeOverTask.endTime) && Objects.equals(this.status, takeOverTask.status)
            && Objects.equals(this.execDesc, takeOverTask.execDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket,
            _object,
            hostType,
            outputBucket,
            outputPath,
            taskId,
            suffix,
            templateGroupName,
            createTime,
            endTime,
            status,
            execDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TakeOverTask {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    outputBucket: ").append(toIndentedString(outputBucket)).append("\n");
        sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        sb.append("    templateGroupName: ").append(toIndentedString(templateGroupName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    execDesc: ").append(toIndentedString(execDesc)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
