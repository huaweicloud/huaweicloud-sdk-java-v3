package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子优化结果条目
 */
public class OptimizationResultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "props")

    private List<PropertyValue> props = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similarity")

    private BigDecimal similarity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_fulfilled_weak_constraints")

    private Integer numFulfilledWeakConstraints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private BigDecimal score;

    public OptimizationResultItem withSmiles(String smiles) {
        this.smiles = smiles;
        return this;
    }

    /**
     * 分子SMILES表达式
     * @return smiles
     */
    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public OptimizationResultItem withProps(List<PropertyValue> props) {
        this.props = props;
        return this;
    }

    public OptimizationResultItem addPropsItem(PropertyValue propsItem) {
        if (this.props == null) {
            this.props = new ArrayList<>();
        }
        this.props.add(propsItem);
        return this;
    }

    public OptimizationResultItem withProps(Consumer<List<PropertyValue>> propsSetter) {
        if (this.props == null) {
            this.props = new ArrayList<>();
        }
        propsSetter.accept(this.props);
        return this;
    }

    /**
     * 分子ADMET属性值列表
     * @return props
     */
    public List<PropertyValue> getProps() {
        return props;
    }

    public void setProps(List<PropertyValue> props) {
        this.props = props;
    }

    public OptimizationResultItem withSimilarity(BigDecimal similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * 分子与初始分子的相似度
     * @return similarity
     */
    public BigDecimal getSimilarity() {
        return similarity;
    }

    public void setSimilarity(BigDecimal similarity) {
        this.similarity = similarity;
    }

    public OptimizationResultItem withNumFulfilledWeakConstraints(Integer numFulfilledWeakConstraints) {
        this.numFulfilledWeakConstraints = numFulfilledWeakConstraints;
        return this;
    }

    /**
     * 分子所满足的弱约束数量
     * @return numFulfilledWeakConstraints
     */
    public Integer getNumFulfilledWeakConstraints() {
        return numFulfilledWeakConstraints;
    }

    public void setNumFulfilledWeakConstraints(Integer numFulfilledWeakConstraints) {
        this.numFulfilledWeakConstraints = numFulfilledWeakConstraints;
    }

    public OptimizationResultItem withScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * 分子的打分
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
        OptimizationResultItem that = (OptimizationResultItem) obj;
        return Objects.equals(this.smiles, that.smiles) && Objects.equals(this.props, that.props)
            && Objects.equals(this.similarity, that.similarity)
            && Objects.equals(this.numFulfilledWeakConstraints, that.numFulfilledWeakConstraints)
            && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smiles, props, similarity, numFulfilledWeakConstraints, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptimizationResultItem {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    props: ").append(toIndentedString(props)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
        sb.append("    numFulfilledWeakConstraints: ")
            .append(toIndentedString(numFulfilledWeakConstraints))
            .append("\n");
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
