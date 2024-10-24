package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 基模型
 */
public class BaseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_model_type")

    private String baseModelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens")

    private Integer maxTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_of_mu")

    private Integer numOfMu;

    public BaseModel withBaseModelType(String baseModelType) {
        this.baseModelType = baseModelType;
        return this;
    }

    /**
     * 类型请从ListBaseModels列举基模型接口响应中获取
     * @return baseModelType
     */
    public String getBaseModelType() {
        return baseModelType;
    }

    public void setBaseModelType(String baseModelType) {
        this.baseModelType = baseModelType;
    }

    public BaseModel withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * 支持的最大token数
     * minimum: 1
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public BaseModel withNumOfMu(Integer numOfMu) {
        this.numOfMu = numOfMu;
        return this;
    }

    /**
     * 消耗MU数量
     * minimum: 1
     * maximum: 128
     * @return numOfMu
     */
    public Integer getNumOfMu() {
        return numOfMu;
    }

    public void setNumOfMu(Integer numOfMu) {
        this.numOfMu = numOfMu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseModel that = (BaseModel) obj;
        return Objects.equals(this.baseModelType, that.baseModelType) && Objects.equals(this.maxTokens, that.maxTokens)
            && Objects.equals(this.numOfMu, that.numOfMu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseModelType, maxTokens, numOfMu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseModel {\n");
        sb.append("    baseModelType: ").append(toIndentedString(baseModelType)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    numOfMu: ").append(toIndentedString(numOfMu)).append("\n");
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
