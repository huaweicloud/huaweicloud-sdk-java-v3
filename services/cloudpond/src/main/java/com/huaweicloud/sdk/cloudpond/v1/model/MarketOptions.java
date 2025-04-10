package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 计费信息
 */
public class MarketOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeMode chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    private PrepaidOptions prepaidOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategies")

    private List<Strategy> strategies = null;

    public MarketOptions withChargeMode(ChargeMode chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * Get chargeMode
     * @return chargeMode
     */
    public ChargeMode getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeMode chargeMode) {
        this.chargeMode = chargeMode;
    }

    public MarketOptions withPrepaidOptions(PrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public MarketOptions withPrepaidOptions(Consumer<PrepaidOptions> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new PrepaidOptions();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /**
     * Get prepaidOptions
     * @return prepaidOptions
     */
    public PrepaidOptions getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(PrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    public MarketOptions withStrategies(List<Strategy> strategies) {
        this.strategies = strategies;
        return this;
    }

    public MarketOptions addStrategiesItem(Strategy strategiesItem) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        this.strategies.add(strategiesItem);
        return this;
    }

    public MarketOptions withStrategies(Consumer<List<Strategy>> strategiesSetter) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        strategiesSetter.accept(this.strategies);
        return this;
    }

    /**
     * Get strategies
     * @return strategies
     */
    public List<Strategy> getStrategies() {
        return strategies;
    }

    public void setStrategies(List<Strategy> strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarketOptions that = (MarketOptions) obj;
        return Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.prepaidOptions, that.prepaidOptions)
            && Objects.equals(this.strategies, that.strategies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, prepaidOptions, strategies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketOptions {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    prepaidOptions: ").append(toIndentedString(prepaidOptions)).append("\n");
        sb.append("    strategies: ").append(toIndentedString(strategies)).append("\n");
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
