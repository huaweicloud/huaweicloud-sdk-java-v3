package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUpgradeDurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategies")

    private List<DurationStrategies> strategies = null;

    public ShowUpgradeDurationResponse withStrategies(List<DurationStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }

    public ShowUpgradeDurationResponse addStrategiesItem(DurationStrategies strategiesItem) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        this.strategies.add(strategiesItem);
        return this;
    }

    public ShowUpgradeDurationResponse withStrategies(Consumer<List<DurationStrategies>> strategiesSetter) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        strategiesSetter.accept(this.strategies);
        return this;
    }

    /**
     * 升级策略列表
     * @return strategies
     */
    public List<DurationStrategies> getStrategies() {
        return strategies;
    }

    public void setStrategies(List<DurationStrategies> strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowUpgradeDurationResponse showUpgradeDurationResponse = (ShowUpgradeDurationResponse) o;
        return Objects.equals(this.strategies, showUpgradeDurationResponse.strategies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUpgradeDurationResponse {\n");
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
