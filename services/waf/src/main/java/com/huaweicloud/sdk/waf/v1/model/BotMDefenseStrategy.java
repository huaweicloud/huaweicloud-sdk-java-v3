package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BotMDefenseStrategy
 */
public class BotMDefenseStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low")

    private BotMDefenseLevel low;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium")

    private BotMDefenseLevel medium;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high")

    private BotMDefenseLevel high;

    public BotMDefenseStrategy withLow(BotMDefenseLevel low) {
        this.low = low;
        return this;
    }

    public BotMDefenseStrategy withLow(Consumer<BotMDefenseLevel> lowSetter) {
        if (this.low == null) {
            this.low = new BotMDefenseLevel();
            lowSetter.accept(this.low);
        }

        return this;
    }

    /**
     * Get low
     * @return low
     */
    public BotMDefenseLevel getLow() {
        return low;
    }

    public void setLow(BotMDefenseLevel low) {
        this.low = low;
    }

    public BotMDefenseStrategy withMedium(BotMDefenseLevel medium) {
        this.medium = medium;
        return this;
    }

    public BotMDefenseStrategy withMedium(Consumer<BotMDefenseLevel> mediumSetter) {
        if (this.medium == null) {
            this.medium = new BotMDefenseLevel();
            mediumSetter.accept(this.medium);
        }

        return this;
    }

    /**
     * Get medium
     * @return medium
     */
    public BotMDefenseLevel getMedium() {
        return medium;
    }

    public void setMedium(BotMDefenseLevel medium) {
        this.medium = medium;
    }

    public BotMDefenseStrategy withHigh(BotMDefenseLevel high) {
        this.high = high;
        return this;
    }

    public BotMDefenseStrategy withHigh(Consumer<BotMDefenseLevel> highSetter) {
        if (this.high == null) {
            this.high = new BotMDefenseLevel();
            highSetter.accept(this.high);
        }

        return this;
    }

    /**
     * Get high
     * @return high
     */
    public BotMDefenseLevel getHigh() {
        return high;
    }

    public void setHigh(BotMDefenseLevel high) {
        this.high = high;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BotMDefenseStrategy that = (BotMDefenseStrategy) obj;
        return Objects.equals(this.low, that.low) && Objects.equals(this.medium, that.medium)
            && Objects.equals(this.high, that.high);
    }

    @Override
    public int hashCode() {
        return Objects.hash(low, medium, high);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotMDefenseStrategy {\n");
        sb.append("    low: ").append(toIndentedString(low)).append("\n");
        sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
        sb.append("    high: ").append(toIndentedString(high)).append("\n");
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
