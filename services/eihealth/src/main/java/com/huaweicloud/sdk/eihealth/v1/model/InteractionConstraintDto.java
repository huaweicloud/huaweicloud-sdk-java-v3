package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 相互作用力约束参数
 */
public class InteractionConstraintDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interactions")

    private List<Interaction> interactions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive")

    private Boolean exclusive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private OperatorType operator;

    public InteractionConstraintDto withInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
        return this;
    }

    public InteractionConstraintDto addInteractionsItem(Interaction interactionsItem) {
        if (this.interactions == null) {
            this.interactions = new ArrayList<>();
        }
        this.interactions.add(interactionsItem);
        return this;
    }

    public InteractionConstraintDto withInteractions(Consumer<List<Interaction>> interactionsSetter) {
        if (this.interactions == null) {
            this.interactions = new ArrayList<>();
        }
        interactionsSetter.accept(this.interactions);
        return this;
    }

    /**
     * 相互作用力列表
     * @return interactions
     */
    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public InteractionConstraintDto withExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
        return this;
    }

    /**
     * 是否排除指定的约束作用力
     * @return exclusive
     */
    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public InteractionConstraintDto withOperator(OperatorType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public OperatorType getOperator() {
        return operator;
    }

    public void setOperator(OperatorType operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractionConstraintDto that = (InteractionConstraintDto) obj;
        return Objects.equals(this.interactions, that.interactions) && Objects.equals(this.exclusive, that.exclusive)
            && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interactions, exclusive, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionConstraintDto {\n");
        sb.append("    interactions: ").append(toIndentedString(interactions)).append("\n");
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
