package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SVGWatermark
 */
public class SVGWatermark {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private String dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private String dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referpos")

    private String referpos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_duration")

    private String timelineDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "random_time_min")

    private Float randomTimeMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "random_time_max")

    private Float randomTimeMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private String width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    public SVGWatermark withDx(String dx) {
        this.dx = dx;
        return this;
    }

    /**
     * 水印图片起点相对输出视频顶点的水平偏移量。 设置方法有如下两种： 整数型：表示图片起点水平偏移视频顶点的像素值，单位px。取值范围：[0，4096] 小数型：表示图片起点相对于视频分辨率宽的水平偏移比率。取值范围：(0，1)，支持4位小数，如0.9999，超出部分系统自动丢弃。 
     * @return dx
     */
    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public SVGWatermark withDy(String dy) {
        this.dy = dy;
        return this;
    }

    /**
     * 水印图片起点相对输出视频顶点的垂直偏移量。 设置方法有如下两种： 整数型：表示图片起点水平偏移视频顶点的像素值，单位px。取值范围：[0，4096] 小数型：表示图片起点相对于视频分辨率宽的水平偏移比率。取值范围：(0，1)，支持4位小数，如0.9999，超出部分系统自动丢弃。 
     * @return dy
     */
    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public SVGWatermark withReferpos(String referpos) {
        this.referpos = referpos;
        return this;
    }

    /**
     * 水印的位置。 取值如下： TopRight：右上角。 TopLeft：左上角。 BottomRight：右下角。 BottomLeft：左下角。 ClockWise：顺时针 AntiClockWise：逆时针 Random：随机跳转 
     * @return referpos
     */
    public String getReferpos() {
        return referpos;
    }

    public void setReferpos(String referpos) {
        this.referpos = referpos;
    }

    public SVGWatermark withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    /**
     * 水印开始时间，与“timeline_duration”配合使用。 
     * @return timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public SVGWatermark withTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
        return this;
    }

    /**
     * 水印持续时间，与“timeline_start”配合使用。 取值范围：[数字，ToEND]。“ToEND”表示持续到视频结束。 默认值：ToEND。 
     * @return timelineDuration
     */
    public String getTimelineDuration() {
        return timelineDuration;
    }

    public void setTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
    }

    public SVGWatermark withRandomTimeMin(Float randomTimeMin) {
        this.randomTimeMin = randomTimeMin;
        return this;
    }

    /**
     * 随机时间最小值，单位：秒 
     * minimum: 0
     * maximum: 3.6E+6
     * @return randomTimeMin
     */
    public Float getRandomTimeMin() {
        return randomTimeMin;
    }

    public void setRandomTimeMin(Float randomTimeMin) {
        this.randomTimeMin = randomTimeMin;
    }

    public SVGWatermark withRandomTimeMax(Float randomTimeMax) {
        this.randomTimeMax = randomTimeMax;
        return this;
    }

    /**
     * 随机时间最大值，单位：秒 
     * minimum: 0
     * maximum: 3.6E+6
     * @return randomTimeMax
     */
    public Float getRandomTimeMax() {
        return randomTimeMax;
    }

    public void setRandomTimeMax(Float randomTimeMax) {
        this.randomTimeMax = randomTimeMax;
    }

    public SVGWatermark withWidth(String width) {
        this.width = width;
        return this;
    }

    /**
     * 水印图片宽，值有两种形式： 整数型代水印图片宽的像素值，范围[8，4096]，单位px。 小数型代表相对输出视频分辨率宽的比率，范围(0,1)，支持4位小数，如0.9999，超出部分系统自动丢弃。 
     * @return width
     */
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public SVGWatermark withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 水印图片高，值有两种形式： 整数型代表水印图片高的像素值，范围[8，4096]，单位px。 小数型代表相对输出视频分辨率高的比率，范围(0，1)，支持4位小数，如0.9999，超出部分系统自动丢弃。 
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SVGWatermark that = (SVGWatermark) obj;
        return Objects.equals(this.dx, that.dx) && Objects.equals(this.dy, that.dy)
            && Objects.equals(this.referpos, that.referpos) && Objects.equals(this.timelineStart, that.timelineStart)
            && Objects.equals(this.timelineDuration, that.timelineDuration)
            && Objects.equals(this.randomTimeMin, that.randomTimeMin)
            && Objects.equals(this.randomTimeMax, that.randomTimeMax) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dx, dy, referpos, timelineStart, timelineDuration, randomTimeMin, randomTimeMax, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SVGWatermark {\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    referpos: ").append(toIndentedString(referpos)).append("\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineDuration: ").append(toIndentedString(timelineDuration)).append("\n");
        sb.append("    randomTimeMin: ").append(toIndentedString(randomTimeMin)).append("\n");
        sb.append("    randomTimeMax: ").append(toIndentedString(randomTimeMax)).append("\n");
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
