package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置一致性校验的结果请求体
 */
public class SetConsistencyResultRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency_result")

    private List<ConsistencyResult> consistencyResult = null;

    public SetConsistencyResultRequestBody withConsistencyResult(List<ConsistencyResult> consistencyResult) {
        this.consistencyResult = consistencyResult;
        return this;
    }

    public SetConsistencyResultRequestBody addConsistencyResultItem(ConsistencyResult consistencyResultItem) {
        if (this.consistencyResult == null) {
            this.consistencyResult = new ArrayList<>();
        }
        this.consistencyResult.add(consistencyResultItem);
        return this;
    }

    public SetConsistencyResultRequestBody withConsistencyResult(
        Consumer<List<ConsistencyResult>> consistencyResultSetter) {
        if (this.consistencyResult == null) {
            this.consistencyResult = new ArrayList<>();
        }
        consistencyResultSetter.accept(this.consistencyResult);
        return this;
    }

    /**
     * 一致性校验结果
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
        SetConsistencyResultRequestBody that = (SetConsistencyResultRequestBody) obj;
        return Objects.equals(this.consistencyResult, that.consistencyResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consistencyResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetConsistencyResultRequestBody {\n");
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
