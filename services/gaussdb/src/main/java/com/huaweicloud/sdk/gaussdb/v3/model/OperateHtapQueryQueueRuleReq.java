package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  设置查询当前查询队列阈值请求体。  **约束限制**：  不涉及。
 */
public class OperateHtapQueryQueueRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_queue_rule")

    private HtapQueryQueueRule queryQueueRule;

    public OperateHtapQueryQueueRuleReq withQueryQueueRule(HtapQueryQueueRule queryQueueRule) {
        this.queryQueueRule = queryQueueRule;
        return this;
    }

    public OperateHtapQueryQueueRuleReq withQueryQueueRule(Consumer<HtapQueryQueueRule> queryQueueRuleSetter) {
        if (this.queryQueueRule == null) {
            this.queryQueueRule = new HtapQueryQueueRule();
            queryQueueRuleSetter.accept(this.queryQueueRule);
        }

        return this;
    }

    /**
     * Get queryQueueRule
     * @return queryQueueRule
     */
    public HtapQueryQueueRule getQueryQueueRule() {
        return queryQueueRule;
    }

    public void setQueryQueueRule(HtapQueryQueueRule queryQueueRule) {
        this.queryQueueRule = queryQueueRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateHtapQueryQueueRuleReq that = (OperateHtapQueryQueueRuleReq) obj;
        return Objects.equals(this.queryQueueRule, that.queryQueueRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryQueueRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateHtapQueryQueueRuleReq {\n");
        sb.append("    queryQueueRule: ").append(toIndentedString(queryQueueRule)).append("\n");
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
