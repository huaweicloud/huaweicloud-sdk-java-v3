package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVideoMotionCaptureJobResponse extends SdkResponse {

    /**
     * 视频驱动模式。 * HEAD: 头部 * HALF_BODY: 半身 * FULL_BODY: 全身 * AUTO: 自动
     */
    public static final class MotionCaptureModeEnum {

        /**
         * Enum HEAD for value: "HEAD"
         */
        public static final MotionCaptureModeEnum HEAD = new MotionCaptureModeEnum("HEAD");

        /**
         * Enum HALF_BODY for value: "HALF_BODY"
         */
        public static final MotionCaptureModeEnum HALF_BODY = new MotionCaptureModeEnum("HALF_BODY");

        /**
         * Enum FULL_BODY for value: "FULL_BODY"
         */
        public static final MotionCaptureModeEnum FULL_BODY = new MotionCaptureModeEnum("FULL_BODY");

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final MotionCaptureModeEnum AUTO = new MotionCaptureModeEnum("AUTO");

        private static final Map<String, MotionCaptureModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MotionCaptureModeEnum> createStaticFields() {
            Map<String, MotionCaptureModeEnum> map = new HashMap<>();
            map.put("HEAD", HEAD);
            map.put("HALF_BODY", HALF_BODY);
            map.put("FULL_BODY", FULL_BODY);
            map.put("AUTO", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MotionCaptureModeEnum(String value) {
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
        public static MotionCaptureModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MotionCaptureModeEnum(value));
        }

        public static MotionCaptureModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MotionCaptureModeEnum) {
                return this.value.equals(((MotionCaptureModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "motion_capture_mode")

    private MotionCaptureModeEnum motionCaptureMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_info")

    private InputInfo inputInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_info")

    private OutputInfo outputInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 任务的状态。 * WAITING: 等待中 * PROCESSING: 处理中 * SUCCEED: 成功 * FAILED: 失败
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

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowVideoMotionCaptureJobResponse withMotionCaptureMode(MotionCaptureModeEnum motionCaptureMode) {
        this.motionCaptureMode = motionCaptureMode;
        return this;
    }

    /**
     * 视频驱动模式。 * HEAD: 头部 * HALF_BODY: 半身 * FULL_BODY: 全身 * AUTO: 自动
     * @return motionCaptureMode
     */
    public MotionCaptureModeEnum getMotionCaptureMode() {
        return motionCaptureMode;
    }

    public void setMotionCaptureMode(MotionCaptureModeEnum motionCaptureMode) {
        this.motionCaptureMode = motionCaptureMode;
    }

    public ShowVideoMotionCaptureJobResponse withInputInfo(InputInfo inputInfo) {
        this.inputInfo = inputInfo;
        return this;
    }

    public ShowVideoMotionCaptureJobResponse withInputInfo(Consumer<InputInfo> inputInfoSetter) {
        if (this.inputInfo == null) {
            this.inputInfo = new InputInfo();
            inputInfoSetter.accept(this.inputInfo);
        }

        return this;
    }

    /**
     * Get inputInfo
     * @return inputInfo
     */
    public InputInfo getInputInfo() {
        return inputInfo;
    }

    public void setInputInfo(InputInfo inputInfo) {
        this.inputInfo = inputInfo;
    }

    public ShowVideoMotionCaptureJobResponse withOutputInfo(OutputInfo outputInfo) {
        this.outputInfo = outputInfo;
        return this;
    }

    public ShowVideoMotionCaptureJobResponse withOutputInfo(Consumer<OutputInfo> outputInfoSetter) {
        if (this.outputInfo == null) {
            this.outputInfo = new OutputInfo();
            outputInfoSetter.accept(this.outputInfo);
        }

        return this;
    }

    /**
     * Get outputInfo
     * @return outputInfo
     */
    public OutputInfo getOutputInfo() {
        return outputInfo;
    }

    public void setOutputInfo(OutputInfo outputInfo) {
        this.outputInfo = outputInfo;
    }

    public ShowVideoMotionCaptureJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 视频驱动任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowVideoMotionCaptureJobResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务的状态。 * WAITING: 等待中 * PROCESSING: 处理中 * SUCCEED: 成功 * FAILED: 失败
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowVideoMotionCaptureJobResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间,格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowVideoMotionCaptureJobResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间,格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVideoMotionCaptureJobResponse that = (ShowVideoMotionCaptureJobResponse) obj;
        return Objects.equals(this.motionCaptureMode, that.motionCaptureMode)
            && Objects.equals(this.inputInfo, that.inputInfo) && Objects.equals(this.outputInfo, that.outputInfo)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motionCaptureMode, inputInfo, outputInfo, jobId, state, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVideoMotionCaptureJobResponse {\n");
        sb.append("    motionCaptureMode: ").append(toIndentedString(motionCaptureMode)).append("\n");
        sb.append("    inputInfo: ").append(toIndentedString(inputInfo)).append("\n");
        sb.append("    outputInfo: ").append(toIndentedString(outputInfo)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
