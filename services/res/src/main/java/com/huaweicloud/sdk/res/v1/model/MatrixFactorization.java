package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 矩阵分解参数配置
 */
public class MatrixFactorization {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "implicit_vector_rank")

    private Integer implicitVectorRank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regular_param")

    private Double regularParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_iterator_num")

    private Integer maxIteratorNum;

    public MatrixFactorization withImplicitVectorRank(Integer implicitVectorRank) {
        this.implicitVectorRank = implicitVectorRank;
        return this;
    }

    /**
     * 隐向量维度。
     * minimum: 1
     * maximum: 100
     * @return implicitVectorRank
     */
    public Integer getImplicitVectorRank() {
        return implicitVectorRank;
    }

    public void setImplicitVectorRank(Integer implicitVectorRank) {
        this.implicitVectorRank = implicitVectorRank;
    }

    public MatrixFactorization withRegularParam(Double regularParam) {
        this.regularParam = regularParam;
        return this;
    }

    /**
     * 优化正则化系数。
     * minimum: 1E-8
     * maximum: 1
     * @return regularParam
     */
    public Double getRegularParam() {
        return regularParam;
    }

    public void setRegularParam(Double regularParam) {
        this.regularParam = regularParam;
    }

    public MatrixFactorization withMaxIteratorNum(Integer maxIteratorNum) {
        this.maxIteratorNum = maxIteratorNum;
        return this;
    }

    /**
     * 迭代次数。
     * minimum: 1
     * maximum: 50
     * @return maxIteratorNum
     */
    public Integer getMaxIteratorNum() {
        return maxIteratorNum;
    }

    public void setMaxIteratorNum(Integer maxIteratorNum) {
        this.maxIteratorNum = maxIteratorNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatrixFactorization matrixFactorization = (MatrixFactorization) o;
        return Objects.equals(this.implicitVectorRank, matrixFactorization.implicitVectorRank)
            && Objects.equals(this.regularParam, matrixFactorization.regularParam)
            && Objects.equals(this.maxIteratorNum, matrixFactorization.maxIteratorNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(implicitVectorRank, regularParam, maxIteratorNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MatrixFactorization {\n");
        sb.append("    implicitVectorRank: ").append(toIndentedString(implicitVectorRank)).append("\n");
        sb.append("    regularParam: ").append(toIndentedString(regularParam)).append("\n");
        sb.append("    maxIteratorNum: ").append(toIndentedString(maxIteratorNum)).append("\n");
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
