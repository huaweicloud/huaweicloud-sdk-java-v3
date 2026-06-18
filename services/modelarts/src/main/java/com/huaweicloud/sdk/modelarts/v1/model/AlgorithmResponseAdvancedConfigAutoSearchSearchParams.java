package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlgorithmResponseAdvancedConfigAutoSearchSearchParams
 */
public class AlgorithmResponseAdvancedConfigAutoSearchSearchParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type")

    private String paramType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower_bound")

    private String lowerBound;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upper_bound")

    private String upperBound;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discrete_points_num")

    private String discretePointsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discrete_values")

    private String discreteValues;

    public AlgorithmResponseAdvancedConfigAutoSearchSearchParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 超参名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlgorithmResponseAdvancedConfigAutoSearchSearchParams withParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * 参数类型。 - continuous：指定时表示这个超参是连续类型的。连续类型的超参在算法使用于训练作业时，控制台显示为输入框。 - discrete：指定时表示这个超参是离散类型的。离散类型的超参在算法使用于训练作业时，控制台显示为下拉选择框架。
     * @return paramType
     */
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public AlgorithmResponseAdvancedConfigAutoSearchSearchParams withLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    /**
     * 超参下界。
     * @return lowerBound
     */
    public String getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
    }

    public AlgorithmResponseAdvancedConfigAutoSearchSearchParams withUpperBound(String upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    /**
     * 超参上界。
     * @return upperBound
     */
    public String getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(String upperBound) {
        this.upperBound = upperBound;
    }

    public AlgorithmResponseAdvancedConfigAutoSearchSearchParams withDiscretePointsNum(String discretePointsNum) {
        this.discretePointsNum = discretePointsNum;
        return this;
    }

    /**
     * 连续型超参离散化取值个数。
     * @return discretePointsNum
     */
    public String getDiscretePointsNum() {
        return discretePointsNum;
    }

    public void setDiscretePointsNum(String discretePointsNum) {
        this.discretePointsNum = discretePointsNum;
    }

    public AlgorithmResponseAdvancedConfigAutoSearchSearchParams withDiscreteValues(String discreteValues) {
        this.discreteValues = discreteValues;
        return this;
    }

    /**
     * 离散型超参的取值列表。
     * @return discreteValues
     */
    public String getDiscreteValues() {
        return discreteValues;
    }

    public void setDiscreteValues(String discreteValues) {
        this.discreteValues = discreteValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmResponseAdvancedConfigAutoSearchSearchParams that =
            (AlgorithmResponseAdvancedConfigAutoSearchSearchParams) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.paramType, that.paramType)
            && Objects.equals(this.lowerBound, that.lowerBound) && Objects.equals(this.upperBound, that.upperBound)
            && Objects.equals(this.discretePointsNum, that.discretePointsNum)
            && Objects.equals(this.discreteValues, that.discreteValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, paramType, lowerBound, upperBound, discretePointsNum, discreteValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmResponseAdvancedConfigAutoSearchSearchParams {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
        sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
        sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
        sb.append("    discretePointsNum: ").append(toIndentedString(discretePointsNum)).append("\n");
        sb.append("    discreteValues: ").append(toIndentedString(discreteValues)).append("\n");
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
