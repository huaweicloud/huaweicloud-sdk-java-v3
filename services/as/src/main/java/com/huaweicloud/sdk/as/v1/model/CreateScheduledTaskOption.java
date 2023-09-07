package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateScheduledTaskOption
 */
public class CreateScheduledTaskOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_policy")

    private ScheduledTaskPolicy scheduledPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_number")

    private IntegerRange instanceNumber;

    public CreateScheduledTaskOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 计划任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateScheduledTaskOption withScheduledPolicy(ScheduledTaskPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
        return this;
    }

    public CreateScheduledTaskOption withScheduledPolicy(Consumer<ScheduledTaskPolicy> scheduledPolicySetter) {
        if (this.scheduledPolicy == null) {
            this.scheduledPolicy = new ScheduledTaskPolicy();
            scheduledPolicySetter.accept(this.scheduledPolicy);
        }

        return this;
    }

    /**
     * Get scheduledPolicy
     * @return scheduledPolicy
     */
    public ScheduledTaskPolicy getScheduledPolicy() {
        return scheduledPolicy;
    }

    public void setScheduledPolicy(ScheduledTaskPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
    }

    public CreateScheduledTaskOption withInstanceNumber(IntegerRange instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }

    public CreateScheduledTaskOption withInstanceNumber(Consumer<IntegerRange> instanceNumberSetter) {
        if (this.instanceNumber == null) {
            this.instanceNumber = new IntegerRange();
            instanceNumberSetter.accept(this.instanceNumber);
        }

        return this;
    }

    /**
     * Get instanceNumber
     * @return instanceNumber
     */
    public IntegerRange getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(IntegerRange instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateScheduledTaskOption that = (CreateScheduledTaskOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.scheduledPolicy, that.scheduledPolicy)
            && Objects.equals(this.instanceNumber, that.instanceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scheduledPolicy, instanceNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScheduledTaskOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
        sb.append("    instanceNumber: ").append(toIndentedString(instanceNumber)).append("\n");
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
