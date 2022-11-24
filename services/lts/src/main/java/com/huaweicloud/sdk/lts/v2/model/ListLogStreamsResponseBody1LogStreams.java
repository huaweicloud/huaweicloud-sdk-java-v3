package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListLogStreamsResponseBody1LogStreams
 */
public class ListLogStreamsResponseBody1LogStreams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private Long creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private Map<String, String> tag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_count")

    private Integer filterCount;

    public ListLogStreamsResponseBody1LogStreams withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 日志流创建时间
     * minimum: 1577808000000
     * maximum: 4102416000000
     * @return creationTime
     */
    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public ListLogStreamsResponseBody1LogStreams withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流ID
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public ListLogStreamsResponseBody1LogStreams withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public ListLogStreamsResponseBody1LogStreams withTag(Map<String, String> tag) {
        this.tag = tag;
        return this;
    }

    public ListLogStreamsResponseBody1LogStreams putTagItem(String key, String tagItem) {
        if (this.tag == null) {
            this.tag = new HashMap<>();
        }
        this.tag.put(key, tagItem);
        return this;
    }

    public ListLogStreamsResponseBody1LogStreams withTag(Consumer<Map<String, String>> tagSetter) {
        if (this.tag == null) {
            this.tag = new HashMap<>();
        }
        tagSetter.accept(this.tag);
        return this;
    }

    /**
     * 日志流所属标签
     * @return tag
     */
    public Map<String, String> getTag() {
        return tag;
    }

    public void setTag(Map<String, String> tag) {
        this.tag = tag;
    }

    public ListLogStreamsResponseBody1LogStreams withFilterCount(Integer filterCount) {
        this.filterCount = filterCount;
        return this;
    }

    /**
     * 过滤器个数
     * minimum: 0
     * maximum: 5
     * @return filterCount
     */
    public Integer getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(Integer filterCount) {
        this.filterCount = filterCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogStreamsResponseBody1LogStreams listLogStreamsResponseBody1LogStreams =
            (ListLogStreamsResponseBody1LogStreams) o;
        return Objects.equals(this.creationTime, listLogStreamsResponseBody1LogStreams.creationTime)
            && Objects.equals(this.logStreamId, listLogStreamsResponseBody1LogStreams.logStreamId)
            && Objects.equals(this.logStreamName, listLogStreamsResponseBody1LogStreams.logStreamName)
            && Objects.equals(this.tag, listLogStreamsResponseBody1LogStreams.tag)
            && Objects.equals(this.filterCount, listLogStreamsResponseBody1LogStreams.filterCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime, logStreamId, logStreamName, tag, filterCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogStreamsResponseBody1LogStreams {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    filterCount: ").append(toIndentedString(filterCount)).append("\n");
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
