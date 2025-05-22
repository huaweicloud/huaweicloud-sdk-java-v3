package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 用于提交逻辑集群增删计划的行为信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class LogicalClusterPlanActionsParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    public LogicalClusterPlanActionsParam withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 定时增删计划行为类型，取值范围为（create|delete）。 **约束限制**： 不涉及。 **取值范围**： create：创建 delete：删除 **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LogicalClusterPlanActionsParam withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释**： 周期性定时增删计划，Cron策略表达式：如\"0 0 0 ? * 3\"。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalClusterPlanActionsParam that = (LogicalClusterPlanActionsParam) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.strategy, that.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, strategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalClusterPlanActionsParam {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
