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
public class AudioModerationResultRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private AudioModerationResultRequestParamsData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private String callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    public AudioModerationResultRequestParams withEventType(String eventType) {
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

    public AudioModerationResultRequestParams withData(AudioModerationResultRequestParamsData data) {
        this.data = data;
        return this;
    }

    public AudioModerationResultRequestParams withData(Consumer<AudioModerationResultRequestParamsData> dataSetter) {
        if (this.data == null) {
            this.data = new AudioModerationResultRequestParamsData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public AudioModerationResultRequestParamsData getData() {
        return data;
    }

    public void setData(AudioModerationResultRequestParamsData data) {
        this.data = data;
    }

    public AudioModerationResultRequestParams withCallback(String callback) {
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

    public AudioModerationResultRequestParams withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public AudioModerationResultRequestParams addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public AudioModerationResultRequestParams withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 创建作业时传的categories参数
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioModerationResultRequestParams that = (AudioModerationResultRequestParams) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.data, that.data)
            && Objects.equals(this.callback, that.callback) && Objects.equals(this.categories, that.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, data, callback, categories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioModerationResultRequestParams {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
