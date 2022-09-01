package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResetConsumeOffsetReq
 */
public class ResetConsumeOffsetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    @JacksonXmlProperty(localName = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    @JacksonXmlProperty(localName = "timestamp")

    private BigDecimal timestamp;

    public ResetConsumeOffsetReq withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 重置的主题。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ResetConsumeOffsetReq withTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 重置的时间。
     * @return timestamp
     */
    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetConsumeOffsetReq resetConsumeOffsetReq = (ResetConsumeOffsetReq) o;
        return Objects.equals(this.topic, resetConsumeOffsetReq.topic)
            && Objects.equals(this.timestamp, resetConsumeOffsetReq.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetConsumeOffsetReq {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
