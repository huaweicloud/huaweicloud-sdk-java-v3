package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询历史值请求
 */
public class GetHistoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_span")

    private TimeSpan timeSpan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_names")

    private List<String> propertyNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public GetHistoryRequest withTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    public GetHistoryRequest withTimeSpan(Consumer<TimeSpan> timeSpanSetter) {
        if (this.timeSpan == null) {
            this.timeSpan = new TimeSpan();
            timeSpanSetter.accept(this.timeSpan);
        }

        return this;
    }

    /**
     * Get timeSpan
     * @return timeSpan
     */
    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(TimeSpan timeSpan) {
        this.timeSpan = timeSpan;
    }

    public GetHistoryRequest withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public GetHistoryRequest putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public GetHistoryRequest withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 对property按指定tags标签进行过滤查询，填入设备标签与标签值，不可为空，例如 {\"deviceId\": \"id0001\"}
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public GetHistoryRequest withPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
        return this;
    }

    public GetHistoryRequest addPropertyNamesItem(String propertyNamesItem) {
        if (this.propertyNames == null) {
            this.propertyNames = new ArrayList<>();
        }
        this.propertyNames.add(propertyNamesItem);
        return this;
    }

    public GetHistoryRequest withPropertyNames(Consumer<List<String>> propertyNamesSetter) {
        if (this.propertyNames == null) {
            this.propertyNames = new ArrayList<>();
        }
        propertyNamesSetter.accept(this.propertyNames);
        return this;
    }

    /**
     * 查询的属性列表
     * @return propertyNames
     */
    public List<String> getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
    }

    public GetHistoryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回值个数限制
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetHistoryRequest getHistoryRequest = (GetHistoryRequest) o;
        return Objects.equals(this.timeSpan, getHistoryRequest.timeSpan)
            && Objects.equals(this.tags, getHistoryRequest.tags)
            && Objects.equals(this.propertyNames, getHistoryRequest.propertyNames)
            && Objects.equals(this.limit, getHistoryRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeSpan, tags, propertyNames, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHistoryRequest {\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
