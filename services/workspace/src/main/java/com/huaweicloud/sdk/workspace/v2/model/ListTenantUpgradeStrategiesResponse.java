package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListTenantUpgradeStrategiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategies")

    private List<TenantUpgradeStrategyDetailRsp> strategies = null;

    public ListTenantUpgradeStrategiesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数量
     * minimum: 0
     * maximum: 2147483647
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListTenantUpgradeStrategiesResponse withStrategies(List<TenantUpgradeStrategyDetailRsp> strategies) {
        this.strategies = strategies;
        return this;
    }

    public ListTenantUpgradeStrategiesResponse addStrategiesItem(TenantUpgradeStrategyDetailRsp strategiesItem) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        this.strategies.add(strategiesItem);
        return this;
    }

    public ListTenantUpgradeStrategiesResponse withStrategies(
        Consumer<List<TenantUpgradeStrategyDetailRsp>> strategiesSetter) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        strategiesSetter.accept(this.strategies);
        return this;
    }

    /**
     * 策略列表
     * @return strategies
     */
    public List<TenantUpgradeStrategyDetailRsp> getStrategies() {
        return strategies;
    }

    public void setStrategies(List<TenantUpgradeStrategyDetailRsp> strategies) {
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
        ListTenantUpgradeStrategiesResponse that = (ListTenantUpgradeStrategiesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.strategies, that.strategies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, strategies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantUpgradeStrategiesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
