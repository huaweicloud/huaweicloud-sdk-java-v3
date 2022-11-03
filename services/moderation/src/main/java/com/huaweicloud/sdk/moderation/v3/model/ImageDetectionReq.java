package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图像内容审核请求体
 */
public class ImageDetectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_text_config")

    private ImgTextConfig imageTextConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    public ImageDetectionReq withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型。 可选值如下： head_image：头像 album：相册 dynamic：动态 article：帖子 comment：评论 room_cover：房间封面 group_message：群聊图片 message：私聊图片 product：商品图片
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ImageDetectionReq withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public ImageDetectionReq addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ImageDetectionReq withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 检测场景，可添加的检测场景如下，华为云当前支持全场景的，以下仅展示部门检测能力，如果有其它检测场景的需求，请在开通服务时咨询华为云工程师：  terrorism：涉政暴恐内容的检测。  porn：鉴黄内容的检测。  politics：政治敏感人物内容的检测 image_text：图文违规内容的检测。（检测图片中出现的广告、色情、暴恐、涉政的文字违规内容以及二维码内容）  备注：资料上线需要删除politics
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public ImageDetectionReq withImageTextConfig(ImgTextConfig imageTextConfig) {
        this.imageTextConfig = imageTextConfig;
        return this;
    }

    public ImageDetectionReq withImageTextConfig(Consumer<ImgTextConfig> imageTextConfigSetter) {
        if (this.imageTextConfig == null) {
            this.imageTextConfig = new ImgTextConfig();
            imageTextConfigSetter.accept(this.imageTextConfig);
        }

        return this;
    }

    /**
     * Get imageTextConfig
     * @return imageTextConfig
     */
    public ImgTextConfig getImageTextConfig() {
        return imageTextConfig;
    }

    public void setImageTextConfig(ImgTextConfig imageTextConfig) {
        this.imageTextConfig = imageTextConfig;
    }

    public ImageDetectionReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 图片url, 与image二选一。 图片的URL路径，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详情请见配置OBS访问权限。 ​ 说明： 接口响应时间依赖图片的下载时间，如果图片下载时间过长，会返回接口调用失败。请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 图片url, 与image二选一。 图片的URL路径，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详情请见配置OBS访问权限。  说明： 接口响应时间依赖图片的下载时间，如果图片下载时间过长，会返回接口调用失败。请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageDetectionReq withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 与url二选一。 ​ 图片文件Base64编码字符串。要求base64编码后大小不超过10M。 ​ 支持JPG/PNG/BMP/WEBP等格式。 与url二选一。  图片文件Base64编码字符串。要求base64编码后大小不超过10M。  支持JPG/PNG/BMP/WEBP等格式。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionReq imageDetectionReq = (ImageDetectionReq) o;
        return Objects.equals(this.eventType, imageDetectionReq.eventType)
            && Objects.equals(this.categories, imageDetectionReq.categories)
            && Objects.equals(this.imageTextConfig, imageDetectionReq.imageTextConfig)
            && Objects.equals(this.url, imageDetectionReq.url) && Objects.equals(this.image, imageDetectionReq.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, categories, imageTextConfig, url, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionReq {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    imageTextConfig: ").append(toIndentedString(imageTextConfig)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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