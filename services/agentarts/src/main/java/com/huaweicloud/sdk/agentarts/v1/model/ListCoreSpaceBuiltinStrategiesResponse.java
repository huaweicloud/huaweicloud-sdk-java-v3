package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListCoreSpaceBuiltinStrategiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategies")

    private List<CoreSpaceBuiltinMemoryStrategy> strategies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCoreSpaceBuiltinStrategiesResponse withStrategies(List<CoreSpaceBuiltinMemoryStrategy> strategies) {
        this.strategies = strategies;
        return this;
    }

    public ListCoreSpaceBuiltinStrategiesResponse addStrategiesItem(CoreSpaceBuiltinMemoryStrategy strategiesItem) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        this.strategies.add(strategiesItem);
        return this;
    }

    public ListCoreSpaceBuiltinStrategiesResponse withStrategies(
        Consumer<List<CoreSpaceBuiltinMemoryStrategy>> strategiesSetter) {
        if (this.strategies == null) {
            this.strategies = new ArrayList<>();
        }
        strategiesSetter.accept(this.strategies);
        return this;
    }

    /**
     * **参数解释：** 内置策略列表。 **取值范围：** 不涉及。 
     * @return strategies
     */
    public List<CoreSpaceBuiltinMemoryStrategy> getStrategies() {
        return strategies;
    }

    public void setStrategies(List<CoreSpaceBuiltinMemoryStrategy> strategies) {
        this.strategies = strategies;
    }

    public ListCoreSpaceBuiltinStrategiesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 内置策略总数（个）。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 100
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreSpaceBuiltinStrategiesResponse that = (ListCoreSpaceBuiltinStrategiesResponse) obj;
        return Objects.equals(this.strategies, that.strategies) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategies, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreSpaceBuiltinStrategiesResponse {\n");
        sb.append("    strategies: ").append(toIndentedString(strategies)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
