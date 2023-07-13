package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文本用例信息
 */
public class CaseDoc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_names")

    private List<String> labelNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preparation")

    private String preparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank")

    private Integer rank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<CaseDocSteps> steps = null;

    public CaseDoc withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用例描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CaseDoc withLabelNames(List<String> labelNames) {
        this.labelNames = labelNames;
        return this;
    }

    public CaseDoc addLabelNamesItem(String labelNamesItem) {
        if (this.labelNames == null) {
            this.labelNames = new ArrayList<>();
        }
        this.labelNames.add(labelNamesItem);
        return this;
    }

    public CaseDoc withLabelNames(Consumer<List<String>> labelNamesSetter) {
        if (this.labelNames == null) {
            this.labelNames = new ArrayList<>();
        }
        labelNamesSetter.accept(this.labelNames);
        return this;
    }

    /**
     * 标签
     * @return labelNames
     */
    public List<String> getLabelNames() {
        return labelNames;
    }

    public void setLabelNames(List<String> labelNames) {
        this.labelNames = labelNames;
    }

    public CaseDoc withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    /**
     * 前置条件
     * @return preparation
     */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public CaseDoc withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * 用例等级（0-L0；1-L1；2-L2；3-L3；4-L4；）
     * minimum: 0
     * maximum: 64
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public CaseDoc withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态（0-新建；5-设计中；6-测试中；7-完成；）
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public CaseDoc withSteps(List<CaseDocSteps> steps) {
        this.steps = steps;
        return this;
    }

    public CaseDoc addStepsItem(CaseDocSteps stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public CaseDoc withSteps(Consumer<List<CaseDocSteps>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 测试步骤
     * @return steps
     */
    public List<CaseDocSteps> getSteps() {
        return steps;
    }

    public void setSteps(List<CaseDocSteps> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseDoc that = (CaseDoc) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.labelNames, that.labelNames)
            && Objects.equals(this.preparation, that.preparation) && Objects.equals(this.rank, that.rank)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, labelNames, preparation, rank, statusCode, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseDoc {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labelNames: ").append(toIndentedString(labelNames)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
