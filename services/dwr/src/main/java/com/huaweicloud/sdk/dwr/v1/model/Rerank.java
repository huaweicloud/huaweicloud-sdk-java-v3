package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Rerank
 */
public class Rerank {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, Object> params = null;

    public Rerank withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释：** 重排序的策略名称。 **约束限制：** 不涉及 **取值范围：** `[\"weighted\", \"rrf\"]` 默认取值: \"rrf\"
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public Rerank withParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public Rerank putParamsItem(String key, Object paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public Rerank withParams(Consumer<Map<String, Object>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：** rerank策略的算法参数。 可以设置的参数： - k：平滑值。（仅对rrf策略生效） - weights：各个向量搜索结果的权值。（仅对weighted策略生效，且当策略为weighted时该参数必填） 重排序的策略名称。 **约束限制：** 不涉及。 **取值范围：** - weights：[0, 1] - k：(0, 16384) **默认取值：** - k：60
     * @return params
     */
    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rerank that = (Rerank) obj;
        return Objects.equals(this.strategy, that.strategy) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategy, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rerank {\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
