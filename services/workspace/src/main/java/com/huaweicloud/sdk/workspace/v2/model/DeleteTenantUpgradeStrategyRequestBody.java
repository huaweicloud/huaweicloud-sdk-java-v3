package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除升级策略请求
 */
public class DeleteTenantUpgradeStrategyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_ids")

    private List<String> strategyIds = null;

    public DeleteTenantUpgradeStrategyRequestBody withStrategyIds(List<String> strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }

    public DeleteTenantUpgradeStrategyRequestBody addStrategyIdsItem(String strategyIdsItem) {
        if (this.strategyIds == null) {
            this.strategyIds = new ArrayList<>();
        }
        this.strategyIds.add(strategyIdsItem);
        return this;
    }

    public DeleteTenantUpgradeStrategyRequestBody withStrategyIds(Consumer<List<String>> strategyIdsSetter) {
        if (this.strategyIds == null) {
            this.strategyIds = new ArrayList<>();
        }
        strategyIdsSetter.accept(this.strategyIds);
        return this;
    }

    /**
     * 策略ID列表
     * @return strategyIds
     */
    public List<String> getStrategyIds() {
        return strategyIds;
    }

    public void setStrategyIds(List<String> strategyIds) {
        this.strategyIds = strategyIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTenantUpgradeStrategyRequestBody that = (DeleteTenantUpgradeStrategyRequestBody) obj;
        return Objects.equals(this.strategyIds, that.strategyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTenantUpgradeStrategyRequestBody {\n");
        sb.append("    strategyIds: ").append(toIndentedString(strategyIds)).append("\n");
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
