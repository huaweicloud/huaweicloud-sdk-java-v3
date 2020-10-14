package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AudioInfo
 */
public class AudioInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="codec")
    
    private String codec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sample")
    
    private Integer sample;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channels")
    
    private Integer channels;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bitrate")
    
    private Integer bitrate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bitrate_bps")
    
    private Long bitrateBps;

    public AudioInfo withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    


    /**
     * 音频编码格式
     * @return codec
     */
    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public AudioInfo withSample(Integer sample) {
        this.sample = sample;
        return this;
    }

    


    /**
     * 音频采样率
     * @return sample
     */
    public Integer getSample() {
        return sample;
    }

    public void setSample(Integer sample) {
        this.sample = sample;
    }

    public AudioInfo withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    


    /**
     * 音频信道
     * @return channels
     */
    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public AudioInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    


    /**
     * 音频码率，单位: kbit/s 
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public AudioInfo withBitrateBps(Long bitrateBps) {
        this.bitrateBps = bitrateBps;
        return this;
    }

    


    /**
     * 音频码率，单位: bit/s 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return bitrateBps
     */
    public Long getBitrateBps() {
        return bitrateBps;
    }

    public void setBitrateBps(Long bitrateBps) {
        this.bitrateBps = bitrateBps;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioInfo audioInfo = (AudioInfo) o;
        return Objects.equals(this.codec, audioInfo.codec) &&
            Objects.equals(this.sample, audioInfo.sample) &&
            Objects.equals(this.channels, audioInfo.channels) &&
            Objects.equals(this.bitrate, audioInfo.bitrate) &&
            Objects.equals(this.bitrateBps, audioInfo.bitrateBps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codec, sample, channels, bitrate, bitrateBps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioInfo {\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    bitrateBps: ").append(toIndentedString(bitrateBps)).append("\n");
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

