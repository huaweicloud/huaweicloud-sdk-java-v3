package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class SampleParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "divide_type")

    private String divideType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_rate")

    private Double trainRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_rate")

    private Double testRate;

    public SampleParam withDivideType(String divideType) {
        this.divideType = divideType;
        return this;
    }

    /**
     * 训练集测试集划分方式： - TIME，时间比例 - RAMDOM，个数比例
     * @return divideType
     */
    public String getDivideType() {
        return divideType;
    }

    public void setDivideType(String divideType) {
        this.divideType = divideType;
    }

    public SampleParam withTrainRate(Double trainRate) {
        this.trainRate = trainRate;
        return this;
    }

    /**
     * 训练数据占比。
     * minimum: 0.01
     * maximum: 1
     * @return trainRate
     */
    public Double getTrainRate() {
        return trainRate;
    }

    public void setTrainRate(Double trainRate) {
        this.trainRate = trainRate;
    }

    public SampleParam withTestRate(Double testRate) {
        this.testRate = testRate;
        return this;
    }

    /**
     * 测试数据占比。
     * minimum: 0.01
     * maximum: 1
     * @return testRate
     */
    public Double getTestRate() {
        return testRate;
    }

    public void setTestRate(Double testRate) {
        this.testRate = testRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleParam sampleParam = (SampleParam) o;
        return Objects.equals(this.divideType, sampleParam.divideType)
            && Objects.equals(this.trainRate, sampleParam.trainRate)
            && Objects.equals(this.testRate, sampleParam.testRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(divideType, trainRate, testRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleParam {\n");
        sb.append("    divideType: ").append(toIndentedString(divideType)).append("\n");
        sb.append("    trainRate: ").append(toIndentedString(trainRate)).append("\n");
        sb.append("    testRate: ").append(toIndentedString(testRate)).append("\n");
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
