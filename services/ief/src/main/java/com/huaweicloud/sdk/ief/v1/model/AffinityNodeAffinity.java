package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点亲和规则
 */
public class AffinityNodeAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferredDuringSchedulingIgnoredDuringExecution")

    private List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requiredDuringSchedulingIgnoredDuringExecution")

    private RequiredDuringScheduling requiredDuringSchedulingIgnoredDuringExecution;

    public AffinityNodeAffinity withPreferredDuringSchedulingIgnoredDuringExecution(
        List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public AffinityNodeAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(
        PreferredSchedulingTerm preferredDuringSchedulingIgnoredDuringExecutionItem) {
        if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
            this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
        return this;
    }

    public AffinityNodeAffinity withPreferredDuringSchedulingIgnoredDuringExecution(
        Consumer<List<PreferredSchedulingTerm>> preferredDuringSchedulingIgnoredDuringExecutionSetter) {
        if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
            this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        preferredDuringSchedulingIgnoredDuringExecutionSetter
            .accept(this.preferredDuringSchedulingIgnoredDuringExecution);
        return this;
    }

    /**
     * 优先使用定义的规则调度，且不会影响已经在节点上运行的Pod。即优先选择调度到满足规则的节点，但也可能会调度到不满足规则的节点。
     * @return preferredDuringSchedulingIgnoredDuringExecution
     */
    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(
        List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public AffinityNodeAffinity withRequiredDuringSchedulingIgnoredDuringExecution(
        RequiredDuringScheduling requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public AffinityNodeAffinity withRequiredDuringSchedulingIgnoredDuringExecution(
        Consumer<RequiredDuringScheduling> requiredDuringSchedulingIgnoredDuringExecutionSetter) {
        if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
            this.requiredDuringSchedulingIgnoredDuringExecution = new RequiredDuringScheduling();
            requiredDuringSchedulingIgnoredDuringExecutionSetter
                .accept(this.requiredDuringSchedulingIgnoredDuringExecution);
        }

        return this;
    }

    /**
     * Get requiredDuringSchedulingIgnoredDuringExecution
     * @return requiredDuringSchedulingIgnoredDuringExecution
     */
    public RequiredDuringScheduling getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(
        RequiredDuringScheduling requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AffinityNodeAffinity affinityNodeAffinity = (AffinityNodeAffinity) o;
        return Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution,
            affinityNodeAffinity.preferredDuringSchedulingIgnoredDuringExecution)
            && Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution,
                affinityNodeAffinity.requiredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution,
            requiredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AffinityNodeAffinity {\n");
        sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ")
            .append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution))
            .append("\n");
        sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ")
            .append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution))
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
