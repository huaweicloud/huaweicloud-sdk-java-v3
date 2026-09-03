package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * FailedAlert
 */
public class FailedAlert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudAlarm")

    private CloudAlarmDto cloudAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskPolicy")

    private TaskPolicy taskPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCasePolicy")

    private TestCasePolicy testCasePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wiseEye")

    private WiseEye wiseEye;

    public FailedAlert withCloudAlarm(CloudAlarmDto cloudAlarm) {
        this.cloudAlarm = cloudAlarm;
        return this;
    }

    public FailedAlert withCloudAlarm(Consumer<CloudAlarmDto> cloudAlarmSetter) {
        if (this.cloudAlarm == null) {
            this.cloudAlarm = new CloudAlarmDto();
            cloudAlarmSetter.accept(this.cloudAlarm);
        }

        return this;
    }

    /**
     * Get cloudAlarm
     * @return cloudAlarm
     */
    public CloudAlarmDto getCloudAlarm() {
        return cloudAlarm;
    }

    public void setCloudAlarm(CloudAlarmDto cloudAlarm) {
        this.cloudAlarm = cloudAlarm;
    }

    public FailedAlert withTaskPolicy(TaskPolicy taskPolicy) {
        this.taskPolicy = taskPolicy;
        return this;
    }

    public FailedAlert withTaskPolicy(Consumer<TaskPolicy> taskPolicySetter) {
        if (this.taskPolicy == null) {
            this.taskPolicy = new TaskPolicy();
            taskPolicySetter.accept(this.taskPolicy);
        }

        return this;
    }

    /**
     * Get taskPolicy
     * @return taskPolicy
     */
    public TaskPolicy getTaskPolicy() {
        return taskPolicy;
    }

    public void setTaskPolicy(TaskPolicy taskPolicy) {
        this.taskPolicy = taskPolicy;
    }

    public FailedAlert withTestCasePolicy(TestCasePolicy testCasePolicy) {
        this.testCasePolicy = testCasePolicy;
        return this;
    }

    public FailedAlert withTestCasePolicy(Consumer<TestCasePolicy> testCasePolicySetter) {
        if (this.testCasePolicy == null) {
            this.testCasePolicy = new TestCasePolicy();
            testCasePolicySetter.accept(this.testCasePolicy);
        }

        return this;
    }

    /**
     * Get testCasePolicy
     * @return testCasePolicy
     */
    public TestCasePolicy getTestCasePolicy() {
        return testCasePolicy;
    }

    public void setTestCasePolicy(TestCasePolicy testCasePolicy) {
        this.testCasePolicy = testCasePolicy;
    }

    public FailedAlert withWiseEye(WiseEye wiseEye) {
        this.wiseEye = wiseEye;
        return this;
    }

    public FailedAlert withWiseEye(Consumer<WiseEye> wiseEyeSetter) {
        if (this.wiseEye == null) {
            this.wiseEye = new WiseEye();
            wiseEyeSetter.accept(this.wiseEye);
        }

        return this;
    }

    /**
     * Get wiseEye
     * @return wiseEye
     */
    public WiseEye getWiseEye() {
        return wiseEye;
    }

    public void setWiseEye(WiseEye wiseEye) {
        this.wiseEye = wiseEye;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailedAlert that = (FailedAlert) obj;
        return Objects.equals(this.cloudAlarm, that.cloudAlarm) && Objects.equals(this.taskPolicy, that.taskPolicy)
            && Objects.equals(this.testCasePolicy, that.testCasePolicy) && Objects.equals(this.wiseEye, that.wiseEye);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudAlarm, taskPolicy, testCasePolicy, wiseEye);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailedAlert {\n");
        sb.append("    cloudAlarm: ").append(toIndentedString(cloudAlarm)).append("\n");
        sb.append("    taskPolicy: ").append(toIndentedString(taskPolicy)).append("\n");
        sb.append("    testCasePolicy: ").append(toIndentedString(testCasePolicy)).append("\n");
        sb.append("    wiseEye: ").append(toIndentedString(wiseEye)).append("\n");
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
