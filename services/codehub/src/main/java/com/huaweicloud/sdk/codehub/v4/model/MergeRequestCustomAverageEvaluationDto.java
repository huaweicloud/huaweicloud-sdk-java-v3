package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeRequestCustomAverageEvaluationDto
 */
public class MergeRequestCustomAverageEvaluationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_type_id")

    private Integer evaluationTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Double level;

    public MergeRequestCustomAverageEvaluationDto withEvaluationTypeId(Integer evaluationTypeId) {
        this.evaluationTypeId = evaluationTypeId;
        return this;
    }

    /**
     * **参数解释：** 自定义评价维度id。
     * @return evaluationTypeId
     */
    public Integer getEvaluationTypeId() {
        return evaluationTypeId;
    }

    public void setEvaluationTypeId(Integer evaluationTypeId) {
        this.evaluationTypeId = evaluationTypeId;
    }

    public MergeRequestCustomAverageEvaluationDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 自定义评价维度名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MergeRequestCustomAverageEvaluationDto withLevel(Double level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释：** 自定义评价维度平均分。
     * @return level
     */
    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestCustomAverageEvaluationDto that = (MergeRequestCustomAverageEvaluationDto) obj;
        return Objects.equals(this.evaluationTypeId, that.evaluationTypeId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationTypeId, name, level);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestCustomAverageEvaluationDto {\n");
        sb.append("    evaluationTypeId: ").append(toIndentedString(evaluationTypeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
