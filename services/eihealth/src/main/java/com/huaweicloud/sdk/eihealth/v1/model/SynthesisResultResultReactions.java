package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SynthesisResultResultReactions
 */
public class SynthesisResultResultReactions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reactants")

    private List<String> reactants = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product")

    private String product;

    public SynthesisResultResultReactions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 反应的序号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SynthesisResultResultReactions withReactants(List<String> reactants) {
        this.reactants = reactants;
        return this;
    }

    public SynthesisResultResultReactions addReactantsItem(String reactantsItem) {
        if (this.reactants == null) {
            this.reactants = new ArrayList<>();
        }
        this.reactants.add(reactantsItem);
        return this;
    }

    public SynthesisResultResultReactions withReactants(Consumer<List<String>> reactantsSetter) {
        if (this.reactants == null) {
            this.reactants = new ArrayList<>();
        }
        reactantsSetter.accept(this.reactants);
        return this;
    }

    /**
     * 反应物分子序号的列表
     * @return reactants
     */
    public List<String> getReactants() {
        return reactants;
    }

    public void setReactants(List<String> reactants) {
        this.reactants = reactants;
    }

    public SynthesisResultResultReactions withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * 产物分子序号
     * @return product
     */
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SynthesisResultResultReactions synthesisResultResultReactions = (SynthesisResultResultReactions) o;
        return Objects.equals(this.id, synthesisResultResultReactions.id)
            && Objects.equals(this.reactants, synthesisResultResultReactions.reactants)
            && Objects.equals(this.product, synthesisResultResultReactions.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reactants, product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisResultResultReactions {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reactants: ").append(toIndentedString(reactants)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
