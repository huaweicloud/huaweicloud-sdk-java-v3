package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** OutputSetting */
public class OutputSetting {

    /** 剪切或拼接的输出封装格式。 */
    public static final class FormatEnum {

        /** Enum MP4 for value: "MP4" */
        public static final FormatEnum MP4 = new FormatEnum("MP4");

        /** Enum HLS for value: "HLS" */
        public static final FormatEnum HLS = new FormatEnum("HLS");

        /** Enum TS for value: "TS" */
        public static final FormatEnum TS = new FormatEnum("TS");

        /** Enum FLV for value: "FLV" */
        public static final FormatEnum FLV = new FormatEnum("FLV");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("MP4", MP4);
            map.put("HLS", HLS);
            map.put("TS", TS);
            map.put("FLV", FLV);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private EditVideoInfo video;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private EditAudioInfo audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls")

    private EditHlsInfo hls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    public OutputSetting withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /** 剪切或拼接的输出封装格式。
     * 
     * @return format */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public OutputSetting withVideo(EditVideoInfo video) {
        this.video = video;
        return this;
    }

    public OutputSetting withVideo(Consumer<EditVideoInfo> videoSetter) {
        if (this.video == null) {
            this.video = new EditVideoInfo();
            videoSetter.accept(this.video);
        }

        return this;
    }

    /** Get video
     * 
     * @return video */
    public EditVideoInfo getVideo() {
        return video;
    }

    public void setVideo(EditVideoInfo video) {
        this.video = video;
    }

    public OutputSetting withAudio(EditAudioInfo audio) {
        this.audio = audio;
        return this;
    }

    public OutputSetting withAudio(Consumer<EditAudioInfo> audioSetter) {
        if (this.audio == null) {
            this.audio = new EditAudioInfo();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /** Get audio
     * 
     * @return audio */
    public EditAudioInfo getAudio() {
        return audio;
    }

    public void setAudio(EditAudioInfo audio) {
        this.audio = audio;
    }

    public OutputSetting withHls(EditHlsInfo hls) {
        this.hls = hls;
        return this;
    }

    public OutputSetting withHls(Consumer<EditHlsInfo> hlsSetter) {
        if (this.hls == null) {
            this.hls = new EditHlsInfo();
            hlsSetter.accept(this.hls);
        }

        return this;
    }

    /** Get hls
     * 
     * @return hls */
    public EditHlsInfo getHls() {
        return hls;
    }

    public void setHls(EditHlsInfo hls) {
        this.hls = hls;
    }

    public OutputSetting withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public OutputSetting withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /** Get output
     * 
     * @return output */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputSetting outputSetting = (OutputSetting) o;
        return Objects.equals(this.format, outputSetting.format) && Objects.equals(this.video, outputSetting.video)
            && Objects.equals(this.audio, outputSetting.audio) && Objects.equals(this.hls, outputSetting.hls)
            && Objects.equals(this.output, outputSetting.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, video, audio, hls, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputSetting {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    hls: ").append(toIndentedString(hls)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
