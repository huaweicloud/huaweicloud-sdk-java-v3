package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ListTopicsItem
 */
public class ListTopicsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    @JacksonXmlProperty(localName = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_policy")

    @JacksonXmlProperty(localName = "push_policy")

    private Integer pushPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListTopicsItem withTopicUrn(String topicUrn) {
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

    public ListTopicsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建topic的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTopicsItem withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Topic的显示名，推送邮件消息时，作为邮件发件人显示。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ListTopicsItem withPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
        return this;
    }

    /**
     * 消息推送的策略，该属性目前不支持修改，后续将支持修改。0表示发送失败，保留到失败队列，1表示直接丢弃发送失败的消息。
     * @return pushPolicy
     */
    public Integer getPushPolicy() {
        return pushPolicy;
    }

    public void setPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
    }

    public ListTopicsItem withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopicsItem listTopicsItem = (ListTopicsItem) o;
        return Objects.equals(this.topicUrn, listTopicsItem.topicUrn) && Objects.equals(this.name, listTopicsItem.name)
            && Objects.equals(this.displayName, listTopicsItem.displayName)
            && Objects.equals(this.pushPolicy, listTopicsItem.pushPolicy)
            && Objects.equals(this.enterpriseProjectId, listTopicsItem.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, name, displayName, pushPolicy, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicsItem {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    pushPolicy: ").append(toIndentedString(pushPolicy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
