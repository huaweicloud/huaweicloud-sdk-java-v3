package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConsistencyResultRequestBodyResultList
 */
public class ConsistencyResultRequestBodyResultList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_time")

    private Long finishedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private String checkResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency_result")

    private List<ConsistencyResult> consistencyResult = null;

    public ConsistencyResultRequestBodyResultList withFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    /**
     * 校验完成时间
     * @return finishedTime
     */
    public Long getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
    }

    public ConsistencyResultRequestBodyResultList withCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 校验结果
     * @return checkResult
     */
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public ConsistencyResultRequestBodyResultList withConsistencyResult(List<ConsistencyResult> consistencyResult) {
        this.consistencyResult = consistencyResult;
        return this;
    }

    public ConsistencyResultRequestBodyResultList addConsistencyResultItem(ConsistencyResult consistencyResultItem) {
        if (this.consistencyResult == null) {
            this.consistencyResult = new ArrayList<>();
        }
        this.consistencyResult.add(consistencyResultItem);
        return this;
    }

    public ConsistencyResultRequestBodyResultList withConsistencyResult(
        Consumer<List<ConsistencyResult>> consistencyResultSetter) {
        if (this.consistencyResult == null) {
            this.consistencyResult = new ArrayList<>();
        }
        consistencyResultSetter.accept(this.consistencyResult);
        return this;
    }

    /**
     * 校验结果
     * @return consistencyResult
     */
    public List<ConsistencyResult> getConsistencyResult() {
        return consistencyResult;
    }

    public void setConsistencyResult(List<ConsistencyResult> consistencyResult) {
        this.consistencyResult = consistencyResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsistencyResultRequestBodyResultList that = (ConsistencyResultRequestBodyResultList) obj;
        return Objects.equals(this.finishedTime, that.finishedTime)
            && Objects.equals(this.checkResult, that.checkResult)
            && Objects.equals(this.consistencyResult, that.consistencyResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finishedTime, checkResult, consistencyResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyResultRequestBodyResultList {\n");
        sb.append("    finishedTime: ").append(toIndentedString(finishedTime)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    consistencyResult: ").append(toIndentedString(consistencyResult)).append("\n");
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
