package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * EditAudioInfo
 */
public class EditAudioInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    @JacksonXmlProperty(localName = "codec")

    private String codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    @JacksonXmlProperty(localName = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    @JacksonXmlProperty(localName = "sample")

    private Integer sample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    @JacksonXmlProperty(localName = "channels")

    private String channels;

    public EditAudioInfo withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * 音频编码格式,取值有：[AAC, HEAAC, MP3]。
     * @return codec
     */
    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public EditAudioInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 视频码率，单位: bit/s 
     * minimum: 0
     * maximum: 20000000
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public EditAudioInfo withSample(Integer sample) {
        this.sample = sample;
        return this;
    }

    /**
     * 采样率, 单位: HZ 
     * minimum: 0
     * maximum: 96000
     * @return sample
     */
    public Integer getSample() {
        return sample;
    }

    public void setSample(Integer sample) {
        this.sample = sample;
    }

    public EditAudioInfo withChannels(String channels) {
        this.channels = channels;
        return this;
    }

    /**
     * 声道数。
     * @return channels
     */
    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
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
        EditAudioInfo editAudioInfo = (EditAudioInfo) o;
        return Objects.equals(this.codec, editAudioInfo.codec) && Objects.equals(this.bitrate, editAudioInfo.bitrate)
            && Objects.equals(this.sample, editAudioInfo.sample)
            && Objects.equals(this.channels, editAudioInfo.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codec, bitrate, sample, channels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditAudioInfo {\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
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
