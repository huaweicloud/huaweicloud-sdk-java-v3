package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * Request Object
 */
public class DeleteCoreSpaceCustomizedStrategyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private UUID spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    private UUID strategyId;

    public DeleteCoreSpaceCustomizedStrategyRequest withSpaceId(UUID spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * **参数解释：**  记忆库 ID，唯一标识一个记忆库，可以通过AgentArts智能体记忆库控制台或者记忆库查询接口获取。 **约束限制：** 仅支持字母、数字和中划线。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值：** 不涉及。 
     * @return spaceId
     */
    public UUID getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(UUID spaceId) {
        this.spaceId = spaceId;
    }

    public DeleteCoreSpaceCustomizedStrategyRequest withStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * **参数解释：** 策略 ID，唯一标识一个记忆策略，可通过\"创建自定义策略\"或\"列出策略\"接口获取。 **约束限制：** 仅支持字母、数字和中划线。 **取值范围：** 长度1-48字符。 **默认取值：** 不涉及。 
     * @return strategyId
     */
    public UUID getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(UUID strategyId) {
        this.strategyId = strategyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCoreSpaceCustomizedStrategyRequest that = (DeleteCoreSpaceCustomizedStrategyRequest) obj;
        return Objects.equals(this.spaceId, that.spaceId) && Objects.equals(this.strategyId, that.strategyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaceId, strategyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCoreSpaceCustomizedStrategyRequest {\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
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
