package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class VideoConfigResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_id")

    private String backgroundId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_id")

    private String logoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_subtitles")

    private Boolean showSubtitles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_type")

    private Integer resolutionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_url")

    private String backgroundUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_frame_url")

    private String imageFrameUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_url")

    private String logoUrl;

    public VideoConfigResp withBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
        return this;
    }

    /**
     * 背景id
     * @return backgroundId
     */
    public String getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
    }

    public VideoConfigResp withLogoId(String logoId) {
        this.logoId = logoId;
        return this;
    }

    /**
     * 图标id
     * @return logoId
     */
    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public VideoConfigResp withShowSubtitles(Boolean showSubtitles) {
        this.showSubtitles = showSubtitles;
        return this;
    }

    /**
     * 是否显示字幕 默认：false
     * @return showSubtitles
     */
    public Boolean getShowSubtitles() {
        return showSubtitles;
    }

    public void setShowSubtitles(Boolean showSubtitles) {
        this.showSubtitles = showSubtitles;
    }

    public VideoConfigResp withResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
        return this;
    }

    /**
     * 画面分辨率： 0: 宽屏landscape（默认） 1: 竖屏portrait
     * @return resolutionType
     */
    public Integer getResolutionType() {
        return resolutionType;
    }

    public void setResolutionType(Integer resolutionType) {
        this.resolutionType = resolutionType;
    }

    public VideoConfigResp withBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
        return this;
    }

    /**
     * 背景图片地址，取默认背景的第一张
     * @return backgroundUrl
     */
    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    public VideoConfigResp withImageFrameUrl(String imageFrameUrl) {
        this.imageFrameUrl = imageFrameUrl;
        return this;
    }

    /**
     * 播报框地址 和background绑定，如果使用用户自定义背景，则使用演播厅框
     * @return imageFrameUrl
     */
    public String getImageFrameUrl() {
        return imageFrameUrl;
    }

    public void setImageFrameUrl(String imageFrameUrl) {
        this.imageFrameUrl = imageFrameUrl;
    }

    public VideoConfigResp withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * logo地址
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoConfigResp that = (VideoConfigResp) obj;
        return Objects.equals(this.backgroundId, that.backgroundId) && Objects.equals(this.logoId, that.logoId)
            && Objects.equals(this.showSubtitles, that.showSubtitles)
            && Objects.equals(this.resolutionType, that.resolutionType)
            && Objects.equals(this.backgroundUrl, that.backgroundUrl)
            && Objects.equals(this.imageFrameUrl, that.imageFrameUrl) && Objects.equals(this.logoUrl, that.logoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backgroundId, logoId, showSubtitles, resolutionType, backgroundUrl, imageFrameUrl, logoUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoConfigResp {\n");
        sb.append("    backgroundId: ").append(toIndentedString(backgroundId)).append("\n");
        sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
        sb.append("    showSubtitles: ").append(toIndentedString(showSubtitles)).append("\n");
        sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
        sb.append("    backgroundUrl: ").append(toIndentedString(backgroundUrl)).append("\n");
        sb.append("    imageFrameUrl: ").append(toIndentedString(imageFrameUrl)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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
