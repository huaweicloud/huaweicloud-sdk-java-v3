package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数解释：分组检查项汇总。
 */
public class MemberCheckJobResultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_template")

    private String reasonTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_params")

    private List<String> reasonParams = null;

    public MemberCheckJobResultItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释：检查项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberCheckJobResultItem withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 参数解释：异常原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public MemberCheckJobResultItem withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 参数解释：重要级别，分为Major(严重)和Tips(提示)
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public MemberCheckJobResultItem withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 参数解释：检查类别，config表示配置检查
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MemberCheckJobResultItem withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 参数解释：任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public MemberCheckJobResultItem withReasonTemplate(String reasonTemplate) {
        this.reasonTemplate = reasonTemplate;
        return this;
    }

    /**
     * 参数解释：异常原因模板
     * @return reasonTemplate
     */
    public String getReasonTemplate() {
        return reasonTemplate;
    }

    public void setReasonTemplate(String reasonTemplate) {
        this.reasonTemplate = reasonTemplate;
    }

    public MemberCheckJobResultItem withReasonParams(List<String> reasonParams) {
        this.reasonParams = reasonParams;
        return this;
    }

    public MemberCheckJobResultItem addReasonParamsItem(String reasonParamsItem) {
        if (this.reasonParams == null) {
            this.reasonParams = new ArrayList<>();
        }
        this.reasonParams.add(reasonParamsItem);
        return this;
    }

    public MemberCheckJobResultItem withReasonParams(Consumer<List<String>> reasonParamsSetter) {
        if (this.reasonParams == null) {
            this.reasonParams = new ArrayList<>();
        }
        reasonParamsSetter.accept(this.reasonParams);
        return this;
    }

    /**
     * 参数解释：异常结果变量参数表，用于结合异常原因模板动态生成异常原因
     * @return reasonParams
     */
    public List<String> getReasonParams() {
        return reasonParams;
    }

    public void setReasonParams(List<String> reasonParams) {
        this.reasonParams = reasonParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberCheckJobResultItem that = (MemberCheckJobResultItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.reasonTemplate, that.reasonTemplate)
            && Objects.equals(this.reasonParams, that.reasonParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, reason, severity, subject, jobId, reasonTemplate, reasonParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberCheckJobResultItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    reasonTemplate: ").append(toIndentedString(reasonTemplate)).append("\n");
        sb.append("    reasonParams: ").append(toIndentedString(reasonParams)).append("\n");
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
