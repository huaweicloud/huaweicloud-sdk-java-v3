package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EmailRecord
 */
public class EmailRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_at")

    private Long sendAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_status")

    private Integer sendStatus;

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
    @JsonProperty(value = "instance_health_report_list")

    private List<InstanceHealthReport> instanceHealthReportList = null;

    public EmailRecord withSendAt(Long sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * 发送时间（Unix timestamp），单位：毫秒。
     * minimum: 0
     * maximum: 253370736001000
     * @return sendAt
     */
    public Long getSendAt() {
        return sendAt;
    }

    public void setSendAt(Long sendAt) {
        this.sendAt = sendAt;
    }

    public EmailRecord withSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }

    /**
     * 发送状态
     * minimum: 0
     * maximum: 2147483647
     * @return sendStatus
     */
    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public EmailRecord withEmail(String email) {
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

    public EmailRecord withTopic(String topic) {
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

    public EmailRecord withTopicUrn(String topicUrn) {
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

    public EmailRecord withInstanceHealthReportList(List<InstanceHealthReport> instanceHealthReportList) {
        this.instanceHealthReportList = instanceHealthReportList;
        return this;
    }

    public EmailRecord addInstanceHealthReportListItem(InstanceHealthReport instanceHealthReportListItem) {
        if (this.instanceHealthReportList == null) {
            this.instanceHealthReportList = new ArrayList<>();
        }
        this.instanceHealthReportList.add(instanceHealthReportListItem);
        return this;
    }

    public EmailRecord withInstanceHealthReportList(
        Consumer<List<InstanceHealthReport>> instanceHealthReportListSetter) {
        if (this.instanceHealthReportList == null) {
            this.instanceHealthReportList = new ArrayList<>();
        }
        instanceHealthReportListSetter.accept(this.instanceHealthReportList);
        return this;
    }

    /**
     * 实例诊断报告列表
     * @return instanceHealthReportList
     */
    public List<InstanceHealthReport> getInstanceHealthReportList() {
        return instanceHealthReportList;
    }

    public void setInstanceHealthReportList(List<InstanceHealthReport> instanceHealthReportList) {
        this.instanceHealthReportList = instanceHealthReportList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailRecord that = (EmailRecord) obj;
        return Objects.equals(this.sendAt, that.sendAt) && Objects.equals(this.sendStatus, that.sendStatus)
            && Objects.equals(this.email, that.email) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.instanceHealthReportList, that.instanceHealthReportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendAt, sendStatus, email, topic, topicUrn, instanceHealthReportList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailRecord {\n");
        sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
        sb.append("    sendStatus: ").append(toIndentedString(sendStatus)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    instanceHealthReportList: ").append(toIndentedString(instanceHealthReportList)).append("\n");
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
