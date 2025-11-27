package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Taint
 */
public class Taint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private String effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeadded")

    private OffsetDateTime timeadded;

    public Taint withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Taint withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Taint withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * effect信息
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Taint withTimeadded(OffsetDateTime timeadded) {
        this.timeadded = timeadded;
        return this;
    }

    /**
     * 时间戳信息
     * @return timeadded
     */
    public OffsetDateTime getTimeadded() {
        return timeadded;
    }

    public void setTimeadded(OffsetDateTime timeadded) {
        this.timeadded = timeadded;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Taint that = (Taint) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.effect, that.effect) && Objects.equals(this.timeadded, that.timeadded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, effect, timeadded);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Taint {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    timeadded: ").append(toIndentedString(timeadded)).append("\n");
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
