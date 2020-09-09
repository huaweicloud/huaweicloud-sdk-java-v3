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
 * Audio
 */
public class Audio  {

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
    
    private Integer codec = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sample_rate")
    
    private Integer sampleRate = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bitrate")
    
    private Integer bitrate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channels")
    
    private Integer channels;

    public Audio withOutputPolicy(OutputPolicyEnum outputPolicy) {
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

    public Audio withCodec(Integer codec) {
        this.codec = codec;
        return this;
    }

    


    /**
     * 音频编码格式。  取值如下：  - 1：AAC格式。 - 2：HEAAC1格式 。 - 3：HEAAC2格式。 - 4：MP3格式 。 
     * minimum: 1
     * maximum: 4
     * @return codec
     */
    public Integer getCodec() {
        return codec;
    }

    public void setCodec(Integer codec) {
        this.codec = codec;
    }

    public Audio withSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    


    /**
     * 音频采样率。  取值如下：  - 1：AUDIO_SAMPLE_AUTO - 2：AUDIO_SAMPLE_22050（22050Hz） - 3：AUDIO_SAMPLE_32000（32000Hz） - 4：AUDIO_SAMPLE_44100（44100Hz） - 5：AUDIO_SAMPLE_48000（48000Hz） - 6：AUDIO_SAMPLE_96000（96000Hz） 
     * minimum: 1
     * maximum: 6
     * @return sampleRate
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    public Audio withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    


    /**
     * 音频码率。  取值范围：0或[8,1000]。  单位：kbit/s。 
     * minimum: 0
     * maximum: 2147483647
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public Audio withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    


    /**
     * 声道数。  取值如下： - 1：AUDIO_CHANNELS_1 - 2：AUDIO_CHANNELS_2 - 6：AUDIO_CHANNELS_5_1 
     * minimum: 1
     * maximum: 6
     * @return channels
     */
    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Audio audio = (Audio) o;
        return Objects.equals(this.outputPolicy, audio.outputPolicy) &&
            Objects.equals(this.codec, audio.codec) &&
            Objects.equals(this.sampleRate, audio.sampleRate) &&
            Objects.equals(this.bitrate, audio.bitrate) &&
            Objects.equals(this.channels, audio.channels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(outputPolicy, codec, sampleRate, bitrate, channels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Audio {\n");
        sb.append("    outputPolicy: ").append(toIndentedString(outputPolicy)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

