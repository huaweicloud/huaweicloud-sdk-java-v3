package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IEF Flink job状态上报的请求body体。
 */
public class IefFlinkJobStatusReportReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    @JacksonXmlProperty(localName = "jobs")

    private List<Jobs> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_confirm_topic")

    @JacksonXmlProperty(localName = "msg_confirm_topic")

    private String msgConfirmTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    @JacksonXmlProperty(localName = "message_id")

    private String messageId;

    public IefFlinkJobStatusReportReq withJobs(List<Jobs> jobs) {
        this.jobs = jobs;
        return this;
    }

    public IefFlinkJobStatusReportReq addJobsItem(Jobs jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public IefFlinkJobStatusReportReq withJobs(Consumer<List<Jobs>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 作业信息列表
     * @return jobs
     */
    public List<Jobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<Jobs> jobs) {
        this.jobs = jobs;
    }

    public IefFlinkJobStatusReportReq withMsgConfirmTopic(String msgConfirmTopic) {
        this.msgConfirmTopic = msgConfirmTopic;
        return this;
    }

    /**
     * 消息确认topic
     * @return msgConfirmTopic
     */
    public String getMsgConfirmTopic() {
        return msgConfirmTopic;
    }

    public void setMsgConfirmTopic(String msgConfirmTopic) {
        this.msgConfirmTopic = msgConfirmTopic;
    }

    public IefFlinkJobStatusReportReq withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 消息id
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IefFlinkJobStatusReportReq iefFlinkJobStatusReportReq = (IefFlinkJobStatusReportReq) o;
        return Objects.equals(this.jobs, iefFlinkJobStatusReportReq.jobs)
            && Objects.equals(this.msgConfirmTopic, iefFlinkJobStatusReportReq.msgConfirmTopic)
            && Objects.equals(this.messageId, iefFlinkJobStatusReportReq.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, msgConfirmTopic, messageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IefFlinkJobStatusReportReq {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    msgConfirmTopic: ").append(toIndentedString(msgConfirmTopic)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
