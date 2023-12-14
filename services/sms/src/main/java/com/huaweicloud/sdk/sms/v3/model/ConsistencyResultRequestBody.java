package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 一致性校验的结果body体
 */
public class ConsistencyResultRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency_result")

    private List<ConsistencyResult> consistencyResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_time")

    private Long finishedTime;

    public ConsistencyResultRequestBody withConsistencyResult(List<ConsistencyResult> consistencyResult) {
        this.consistencyResult = consistencyResult;
        return this;
    }

    public ConsistencyResultRequestBody addConsistencyResultItem(ConsistencyResult consistencyResultItem) {
        if (this.consistencyResult == null) {
            this.consistencyResult = new ArrayList<>();
        }
        this.consistencyResult.add(consistencyResultItem);
        return this;
    }

    public ConsistencyResultRequestBody withConsistencyResult(
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

    public ConsistencyResultRequestBody withFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    /**
     * 检验完成时间
     * minimum: 0
     * maximum: 100000000000
     * @return finishedTime
     */
    public Long getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsistencyResultRequestBody that = (ConsistencyResultRequestBody) obj;
        return Objects.equals(this.consistencyResult, that.consistencyResult)
            && Objects.equals(this.finishedTime, that.finishedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consistencyResult, finishedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsistencyResultRequestBody {\n");
        sb.append("    consistencyResult: ").append(toIndentedString(consistencyResult)).append("\n");
        sb.append("    finishedTime: ").append(toIndentedString(finishedTime)).append("\n");
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
