package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * VideoAndTemplate
 */
public class VideoAndTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private Integer templateId;

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

    public VideoAndTemplate withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID 
     * minimum: 0
     * maximum: 2147483647
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public VideoAndTemplate withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度（单位：像素） - H264：范围[32,4096]，必须为2的倍数 - H265：范围[320,4096]，必须是4的倍数 
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

    public VideoAndTemplate withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度（单位：像素） - H264：范围[32,2880]，必须为2的倍数 - H265：范围[240,2880]，必须是4的倍数 
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

    public VideoAndTemplate withBitrate(Integer bitrate) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoAndTemplate videoAndTemplate = (VideoAndTemplate) o;
        return Objects.equals(this.templateId, videoAndTemplate.templateId)
            && Objects.equals(this.width, videoAndTemplate.width)
            && Objects.equals(this.height, videoAndTemplate.height)
            && Objects.equals(this.bitrate, videoAndTemplate.bitrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, width, height, bitrate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoAndTemplate {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
