package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求参数
 */
public class AtlasFullTextResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private AtlasEntityHeader entity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private BigDecimal score;

    public AtlasFullTextResult withEntity(AtlasEntityHeader entity) {
        this.entity = entity;
        return this;
    }

    public AtlasFullTextResult withEntity(Consumer<AtlasEntityHeader> entitySetter) {
        if (this.entity == null) {
            this.entity = new AtlasEntityHeader();
            entitySetter.accept(this.entity);
        }

        return this;
    }

    /**
     * Get entity
     * @return entity
     */
    public AtlasEntityHeader getEntity() {
        return entity;
    }

    public void setEntity(AtlasEntityHeader entity) {
        this.entity = entity;
    }

    public AtlasFullTextResult withScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * 数值
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
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
        AtlasFullTextResult that = (AtlasFullTextResult) obj;
        return Objects.equals(this.entity, that.entity) && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtlasFullTextResult {\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
