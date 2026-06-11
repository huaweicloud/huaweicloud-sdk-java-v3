package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreferredSchedulingTerm
 */
public class PreferredSchedulingTerm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preference")

    private NodeSelectorTerm preference;

    public PreferredSchedulingTerm withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释**：与匹配相应 nodeSelectorTerm 相关的权重 **约束限制**：不涉及。 **取值范围**：范围为 1-100。 **默认取值**：不涉及。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public PreferredSchedulingTerm withPreference(NodeSelectorTerm preference) {
        this.preference = preference;
        return this;
    }

    public PreferredSchedulingTerm withPreference(Consumer<NodeSelectorTerm> preferenceSetter) {
        if (this.preference == null) {
            this.preference = new NodeSelectorTerm();
            preferenceSetter.accept(this.preference);
        }

        return this;
    }

    /**
     * Get preference
     * @return preference
     */
    public NodeSelectorTerm getPreference() {
        return preference;
    }

    public void setPreference(NodeSelectorTerm preference) {
        this.preference = preference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreferredSchedulingTerm that = (PreferredSchedulingTerm) obj;
        return Objects.equals(this.weight, that.weight) && Objects.equals(this.preference, that.preference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, preference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreferredSchedulingTerm {\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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
