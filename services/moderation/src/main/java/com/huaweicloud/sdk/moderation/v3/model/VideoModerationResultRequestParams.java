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
public class VideoModerationResultRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private VideoModerationResultRequestParamsData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_categories")

    private List<String> imageCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_categories")

    private List<String> audioCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private String callback;

    public VideoModerationResultRequestParams withData(VideoModerationResultRequestParamsData data) {
        this.data = data;
        return this;
    }

    public VideoModerationResultRequestParams withData(Consumer<VideoModerationResultRequestParamsData> dataSetter) {
        if (this.data == null) {
            this.data = new VideoModerationResultRequestParamsData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public VideoModerationResultRequestParamsData getData() {
        return data;
    }

    public void setData(VideoModerationResultRequestParamsData data) {
        this.data = data;
    }

    public VideoModerationResultRequestParams withEventType(String eventType) {
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

    public VideoModerationResultRequestParams withImageCategories(List<String> imageCategories) {
        this.imageCategories = imageCategories;
        return this;
    }

    public VideoModerationResultRequestParams addImageCategoriesItem(String imageCategoriesItem) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        this.imageCategories.add(imageCategoriesItem);
        return this;
    }

    public VideoModerationResultRequestParams withImageCategories(Consumer<List<String>> imageCategoriesSetter) {
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

    public VideoModerationResultRequestParams withAudioCategories(List<String> audioCategories) {
        this.audioCategories = audioCategories;
        return this;
    }

    public VideoModerationResultRequestParams addAudioCategoriesItem(String audioCategoriesItem) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        this.audioCategories.add(audioCategoriesItem);
        return this;
    }

    public VideoModerationResultRequestParams withAudioCategories(Consumer<List<String>> audioCategoriesSetter) {
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

    public VideoModerationResultRequestParams withCallback(String callback) {
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
        VideoModerationResultRequestParams that = (VideoModerationResultRequestParams) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.imageCategories, that.imageCategories)
            && Objects.equals(this.audioCategories, that.audioCategories)
            && Objects.equals(this.callback, that.callback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, eventType, imageCategories, audioCategories, callback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoModerationResultRequestParams {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    imageCategories: ").append(toIndentedString(imageCategories)).append("\n");
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
