package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** WatermarkTemplate */
public class WatermarkTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Long status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private String dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private String dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private String width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_type")

    private String watermarkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_process")

    private String imageProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_duration")

    private String timelineDuration;

    public WatermarkTemplate withName(String name) {
        this.name = name;
        return this;
    }

    /** 水印模板名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WatermarkTemplate withId(String id) {
        this.id = id;
        return this;
    }

    /** 水印模板配置id。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WatermarkTemplate withStatus(Long status) {
        this.status = status;
        return this;
    }

    /** 启用状态。 取值为： - 0：停用 - 1：启用
     * 
     * @return status */
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public WatermarkTemplate withDx(String dx) {
        this.dx = dx;
        return this;
    }

    /** 水印图片相对输出视频的水平偏移量。 默认值是0。
     * 
     * @return dx */
    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public WatermarkTemplate withDy(String dy) {
        this.dy = dy;
        return this;
    }

    /** 水印图片相对输出视频的垂直偏移量。 默认值是0。
     * 
     * @return dy */
    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public WatermarkTemplate withPosition(String position) {
        this.position = position;
        return this;
    }

    /** 水印的位置。
     * 
     * @return position */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public WatermarkTemplate withWidth(String width) {
        this.width = width;
        return this;
    }

    /** 水印图片宽。
     * 
     * @return width */
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public WatermarkTemplate withHeight(String height) {
        this.height = height;
        return this;
    }

    /** 水印图片高。
     * 
     * @return height */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public WatermarkTemplate withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间。
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public WatermarkTemplate withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /** 水印图片下载url。
     * 
     * @return imageUrl */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public WatermarkTemplate withType(String type) {
        this.type = type;
        return this;
    }

    /** 水印图片格式类型。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WatermarkTemplate withWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }

    /** 水印类型，当前只支持Image（图片水印）。
     * 
     * @return watermarkType */
    public String getWatermarkType() {
        return watermarkType;
    }

    public void setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
    }

    public WatermarkTemplate withImageProcess(String imageProcess) {
        this.imageProcess = imageProcess;
        return this;
    }

    /** type设置为Image时有效。 目前包括： - Original：只做简单缩放，不做其他处理 - Transparent：图片底色透明 - Grayed：彩色图片变灰
     * 
     * @return imageProcess */
    public String getImageProcess() {
        return imageProcess;
    }

    public void setImageProcess(String imageProcess) {
        this.imageProcess = imageProcess;
    }

    public WatermarkTemplate withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    /** 水印开始时间。
     * 
     * @return timelineStart */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public WatermarkTemplate withTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
        return this;
    }

    /** 水印持续时间。
     * 
     * @return timelineDuration */
    public String getTimelineDuration() {
        return timelineDuration;
    }

    public void setTimelineDuration(String timelineDuration) {
        this.timelineDuration = timelineDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WatermarkTemplate watermarkTemplate = (WatermarkTemplate) o;
        return Objects.equals(this.name, watermarkTemplate.name) && Objects.equals(this.id, watermarkTemplate.id)
            && Objects.equals(this.status, watermarkTemplate.status) && Objects.equals(this.dx, watermarkTemplate.dx)
            && Objects.equals(this.dy, watermarkTemplate.dy)
            && Objects.equals(this.position, watermarkTemplate.position)
            && Objects.equals(this.width, watermarkTemplate.width)
            && Objects.equals(this.height, watermarkTemplate.height)
            && Objects.equals(this.createTime, watermarkTemplate.createTime)
            && Objects.equals(this.imageUrl, watermarkTemplate.imageUrl)
            && Objects.equals(this.type, watermarkTemplate.type)
            && Objects.equals(this.watermarkType, watermarkTemplate.watermarkType)
            && Objects.equals(this.imageProcess, watermarkTemplate.imageProcess)
            && Objects.equals(this.timelineStart, watermarkTemplate.timelineStart)
            && Objects.equals(this.timelineDuration, watermarkTemplate.timelineDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            status,
            dx,
            dy,
            position,
            width,
            height,
            createTime,
            imageUrl,
            type,
            watermarkType,
            imageProcess,
            timelineStart,
            timelineDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WatermarkTemplate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    watermarkType: ").append(toIndentedString(watermarkType)).append("\n");
        sb.append("    imageProcess: ").append(toIndentedString(imageProcess)).append("\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineDuration: ").append(toIndentedString(timelineDuration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
