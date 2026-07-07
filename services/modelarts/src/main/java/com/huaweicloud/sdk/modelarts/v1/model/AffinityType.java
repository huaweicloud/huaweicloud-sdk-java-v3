package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AffinityType
 */
public class AffinityType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_during_scheduling_ignored_during_execution")

    private List<AffinityRule> requiredDuringSchedulingIgnoredDuringExecution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferred_during_scheduling_ignored_during_execution")

    private List<AffinityRule> preferredDuringSchedulingIgnoredDuringExecution = null;

    public AffinityType withRequiredDuringSchedulingIgnoredDuringExecution(
        List<AffinityRule> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public AffinityType addRequiredDuringSchedulingIgnoredDuringExecutionItem(
        AffinityRule requiredDuringSchedulingIgnoredDuringExecutionItem) {
        if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
            this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        this.requiredDuringSchedulingIgnoredDuringExecution.add(requiredDuringSchedulingIgnoredDuringExecutionItem);
        return this;
    }

    public AffinityType withRequiredDuringSchedulingIgnoredDuringExecution(
        Consumer<List<AffinityRule>> requiredDuringSchedulingIgnoredDuringExecutionSetter) {
        if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
            this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        requiredDuringSchedulingIgnoredDuringExecutionSetter
            .accept(this.requiredDuringSchedulingIgnoredDuringExecution);
        return this;
    }

    /**
     * 参数描述： 专属池场景下设置强亲和特性 参数约束： key、values、operator必填
     * @return requiredDuringSchedulingIgnoredDuringExecution
     */
    public List<AffinityRule> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(
        List<AffinityRule> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    public AffinityType withPreferredDuringSchedulingIgnoredDuringExecution(
        List<AffinityRule> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public AffinityType addPreferredDuringSchedulingIgnoredDuringExecutionItem(
        AffinityRule preferredDuringSchedulingIgnoredDuringExecutionItem) {
        if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
            this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
        return this;
    }

    public AffinityType withPreferredDuringSchedulingIgnoredDuringExecution(
        Consumer<List<AffinityRule>> preferredDuringSchedulingIgnoredDuringExecutionSetter) {
        if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
            this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        preferredDuringSchedulingIgnoredDuringExecutionSetter
            .accept(this.preferredDuringSchedulingIgnoredDuringExecution);
        return this;
    }

    /**
     * 参数描述： 专属池场景下设置弱亲和特性 参数约束： key、values、operator必填，weight选填
     * @return preferredDuringSchedulingIgnoredDuringExecution
     */
    public List<AffinityRule> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(
        List<AffinityRule> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AffinityType that = (AffinityType) obj;
        return Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution,
            that.requiredDuringSchedulingIgnoredDuringExecution)
            && Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution,
                that.preferredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredDuringSchedulingIgnoredDuringExecution,
            preferredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AffinityType {\n");
        sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ")
            .append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution))
            .append("\n");
        sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ")
            .append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution))
            .append("\n");
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
