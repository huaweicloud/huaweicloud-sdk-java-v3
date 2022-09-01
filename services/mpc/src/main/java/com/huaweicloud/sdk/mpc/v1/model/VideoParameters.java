package com.huaweicloud.sdk.mpc.v1.model;

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
 * VideoParameters
 */
public class VideoParameters {

    /**
     * 输出策略。  取值如下： - discard - transcode  >- 当视频参数中的“output_policy”为\"discard\"，且音频参数中的“output_policy”为“transcode”时，表示只输出音频。 >- 当视频参数中的“output_policy”为\"transcode\"，且音频参数中的“output_policy”为“discard”时，表示只输出视频。 >- 同时为\"discard\"时不合法。 >- 同时为“transcode”时，表示输出音视频。 
     */
    public static final class OutputPolicyEnum {

        /**
         * Enum TRANSCODE for value: "transcode"
         */
        public static final OutputPolicyEnum TRANSCODE = new OutputPolicyEnum("transcode");

        /**
         * Enum DISCARD for value: "discard"
         */
        public static final OutputPolicyEnum DISCARD = new OutputPolicyEnum("discard");

        /**
         * Enum COPY for value: "copy"
         */
        public static final OutputPolicyEnum COPY = new OutputPolicyEnum("copy");

        private static final Map<String, OutputPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OutputPolicyEnum> createStaticFields() {
            Map<String, OutputPolicyEnum> map = new HashMap<>();
            map.put("transcode", TRANSCODE);
            map.put("discard", DISCARD);
            map.put("copy", COPY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OutputPolicyEnum(String value) {
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
        public static OutputPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OutputPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OutputPolicyEnum(value);
            }
            return result;
        }

        public static OutputPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OutputPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OutputPolicyEnum) {
                return this.value.equals(((OutputPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_policy")

    @JacksonXmlProperty(localName = "output_policy")

    private OutputPolicyEnum outputPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    @JacksonXmlProperty(localName = "codec")

    private Integer codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    @JacksonXmlProperty(localName = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile")

    @JacksonXmlProperty(localName = "profile")

    private Integer profile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    @JacksonXmlProperty(localName = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preset")

    @JacksonXmlProperty(localName = "preset")

    private Integer preset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_frames_count")

    @JacksonXmlProperty(localName = "ref_frames_count")

    private Integer refFramesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_iframes_interval")

    @JacksonXmlProperty(localName = "max_iframes_interval")

    private Integer maxIframesInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bframes_count")

    @JacksonXmlProperty(localName = "bframes_count")

    private Integer bframesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    @JacksonXmlProperty(localName = "frame_rate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    @JacksonXmlProperty(localName = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    @JacksonXmlProperty(localName = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black_cut")

    @JacksonXmlProperty(localName = "black_cut")

    private Integer blackCut;

    public VideoParameters withOutputPolicy(OutputPolicyEnum outputPolicy) {
        this.outputPolicy = outputPolicy;
        return this;
    }

    /**
     * 输出策略。  取值如下： - discard - transcode  >- 当视频参数中的“output_policy”为\"discard\"，且音频参数中的“output_policy”为“transcode”时，表示只输出音频。 >- 当视频参数中的“output_policy”为\"transcode\"，且音频参数中的“output_policy”为“discard”时，表示只输出视频。 >- 同时为\"discard\"时不合法。 >- 同时为“transcode”时，表示输出音视频。 
     * @return outputPolicy
     */
    public OutputPolicyEnum getOutputPolicy() {
        return outputPolicy;
    }

    public void setOutputPolicy(OutputPolicyEnum outputPolicy) {
        this.outputPolicy = outputPolicy;
    }

    public VideoParameters withCodec(Integer codec) {
        this.codec = codec;
        return this;
    }

    /**
     * 视频编码格式。  取值如下： - 1：VIDEO_CODEC_H264 - 2：VIDEO_CODEC_H265 
     * minimum: 0
     * maximum: 3
     * @return codec
     */
    public Integer getCodec() {
        return codec;
    }

    public void setCodec(Integer codec) {
        this.codec = codec;
    }

    public VideoParameters withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 输出平均码率。  取值范围：0或[40,30000]之间的整数。  单位：kbit/s  若设置为0，则输出平均码率为自适应值。 
     * minimum: 0
     * maximum: 30000
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public VideoParameters withProfile(Integer profile) {
        this.profile = profile;
        return this;
    }

    /**
     * 编码档次  取值如下： - 1：VIDEO_PROFILE_H264_BASE - 2：VIDEO_PROFILE_H264_MAIN - 3：VIDEO_PROFILE_H264_HIGH - 4：VIDEO_PROFILE_H265_MAIN 
     * minimum: 0
     * maximum: 5
     * @return profile
     */
    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    public VideoParameters withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 编码级别  取值如下： - 1：VIDEO_LEVEL_1_0 - 2：VIDEO_LEVEL_1_1 - 3：VIDEO_LEVEL_1_2 - 4：VIDEO_LEVEL_1_3 - 5：VIDEO_LEVEL_2_0 - 6：VIDEO_LEVEL_2_1 - 7：VIDEO_LEVEL_2_2 - 8：VIDEO_LEVEL_3_0 - 9：VIDEO_LEVEL_3_1 - 10：VIDEO_LEVEL_3_2 - 11：VIDEO_LEVEL_4_0 - 12：VIDEO_LEVEL_4_1 - 13：VIDEO_LEVEL_4_2 - 14：VIDEO_LEVEL_5_0 - 15：VIDEO_LEVEL_5_1 - 16：VIDEO_LEVEL_x_x 
     * minimum: 0
     * maximum: 16
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public VideoParameters withPreset(Integer preset) {
        this.preset = preset;
        return this;
    }

    /**
     * 编码质量等级  取值如下： - 1：VIDEO_PRESET_HSPEED2 (只用于h.265, h.265 default) - 2：VIDEO_PRESET_HSPEED (只用于h.265) - 3：VIDEO_PRESET_NORMAL (h264/h.265可用，h.264 default) 
     * minimum: 0
     * maximum: 4
     * @return preset
     */
    public Integer getPreset() {
        return preset;
    }

    public void setPreset(Integer preset) {
        this.preset = preset;
    }

    public VideoParameters withRefFramesCount(Integer refFramesCount) {
        this.refFramesCount = refFramesCount;
        return this;
    }

    /**
     * 最大参考帧数。  取值范围： - H264：[1，8]，默认值为4 。 - H265：固定值4。  单位：帧。 
     * minimum: 0
     * maximum: 8
     * @return refFramesCount
     */
    public Integer getRefFramesCount() {
        return refFramesCount;
    }

    public void setRefFramesCount(Integer refFramesCount) {
        this.refFramesCount = refFramesCount;
    }

    public VideoParameters withMaxIframesInterval(Integer maxIframesInterval) {
        this.maxIframesInterval = maxIframesInterval;
        return this;
    }

    /**
     * I帧最大间隔  取值范围：[2，10]。  默认值：5。  单位：秒。 
     * minimum: 2
     * maximum: 10
     * @return maxIframesInterval
     */
    public Integer getMaxIframesInterval() {
        return maxIframesInterval;
    }

    public void setMaxIframesInterval(Integer maxIframesInterval) {
        this.maxIframesInterval = maxIframesInterval;
    }

    public VideoParameters withBframesCount(Integer bframesCount) {
        this.bframesCount = bframesCount;
        return this;
    }

    /**
     * 最大B帧间隔。  取值范围： - H264：[0，7]，默认值为4。 - H265：[0，7]，默认值为7。  单位：帧。 
     * minimum: 0
     * maximum: 8
     * @return bframesCount
     */
    public Integer getBframesCount() {
        return bframesCount;
    }

    public void setBframesCount(Integer bframesCount) {
        this.bframesCount = bframesCount;
    }

    public VideoParameters withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率。  取值范围：0或[5,60]，0表示自适应。  单位：帧每秒。  > 若设置的帧率不在取值范围内，则自动调整为0，若设置的帧率高于片源帧率，则自动调整为片源帧率。 
     * minimum: 0
     * maximum: 2147483647
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public VideoParameters withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度（单位：像素）  - H264：范围[32,4096]，必须为2的倍数 - H265：范围[320,4096]，必须是4的倍数 
     * minimum: 0
     * maximum: 4096
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VideoParameters withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度（单位：像素）  - H264：范围[32,2880]，必须为2的倍数 - H265：范围[240,2880] ，必须是4的倍数 
     * minimum: 0
     * maximum: 2880
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VideoParameters withBlackCut(Integer blackCut) {
        this.blackCut = blackCut;
        return this;
    }

    /**
     * 黑边剪裁类型  - 0：不开启黑边剪裁 - 1：开启黑边剪裁，低复杂度算法，针对长视频（>5分钟） - 2：开启黑边剪裁，高复杂度算法，针对短视频（<=5分钟） 
     * minimum: 0
     * maximum: 2
     * @return blackCut
     */
    public Integer getBlackCut() {
        return blackCut;
    }

    public void setBlackCut(Integer blackCut) {
        this.blackCut = blackCut;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoParameters videoParameters = (VideoParameters) o;
        return Objects.equals(this.outputPolicy, videoParameters.outputPolicy)
            && Objects.equals(this.codec, videoParameters.codec)
            && Objects.equals(this.bitrate, videoParameters.bitrate)
            && Objects.equals(this.profile, videoParameters.profile)
            && Objects.equals(this.level, videoParameters.level) && Objects.equals(this.preset, videoParameters.preset)
            && Objects.equals(this.refFramesCount, videoParameters.refFramesCount)
            && Objects.equals(this.maxIframesInterval, videoParameters.maxIframesInterval)
            && Objects.equals(this.bframesCount, videoParameters.bframesCount)
            && Objects.equals(this.frameRate, videoParameters.frameRate)
            && Objects.equals(this.width, videoParameters.width) && Objects.equals(this.height, videoParameters.height)
            && Objects.equals(this.blackCut, videoParameters.blackCut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputPolicy,
            codec,
            bitrate,
            profile,
            level,
            preset,
            refFramesCount,
            maxIframesInterval,
            bframesCount,
            frameRate,
            width,
            height,
            blackCut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoParameters {\n");
        sb.append("    outputPolicy: ").append(toIndentedString(outputPolicy)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    refFramesCount: ").append(toIndentedString(refFramesCount)).append("\n");
        sb.append("    maxIframesInterval: ").append(toIndentedString(maxIframesInterval)).append("\n");
        sb.append("    bframesCount: ").append(toIndentedString(bframesCount)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    blackCut: ").append(toIndentedString(blackCut)).append("\n");
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
