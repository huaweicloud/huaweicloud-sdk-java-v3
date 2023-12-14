package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConsistencyResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency_result")

    private List<ConsistencyResult> consistencyResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_time")

    private Long finishedTime;

    public ShowConsistencyResultResponse withConsistencyResult(List<ConsistencyResult> consistencyResult) {
        this.consistencyResult = consistencyResult;
        return this;
    }

    public ShowConsistencyResultResponse addConsistencyResultItem(ConsistencyResult consistencyResultItem) {
        if (this.consistencyResult == null) {
            this.consistencyResult = new ArrayList<>();
        }
        this.consistencyResult.add(consistencyResultItem);
        return this;
    }

    public ShowConsistencyResultResponse withConsistencyResult(
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

    public ShowConsistencyResultResponse withFinishedTime(Long finishedTime) {
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
        ShowConsistencyResultResponse that = (ShowConsistencyResultResponse) obj;
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
        sb.append("class ShowConsistencyResultResponse {\n");
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
