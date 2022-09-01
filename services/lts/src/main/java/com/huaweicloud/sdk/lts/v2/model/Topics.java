package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Topics
 */
public class Topics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    @JacksonXmlProperty(localName = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_policy")

    @JacksonXmlProperty(localName = "push_policy")

    private Integer pushPolicy;

    public Topics withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主题名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topics withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * Topic的唯一的资源标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public Topics withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Topic的显示名，推送邮件消息时，作为邮件发件人显示
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Topics withPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
        return this;
    }

    /**
     * 消息推送的策略
     * minimum: 0
     * maximum: 13
     * @return pushPolicy
     */
    public Integer getPushPolicy() {
        return pushPolicy;
    }

    public void setPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Topics topics = (Topics) o;
        return Objects.equals(this.name, topics.name) && Objects.equals(this.topicUrn, topics.topicUrn)
            && Objects.equals(this.displayName, topics.displayName)
            && Objects.equals(this.pushPolicy, topics.pushPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, topicUrn, displayName, pushPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Topics {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    pushPolicy: ").append(toIndentedString(pushPolicy)).append("\n");
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
