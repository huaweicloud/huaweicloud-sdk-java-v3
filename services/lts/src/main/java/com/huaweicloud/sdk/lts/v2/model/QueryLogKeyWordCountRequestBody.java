package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志关键词统计请求体。
 */
public class QueryLogKeyWordCountRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_interval")

    private Long stepInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_iterative")

    private Boolean isIterative;

    public QueryLogKeyWordCountRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public QueryLogKeyWordCountRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryLogKeyWordCountRequestBody withStepInterval(Long stepInterval) {
        this.stepInterval = stepInterval;
        return this;
    }

    /**
     * 步长间隔
     * @return stepInterval
     */
    public Long getStepInterval() {
        return stepInterval;
    }

    public void setStepInterval(Long stepInterval) {
        this.stepInterval = stepInterval;
    }

    public QueryLogKeyWordCountRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 日志组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public QueryLogKeyWordCountRequestBody withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * 日志流ID
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public QueryLogKeyWordCountRequestBody withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 关键词
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public QueryLogKeyWordCountRequestBody withIsIterative(Boolean isIterative) {
        this.isIterative = isIterative;
        return this;
    }

    /**
     * 日志迭代查询，默认为false（不开启迭代），true为开启迭代。
     * @return isIterative
     */
    public Boolean getIsIterative() {
        return isIterative;
    }

    public void setIsIterative(Boolean isIterative) {
        this.isIterative = isIterative;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryLogKeyWordCountRequestBody that = (QueryLogKeyWordCountRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.stepInterval, that.stepInterval) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.keyWord, that.keyWord)
            && Objects.equals(this.isIterative, that.isIterative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, stepInterval, groupId, streamId, keyWord, isIterative);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryLogKeyWordCountRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    stepInterval: ").append(toIndentedString(stepInterval)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    isIterative: ").append(toIndentedString(isIterative)).append("\n");
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
