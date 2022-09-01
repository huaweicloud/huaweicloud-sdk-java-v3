package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * MosaicInfo
 */
public class MosaicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    @JacksonXmlProperty(localName = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_duration")

    @JacksonXmlProperty(localName = "timeline_duration")

    private String timelineDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    @JacksonXmlProperty(localName = "dx")

    private String dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    @JacksonXmlProperty(localName = "dy")

    private String dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    @JacksonXmlProperty(localName = "width")

    private String width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    @JacksonXmlProperty(localName = "height")

    private String height;

    public MosaicInfo withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    /**
     * 马赛克开始时间，与“timeline_duration”配合使用。  取值范围：数字。  单位：秒。 
     * @return timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public MosaicInfo withTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
        return this;
    }

    /**
     * 马赛克持续时间，与“timeline_start”配合使用。  取值范围：[数字，ToEND]。“ToEND”表示持续到视频结束。  默认值：ToEND。 
     * @return timelineDuration
     */
    public String getTimelineDuration() {
        return timelineDuration;
    }

    public void setTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
    }

    public MosaicInfo withDx(String dx) {
        this.dx = dx;
        return this;
    }

    /**
     * 马赛克起点相对输出视频顶点的水平偏移量。  设置方法有如下两种：  - 整数型：表示马赛克起点水平偏移视频顶点的像素值，单位px。取值范围：[0，4096] - 小数型：表示马赛克起点相对于视频分辨率宽的水平偏移比率。取值范围：(0，1)，支持4位小数，如0.9999。  示例：输出视频分辨率宽1920，设置“dx”为“0.1”，“referpos”为“TopRight”（右上角），则马赛克右上角到视频右顶点在水平方向上偏移距离为192。 
     * @return dx
     */
    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public MosaicInfo withDy(String dy) {
        this.dy = dy;
        return this;
    }

    /**
     * 马赛克起点相对输出视频顶点的垂直偏移量。  - 设置方法有如下两种：整数型：表示马赛克起点垂直偏移视频顶点的像素值，单位px。取值范围：[0，4096] - 小数型：表示马赛克起点相对于视频分辨率高的垂直偏移比率。取值范围：(0，1)，支持4位小数，如0.9999。  示例：输出视频分辨率高1080，设置“dy”为“0.1”，“referpos”为“TopRight”（右上角），则马赛克右上角到视频右顶点在垂直方向上的偏移距离为108。 
     * @return dy
     */
    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public MosaicInfo withWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * 马赛克宽，值有两种形式： - 整数型代马赛克宽的像素值，范围[8，4096]，单位px。 - 小数型代表相对输出视频分辨率宽的比率，范围(0,1)，支持4位小数，如0.9999。 
     * @return width
     */
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public MosaicInfo withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 马赛克高，值有两种形式： - 整数型代表马赛克的像素值，范围[8，4096]，单位px。 - 小数型代表相对输出视频分辨率高的比率，范围(0，1)，支持4位小数，如0.9999。 
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MosaicInfo mosaicInfo = (MosaicInfo) o;
        return Objects.equals(this.timelineStart, mosaicInfo.timelineStart)
            && Objects.equals(this.timelineDuration, mosaicInfo.timelineDuration)
            && Objects.equals(this.dx, mosaicInfo.dx) && Objects.equals(this.dy, mosaicInfo.dy)
            && Objects.equals(this.width, mosaicInfo.width) && Objects.equals(this.height, mosaicInfo.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timelineStart, timelineDuration, dx, dy, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MosaicInfo {\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineDuration: ").append(toIndentedString(timelineDuration)).append("\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
