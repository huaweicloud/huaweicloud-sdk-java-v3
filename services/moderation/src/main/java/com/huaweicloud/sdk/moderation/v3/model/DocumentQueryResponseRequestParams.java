package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业创建参数
 */
public class DocumentQueryResponseRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private DocumentQueryResponseRequestParamsData data;

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

    public DocumentQueryResponseRequestParams withData(DocumentQueryResponseRequestParamsData data) {
        this.data = data;
        return this;
    }

    public DocumentQueryResponseRequestParams withData(Consumer<DocumentQueryResponseRequestParamsData> dataSetter) {
        if (this.data == null) {
            this.data = new DocumentQueryResponseRequestParamsData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public DocumentQueryResponseRequestParamsData getData() {
        return data;
    }

    public void setData(DocumentQueryResponseRequestParamsData data) {
        this.data = data;
    }

    public DocumentQueryResponseRequestParams withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 创建作业时传的event_type参数
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public DocumentQueryResponseRequestParams withImageCategories(List<String> imageCategories) {
        this.imageCategories = imageCategories;
        return this;
    }

    public DocumentQueryResponseRequestParams addImageCategoriesItem(String imageCategoriesItem) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        this.imageCategories.add(imageCategoriesItem);
        return this;
    }

    public DocumentQueryResponseRequestParams withImageCategories(Consumer<List<String>> imageCategoriesSetter) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        imageCategoriesSetter.accept(this.imageCategories);
        return this;
    }

    /**
     * 创建作业时传的image_categories参数
     * @return imageCategories
     */
    public List<String> getImageCategories() {
        return imageCategories;
    }

    public void setImageCategories(List<String> imageCategories) {
        this.imageCategories = imageCategories;
    }

    public DocumentQueryResponseRequestParams withTextCategories(List<String> textCategories) {
        this.textCategories = textCategories;
        return this;
    }

    public DocumentQueryResponseRequestParams addTextCategoriesItem(String textCategoriesItem) {
        if (this.textCategories == null) {
            this.textCategories = new ArrayList<>();
        }
        this.textCategories.add(textCategoriesItem);
        return this;
    }

    public DocumentQueryResponseRequestParams withTextCategories(Consumer<List<String>> textCategoriesSetter) {
        if (this.textCategories == null) {
            this.textCategories = new ArrayList<>();
        }
        textCategoriesSetter.accept(this.textCategories);
        return this;
    }

    /**
     * 创建作业时传的text_categories参数
     * @return textCategories
     */
    public List<String> getTextCategories() {
        return textCategories;
    }

    public void setTextCategories(List<String> textCategories) {
        this.textCategories = textCategories;
    }

    public DocumentQueryResponseRequestParams withVideoImageCategories(List<String> videoImageCategories) {
        this.videoImageCategories = videoImageCategories;
        return this;
    }

    public DocumentQueryResponseRequestParams addVideoImageCategoriesItem(String videoImageCategoriesItem) {
        if (this.videoImageCategories == null) {
            this.videoImageCategories = new ArrayList<>();
        }
        this.videoImageCategories.add(videoImageCategoriesItem);
        return this;
    }

    public DocumentQueryResponseRequestParams withVideoImageCategories(
        Consumer<List<String>> videoImageCategoriesSetter) {
        if (this.videoImageCategories == null) {
            this.videoImageCategories = new ArrayList<>();
        }
        videoImageCategoriesSetter.accept(this.videoImageCategories);
        return this;
    }

    /**
     * 创建作业时传的video_image_categories参数
     * @return videoImageCategories
     */
    public List<String> getVideoImageCategories() {
        return videoImageCategories;
    }

    public void setVideoImageCategories(List<String> videoImageCategories) {
        this.videoImageCategories = videoImageCategories;
    }

    public DocumentQueryResponseRequestParams withAudioCategories(List<String> audioCategories) {
        this.audioCategories = audioCategories;
        return this;
    }

    public DocumentQueryResponseRequestParams addAudioCategoriesItem(String audioCategoriesItem) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        this.audioCategories.add(audioCategoriesItem);
        return this;
    }

    public DocumentQueryResponseRequestParams withAudioCategories(Consumer<List<String>> audioCategoriesSetter) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        audioCategoriesSetter.accept(this.audioCategories);
        return this;
    }

    /**
     * 创建作业时传的audio_categories参数
     * @return audioCategories
     */
    public List<String> getAudioCategories() {
        return audioCategories;
    }

    public void setAudioCategories(List<String> audioCategories) {
        this.audioCategories = audioCategories;
    }

    public DocumentQueryResponseRequestParams withCallback(String callback) {
        this.callback = callback;
        return this;
    }

    /**
     * 创建作业时传的callback参数
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
        DocumentQueryResponseRequestParams that = (DocumentQueryResponseRequestParams) obj;
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
        sb.append("class DocumentQueryResponseRequestParams {\n");
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
