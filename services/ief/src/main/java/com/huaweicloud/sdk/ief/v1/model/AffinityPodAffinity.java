package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Pod亲和规则
 */
public class AffinityPodAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferredDuringSchedulingIgnoredDuringExecution")

    @JacksonXmlProperty(localName = "preferredDuringSchedulingIgnoredDuringExecution")

    private List<WeightPodAffinityTerms> preferredDuringSchedulingIgnoredDuringExecution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requiredDuringSchedulingIgnoredDuringExecution")

    @JacksonXmlProperty(localName = "requiredDuringSchedulingIgnoredDuringExecution")

    private List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution = null;

    public AffinityPodAffinity withPreferredDuringSchedulingIgnoredDuringExecution(
        List<WeightPodAffinityTerms> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public AffinityPodAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(
        WeightPodAffinityTerms preferredDuringSchedulingIgnoredDuringExecutionItem) {
        if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
            this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
        return this;
    }

    public AffinityPodAffinity withPreferredDuringSchedulingIgnoredDuringExecution(
        Consumer<List<WeightPodAffinityTerms>> preferredDuringSchedulingIgnoredDuringExecutionSetter) {
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
    public List<WeightPodAffinityTerms> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(
        List<WeightPodAffinityTerms> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    public AffinityPodAffinity withRequiredDuringSchedulingIgnoredDuringExecution(
        List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }

    public AffinityPodAffinity addRequiredDuringSchedulingIgnoredDuringExecutionItem(
        PodAffinityTerm requiredDuringSchedulingIgnoredDuringExecutionItem) {
        if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
            this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        this.requiredDuringSchedulingIgnoredDuringExecution.add(requiredDuringSchedulingIgnoredDuringExecutionItem);
        return this;
    }

    public AffinityPodAffinity withRequiredDuringSchedulingIgnoredDuringExecution(
        Consumer<List<PodAffinityTerm>> requiredDuringSchedulingIgnoredDuringExecutionSetter) {
        if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
            this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<>();
        }
        requiredDuringSchedulingIgnoredDuringExecutionSetter
            .accept(this.requiredDuringSchedulingIgnoredDuringExecution);
        return this;
    }

    /**
     * 强制使用定义的规则调度，且不会影响已经在节点上运行的Pod。即强制选择调度到满足规则的节点，不会调度到不满足规则的节点。
     * @return requiredDuringSchedulingIgnoredDuringExecution
     */
    public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(
        List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
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
        AffinityPodAffinity affinityPodAffinity = (AffinityPodAffinity) o;
        return Objects.equals(this.preferredDuringSchedulingIgnoredDuringExecution,
            affinityPodAffinity.preferredDuringSchedulingIgnoredDuringExecution)
            && Objects.equals(this.requiredDuringSchedulingIgnoredDuringExecution,
                affinityPodAffinity.requiredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution,
            requiredDuringSchedulingIgnoredDuringExecution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AffinityPodAffinity {\n");
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
