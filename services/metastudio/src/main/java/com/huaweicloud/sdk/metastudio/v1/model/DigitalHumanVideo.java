package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数字人制作任务信息。
 */
public class DigitalHumanVideo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 任务的状态。 * WAITING：等待 * PROCESSING：处理中 * SUCCEED：成功 * FAILED：失败 * CANCELED：取消 * BLOCK: 冻结
     */
    public static final class StateEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StateEnum WAITING = new StateEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StateEnum PROCESSING = new StateEnum("PROCESSING");

        /**
         * Enum SUCCEED for value: "SUCCEED"
         */
        public static final StateEnum SUCCEED = new StateEnum("SUCCEED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StateEnum CANCELED = new StateEnum("CANCELED");

        /**
         * Enum BLOCK for value: "BLOCK"
         */
        public static final StateEnum BLOCK = new StateEnum("BLOCK");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            map.put("BLOCK", BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    /**
     * 任务类型。 * 2D_DIGITAL_HUMAN_VIDEO: 分身数字人视频制作任务 * DIGITAL_HUMAN_PHOTO_VIDEO: 照片数字人视频制作任务
     */
    public static final class JobTypeEnum {

        /**
         * Enum _2D_DIGITAL_HUMAN_VIDEO for value: "2D_DIGITAL_HUMAN_VIDEO"
         */
        public static final JobTypeEnum _2D_DIGITAL_HUMAN_VIDEO = new JobTypeEnum("2D_DIGITAL_HUMAN_VIDEO");

        /**
         * Enum DIGITAL_HUMAN_PHOTO_VIDEO for value: "DIGITAL_HUMAN_PHOTO_VIDEO"
         */
        public static final JobTypeEnum DIGITAL_HUMAN_PHOTO_VIDEO = new JobTypeEnum("DIGITAL_HUMAN_PHOTO_VIDEO");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("2D_DIGITAL_HUMAN_VIDEO", _2D_DIGITAL_HUMAN_VIDEO);
            map.put("DIGITAL_HUMAN_PHOTO_VIDEO", DIGITAL_HUMAN_PHOTO_VIDEO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Float duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_asset_config")

    private OutputAssetInfo outputAssetConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastupdate_time")

    private String lastupdateTime;

    public DigitalHumanVideo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DigitalHumanVideo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务的状态。 * WAITING：等待 * PROCESSING：处理中 * SUCCEED：成功 * FAILED：失败 * CANCELED：取消 * BLOCK: 冻结
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public DigitalHumanVideo withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务类型。 * 2D_DIGITAL_HUMAN_VIDEO: 分身数字人视频制作任务 * DIGITAL_HUMAN_PHOTO_VIDEO: 照片数字人视频制作任务
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public DigitalHumanVideo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 数字人视频制作开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DigitalHumanVideo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 数字人视频制作结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DigitalHumanVideo withDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**： 数字人视频内容时长。
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public DigitalHumanVideo withOutputAssetConfig(OutputAssetInfo outputAssetConfig) {
        this.outputAssetConfig = outputAssetConfig;
        return this;
    }

    public DigitalHumanVideo withOutputAssetConfig(Consumer<OutputAssetInfo> outputAssetConfigSetter) {
        if (this.outputAssetConfig == null) {
            this.outputAssetConfig = new OutputAssetInfo();
            outputAssetConfigSetter.accept(this.outputAssetConfig);
        }

        return this;
    }

    /**
     * Get outputAssetConfig
     * @return outputAssetConfig
     */
    public OutputAssetInfo getOutputAssetConfig() {
        return outputAssetConfig;
    }

    public void setOutputAssetConfig(OutputAssetInfo outputAssetConfig) {
        this.outputAssetConfig = outputAssetConfig;
    }

    public DigitalHumanVideo withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public DigitalHumanVideo withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
    }

    public DigitalHumanVideo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DigitalHumanVideo withLastupdateTime(String lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
        return this;
    }

    /**
     * 任务更新时间。
     * @return lastupdateTime
     */
    public String getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(String lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DigitalHumanVideo that = (DigitalHumanVideo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.outputAssetConfig, that.outputAssetConfig)
            && Objects.equals(this.errorInfo, that.errorInfo) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastupdateTime, that.lastupdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            state,
            jobType,
            startTime,
            endTime,
            duration,
            outputAssetConfig,
            errorInfo,
            createTime,
            lastupdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DigitalHumanVideo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    outputAssetConfig: ").append(toIndentedString(outputAssetConfig)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastupdateTime: ").append(toIndentedString(lastupdateTime)).append("\n");
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
