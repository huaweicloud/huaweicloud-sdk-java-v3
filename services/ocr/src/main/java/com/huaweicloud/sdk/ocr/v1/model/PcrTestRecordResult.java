package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PcrTestRecordResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sampling_time")

    private String samplingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_time")

    private String testTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result")

    private String testResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private PcrTestRecordConfidence confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    private List<PcrTestRecordWordsBlockList> wordsBlockList = null;

    public PcrTestRecordResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PcrTestRecordResult withSamplingTime(String samplingTime) {
        this.samplingTime = samplingTime;
        return this;
    }

    /**
     * 核酸检测采样时间 
     * @return samplingTime
     */
    public String getSamplingTime() {
        return samplingTime;
    }

    public void setSamplingTime(String samplingTime) {
        this.samplingTime = samplingTime;
    }

    public PcrTestRecordResult withTestTime(String testTime) {
        this.testTime = testTime;
        return this;
    }

    /**
     * 核酸检测结果更新时间 
     * @return testTime
     */
    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public PcrTestRecordResult withTestResult(String testResult) {
        this.testResult = testResult;
        return this;
    }

    /**
     * 核酸检测结果，可选值包括：  - \"positive\",即阳性  - \"negative\",即阴性  - \"unknown\",未知 
     * @return testResult
     */
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public PcrTestRecordResult withConfidence(PcrTestRecordConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public PcrTestRecordResult withConfidence(Consumer<PcrTestRecordConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new PcrTestRecordConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /**
     * Get confidence
     * @return confidence
     */
    public PcrTestRecordConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(PcrTestRecordConfidence confidence) {
        this.confidence = confidence;
    }

    public PcrTestRecordResult withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 代表检测识别出来的文字块数目。 
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public PcrTestRecordResult withWordsBlockList(List<PcrTestRecordWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public PcrTestRecordResult addWordsBlockListItem(PcrTestRecordWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public PcrTestRecordResult withWordsBlockList(Consumer<List<PcrTestRecordWordsBlockList>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 识别文字块列表，输出顺序从左到右，从上到下。 
     * @return wordsBlockList
     */
    public List<PcrTestRecordWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<PcrTestRecordWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PcrTestRecordResult pcrTestRecordResult = (PcrTestRecordResult) o;
        return Objects.equals(this.name, pcrTestRecordResult.name)
            && Objects.equals(this.samplingTime, pcrTestRecordResult.samplingTime)
            && Objects.equals(this.testTime, pcrTestRecordResult.testTime)
            && Objects.equals(this.testResult, pcrTestRecordResult.testResult)
            && Objects.equals(this.confidence, pcrTestRecordResult.confidence)
            && Objects.equals(this.wordsBlockCount, pcrTestRecordResult.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, pcrTestRecordResult.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, samplingTime, testTime, testResult, confidence, wordsBlockCount, wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PcrTestRecordResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    samplingTime: ").append(toIndentedString(samplingTime)).append("\n");
        sb.append("    testTime: ").append(toIndentedString(testTime)).append("\n");
        sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    wordsBlockList: ").append(toIndentedString(wordsBlockList)).append("\n");
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
