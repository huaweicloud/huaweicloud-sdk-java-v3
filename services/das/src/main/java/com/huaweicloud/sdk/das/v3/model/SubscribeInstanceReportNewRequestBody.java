package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅实例报告请求体
 */
public class SubscribeInstanceReportNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_uri")

    private String serviceUri;

    public SubscribeInstanceReportNewRequestBody withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public SubscribeInstanceReportNewRequestBody withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 地址
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public SubscribeInstanceReportNewRequestBody withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 主题
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SubscribeInstanceReportNewRequestBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题地址
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public SubscribeInstanceReportNewRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public SubscribeInstanceReportNewRequestBody withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 风险等级
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public SubscribeInstanceReportNewRequestBody withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * 服务URI
     * @return serviceUri
     */
    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeInstanceReportNewRequestBody that = (SubscribeInstanceReportNewRequestBody) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.level, that.level)
            && Objects.equals(this.serviceUri, that.serviceUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, endpoint, topic, topicUrn, bucketName, level, serviceUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeInstanceReportNewRequestBody {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    serviceUri: ").append(toIndentedString(serviceUri)).append("\n");
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
