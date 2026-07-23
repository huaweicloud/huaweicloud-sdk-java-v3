package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评测集中具体条目的详细信息。 **取值范围：** 不涉及。
 */
public class OpsItemDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turns")

    private List<OpsTurn> turns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public OpsItemDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 数据条目的唯一标识符。 **取值范围：** 通常为符合 MongoDB ObjectID 规范的 24 位十六进制字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsItemDetail withTurns(List<OpsTurn> turns) {
        this.turns = turns;
        return this;
    }

    public OpsItemDetail addTurnsItem(OpsTurn turnsItem) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        this.turns.add(turnsItem);
        return this;
    }

    public OpsItemDetail withTurns(Consumer<List<OpsTurn>> turnsSetter) {
        if (this.turns == null) {
            this.turns = new ArrayList<>();
        }
        turnsSetter.accept(this.turns);
        return this;
    }

    /**
     * **参数解释：** 包含该条目具体业务内容的轮次数据列表，支持多轮对话格式。 **取值范围：** 符合OpsTurn定义的对象数组。
     * @return turns
     */
    public List<OpsTurn> getTurns() {
        return turns;
    }

    public void setTurns(List<OpsTurn> turns) {
        this.turns = turns;
    }

    public OpsItemDetail withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 该条目被首次创建的时间。 **取值范围：** UTC 时间字符串。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OpsItemDetail withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 该条目最后一次被修改的时间。 **取值范围：** UTC 时间字符串。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsItemDetail that = (OpsItemDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.turns, that.turns)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, turns, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsItemDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    turns: ").append(toIndentedString(turns)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
