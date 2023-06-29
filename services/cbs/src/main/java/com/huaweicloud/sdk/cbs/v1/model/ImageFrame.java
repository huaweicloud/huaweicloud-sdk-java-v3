package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ImageFrame {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_resolution_type")

    private Integer frameResolutionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_frame_position")

    private LeftRightPosition imageFramePosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_position")

    private LeftRightPosition imagePosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_type")

    private Integer resolutionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ImageFrame withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ImageFrame withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ImageFrame withFrameResolutionType(Integer frameResolutionType) {
        this.frameResolutionType = frameResolutionType;
        return this;
    }

    /**
     * 0: 16/9 1: 4/3 2: 3/4
     * @return frameResolutionType
     */
    public Integer getFrameResolutionType() {
        return frameResolutionType;
    }

    public void setFrameResolutionType(Integer frameResolutionType) {
        this.frameResolutionType = frameResolutionType;
    }

    public ImageFrame withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageFrame withImageFramePosition(LeftRightPosition imageFramePosition) {
        this.imageFramePosition = imageFramePosition;
        return this;
    }

    public ImageFrame withImageFramePosition(Consumer<LeftRightPosition> imageFramePositionSetter) {
        if (this.imageFramePosition == null) {
            this.imageFramePosition = new LeftRightPosition();
            imageFramePositionSetter.accept(this.imageFramePosition);
        }

        return this;
    }

    /**
     * Get imageFramePosition
     * @return imageFramePosition
     */
    public LeftRightPosition getImageFramePosition() {
        return imageFramePosition;
    }

    public void setImageFramePosition(LeftRightPosition imageFramePosition) {
        this.imageFramePosition = imageFramePosition;
    }

    public ImageFrame withImagePosition(LeftRightPosition imagePosition) {
        this.imagePosition = imagePosition;
        return this;
    }

    public ImageFrame withImagePosition(Consumer<LeftRightPosition> imagePositionSetter) {
        if (this.imagePosition == null) {
            this.imagePosition = new LeftRightPosition();
            imagePositionSetter.accept(this.imagePosition);
        }

        return this;
    }

    /**
     * Get imagePosition
     * @return imagePosition
     */
    public LeftRightPosition getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(LeftRightPosition imagePosition) {
        this.imagePosition = imagePosition;
    }

    public ImageFrame withResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
        return this;
    }

    /**
     * 横版：0 竖版：1
     * @return resolutionType
     */
    public Integer getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
    }

    public ImageFrame withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageFrame that = (ImageFrame) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.frameResolutionType, that.frameResolutionType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.imageFramePosition, that.imageFramePosition)
            && Objects.equals(this.imagePosition, that.imagePosition)
            && Objects.equals(this.resolutionType, that.resolutionType) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            updateTime,
            frameResolutionType,
            id,
            imageFramePosition,
            imagePosition,
            resolutionType,
            url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageFrame {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    frameResolutionType: ").append(toIndentedString(frameResolutionType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageFramePosition: ").append(toIndentedString(imageFramePosition)).append("\n");
        sb.append("    imagePosition: ").append(toIndentedString(imagePosition)).append("\n");
        sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
