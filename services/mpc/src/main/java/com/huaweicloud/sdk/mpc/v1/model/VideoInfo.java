package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * VideoInfo
 */
public class VideoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    @JacksonXmlProperty(localName = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    @JacksonXmlProperty(localName = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    @JacksonXmlProperty(localName = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate_bps")

    @JacksonXmlProperty(localName = "bitrate_bps")

    private Long bitrateBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    @JacksonXmlProperty(localName = "frame_rate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    @JacksonXmlProperty(localName = "codec")

    private String codec;

    public VideoInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度
     * minimum: 0
     * maximum: 2147483647
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VideoInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度
     * minimum: 0
     * maximum: 2147483647
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VideoInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 视频码率，单位: kbit/s 
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

    public VideoInfo withBitrateBps(Long bitrateBps) {
        this.bitrateBps = bitrateBps;
        return this;
    }

    /**
     * 视频码率，单位: bit/s 
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

    public VideoInfo withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率。    取值范围：0或[5,60]，0表示自适应。    单位：帧每秒。    > 若设置的帧率不在取值范围内，则自动调整为0，若设置的帧率高于片源帧率，则自动调整为片源帧率。 
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

    public VideoInfo withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * 视频编码格式
     * @return codec
     */
    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) o;
        return Objects.equals(this.width, videoInfo.width) && Objects.equals(this.height, videoInfo.height)
            && Objects.equals(this.bitrate, videoInfo.bitrate) && Objects.equals(this.bitrateBps, videoInfo.bitrateBps)
            && Objects.equals(this.frameRate, videoInfo.frameRate) && Objects.equals(this.codec, videoInfo.codec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, bitrate, bitrateBps, frameRate, codec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoInfo {\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    bitrateBps: ").append(toIndentedString(bitrateBps)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
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
