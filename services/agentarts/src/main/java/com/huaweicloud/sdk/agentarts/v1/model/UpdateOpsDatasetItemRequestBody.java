package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 更新特定数据条目内容的请求体。 **约束限制：** 执行此操作将全量覆盖原有的轮次数据。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class UpdateOpsDatasetItemRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turns")

    private List<OpsTurnInput> turns = null;

    public UpdateOpsDatasetItemRequestBody withTurns(List<OpsTurnInput> turns) {
        this.turns = turns;
        return this;
    }

    public UpdateOpsDatasetItemRequestBody addTurnsItem(OpsTurnInput turnsItem) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        this.turns.add(turnsItem);
        return this;
    }

    public UpdateOpsDatasetItemRequestBody withTurns(Consumer<List<OpsTurnInput>> turnsSetter) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        turnsSetter.accept(this.turns);
        return this;
    }

    /**
     * **参数解释：** 待更新的多轮对话或业务数据内容。 **约束限制：** 必填参数；数组长度限制 1 到 10000。 **取值范围：** 符合 OpsTurnInput 结构的对象数组。 **默认取值：** 不涉及。 
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
        UpdateOpsDatasetItemRequestBody that = (UpdateOpsDatasetItemRequestBody) obj;
        return Objects.equals(this.turns, that.turns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsDatasetItemRequestBody {\n");
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
