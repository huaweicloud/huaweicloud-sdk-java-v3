package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TimeoutAlert
 */
public class TimeoutAlert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_template")

    private AlertTemplate alertTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_timeout_policy")

    private TaskTimeoutPolicy taskTimeoutPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseTimeoutPolicy")

    private TestCaseTimeoutPolicy testCaseTimeoutPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeoutRetryTimes")

    private Integer timeoutRetryTimes;

    public TimeoutAlert withAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
        return this;
    }

    public TimeoutAlert withAlertTemplate(Consumer<AlertTemplate> alertTemplateSetter) {
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

    public TimeoutAlert withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 超时告警开启 0关闭 1开启
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public TimeoutAlert withTaskTimeoutPolicy(TaskTimeoutPolicy taskTimeoutPolicy) {
        this.taskTimeoutPolicy = taskTimeoutPolicy;
        return this;
    }

    public TimeoutAlert withTaskTimeoutPolicy(Consumer<TaskTimeoutPolicy> taskTimeoutPolicySetter) {
        if (this.taskTimeoutPolicy == null) {
            this.taskTimeoutPolicy = new TaskTimeoutPolicy();
            taskTimeoutPolicySetter.accept(this.taskTimeoutPolicy);
        }

        return this;
    }

    /**
     * Get taskTimeoutPolicy
     * @return taskTimeoutPolicy
     */
    public TaskTimeoutPolicy getTaskTimeoutPolicy() {
        return taskTimeoutPolicy;
    }

    public void setTaskTimeoutPolicy(TaskTimeoutPolicy taskTimeoutPolicy) {
        this.taskTimeoutPolicy = taskTimeoutPolicy;
    }

    public TimeoutAlert withTestCaseTimeoutPolicy(TestCaseTimeoutPolicy testCaseTimeoutPolicy) {
        this.testCaseTimeoutPolicy = testCaseTimeoutPolicy;
        return this;
    }

    public TimeoutAlert withTestCaseTimeoutPolicy(Consumer<TestCaseTimeoutPolicy> testCaseTimeoutPolicySetter) {
        if (this.testCaseTimeoutPolicy == null) {
            this.testCaseTimeoutPolicy = new TestCaseTimeoutPolicy();
            testCaseTimeoutPolicySetter.accept(this.testCaseTimeoutPolicy);
        }

        return this;
    }

    /**
     * Get testCaseTimeoutPolicy
     * @return testCaseTimeoutPolicy
     */
    public TestCaseTimeoutPolicy getTestCaseTimeoutPolicy() {
        return testCaseTimeoutPolicy;
    }

    public void setTestCaseTimeoutPolicy(TestCaseTimeoutPolicy testCaseTimeoutPolicy) {
        this.testCaseTimeoutPolicy = testCaseTimeoutPolicy;
    }

    public TimeoutAlert withTimeoutRetryTimes(Integer timeoutRetryTimes) {
        this.timeoutRetryTimes = timeoutRetryTimes;
        return this;
    }

    /**
     * 超时重试次数
     * @return timeoutRetryTimes
     */
    public Integer getTimeoutRetryTimes() {
        return timeoutRetryTimes;
    }

    public void setTimeoutRetryTimes(Integer timeoutRetryTimes) {
        this.timeoutRetryTimes = timeoutRetryTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeoutAlert that = (TimeoutAlert) obj;
        return Objects.equals(this.alertTemplate, that.alertTemplate) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.taskTimeoutPolicy, that.taskTimeoutPolicy)
            && Objects.equals(this.testCaseTimeoutPolicy, that.testCaseTimeoutPolicy)
            && Objects.equals(this.timeoutRetryTimes, that.timeoutRetryTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertTemplate, enable, taskTimeoutPolicy, testCaseTimeoutPolicy, timeoutRetryTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeoutAlert {\n");
        sb.append("    alertTemplate: ").append(toIndentedString(alertTemplate)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    taskTimeoutPolicy: ").append(toIndentedString(taskTimeoutPolicy)).append("\n");
        sb.append("    testCaseTimeoutPolicy: ").append(toIndentedString(testCaseTimeoutPolicy)).append("\n");
        sb.append("    timeoutRetryTimes: ").append(toIndentedString(timeoutRetryTimes)).append("\n");
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
