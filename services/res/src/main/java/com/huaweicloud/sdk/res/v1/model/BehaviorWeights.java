package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** BehaviorWeights */
public class BehaviorWeights {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_type")

    private String behaviorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_uses")

    private List<String> otherUses = null;

    public BehaviorWeights withBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }

    /** 行为类型。
     * 
     * @return behaviorType */
    public String getBehaviorType() {
        return behaviorType;
    }

    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
    }

    public BehaviorWeights withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /** 行为权重。
     * 
     * @return weight */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public BehaviorWeights withOtherUses(List<String> otherUses) {
        this.otherUses = otherUses;
        return this;
    }

    public BehaviorWeights addOtherUsesItem(String otherUsesItem) {
        if (this.otherUses == null) {
            this.otherUses = new ArrayList<>();
        }
        this.otherUses.add(otherUsesItem);
        return this;
    }

    public BehaviorWeights withOtherUses(Consumer<List<String>> otherUsesSetter) {
        if (this.otherUses == null) {
            this.otherUses = new ArrayList<>();
        }
        otherUsesSetter.accept(this.otherUses);
        return this;
    }

    /** 其他用途。
     * 
     * @return otherUses */
    public List<String> getOtherUses() {
        return otherUses;
    }

    public void setOtherUses(List<String> otherUses) {
        this.otherUses = otherUses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BehaviorWeights behaviorWeights = (BehaviorWeights) o;
        return Objects.equals(this.behaviorType, behaviorWeights.behaviorType)
            && Objects.equals(this.weight, behaviorWeights.weight)
            && Objects.equals(this.otherUses, behaviorWeights.otherUses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(behaviorType, weight, otherUses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BehaviorWeights {\n");
        sb.append("    behaviorType: ").append(toIndentedString(behaviorType)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    otherUses: ").append(toIndentedString(otherUses)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
