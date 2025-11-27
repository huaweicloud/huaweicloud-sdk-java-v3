package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEmailTemplateRequestBody
 */
public class UpdateEmailTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Integer templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

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

    public UpdateEmailTemplateRequestBody withTemplateId(Integer templateId) {
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

    public UpdateEmailTemplateRequestBody withTemplateName(String templateName) {
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

    public UpdateEmailTemplateRequestBody withGroupId(List<Integer> groupId) {
        this.groupId = groupId;
        return this;
    }

    public UpdateEmailTemplateRequestBody addGroupIdItem(Integer groupIdItem) {
        if (this.groupId == null) {
            this.groupId = new ArrayList<>();
        }
        this.groupId.add(groupIdItem);
        return this;
    }

    public UpdateEmailTemplateRequestBody withGroupId(Consumer<List<Integer>> groupIdSetter) {
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

    public UpdateEmailTemplateRequestBody withHealthRank(List<String> healthRank) {
        this.healthRank = healthRank;
        return this;
    }

    public UpdateEmailTemplateRequestBody addHealthRankItem(String healthRankItem) {
        if (this.healthRank == null) {
            this.healthRank = new ArrayList<>();
        }
        this.healthRank.add(healthRankItem);
        return this;
    }

    public UpdateEmailTemplateRequestBody withHealthRank(Consumer<List<String>> healthRankSetter) {
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

    public UpdateEmailTemplateRequestBody withEmail(String email) {
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

    public UpdateEmailTemplateRequestBody withTopic(String topic) {
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

    public UpdateEmailTemplateRequestBody withTopicUrn(String topicUrn) {
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

    public UpdateEmailTemplateRequestBody withObsBucketName(String obsBucketName) {
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

    public UpdateEmailTemplateRequestBody withInspectionTime(String inspectionTime) {
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

    public UpdateEmailTemplateRequestBody withSendTime(String sendTime) {
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

    public UpdateEmailTemplateRequestBody withTimeZone(String timeZone) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEmailTemplateRequestBody that = (UpdateEmailTemplateRequestBody) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.healthRank, that.healthRank)
            && Objects.equals(this.email, that.email) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.inspectionTime, that.inspectionTime) && Objects.equals(this.sendTime, that.sendTime)
            && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            templateName,
            groupId,
            healthRank,
            email,
            topic,
            topicUrn,
            obsBucketName,
            inspectionTime,
            sendTime,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEmailTemplateRequestBody {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    healthRank: ").append(toIndentedString(healthRank)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    inspectionTime: ").append(toIndentedString(inspectionTime)).append("\n");
        sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
