package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子合成路径规划任务的返回结果
 */
public class SynthesisResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_search_depth")

    private Integer maxSearchDepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_prediction_per_product")

    private Integer maxPredictionPerProduct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private SynthesisResultResult result;

    public SynthesisResult withSmiles(String smiles) {
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

    public SynthesisResult withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 期望返回的条目数
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public SynthesisResult withMaxSearchDepth(Integer maxSearchDepth) {
        this.maxSearchDepth = maxSearchDepth;
        return this;
    }

    /**
     * 期望搜索的最大深度
     * @return maxSearchDepth
     */
    public Integer getMaxSearchDepth() {
        return maxSearchDepth;
    }

    public void setMaxSearchDepth(Integer maxSearchDepth) {
        this.maxSearchDepth = maxSearchDepth;
    }

    public SynthesisResult withMaxPredictionPerProduct(Integer maxPredictionPerProduct) {
        this.maxPredictionPerProduct = maxPredictionPerProduct;
        return this;
    }

    /**
     * 期望每个产物的最多反应数量
     * @return maxPredictionPerProduct
     */
    public Integer getMaxPredictionPerProduct() {
        return maxPredictionPerProduct;
    }

    public void setMaxPredictionPerProduct(Integer maxPredictionPerProduct) {
        this.maxPredictionPerProduct = maxPredictionPerProduct;
    }

    public SynthesisResult withResult(SynthesisResultResult result) {
        this.result = result;
        return this;
    }

    public SynthesisResult withResult(Consumer<SynthesisResultResult> resultSetter) {
        if (this.result == null) {
            this.result = new SynthesisResultResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public SynthesisResultResult getResult() {
        return result;
    }

    public void setResult(SynthesisResultResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SynthesisResult that = (SynthesisResult) obj;
        return Objects.equals(this.smiles, that.smiles) && Objects.equals(this.topN, that.topN)
            && Objects.equals(this.maxSearchDepth, that.maxSearchDepth)
            && Objects.equals(this.maxPredictionPerProduct, that.maxPredictionPerProduct)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smiles, topN, maxSearchDepth, maxPredictionPerProduct, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisResult {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    maxSearchDepth: ").append(toIndentedString(maxSearchDepth)).append("\n");
        sb.append("    maxPredictionPerProduct: ").append(toIndentedString(maxPredictionPerProduct)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
