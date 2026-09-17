package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 健康报告订阅信息
 */
public class ReportSubscription {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_id")

    private String subscribeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

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
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private String locale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra")

    private Object extra;

    public ReportSubscription withSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }

    /**
     * 订阅ID
     * @return subscribeId
     */
    public String getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
    }

    public ReportSubscription withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ReportSubscription withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户在某一Region下的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ReportSubscription withProtocol(String protocol) {
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

    public ReportSubscription withEndpoint(String endpoint) {
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

    public ReportSubscription withTopic(String topic) {
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

    public ReportSubscription withTopicUrn(String topicUrn) {
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

    public ReportSubscription withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * 桶名
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public ReportSubscription withLevel(String level) {
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

    public ReportSubscription withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * 语言
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public ReportSubscription withExtra(Object extra) {
        this.extra = extra;
        return this;
    }

    /**
     * 额外信息
     * @return extra
     */
    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportSubscription that = (ReportSubscription) obj;
        return Objects.equals(this.subscribeId, that.subscribeId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.level, that.level) && Objects.equals(this.locale, that.locale)
            && Objects.equals(this.extra, that.extra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribeId,
            instanceId,
            projectId,
            protocol,
            endpoint,
            topic,
            topicUrn,
            obsBucketName,
            level,
            locale,
            extra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportSubscription {\n");
        sb.append("    subscribeId: ").append(toIndentedString(subscribeId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
