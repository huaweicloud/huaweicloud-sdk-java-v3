package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SynthesisParamDto
 */
public class SynthesisParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_search_depth")

    private Integer maxSearchDepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_limit")

    private Integer timeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_prediction_per_product")

    private Integer maxPredictionPerProduct;

    public SynthesisParamDto withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 期望最大返回条目数（排序后取TopN）
     * minimum: 1
     * maximum: 50
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public SynthesisParamDto withMaxSearchDepth(Integer maxSearchDepth) {
        this.maxSearchDepth = maxSearchDepth;
        return this;
    }

    /**
     * 预测路径的最大深度
     * minimum: 3
     * maximum: 12
     * @return maxSearchDepth
     */
    public Integer getMaxSearchDepth() {
        return maxSearchDepth;
    }

    public void setMaxSearchDepth(Integer maxSearchDepth) {
        this.maxSearchDepth = maxSearchDepth;
    }

    public SynthesisParamDto withTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    /**
     * 搜索最大时间，单位:分钟
     * minimum: 5
     * maximum: 60
     * @return timeLimit
     */
    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public SynthesisParamDto withMaxPredictionPerProduct(Integer maxPredictionPerProduct) {
        this.maxPredictionPerProduct = maxPredictionPerProduct;
        return this;
    }

    /**
     * 每个产物的最大反应数量
     * minimum: 2
     * maximum: 20
     * @return maxPredictionPerProduct
     */
    public Integer getMaxPredictionPerProduct() {
        return maxPredictionPerProduct;
    }

    public void setMaxPredictionPerProduct(Integer maxPredictionPerProduct) {
        this.maxPredictionPerProduct = maxPredictionPerProduct;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SynthesisParamDto that = (SynthesisParamDto) obj;
        return Objects.equals(this.topN, that.topN) && Objects.equals(this.maxSearchDepth, that.maxSearchDepth)
            && Objects.equals(this.timeLimit, that.timeLimit)
            && Objects.equals(this.maxPredictionPerProduct, that.maxPredictionPerProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topN, maxSearchDepth, timeLimit, maxPredictionPerProduct);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisParamDto {\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    maxSearchDepth: ").append(toIndentedString(maxSearchDepth)).append("\n");
        sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
        sb.append("    maxPredictionPerProduct: ").append(toIndentedString(maxPredictionPerProduct)).append("\n");
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
