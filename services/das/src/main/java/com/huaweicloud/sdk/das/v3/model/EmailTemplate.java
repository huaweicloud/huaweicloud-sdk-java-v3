package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EmailTemplate
 */
public class EmailTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Integer templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private List<Integer> groupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_rank")

    private List<String> healthRank = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

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
    @JsonProperty(value = "inspection_time")

    private String inspectionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_time")

    private String sendTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public EmailTemplate withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 邮件模板ID
     * minimum: 1
     * maximum: 2147483647
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public EmailTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 邮件模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public EmailTemplate withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public EmailTemplate withGroupId(List<Integer> groupId) {
        this.groupId = groupId;
        return this;
    }

    public EmailTemplate addGroupIdItem(Integer groupIdItem) {
        if (this.groupId == null) {
            this.groupId = new ArrayList<>();
        }
        this.groupId.add(groupIdItem);
        return this;
    }

    public EmailTemplate withGroupId(Consumer<List<Integer>> groupIdSetter) {
        if (this.groupId == null) {
            this.groupId = new ArrayList<>();
        }
        groupIdSetter.accept(this.groupId);
        return this;
    }

    /**
     * 实例组ID列表
     * @return groupId
     */
    public List<Integer> getGroupId() {
        return groupId;
    }

    public void setGroupId(List<Integer> groupId) {
        this.groupId = groupId;
    }

    public EmailTemplate withHealthRank(List<String> healthRank) {
        this.healthRank = healthRank;
        return this;
    }

    public EmailTemplate addHealthRankItem(String healthRankItem) {
        if (this.healthRank == null) {
            this.healthRank = new ArrayList<>();
        }
        this.healthRank.add(healthRankItem);
        return this;
    }

    public EmailTemplate withHealthRank(Consumer<List<String>> healthRankSetter) {
        if (this.healthRank == null) {
            this.healthRank = new ArrayList<>();
        }
        healthRankSetter.accept(this.healthRank);
        return this;
    }

    /**
     * 健康等级列表
     * @return healthRank
     */
    public List<String> getHealthRank() {
        return healthRank;
    }

    public void setHealthRank(List<String> healthRank) {
        this.healthRank = healthRank;
    }

    public EmailTemplate withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmailTemplate withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 主题名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public EmailTemplate withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题标识符
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public EmailTemplate withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS桶名
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public EmailTemplate withInspectionTime(String inspectionTime) {
        this.inspectionTime = inspectionTime;
        return this;
    }

    /**
     * 诊断时间，12:00-12:00（默认）或00:00-00:00
     * @return inspectionTime
     */
    public String getInspectionTime() {
        return inspectionTime;
    }

    public void setInspectionTime(String inspectionTime) {
        this.inspectionTime = inspectionTime;
    }

    public EmailTemplate withSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    /**
     * 发送时间
     * @return sendTime
     */
    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public EmailTemplate withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public EmailTemplate withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 253370736001000
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public EmailTemplate withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 最后修改人
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EmailTemplate withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 邮件模板状态（0-未启用 1-启用 2-删除）
     * minimum: -2147483648
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailTemplate that = (EmailTemplate) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.healthRank, that.healthRank) && Objects.equals(this.email, that.email)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.inspectionTime, that.inspectionTime) && Objects.equals(this.sendTime, that.sendTime)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            templateName,
            datastoreType,
            groupId,
            healthRank,
            email,
            topic,
            topicUrn,
            obsBucketName,
            inspectionTime,
            sendTime,
            timeZone,
            updateAt,
            userId,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailTemplate {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    healthRank: ").append(toIndentedString(healthRank)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    inspectionTime: ").append(toIndentedString(inspectionTime)).append("\n");
        sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
