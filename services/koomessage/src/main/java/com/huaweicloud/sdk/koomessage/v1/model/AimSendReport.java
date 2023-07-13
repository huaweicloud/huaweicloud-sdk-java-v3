package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 报表详情。
 */
public class AimSendReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_time")

    private String reportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submission_count")

    private Integer submissionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_resolve_count")

    private Integer supportResolveCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_count")

    private Integer sendCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_success_count")

    private Integer sendSuccessCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_success_count")

    private Integer resolveSuccessCount;

    public AimSendReport withReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }

    /**
     * 报表日期时间。
     * @return reportTime
     */
    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public AimSendReport withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public AimSendReport withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public AimSendReport withSubmissionCount(Integer submissionCount) {
        this.submissionCount = submissionCount;
        return this;
    }

    /**
     * 提交号码总数量。
     * @return submissionCount
     */
    public Integer getSubmissionCount() {
        return submissionCount;
    }

    public void setSubmissionCount(Integer submissionCount) {
        this.submissionCount = submissionCount;
    }

    public AimSendReport withSupportResolveCount(Integer supportResolveCount) {
        this.supportResolveCount = supportResolveCount;
        return this;
    }

    /**
     * 支持解析数量。  > 此数据不包括通过API发送的智能信息任务。 
     * @return supportResolveCount
     */
    public Integer getSupportResolveCount() {
        return supportResolveCount;
    }

    public void setSupportResolveCount(Integer supportResolveCount) {
        this.supportResolveCount = supportResolveCount;
    }

    public AimSendReport withSendCount(Integer sendCount) {
        this.sendCount = sendCount;
        return this;
    }

    /**
     * 发送数量。
     * @return sendCount
     */
    public Integer getSendCount() {
        return sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    public AimSendReport withSendSuccessCount(Integer sendSuccessCount) {
        this.sendSuccessCount = sendSuccessCount;
        return this;
    }

    /**
     * 成功发送数量。
     * @return sendSuccessCount
     */
    public Integer getSendSuccessCount() {
        return sendSuccessCount;
    }

    public void setSendSuccessCount(Integer sendSuccessCount) {
        this.sendSuccessCount = sendSuccessCount;
    }

    public AimSendReport withResolveSuccessCount(Integer resolveSuccessCount) {
        this.resolveSuccessCount = resolveSuccessCount;
        return this;
    }

    /**
     * 成功解析数量。
     * @return resolveSuccessCount
     */
    public Integer getResolveSuccessCount() {
        return resolveSuccessCount;
    }

    public void setResolveSuccessCount(Integer resolveSuccessCount) {
        this.resolveSuccessCount = resolveSuccessCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AimSendReport that = (AimSendReport) obj;
        return Objects.equals(this.reportTime, that.reportTime) && Objects.equals(this.tplId, that.tplId)
            && Objects.equals(this.tplName, that.tplName) && Objects.equals(this.submissionCount, that.submissionCount)
            && Objects.equals(this.supportResolveCount, that.supportResolveCount)
            && Objects.equals(this.sendCount, that.sendCount)
            && Objects.equals(this.sendSuccessCount, that.sendSuccessCount)
            && Objects.equals(this.resolveSuccessCount, that.resolveSuccessCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportTime,
            tplId,
            tplName,
            submissionCount,
            supportResolveCount,
            sendCount,
            sendSuccessCount,
            resolveSuccessCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AimSendReport {\n");
        sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    submissionCount: ").append(toIndentedString(submissionCount)).append("\n");
        sb.append("    supportResolveCount: ").append(toIndentedString(supportResolveCount)).append("\n");
        sb.append("    sendCount: ").append(toIndentedString(sendCount)).append("\n");
        sb.append("    sendSuccessCount: ").append(toIndentedString(sendSuccessCount)).append("\n");
        sb.append("    resolveSuccessCount: ").append(toIndentedString(resolveSuccessCount)).append("\n");
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
