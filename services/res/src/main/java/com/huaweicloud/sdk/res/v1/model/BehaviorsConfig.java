package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class BehaviorsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "positive_behaviors")

    @JacksonXmlProperty(localName = "positive_behaviors")

    private List<BehaviorWeights> positiveBehaviors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "negative_behaviors")

    @JacksonXmlProperty(localName = "negative_behaviors")

    private List<BehaviorWeights> negativeBehaviors = null;

    public BehaviorsConfig withPositiveBehaviors(List<BehaviorWeights> positiveBehaviors) {
        this.positiveBehaviors = positiveBehaviors;
        return this;
    }

    public BehaviorsConfig addPositiveBehaviorsItem(BehaviorWeights positiveBehaviorsItem) {
        if (this.positiveBehaviors == null) {
            this.positiveBehaviors = new ArrayList<>();
        }
        this.positiveBehaviors.add(positiveBehaviorsItem);
        return this;
    }

    public BehaviorsConfig withPositiveBehaviors(Consumer<List<BehaviorWeights>> positiveBehaviorsSetter) {
        if (this.positiveBehaviors == null) {
            this.positiveBehaviors = new ArrayList<>();
        }
        positiveBehaviorsSetter.accept(this.positiveBehaviors);
        return this;
    }

    /**
     * 正向行为。
     * @return positiveBehaviors
     */
    public List<BehaviorWeights> getPositiveBehaviors() {
        return positiveBehaviors;
    }

    public void setPositiveBehaviors(List<BehaviorWeights> positiveBehaviors) {
        this.positiveBehaviors = positiveBehaviors;
    }

    public BehaviorsConfig withNegativeBehaviors(List<BehaviorWeights> negativeBehaviors) {
        this.negativeBehaviors = negativeBehaviors;
        return this;
    }

    public BehaviorsConfig addNegativeBehaviorsItem(BehaviorWeights negativeBehaviorsItem) {
        if (this.negativeBehaviors == null) {
            this.negativeBehaviors = new ArrayList<>();
        }
        this.negativeBehaviors.add(negativeBehaviorsItem);
        return this;
    }

    public BehaviorsConfig withNegativeBehaviors(Consumer<List<BehaviorWeights>> negativeBehaviorsSetter) {
        if (this.negativeBehaviors == null) {
            this.negativeBehaviors = new ArrayList<>();
        }
        negativeBehaviorsSetter.accept(this.negativeBehaviors);
        return this;
    }

    /**
     * 负向行为。
     * @return negativeBehaviors
     */
    public List<BehaviorWeights> getNegativeBehaviors() {
        return negativeBehaviors;
    }

    public void setNegativeBehaviors(List<BehaviorWeights> negativeBehaviors) {
        this.negativeBehaviors = negativeBehaviors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BehaviorsConfig behaviorsConfig = (BehaviorsConfig) o;
        return Objects.equals(this.positiveBehaviors, behaviorsConfig.positiveBehaviors)
            && Objects.equals(this.negativeBehaviors, behaviorsConfig.negativeBehaviors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positiveBehaviors, negativeBehaviors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BehaviorsConfig {\n");
        sb.append("    positiveBehaviors: ").append(toIndentedString(positiveBehaviors)).append("\n");
        sb.append("    negativeBehaviors: ").append(toIndentedString(negativeBehaviors)).append("\n");
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
