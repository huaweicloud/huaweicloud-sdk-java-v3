package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 合成的单条数据条目对象（Turn 格式）。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class EvaluationOpsSynthesisItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turns")

    private List<EvaluationOpsTurn> turns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public EvaluationOpsSynthesisItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 合成条目的唯一标识符。在存储层对应MongoDB的ObjectID。 **约束限制：** 1-64个字符。 **取值范围：** 标准的ObjectID字符串格式。 **默认取值：** 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EvaluationOpsSynthesisItem withTurns(List<EvaluationOpsTurn> turns) {
        this.turns = turns;
        return this;
    }

    public EvaluationOpsSynthesisItem addTurnsItem(EvaluationOpsTurn turnsItem) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        this.turns.add(turnsItem);
        return this;
    }

    public EvaluationOpsSynthesisItem withTurns(Consumer<List<EvaluationOpsTurn>> turnsSetter) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        turnsSetter.accept(this.turns);
        return this;
    }

    /**
     * **参数解释：** 条目对应的多轮对话或交互序列。 **约束限制：** 包含0-10个对话轮次。 **取值范围：** 参考EvaluationOpsTurn。 **默认取值：** 不涉及。 
     * @return turns
     */
    public List<EvaluationOpsTurn> getTurns() {
        return turns;
    }

    public void setTurns(List<EvaluationOpsTurn> turns) {
        this.turns = turns;
    }

    public EvaluationOpsSynthesisItem withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 该合成条目生成的精确时间戳。 **约束限制：** 符合ISO8601标准。 **取值范围：** 日期时间字符串。 **默认取值：** 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsSynthesisItem that = (EvaluationOpsSynthesisItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.turns, that.turns)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, turns, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsSynthesisItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    turns: ").append(toIndentedString(turns)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
