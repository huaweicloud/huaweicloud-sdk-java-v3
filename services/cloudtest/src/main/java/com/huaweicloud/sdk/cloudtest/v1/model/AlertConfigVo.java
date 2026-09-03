package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlertConfigVo
 */
public class AlertConfigVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_expression")

    private List<AlertExpression> alertExpression = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertPeriodBegin")

    private String alertPeriodBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertPeriodEnd")

    private String alertPeriodEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockAlert")

    private BlockAlert blockAlert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultAlertTemplate")

    private AlertTemplate defaultAlertTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorAlert")

    private ErrorAlert errorAlert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedAlert")

    private FailedAlert failedAlert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recoverNoticeEnable")

    private String recoverNoticeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restrainAlertEnable")

    private String restrainAlertEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_alert_num")

    private Integer resumeAlertNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resumeAlertTime")

    private String resumeAlertTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeoutAlert")

    private TimeoutAlert timeoutAlert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeoutAlertV4")

    private TimeoutAlert timeoutAlertV4;

    public AlertConfigVo withAlertExpression(List<AlertExpression> alertExpression) {
        this.alertExpression = alertExpression;
        return this;
    }

    public AlertConfigVo addAlertExpressionItem(AlertExpression alertExpressionItem) {
        if (this.alertExpression == null) {
            this.alertExpression = new ArrayList<>();
        }
        this.alertExpression.add(alertExpressionItem);
        return this;
    }

    public AlertConfigVo withAlertExpression(Consumer<List<AlertExpression>> alertExpressionSetter) {
        if (this.alertExpression == null) {
            this.alertExpression = new ArrayList<>();
        }
        alertExpressionSetter.accept(this.alertExpression);
        return this;
    }

    /**
     * 告警表达式
     * @return alertExpression
     */
    public List<AlertExpression> getAlertExpression() {
        return alertExpression;
    }

    public void setAlertExpression(List<AlertExpression> alertExpression) {
        this.alertExpression = alertExpression;
    }

    public AlertConfigVo withAlertPeriodBegin(String alertPeriodBegin) {
        this.alertPeriodBegin = alertPeriodBegin;
        return this;
    }

    /**
     * 告警区间，开始时间
     * @return alertPeriodBegin
     */
    public String getAlertPeriodBegin() {
        return alertPeriodBegin;
    }

    public void setAlertPeriodBegin(String alertPeriodBegin) {
        this.alertPeriodBegin = alertPeriodBegin;
    }

    public AlertConfigVo withAlertPeriodEnd(String alertPeriodEnd) {
        this.alertPeriodEnd = alertPeriodEnd;
        return this;
    }

    /**
     * 告警区间，开始时间
     * @return alertPeriodEnd
     */
    public String getAlertPeriodEnd() {
        return alertPeriodEnd;
    }

    public void setAlertPeriodEnd(String alertPeriodEnd) {
        this.alertPeriodEnd = alertPeriodEnd;
    }

    public AlertConfigVo withBlockAlert(BlockAlert blockAlert) {
        this.blockAlert = blockAlert;
        return this;
    }

    public AlertConfigVo withBlockAlert(Consumer<BlockAlert> blockAlertSetter) {
        if (this.blockAlert == null) {
            this.blockAlert = new BlockAlert();
            blockAlertSetter.accept(this.blockAlert);
        }

        return this;
    }

    /**
     * Get blockAlert
     * @return blockAlert
     */
    public BlockAlert getBlockAlert() {
        return blockAlert;
    }

    public void setBlockAlert(BlockAlert blockAlert) {
        this.blockAlert = blockAlert;
    }

    public AlertConfigVo withDefaultAlertTemplate(AlertTemplate defaultAlertTemplate) {
        this.defaultAlertTemplate = defaultAlertTemplate;
        return this;
    }

    public AlertConfigVo withDefaultAlertTemplate(Consumer<AlertTemplate> defaultAlertTemplateSetter) {
        if (this.defaultAlertTemplate == null) {
            this.defaultAlertTemplate = new AlertTemplate();
            defaultAlertTemplateSetter.accept(this.defaultAlertTemplate);
        }

        return this;
    }

    /**
     * Get defaultAlertTemplate
     * @return defaultAlertTemplate
     */
    public AlertTemplate getDefaultAlertTemplate() {
        return defaultAlertTemplate;
    }

    public void setDefaultAlertTemplate(AlertTemplate defaultAlertTemplate) {
        this.defaultAlertTemplate = defaultAlertTemplate;
    }

    public AlertConfigVo withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 告警开启 0关闭 1开启
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public AlertConfigVo withErrorAlert(ErrorAlert errorAlert) {
        this.errorAlert = errorAlert;
        return this;
    }

    public AlertConfigVo withErrorAlert(Consumer<ErrorAlert> errorAlertSetter) {
        if (this.errorAlert == null) {
            this.errorAlert = new ErrorAlert();
            errorAlertSetter.accept(this.errorAlert);
        }

        return this;
    }

    /**
     * Get errorAlert
     * @return errorAlert
     */
    public ErrorAlert getErrorAlert() {
        return errorAlert;
    }

    public void setErrorAlert(ErrorAlert errorAlert) {
        this.errorAlert = errorAlert;
    }

    public AlertConfigVo withFailedAlert(FailedAlert failedAlert) {
        this.failedAlert = failedAlert;
        return this;
    }

    public AlertConfigVo withFailedAlert(Consumer<FailedAlert> failedAlertSetter) {
        if (this.failedAlert == null) {
            this.failedAlert = new FailedAlert();
            failedAlertSetter.accept(this.failedAlert);
        }

        return this;
    }

    /**
     * Get failedAlert
     * @return failedAlert
     */
    public FailedAlert getFailedAlert() {
        return failedAlert;
    }

    public void setFailedAlert(FailedAlert failedAlert) {
        this.failedAlert = failedAlert;
    }

    public AlertConfigVo withRecoverNoticeEnable(String recoverNoticeEnable) {
        this.recoverNoticeEnable = recoverNoticeEnable;
        return this;
    }

    /**
     * 告警恢复通知开关 0关闭 1开启
     * @return recoverNoticeEnable
     */
    public String getRecoverNoticeEnable() {
        return recoverNoticeEnable;
    }

    public void setRecoverNoticeEnable(String recoverNoticeEnable) {
        this.recoverNoticeEnable = recoverNoticeEnable;
    }

    public AlertConfigVo withRestrainAlertEnable(String restrainAlertEnable) {
        this.restrainAlertEnable = restrainAlertEnable;
        return this;
    }

    /**
     * 告警收敛开关 0关闭 1开启
     * @return restrainAlertEnable
     */
    public String getRestrainAlertEnable() {
        return restrainAlertEnable;
    }

    public void setRestrainAlertEnable(String restrainAlertEnable) {
        this.restrainAlertEnable = restrainAlertEnable;
    }

    public AlertConfigVo withResumeAlertNum(Integer resumeAlertNum) {
        this.resumeAlertNum = resumeAlertNum;
        return this;
    }

    /**
     * 智能告警 成功多少次后发送恢复告警
     * @return resumeAlertNum
     */
    public Integer getResumeAlertNum() {
        return resumeAlertNum;
    }

    public void setResumeAlertNum(Integer resumeAlertNum) {
        this.resumeAlertNum = resumeAlertNum;
    }

    public AlertConfigVo withResumeAlertTime(String resumeAlertTime) {
        this.resumeAlertTime = resumeAlertTime;
        return this;
    }

    /**
     * 智能告警 指定时间后发送恢复告警
     * @return resumeAlertTime
     */
    public String getResumeAlertTime() {
        return resumeAlertTime;
    }

    public void setResumeAlertTime(String resumeAlertTime) {
        this.resumeAlertTime = resumeAlertTime;
    }

    public AlertConfigVo withTimeoutAlert(TimeoutAlert timeoutAlert) {
        this.timeoutAlert = timeoutAlert;
        return this;
    }

    public AlertConfigVo withTimeoutAlert(Consumer<TimeoutAlert> timeoutAlertSetter) {
        if (this.timeoutAlert == null) {
            this.timeoutAlert = new TimeoutAlert();
            timeoutAlertSetter.accept(this.timeoutAlert);
        }

        return this;
    }

    /**
     * Get timeoutAlert
     * @return timeoutAlert
     */
    public TimeoutAlert getTimeoutAlert() {
        return timeoutAlert;
    }

    public void setTimeoutAlert(TimeoutAlert timeoutAlert) {
        this.timeoutAlert = timeoutAlert;
    }

    public AlertConfigVo withTimeoutAlertV4(TimeoutAlert timeoutAlertV4) {
        this.timeoutAlertV4 = timeoutAlertV4;
        return this;
    }

    public AlertConfigVo withTimeoutAlertV4(Consumer<TimeoutAlert> timeoutAlertV4Setter) {
        if (this.timeoutAlertV4 == null) {
            this.timeoutAlertV4 = new TimeoutAlert();
            timeoutAlertV4Setter.accept(this.timeoutAlertV4);
        }

        return this;
    }

    /**
     * Get timeoutAlertV4
     * @return timeoutAlertV4
     */
    public TimeoutAlert getTimeoutAlertV4() {
        return timeoutAlertV4;
    }

    public void setTimeoutAlertV4(TimeoutAlert timeoutAlertV4) {
        this.timeoutAlertV4 = timeoutAlertV4;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertConfigVo that = (AlertConfigVo) obj;
        return Objects.equals(this.alertExpression, that.alertExpression)
            && Objects.equals(this.alertPeriodBegin, that.alertPeriodBegin)
            && Objects.equals(this.alertPeriodEnd, that.alertPeriodEnd)
            && Objects.equals(this.blockAlert, that.blockAlert)
            && Objects.equals(this.defaultAlertTemplate, that.defaultAlertTemplate)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.errorAlert, that.errorAlert)
            && Objects.equals(this.failedAlert, that.failedAlert)
            && Objects.equals(this.recoverNoticeEnable, that.recoverNoticeEnable)
            && Objects.equals(this.restrainAlertEnable, that.restrainAlertEnable)
            && Objects.equals(this.resumeAlertNum, that.resumeAlertNum)
            && Objects.equals(this.resumeAlertTime, that.resumeAlertTime)
            && Objects.equals(this.timeoutAlert, that.timeoutAlert)
            && Objects.equals(this.timeoutAlertV4, that.timeoutAlertV4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertExpression,
            alertPeriodBegin,
            alertPeriodEnd,
            blockAlert,
            defaultAlertTemplate,
            enable,
            errorAlert,
            failedAlert,
            recoverNoticeEnable,
            restrainAlertEnable,
            resumeAlertNum,
            resumeAlertTime,
            timeoutAlert,
            timeoutAlertV4);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertConfigVo {\n");
        sb.append("    alertExpression: ").append(toIndentedString(alertExpression)).append("\n");
        sb.append("    alertPeriodBegin: ").append(toIndentedString(alertPeriodBegin)).append("\n");
        sb.append("    alertPeriodEnd: ").append(toIndentedString(alertPeriodEnd)).append("\n");
        sb.append("    blockAlert: ").append(toIndentedString(blockAlert)).append("\n");
        sb.append("    defaultAlertTemplate: ").append(toIndentedString(defaultAlertTemplate)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    errorAlert: ").append(toIndentedString(errorAlert)).append("\n");
        sb.append("    failedAlert: ").append(toIndentedString(failedAlert)).append("\n");
        sb.append("    recoverNoticeEnable: ").append(toIndentedString(recoverNoticeEnable)).append("\n");
        sb.append("    restrainAlertEnable: ").append(toIndentedString(restrainAlertEnable)).append("\n");
        sb.append("    resumeAlertNum: ").append(toIndentedString(resumeAlertNum)).append("\n");
        sb.append("    resumeAlertTime: ").append(toIndentedString(resumeAlertTime)).append("\n");
        sb.append("    timeoutAlert: ").append(toIndentedString(timeoutAlert)).append("\n");
        sb.append("    timeoutAlertV4: ").append(toIndentedString(timeoutAlertV4)).append("\n");
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
