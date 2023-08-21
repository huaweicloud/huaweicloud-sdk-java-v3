package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建日志流参数。
 */
public class CreateLogStreamParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private Integer ttlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private TagsBody tags;

    public CreateLogStreamParams withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 需要创建的日志流名称。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public CreateLogStreamParams withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间 说明： 该参数仅对华东-上海一、华北-北京四、华南-广州用户开放。
     * minimum: 1
     * maximum: 365
     * @return ttlInDays
     */
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    public CreateLogStreamParams withTags(TagsBody tags) {
        this.tags = tags;
        return this;
    }

    public CreateLogStreamParams withTags(Consumer<TagsBody> tagsSetter) {
        if (this.tags == null) {
            this.tags = new TagsBody();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public TagsBody getTags() {
        return tags;
    }

    public void setTags(TagsBody tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLogStreamParams that = (CreateLogStreamParams) obj;
        return Objects.equals(this.logStreamName, that.logStreamName) && Objects.equals(this.ttlInDays, that.ttlInDays)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamName, ttlInDays, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogStreamParams {\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
