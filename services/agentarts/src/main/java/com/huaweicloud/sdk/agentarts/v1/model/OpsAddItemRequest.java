package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 新增单个数据条目的具体内容请求。 **约束限制：** turns 列表不能为空。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class OpsAddItemRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turns")

    private List<OpsTurnInput> turns = null;

    public OpsAddItemRequest withTurns(List<OpsTurnInput> turns) {
        this.turns = turns;
        return this;
    }

    public OpsAddItemRequest addTurnsItem(OpsTurnInput turnsItem) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        this.turns.add(turnsItem);
        return this;
    }

    public OpsAddItemRequest withTurns(Consumer<List<OpsTurnInput>> turnsSetter) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        turnsSetter.accept(this.turns);
        return this;
    }

    /**
     * **参数解释：** 构成该数据条目的交互轮次列表。对于单轮问答长度为1，多轮对话包含多个轮次。 **约束限制：** 包含1到10000个轮次项。 **取值范围：** 参考OpsTurnInput定义。 **默认取值：** 不涉及。 
     * @return turns
     */
    public List<OpsTurnInput> getTurns() {
        return turns;
    }

    public void setTurns(List<OpsTurnInput> turns) {
        this.turns = turns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsAddItemRequest that = (OpsAddItemRequest) obj;
        return Objects.equals(this.turns, that.turns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsAddItemRequest {\n");
        sb.append("    turns: ").append(toIndentedString(turns)).append("\n");
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
