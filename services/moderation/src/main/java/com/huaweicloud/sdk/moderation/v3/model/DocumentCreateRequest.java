package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DocumentCreateRequest
 */
public class DocumentCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private DocumentCreateRequestData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_categories")

    private List<String> imageCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_categories")

    private List<String> textCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_image_categories")

    private List<String> videoImageCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_categories")

    private List<String> audioCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private String callback;

    public DocumentCreateRequest withData(DocumentCreateRequestData data) {
        this.data = data;
        return this;
    }

    public DocumentCreateRequest withData(Consumer<DocumentCreateRequestData> dataSetter) {
        if (this.data == null) {
            this.data = new DocumentCreateRequestData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public DocumentCreateRequestData getData() {
        return data;
    }

    public void setData(DocumentCreateRequestData data) {
        this.data = data;
    }

    public DocumentCreateRequest withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，可选值如下： default：默认事件 liberal_arts_education：文科教育 sciences_education：理科教育 news：新闻 forums：论坛 novels：小说
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public DocumentCreateRequest withImageCategories(List<String> imageCategories) {
        this.imageCategories = imageCategories;
        return this;
    }

    public DocumentCreateRequest addImageCategoriesItem(String imageCategoriesItem) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        this.imageCategories.add(imageCategoriesItem);
        return this;
    }

    public DocumentCreateRequest withImageCategories(Consumer<List<String>> imageCategoriesSetter) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        imageCategoriesSetter.accept(this.imageCategories);
        return this;
    }

    /**
     * 文档中图片需要检测的风险类型，不传或为空时表示不审核图片内容， 可取值如下： politics: 涉政检测 porn：涉黄检测 terrorism: 暴恐检测 bad_scene: 不良场景检测 image_text: 图文检测
     * @return imageCategories
     */
    public List<String> getImageCategories() {
        return imageCategories;
    }

    public void setImageCategories(List<String> imageCategories) {
        this.imageCategories = imageCategories;
    }

    public DocumentCreateRequest withTextCategories(List<String> textCategories) {
        this.textCategories = textCategories;
        return this;
    }

    public DocumentCreateRequest addTextCategoriesItem(String textCategoriesItem) {
        if (this.textCategories == null) {
            this.textCategories = new ArrayList<>();
        }
        this.textCategories.add(textCategoriesItem);
        return this;
    }

    public DocumentCreateRequest withTextCategories(Consumer<List<String>> textCategoriesSetter) {
        if (this.textCategories == null) {
            this.textCategories = new ArrayList<>();
        }
        textCategoriesSetter.accept(this.textCategories);
        return this;
    }

    /**
     * 文档中文本需要检测的风险类型，不传或为空时表示不审核文本内容， 可取值如下： default: 检测涉政、暴恐、违禁、色情、辱骂、广告等违规内容
     * @return textCategories
     */
    public List<String> getTextCategories() {
        return textCategories;
    }

    public void setTextCategories(List<String> textCategories) {
        this.textCategories = textCategories;
    }

    public DocumentCreateRequest withVideoImageCategories(List<String> videoImageCategories) {
        this.videoImageCategories = videoImageCategories;
        return this;
    }

    public DocumentCreateRequest addVideoImageCategoriesItem(String videoImageCategoriesItem) {
        if (this.videoImageCategories == null) {
            this.videoImageCategories = new ArrayList<>();
        }
        this.videoImageCategories.add(videoImageCategoriesItem);
        return this;
    }

    public DocumentCreateRequest withVideoImageCategories(Consumer<List<String>> videoImageCategoriesSetter) {
        if (this.videoImageCategories == null) {
            this.videoImageCategories = new ArrayList<>();
        }
        videoImageCategoriesSetter.accept(this.videoImageCategories);
        return this;
    }

    /**
     * 网页视频中图片需要检测的风险类型，不传或为空时表示不审核网页视频内容， 可取值如下： politics: 涉政检测 porn：涉黄检测 terrorism: 暴恐检测 bad_scene: 不良场景检测 image_text: 图文检测
     * @return videoImageCategories
     */
    public List<String> getVideoImageCategories() {
        return videoImageCategories;
    }

    public void setVideoImageCategories(List<String> videoImageCategories) {
        this.videoImageCategories = videoImageCategories;
    }

    public DocumentCreateRequest withAudioCategories(List<String> audioCategories) {
        this.audioCategories = audioCategories;
        return this;
    }

    public DocumentCreateRequest addAudioCategoriesItem(String audioCategoriesItem) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        this.audioCategories.add(audioCategoriesItem);
        return this;
    }

    public DocumentCreateRequest withAudioCategories(Consumer<List<String>> audioCategoriesSetter) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        audioCategoriesSetter.accept(this.audioCategories);
        return this;
    }

    /**
     * 网页视频中音频需要检测的风险类型，不传或为空时表示不审核网页视频中音频的内容， 可取值如下： politics: 涉政检测 porn：涉黄检测 ad：广告检测 abuse：辱骂检测 moan：娇喘检测
     * @return audioCategories
     */
    public List<String> getAudioCategories() {
        return audioCategories;
    }

    public void setAudioCategories(List<String> audioCategories) {
        this.audioCategories = audioCategories;
    }

    public DocumentCreateRequest withCallback(String callback) {
        this.callback = callback;
        return this;
    }

    /**
     * 回调http接口：当该字段非空时，服务将根据该字段回调通知用户审核结果。
     * @return callback
     */
    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentCreateRequest that = (DocumentCreateRequest) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.imageCategories, that.imageCategories)
            && Objects.equals(this.textCategories, that.textCategories)
            && Objects.equals(this.videoImageCategories, that.videoImageCategories)
            && Objects.equals(this.audioCategories, that.audioCategories)
            && Objects.equals(this.callback, that.callback);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(data, eventType, imageCategories, textCategories, videoImageCategories, audioCategories, callback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentCreateRequest {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    imageCategories: ").append(toIndentedString(imageCategories)).append("\n");
        sb.append("    textCategories: ").append(toIndentedString(textCategories)).append("\n");
        sb.append("    videoImageCategories: ").append(toIndentedString(videoImageCategories)).append("\n");
        sb.append("    audioCategories: ").append(toIndentedString(audioCategories)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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
