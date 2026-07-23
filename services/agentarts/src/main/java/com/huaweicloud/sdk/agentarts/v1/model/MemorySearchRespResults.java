package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MemorySearchRespResults
 */
public class MemorySearchRespResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record")

    private MemoryRecord record;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    public MemorySearchRespResults withRecord(MemoryRecord record) {
        this.record = record;
        return this;
    }

    public MemorySearchRespResults withRecord(Consumer<MemoryRecord> recordSetter) {
        if (this.record == null) {
            this.record = new MemoryRecord();
            recordSetter.accept(this.record);
        }

        return this;
    }

    /**
     * Get record
     * @return record
     */
    public MemoryRecord getRecord() {
        return record;
    }

    public void setRecord(MemoryRecord record) {
        this.record = record;
    }

    public MemorySearchRespResults withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：**  相似度分数（0.0-1.0）。 **约束限制：**  不涉及。 **取值范围：**  0.0-1.0 **默认取值：**  0.0-1.0 
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemorySearchRespResults that = (MemorySearchRespResults) obj;
        return Objects.equals(this.record, that.record) && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(record, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemorySearchRespResults {\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
