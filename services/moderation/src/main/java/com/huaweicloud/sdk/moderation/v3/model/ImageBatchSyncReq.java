package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图像审核批量同步接口请求参数Body体
 */
public class ImageBatchSyncReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_text_config")

    private ImageBatchSyncReqImageTextConfig imageTextConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<ImageBatchSyncReqUrls> urls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private String bizType;

    public ImageBatchSyncReq withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型。可选值如下： - head_image：头像 - album：相册 - dynamic：动态 - article：帖子 - comment：评论 - room_cover：房间封面 - group_message：群聊图片 - message：私聊图片 - product：商品图片
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ImageBatchSyncReq withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public ImageBatchSyncReq addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ImageBatchSyncReq withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 检测场景。可添加的检测场景如下： - terrorism：暴恐元素的检测。 - porn：涉黄元素的检测。 - politics：涉政人物的检测。 - image_text：广告图文的检测。 可通过配置上述场景，来完对应场景元素的检测。每个检测场景的检测次数会分类统计。
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public ImageBatchSyncReq withImageTextConfig(ImageBatchSyncReqImageTextConfig imageTextConfig) {
        this.imageTextConfig = imageTextConfig;
        return this;
    }

    public ImageBatchSyncReq withImageTextConfig(Consumer<ImageBatchSyncReqImageTextConfig> imageTextConfigSetter) {
        if (this.imageTextConfig == null) {
            this.imageTextConfig = new ImageBatchSyncReqImageTextConfig();
            imageTextConfigSetter.accept(this.imageTextConfig);
        }

        return this;
    }

    /**
     * Get imageTextConfig
     * @return imageTextConfig
     */
    public ImageBatchSyncReqImageTextConfig getImageTextConfig() {
        return imageTextConfig;
    }

    public void setImageTextConfig(ImageBatchSyncReqImageTextConfig imageTextConfig) {
        this.imageTextConfig = imageTextConfig;
    }

    public ImageBatchSyncReq withUrls(List<ImageBatchSyncReqUrls> urls) {
        this.urls = urls;
        return this;
    }

    public ImageBatchSyncReq addUrlsItem(ImageBatchSyncReqUrls urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public ImageBatchSyncReq withUrls(Consumer<List<ImageBatchSyncReqUrls>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 图片url列表。
     * @return urls
     */
    public List<ImageBatchSyncReqUrls> getUrls() {
        return urls;
    }

    public void setUrls(List<ImageBatchSyncReqUrls> urls) {
        this.urls = urls;
    }

    public ImageBatchSyncReq withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 指定图片中文字语种类型。 - zh: 中文 默认值为zh，中国站仅支持zh。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ImageBatchSyncReq withBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 用户在控制台界面创建的自定义审核策略名称。 - 如果请求参数中包含biz_type则优先使用biztype。 - 如果未传biz_type则event_type和categories为必传参数。
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
        ImageBatchSyncReq that = (ImageBatchSyncReq) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.categories, that.categories)
            && Objects.equals(this.imageTextConfig, that.imageTextConfig) && Objects.equals(this.urls, that.urls)
            && Objects.equals(this.language, that.language) && Objects.equals(this.bizType, that.bizType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, categories, imageTextConfig, urls, language, bizType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBatchSyncReq {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    imageTextConfig: ").append(toIndentedString(imageTextConfig)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
