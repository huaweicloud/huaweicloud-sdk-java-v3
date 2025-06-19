package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检查webhook地址
 */
public class CheckWebhookUrlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_type")

    private String noticeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhook_url")

    private String webhookUrl;

    public CheckWebhookUrlRequestBody withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CheckWebhookUrlRequestBody withNoticeType(String noticeType) {
        this.noticeType = noticeType;
        return this;
    }

    /**
     * 通知的类型,分为消息，邮件，钉钉，飞书和微信
     * @return noticeType
     */
    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public CheckWebhookUrlRequestBody withWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * Webhook地址
     * @return webhookUrl
     */
    public String getWebhookUrl() {
        return webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckWebhookUrlRequestBody that = (CheckWebhookUrlRequestBody) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.noticeType, that.noticeType)
            && Objects.equals(this.webhookUrl, that.webhookUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, noticeType, webhookUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckWebhookUrlRequestBody {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    noticeType: ").append(toIndentedString(noticeType)).append("\n");
        sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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
