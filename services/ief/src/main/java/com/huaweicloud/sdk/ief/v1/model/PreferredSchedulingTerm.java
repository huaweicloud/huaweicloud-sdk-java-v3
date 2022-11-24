package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 优先使用定义的规则调度，且不会影响已经在节点上运行的Pod。即优先选择调度到满足规则的节点，但也可能会调度到不满足规则的节点。
 */
public class PreferredSchedulingTerm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preference")

    private PreferredSchedulingTermPreference preference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public PreferredSchedulingTerm withPreference(PreferredSchedulingTermPreference preference) {
        this.preference = preference;
        return this;
    }

    public PreferredSchedulingTerm withPreference(Consumer<PreferredSchedulingTermPreference> preferenceSetter) {
        if (this.preference == null) {
            this.preference = new PreferredSchedulingTermPreference();
            preferenceSetter.accept(this.preference);
        }

        return this;
    }

    /**
     * Get preference
     * @return preference
     */
    public PreferredSchedulingTermPreference getPreference() {
        return preference;
    }

    public void setPreference(PreferredSchedulingTermPreference preference) {
        this.preference = preference;
    }

    public PreferredSchedulingTerm withWeight(Integer weight) {
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
        PreferredSchedulingTerm preferredSchedulingTerm = (PreferredSchedulingTerm) o;
        return Objects.equals(this.preference, preferredSchedulingTerm.preference)
            && Objects.equals(this.weight, preferredSchedulingTerm.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preference, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreferredSchedulingTerm {\n");
        sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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
