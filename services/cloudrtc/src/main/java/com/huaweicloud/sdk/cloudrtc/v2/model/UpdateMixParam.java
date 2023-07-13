package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可修改的合流参数
 */
public class UpdateMixParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_template")

    private String layoutTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_image")

    private String backgroundImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_user_background_image")

    private String defaultUserBackgroundImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screen_background_image")

    private String screenBackgroundImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_idle_time")

    private Integer maxIdleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_panes")

    private List<MixLayoutPane> layoutPanes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_background_images")

    private List<MixUserBackgroundImage> userBackgroundImages = null;

    public UpdateMixParam withLayoutTemplate(String layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
        return this;
    }

    /**
     * 视频布局模板编号，仅支持自定义模板之间的更新。
     * @return layoutTemplate
     */
    public String getLayoutTemplate() {
        return layoutTemplate;
    }

    public void setLayoutTemplate(String layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
    }

    public UpdateMixParam withBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    /**
     * 画布背景图地址，图片先上传obs。默认使用等比缩放裁剪，保证铺满。格式s3://bucket/object
     * @return backgroundImage
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public UpdateMixParam withDefaultUserBackgroundImage(String defaultUserBackgroundImage) {
        this.defaultUserBackgroundImage = defaultUserBackgroundImage;
        return this;
    }

    /**
     * 默认用户背景图地址，图片先上传obs，格式s3://bucket/object。默认使用等比缩放裁剪，保证铺满。
     * @return defaultUserBackgroundImage
     */
    public String getDefaultUserBackgroundImage() {
        return defaultUserBackgroundImage;
    }

    public void setDefaultUserBackgroundImage(String defaultUserBackgroundImage) {
        this.defaultUserBackgroundImage = defaultUserBackgroundImage;
    }

    public UpdateMixParam withScreenBackgroundImage(String screenBackgroundImage) {
        this.screenBackgroundImage = screenBackgroundImage;
        return this;
    }

    /**
     * 共享屏幕的背景图地址，图片先上传obs，格式s3://bucket/object。  在一大多小的布局场景下，无论大窗是显示非指定用户（屏幕共享人的桌面）还是指定用户的共享桌面，都通过该字段指定背景图。 
     * @return screenBackgroundImage
     */
    public String getScreenBackgroundImage() {
        return screenBackgroundImage;
    }

    public void setScreenBackgroundImage(String screenBackgroundImage) {
        this.screenBackgroundImage = screenBackgroundImage;
    }

    public UpdateMixParam withMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }

    /**
     * 最长空闲频道时间。  取值范围：[5，43200]，默认值为30。  单位：秒。  如果频道内无连麦方的状态持续超过该时间，录制程序会自动退出。退出后，再次调用start请求，会产生新的录制任务。  连麦方指：joiner或者publisher的用户。 
     * minimum: 5
     * maximum: 43200
     * @return maxIdleTime
     */
    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }

    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    public UpdateMixParam withLayoutPanes(List<MixLayoutPane> layoutPanes) {
        this.layoutPanes = layoutPanes;
        return this;
    }

    public UpdateMixParam addLayoutPanesItem(MixLayoutPane layoutPanesItem) {
        if (this.layoutPanes == null) {
            this.layoutPanes = new ArrayList<>();
        }
        this.layoutPanes.add(layoutPanesItem);
        return this;
    }

    public UpdateMixParam withLayoutPanes(Consumer<List<MixLayoutPane>> layoutPanesSetter) {
        if (this.layoutPanes == null) {
            this.layoutPanes = new ArrayList<>();
        }
        layoutPanesSetter.accept(this.layoutPanes);
        return this;
    }

    /**
     * 需要混流的视频列表。若不需要视频混流，则可不传递该参数。
     * @return layoutPanes
     */
    public List<MixLayoutPane> getLayoutPanes() {
        return layoutPanes;
    }

    public void setLayoutPanes(List<MixLayoutPane> layoutPanes) {
        this.layoutPanes = layoutPanes;
    }

    public UpdateMixParam withUserBackgroundImages(List<MixUserBackgroundImage> userBackgroundImages) {
        this.userBackgroundImages = userBackgroundImages;
        return this;
    }

    public UpdateMixParam addUserBackgroundImagesItem(MixUserBackgroundImage userBackgroundImagesItem) {
        if (this.userBackgroundImages == null) {
            this.userBackgroundImages = new ArrayList<>();
        }
        this.userBackgroundImages.add(userBackgroundImagesItem);
        return this;
    }

    public UpdateMixParam withUserBackgroundImages(Consumer<List<MixUserBackgroundImage>> userBackgroundImagesSetter) {
        if (this.userBackgroundImages == null) {
            this.userBackgroundImages = new ArrayList<>();
        }
        userBackgroundImagesSetter.accept(this.userBackgroundImages);
        return this;
    }

    /**
     * 指定用户背景图，优先级大于default_user_background_image
     * @return userBackgroundImages
     */
    public List<MixUserBackgroundImage> getUserBackgroundImages() {
        return userBackgroundImages;
    }

    public void setUserBackgroundImages(List<MixUserBackgroundImage> userBackgroundImages) {
        this.userBackgroundImages = userBackgroundImages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateMixParam that = (UpdateMixParam) obj;
        return Objects.equals(this.layoutTemplate, that.layoutTemplate)
            && Objects.equals(this.backgroundImage, that.backgroundImage)
            && Objects.equals(this.defaultUserBackgroundImage, that.defaultUserBackgroundImage)
            && Objects.equals(this.screenBackgroundImage, that.screenBackgroundImage)
            && Objects.equals(this.maxIdleTime, that.maxIdleTime) && Objects.equals(this.layoutPanes, that.layoutPanes)
            && Objects.equals(this.userBackgroundImages, that.userBackgroundImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutTemplate,
            backgroundImage,
            defaultUserBackgroundImage,
            screenBackgroundImage,
            maxIdleTime,
            layoutPanes,
            userBackgroundImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMixParam {\n");
        sb.append("    layoutTemplate: ").append(toIndentedString(layoutTemplate)).append("\n");
        sb.append("    backgroundImage: ").append(toIndentedString(backgroundImage)).append("\n");
        sb.append("    defaultUserBackgroundImage: ").append(toIndentedString(defaultUserBackgroundImage)).append("\n");
        sb.append("    screenBackgroundImage: ").append(toIndentedString(screenBackgroundImage)).append("\n");
        sb.append("    maxIdleTime: ").append(toIndentedString(maxIdleTime)).append("\n");
        sb.append("    layoutPanes: ").append(toIndentedString(layoutPanes)).append("\n");
        sb.append("    userBackgroundImages: ").append(toIndentedString(userBackgroundImages)).append("\n");
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
