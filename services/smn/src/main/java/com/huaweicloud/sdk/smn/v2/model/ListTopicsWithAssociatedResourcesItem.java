package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListTopicsWithAssociatedResourcesItem
 */
public class ListTopicsWithAssociatedResourcesItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_policy")

    private Integer pushPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private TopicAccessPolicyAttribute attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtanks")

    private List<LogtankItem> logtanks = null;

    public ListTopicsWithAssociatedResourcesItem withTopicUrn(String topicUrn) {
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

    public ListTopicsWithAssociatedResourcesItem withName(String name) {
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

    public ListTopicsWithAssociatedResourcesItem withDisplayName(String displayName) {
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

    public ListTopicsWithAssociatedResourcesItem withPushPolicy(Integer pushPolicy) {
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

    public ListTopicsWithAssociatedResourcesItem withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListTopicsWithAssociatedResourcesItem withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * 主题ID。
     * @return topicId
     */
    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public ListTopicsWithAssociatedResourcesItem withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListTopicsWithAssociatedResourcesItem withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListTopicsWithAssociatedResourcesItem withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListTopicsWithAssociatedResourcesItem addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListTopicsWithAssociatedResourcesItem withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ListTopicsWithAssociatedResourcesItem withAttributes(TopicAccessPolicyAttribute attributes) {
        this.attributes = attributes;
        return this;
    }

    public ListTopicsWithAssociatedResourcesItem withAttributes(Consumer<TopicAccessPolicyAttribute> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new TopicAccessPolicyAttribute();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public TopicAccessPolicyAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(TopicAccessPolicyAttribute attributes) {
        this.attributes = attributes;
    }

    public ListTopicsWithAssociatedResourcesItem withLogtanks(List<LogtankItem> logtanks) {
        this.logtanks = logtanks;
        return this;
    }

    public ListTopicsWithAssociatedResourcesItem addLogtanksItem(LogtankItem logtanksItem) {
        if (this.logtanks == null) {
            this.logtanks = new ArrayList<>();
        }
        this.logtanks.add(logtanksItem);
        return this;
    }

    public ListTopicsWithAssociatedResourcesItem withLogtanks(Consumer<List<LogtankItem>> logtanksSetter) {
        if (this.logtanks == null) {
            this.logtanks = new ArrayList<>();
        }
        logtanksSetter.accept(this.logtanks);
        return this;
    }

    /**
     * 云日志信息列表。
     * @return logtanks
     */
    public List<LogtankItem> getLogtanks() {
        return logtanks;
    }

    public void setLogtanks(List<LogtankItem> logtanks) {
        this.logtanks = logtanks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopicsWithAssociatedResourcesItem that = (ListTopicsWithAssociatedResourcesItem) obj;
        return Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.pushPolicy, that.pushPolicy)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.topicId, that.topicId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.attributes, that.attributes) && Objects.equals(this.logtanks, that.logtanks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn,
            name,
            displayName,
            pushPolicy,
            enterpriseProjectId,
            topicId,
            createTime,
            updateTime,
            tags,
            attributes,
            logtanks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicsWithAssociatedResourcesItem {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    pushPolicy: ").append(toIndentedString(pushPolicy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    logtanks: ").append(toIndentedString(logtanks)).append("\n");
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
