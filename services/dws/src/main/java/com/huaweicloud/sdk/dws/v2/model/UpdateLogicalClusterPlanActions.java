package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 更新逻辑集群增删计划细节信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class UpdateLogicalClusterPlanActions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    public UpdateLogicalClusterPlanActions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群增删行动ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateLogicalClusterPlanActions withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 更新逻辑集群增删计划行动类型。 **约束限制**： 不涉及。 **取值范围**： create：创建 delete：删除 **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateLogicalClusterPlanActions withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释**： 更新逻辑集群增删计划行为Cron策略表达式。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
        UpdateLogicalClusterPlanActions that = (UpdateLogicalClusterPlanActions) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.strategy, that.strategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, strategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogicalClusterPlanActions {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
