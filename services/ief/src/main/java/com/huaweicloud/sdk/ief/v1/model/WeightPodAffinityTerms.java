package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 优先使用定义的规则调度，且不会影响已经在节点上运行的Pod。即优先选择调度到满足规则的节点，但也可能会调度到不满足规则的节点。
 */
public class WeightPodAffinityTerms {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podAffinityTerm")

    @JacksonXmlProperty(localName = "podAffinityTerm")

    private WeightPodAffinityTermsPodAffinityTerm podAffinityTerm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    @JacksonXmlProperty(localName = "weight")

    private Integer weight;

    public WeightPodAffinityTerms withPodAffinityTerm(WeightPodAffinityTermsPodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }

    public WeightPodAffinityTerms withPodAffinityTerm(
        Consumer<WeightPodAffinityTermsPodAffinityTerm> podAffinityTermSetter) {
        if (this.podAffinityTerm == null) {
            this.podAffinityTerm = new WeightPodAffinityTermsPodAffinityTerm();
            podAffinityTermSetter.accept(this.podAffinityTerm);
        }

        return this;
    }

    /**
     * Get podAffinityTerm
     * @return podAffinityTerm
     */
    public WeightPodAffinityTermsPodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(WeightPodAffinityTermsPodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    public WeightPodAffinityTerms withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重，范围为1-100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeightPodAffinityTerms weightPodAffinityTerms = (WeightPodAffinityTerms) o;
        return Objects.equals(this.podAffinityTerm, weightPodAffinityTerms.podAffinityTerm)
            && Objects.equals(this.weight, weightPodAffinityTerms.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(podAffinityTerm, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeightPodAffinityTerms {\n");
        sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
