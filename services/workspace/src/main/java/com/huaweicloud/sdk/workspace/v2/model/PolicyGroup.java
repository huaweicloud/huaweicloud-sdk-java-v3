package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略组。
 */
public class PolicyGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_id")

    private String policyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<Target> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private Policies policies;

    public PolicyGroup withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * 策略组ID。
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    public PolicyGroup withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * 策略组名称。
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public PolicyGroup withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级。
     * minimum: 1
     * maximum: 65535
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public PolicyGroup withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新日期。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public PolicyGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyGroup withTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public PolicyGroup addTargetsItem(Target targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public PolicyGroup withTargets(Consumer<List<Target>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 应用对象列表。
     * @return targets
     */
    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public PolicyGroup withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    public PolicyGroup withPolicies(Consumer<Policies> policiesSetter) {
        if (this.policies == null) {
            this.policies = new Policies();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public Policies getPolicies() {
        return policies;
    }

    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyGroup that = (PolicyGroup) obj;
        return Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupName, that.policyGroupName)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.targets, that.targets)
            && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroupId, policyGroupName, priority, updateTime, description, targets, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyGroup {\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
