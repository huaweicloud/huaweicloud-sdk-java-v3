package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EditingVideoInfo
 */
public class EditingVideoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate_bps")

    private Long bitrateBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    private String codec;

    public EditingVideoInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度 
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

    public EditingVideoInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度
     * minimum: 0
     * maximum: 4096
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public EditingVideoInfo withBitrate(Integer bitrate) {
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

    public EditingVideoInfo withBitrateBps(Long bitrateBps) {
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

    public EditingVideoInfo withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 输出帧率。 
     * minimum: 0
     * maximum: 8028
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public EditingVideoInfo withCodec(String codec) {
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
        EditingVideoInfo editingVideoInfo = (EditingVideoInfo) o;
        return Objects.equals(this.width, editingVideoInfo.width)
            && Objects.equals(this.height, editingVideoInfo.height)
            && Objects.equals(this.bitrate, editingVideoInfo.bitrate)
            && Objects.equals(this.bitrateBps, editingVideoInfo.bitrateBps)
            && Objects.equals(this.frameRate, editingVideoInfo.frameRate)
            && Objects.equals(this.codec, editingVideoInfo.codec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, bitrate, bitrateBps, frameRate, codec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditingVideoInfo {\n");
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
