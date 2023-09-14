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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private String bizType;

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
     * 检测场景。可添加的检测场景如下： - terrorism：暴恐元素的检测。 - porn：涉黄元素的检测。 - image_text：广告图文的检测。 - 可通过配置上述场景，来完对应场景元素的检测。 > 每个检测场景的检测次数会分类统计。
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
     * 图片url, 与image二选一，目前支持： - 公网HTTP/HTTPS URL
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
     * 与url二选一，图片文件Base64编码字符串，要求base64编码后大小不超过10M，支持JPG/PNG/JPEG/WEBP/GIF/TIFF/TIF/HEIF等格式。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageDetectionReq withBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 自定义审核策略名称，可在控制台配置;如果请求参数中传了biz_type则优先使用biz_type,如果用户没传biz_type则event_type和categories必须传。
     * @return bizType
     */
    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageDetectionReq that = (ImageDetectionReq) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.categories, that.categories)
            && Objects.equals(this.imageTextConfig, that.imageTextConfig) && Objects.equals(this.url, that.url)
            && Objects.equals(this.image, that.image) && Objects.equals(this.bizType, that.bizType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, categories, imageTextConfig, url, image, bizType);
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
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
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
