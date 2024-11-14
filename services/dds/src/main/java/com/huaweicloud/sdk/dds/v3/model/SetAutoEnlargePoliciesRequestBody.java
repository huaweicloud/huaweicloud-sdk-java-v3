package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetAutoEnlargePoliciesRequestBody
 */
public class SetAutoEnlargePoliciesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private String switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<DiskAutoExpansionPolicy> policies = null;

    public SetAutoEnlargePoliciesRequestBody withSwitchOption(String switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * 自动扩容开关。 - on:开启磁盘自动扩容策略。 - off: 关闭磁盘自动扩容策略。 默认值为on。
     * @return switchOption
     */
    public String getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(String switchOption) {
        this.switchOption = switchOption;
    }

    public SetAutoEnlargePoliciesRequestBody withPolicies(List<DiskAutoExpansionPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public SetAutoEnlargePoliciesRequestBody addPoliciesItem(DiskAutoExpansionPolicy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public SetAutoEnlargePoliciesRequestBody withPolicies(Consumer<List<DiskAutoExpansionPolicy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 磁盘自动扩容策略。 最大支持设置10个实例的策略。
     * @return policies
     */
    public List<DiskAutoExpansionPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<DiskAutoExpansionPolicy> policies) {
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
        SetAutoEnlargePoliciesRequestBody that = (SetAutoEnlargePoliciesRequestBody) obj;
        return Objects.equals(this.switchOption, that.switchOption) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAutoEnlargePoliciesRequestBody {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
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
