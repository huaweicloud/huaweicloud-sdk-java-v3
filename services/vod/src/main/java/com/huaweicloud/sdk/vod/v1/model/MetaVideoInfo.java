package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetaVideoInfo
 */
public class MetaVideoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Long bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    private String codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fps")

    private Integer fps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    public MetaVideoInfo withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 视频码率，单位：bit/s 
     * @return bitrate
     */
    public Long getBitrate() {
        return bitrate;
    }

    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    public MetaVideoInfo withCodec(String codec) {
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

    public MetaVideoInfo withFps(Integer fps) {
        this.fps = fps;
        return this;
    }

    /**
     * 帧率 
     * @return fps
     */
    public Integer getFps() {
        return fps;
    }

    public void setFps(Integer fps) {
        this.fps = fps;
    }

    public MetaVideoInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度 
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public MetaVideoInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度 
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaVideoInfo that = (MetaVideoInfo) obj;
        return Objects.equals(this.bitrate, that.bitrate) && Objects.equals(this.codec, that.codec)
            && Objects.equals(this.fps, that.fps) && Objects.equals(this.height, that.height)
            && Objects.equals(this.width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitrate, codec, fps, height, width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaVideoInfo {\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
