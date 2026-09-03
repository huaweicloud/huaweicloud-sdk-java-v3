package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ErrorAlert
 */
public class ErrorAlert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_template")

    private AlertTemplate alertTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskErrorPolicy")

    private TaskErrorPolicy taskErrorPolicy;

    public ErrorAlert withAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
        return this;
    }

    public ErrorAlert withAlertTemplate(Consumer<AlertTemplate> alertTemplateSetter) {
        if (this.alertTemplate == null) {
            this.alertTemplate = new AlertTemplate();
            alertTemplateSetter.accept(this.alertTemplate);
        }

        return this;
    }

    /**
     * Get alertTemplate
     * @return alertTemplate
     */
    public AlertTemplate getAlertTemplate() {
        return alertTemplate;
    }

    public void setAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
    }

    public ErrorAlert withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 异常告警是否开启：0关闭，1开启，默认关闭
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public ErrorAlert withTaskErrorPolicy(TaskErrorPolicy taskErrorPolicy) {
        this.taskErrorPolicy = taskErrorPolicy;
        return this;
    }

    public ErrorAlert withTaskErrorPolicy(Consumer<TaskErrorPolicy> taskErrorPolicySetter) {
        if (this.taskErrorPolicy == null) {
            this.taskErrorPolicy = new TaskErrorPolicy();
            taskErrorPolicySetter.accept(this.taskErrorPolicy);
        }

        return this;
    }

    /**
     * Get taskErrorPolicy
     * @return taskErrorPolicy
     */
    public TaskErrorPolicy getTaskErrorPolicy() {
        return taskErrorPolicy;
    }

    public void setTaskErrorPolicy(TaskErrorPolicy taskErrorPolicy) {
        this.taskErrorPolicy = taskErrorPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorAlert that = (ErrorAlert) obj;
        return Objects.equals(this.alertTemplate, that.alertTemplate) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.taskErrorPolicy, that.taskErrorPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertTemplate, enable, taskErrorPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorAlert {\n");
        sb.append("    alertTemplate: ").append(toIndentedString(alertTemplate)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    taskErrorPolicy: ").append(toIndentedString(taskErrorPolicy)).append("\n");
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
