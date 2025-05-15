package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 冻结效果。
 */
public class FrozenEffect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_effect")

    private FrozenEffectEnum frozenEffect;

    public FrozenEffect withFrozenEffect(FrozenEffectEnum frozenEffect) {
        this.frozenEffect = frozenEffect;
        return this;
    }

    /**
     * Get frozenEffect
     * @return frozenEffect
     */
    public FrozenEffectEnum getFrozenEffect() {
        return frozenEffect;
    }

    public void setFrozenEffect(FrozenEffectEnum frozenEffect) {
        this.frozenEffect = frozenEffect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrozenEffect that = (FrozenEffect) obj;
        return Objects.equals(this.frozenEffect, that.frozenEffect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frozenEffect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrozenEffect {\n");
        sb.append("    frozenEffect: ").append(toIndentedString(frozenEffect)).append("\n");
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
