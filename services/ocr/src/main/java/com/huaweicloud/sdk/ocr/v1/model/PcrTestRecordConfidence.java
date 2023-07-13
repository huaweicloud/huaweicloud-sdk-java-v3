package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PcrTestRecordConfidence
 */
public class PcrTestRecordConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Float name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sampling_time")

    private Float samplingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_time")

    private Float testTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result")

    private Float testResult;

    public PcrTestRecordConfidence withName(Float name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名的置信度 
     * @return name
     */
    public Float getName() {
        return name;
    }

    public void setName(Float name) {
        this.name = name;
    }

    public PcrTestRecordConfidence withSamplingTime(Float samplingTime) {
        this.samplingTime = samplingTime;
        return this;
    }

    /**
     * 核酸检测采样时间的置信度 
     * @return samplingTime
     */
    public Float getSamplingTime() {
        return samplingTime;
    }

    public void setSamplingTime(Float samplingTime) {
        this.samplingTime = samplingTime;
    }

    public PcrTestRecordConfidence withTestTime(Float testTime) {
        this.testTime = testTime;
        return this;
    }

    /**
     * 核酸检测结果更新时间的置信度 
     * @return testTime
     */
    public Float getTestTime() {
        return testTime;
    }

    public void setTestTime(Float testTime) {
        this.testTime = testTime;
    }

    public PcrTestRecordConfidence withTestResult(Float testResult) {
        this.testResult = testResult;
        return this;
    }

    /**
     * 核酸检测结果的置信度 
     * @return testResult
     */
    public Float getTestResult() {
        return testResult;
    }

    public void setTestResult(Float testResult) {
        this.testResult = testResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PcrTestRecordConfidence that = (PcrTestRecordConfidence) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.samplingTime, that.samplingTime)
            && Objects.equals(this.testTime, that.testTime) && Objects.equals(this.testResult, that.testResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, samplingTime, testTime, testResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PcrTestRecordConfidence {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    samplingTime: ").append(toIndentedString(samplingTime)).append("\n");
        sb.append("    testTime: ").append(toIndentedString(testTime)).append("\n");
        sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
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
