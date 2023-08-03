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
 * 视频驱动动作任务请求。
 */
public class VideoMotionCaptureJobReq {

    /**
     * 视频驱动模式。 * HEAD：头部 * HALF_BODY：半身 * FULL_BODY：全身 * AUTO：自动
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

    public VideoMotionCaptureJobReq withMotionCaptureMode(MotionCaptureModeEnum motionCaptureMode) {
        this.motionCaptureMode = motionCaptureMode;
        return this;
    }

    /**
     * 视频驱动模式。 * HEAD：头部 * HALF_BODY：半身 * FULL_BODY：全身 * AUTO：自动
     * @return motionCaptureMode
     */
    public MotionCaptureModeEnum getMotionCaptureMode() {
        return motionCaptureMode;
    }

    public void setMotionCaptureMode(MotionCaptureModeEnum motionCaptureMode) {
        this.motionCaptureMode = motionCaptureMode;
    }

    public VideoMotionCaptureJobReq withInputInfo(InputInfo inputInfo) {
        this.inputInfo = inputInfo;
        return this;
    }

    public VideoMotionCaptureJobReq withInputInfo(Consumer<InputInfo> inputInfoSetter) {
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

    public VideoMotionCaptureJobReq withOutputInfo(OutputInfo outputInfo) {
        this.outputInfo = outputInfo;
        return this;
    }

    public VideoMotionCaptureJobReq withOutputInfo(Consumer<OutputInfo> outputInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoMotionCaptureJobReq that = (VideoMotionCaptureJobReq) obj;
        return Objects.equals(this.motionCaptureMode, that.motionCaptureMode)
            && Objects.equals(this.inputInfo, that.inputInfo) && Objects.equals(this.outputInfo, that.outputInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motionCaptureMode, inputInfo, outputInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoMotionCaptureJobReq {\n");
        sb.append("    motionCaptureMode: ").append(toIndentedString(motionCaptureMode)).append("\n");
        sb.append("    inputInfo: ").append(toIndentedString(inputInfo)).append("\n");
        sb.append("    outputInfo: ").append(toIndentedString(outputInfo)).append("\n");
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
