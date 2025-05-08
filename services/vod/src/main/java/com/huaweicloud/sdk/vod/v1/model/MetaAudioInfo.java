package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetaAudioInfo
 */
public class MetaAudioInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    private String codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sampling_rate")

    private Integer samplingRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Long bitrate;

    public MetaAudioInfo withCodec(String codec) {
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

    public MetaAudioInfo withSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }

    /**
     * 音频采样率 
     * @return samplingRate
     */
    public Integer getSamplingRate() {
        return samplingRate;
    }

    public void setSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
    }

    public MetaAudioInfo withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 音频码率，单位：bit/s 
     * @return bitrate
     */
    public Long getBitrate() {
        return bitrate;
    }

    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaAudioInfo that = (MetaAudioInfo) obj;
        return Objects.equals(this.codec, that.codec) && Objects.equals(this.samplingRate, that.samplingRate)
            && Objects.equals(this.bitrate, that.bitrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codec, samplingRate, bitrate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaAudioInfo {\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    samplingRate: ").append(toIndentedString(samplingRate)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
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
