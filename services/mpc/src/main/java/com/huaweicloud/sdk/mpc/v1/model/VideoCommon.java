package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.OutputPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VideoCommon
 */
public class VideoCommon  {

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
        

        private static final Map<String, OutputPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OutputPolicyEnum> createStaticFields() {
            Map<String, OutputPolicyEnum> map = new HashMap<>();
            map.put("transcode", TRANSCODE);
            map.put("discard", DISCARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OutputPolicyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OutputPolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OutputPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OutputPolicyEnum(value);
            }
            return result;
        }

        public static OutputPolicyEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof OutputPolicyEnum) {
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
    @JsonProperty(value="output_policy")
    
    private OutputPolicyEnum outputPolicy = OutputPolicyEnum.TRANSCODE;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="codec")
    
    private Integer codec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="profile")
    
    private Integer profile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    
    private Integer level = 15;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preset")
    
    private Integer preset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ref_frames_count")
    
    private Integer refFramesCount = 4;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_iframes_interval")
    
    private Integer maxIframesInterval = 5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bframes_count")
    
    private Integer bframesCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="frame_rate")
    
    private Integer frameRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_timestamp")
    
    private Boolean syncTimestamp = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_ratio")
    
    private Integer aspectRatio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="black_cut")
    
    private Integer blackCut;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="GOP_structure")
    
    private Boolean goPStructure = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sr_factor")
    
    private String srFactor;

    public VideoCommon withOutputPolicy(OutputPolicyEnum outputPolicy) {
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

    public VideoCommon withCodec(Integer codec) {
        this.codec = codec;
        return this;
    }

    


    /**
     * 视频编码格式。  取值如下： - 1：表示H.264。 - 2：表示H.265。 
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

    public VideoCommon withProfile(Integer profile) {
        this.profile = profile;
        return this;
    }

    


    /**
     * 编码档次，建议设为3。  取值如下： - 1：VIDEO_PROFILE_H264_BASE - 2：VIDEO_PROFILE_H264_MAIN - 3：VIDEO_PROFILE_H264_HIGH - 4：VIDEO_PROFILE_H265_MAIN 
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

    public VideoCommon withLevel(Integer level) {
        this.level = level;
        return this;
    }

    


    /**
     * 编码级别。  取值如下： - 1：VIDEO_LEVEL_1_0 - 2：VIDEO_LEVEL_1_1 - 3：VIDEO_LEVEL_1_2 - 4：VIDEO_LEVEL_1_3 - 5：VIDEO_LEVEL_2_0 - 6：VIDEO_LEVEL_2_1 - 7：VIDEO_LEVEL_2_2 - 8：VIDEO_LEVEL_3_0 - 9：VIDEO_LEVEL_3_1 - 10：VIDEO_LEVEL_3_2 - 11：VIDEO_LEVEL_4_0 - 12：VIDEO_LEVEL_4_1 - 13：VIDEO_LEVEL_4_2 - 14：VIDEO_LEVEL_5_0 - 15：VIDEO_LEVEL_5_1 
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

    public VideoCommon withPreset(Integer preset) {
        this.preset = preset;
        return this;
    }

    


    /**
     * 编码质量等级。  取值如下： - 1：VIDEO_PRESET_HSPEED2 - 2：VIDEO_PRESET_HSPEED - 3：VIDEO_PRESET_NORMAL > 值越大，表示编码的质量越高，转码耗时也越长。 
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

    public VideoCommon withRefFramesCount(Integer refFramesCount) {
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

    public VideoCommon withMaxIframesInterval(Integer maxIframesInterval) {
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

    public VideoCommon withBframesCount(Integer bframesCount) {
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

    public VideoCommon withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    


    /**
     * 帧率  取值范围：0或[5,60]之间的整数，0表示自适应  单位：帧每秒 
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

    public VideoCommon withSyncTimestamp(Boolean syncTimestamp) {
        this.syncTimestamp = syncTimestamp;
        return this;
    }

    


    /**
     * 降帧率时是否同步调整时间戳 在配置降帧率场景下有效。 取值如下： - false：不调整时间戳； - true：根据 frame_rate 配置的帧率，重新计算时间戳。 
     * @return syncTimestamp
     */
    public Boolean getSyncTimestamp() {
        return syncTimestamp;
    }

    public void setSyncTimestamp(Boolean syncTimestamp) {
        this.syncTimestamp = syncTimestamp;
    }

    public VideoCommon withAspectRatio(Integer aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    


    /**
     * 纵横比，图像缩放方式 
     * minimum: 0
     * maximum: 2
     * @return aspectRatio
     */
    public Integer getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Integer aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public VideoCommon withBlackCut(Integer blackCut) {
        this.blackCut = blackCut;
        return this;
    }

    


    /**
     * 黑边剪裁类型  取值如下： - 0：不开启黑边剪裁 - 1：开启黑边剪裁，低复杂度算法，针对长视频（>5分钟） - 2：开启黑边剪裁，高复杂度算法，针对短视频（<=5分钟） 
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

    public VideoCommon withGoPStructure(Boolean goPStructure) {
        this.goPStructure = goPStructure;
        return this;
    }

    


    /**
     * GOP类型（暂不开放） 0: Closed (Default) 1:Open 
     * @return goPStructure
     */
    public Boolean getGoPStructure() {
        return goPStructure;
    }

    public void setGoPStructure(Boolean goPStructure) {
        this.goPStructure = goPStructure;
    }

    public VideoCommon withSrFactor(String srFactor) {
        this.srFactor = srFactor;
        return this;
    }

    


    /**
     * 超分倍数  取值如下： - 2：两倍超分 
     * @return srFactor
     */
    public String getSrFactor() {
        return srFactor;
    }

    public void setSrFactor(String srFactor) {
        this.srFactor = srFactor;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCommon videoCommon = (VideoCommon) o;
        return Objects.equals(this.outputPolicy, videoCommon.outputPolicy) &&
            Objects.equals(this.codec, videoCommon.codec) &&
            Objects.equals(this.profile, videoCommon.profile) &&
            Objects.equals(this.level, videoCommon.level) &&
            Objects.equals(this.preset, videoCommon.preset) &&
            Objects.equals(this.refFramesCount, videoCommon.refFramesCount) &&
            Objects.equals(this.maxIframesInterval, videoCommon.maxIframesInterval) &&
            Objects.equals(this.bframesCount, videoCommon.bframesCount) &&
            Objects.equals(this.frameRate, videoCommon.frameRate) &&
            Objects.equals(this.syncTimestamp, videoCommon.syncTimestamp) &&
            Objects.equals(this.aspectRatio, videoCommon.aspectRatio) &&
            Objects.equals(this.blackCut, videoCommon.blackCut) &&
            Objects.equals(this.goPStructure, videoCommon.goPStructure) &&
            Objects.equals(this.srFactor, videoCommon.srFactor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(outputPolicy, codec, profile, level, preset, refFramesCount, maxIframesInterval, bframesCount, frameRate, syncTimestamp, aspectRatio, blackCut, goPStructure, srFactor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCommon {\n");
        sb.append("    outputPolicy: ").append(toIndentedString(outputPolicy)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    refFramesCount: ").append(toIndentedString(refFramesCount)).append("\n");
        sb.append("    maxIframesInterval: ").append(toIndentedString(maxIframesInterval)).append("\n");
        sb.append("    bframesCount: ").append(toIndentedString(bframesCount)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    syncTimestamp: ").append(toIndentedString(syncTimestamp)).append("\n");
        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    blackCut: ").append(toIndentedString(blackCut)).append("\n");
        sb.append("    goPStructure: ").append(toIndentedString(goPStructure)).append("\n");
        sb.append("    srFactor: ").append(toIndentedString(srFactor)).append("\n");
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

