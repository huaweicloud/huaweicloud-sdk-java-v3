package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 污点。
 */
public class Taints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private String effect;

    public Taints withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：键。 **取值范围**：不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Taints withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：值。 **取值范围**：不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Taints withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * **参数解释**：作用效果。 **取值范围**：不涉及。
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Taints that = (Taints) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.effect, that.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, effect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Taints {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
