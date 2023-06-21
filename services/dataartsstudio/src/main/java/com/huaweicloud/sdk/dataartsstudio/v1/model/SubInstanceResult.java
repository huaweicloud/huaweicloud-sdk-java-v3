package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubInstanceResult
 */
public class SubInstanceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_rule_id")

    private String subRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_instance_instance_id")

    private String subInstanceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_status")

    private String abnormalTableStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<Object> results = null;

    public SubInstanceResult withSubRuleId(String subRuleId) {
        this.subRuleId = subRuleId;
        return this;
    }

    /**
     * 子规则ID
     * @return subRuleId
     */
    public String getSubRuleId() {
        return subRuleId;
    }

    public void setSubRuleId(String subRuleId) {
        this.subRuleId = subRuleId;
    }

    public SubInstanceResult withSubInstanceInstanceId(String subInstanceInstanceId) {
        this.subInstanceInstanceId = subInstanceInstanceId;
        return this;
    }

    /**
     * 子规则实例ID
     * @return subInstanceInstanceId
     */
    public String getSubInstanceInstanceId() {
        return subInstanceInstanceId;
    }

    public void setSubInstanceInstanceId(String subInstanceInstanceId) {
        this.subInstanceInstanceId = subInstanceInstanceId;
    }

    public SubInstanceResult withAbnormalTableStatus(String abnormalTableStatus) {
        this.abnormalTableStatus = abnormalTableStatus;
        return this;
    }

    /**
     * 异常表任务状态 UNSUPPORTED:不支持异常表,READY：准备中,RUNNING：运行中,FAILED：失败,SUCCESS：成功
     * @return abnormalTableStatus
     */
    public String getAbnormalTableStatus() {
        return abnormalTableStatus;
    }

    public void setAbnormalTableStatus(String abnormalTableStatus) {
        this.abnormalTableStatus = abnormalTableStatus;
    }

    public SubInstanceResult withResults(List<Object> results) {
        this.results = results;
        return this;
    }

    public SubInstanceResult addResultsItem(Object resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public SubInstanceResult withResults(Consumer<List<Object>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 结果集
     * @return results
     */
    public List<Object> getResults() {
        return results;
    }

    public void setResults(List<Object> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubInstanceResult subInstanceResult = (SubInstanceResult) o;
        return Objects.equals(this.subRuleId, subInstanceResult.subRuleId)
            && Objects.equals(this.subInstanceInstanceId, subInstanceResult.subInstanceInstanceId)
            && Objects.equals(this.abnormalTableStatus, subInstanceResult.abnormalTableStatus)
            && Objects.equals(this.results, subInstanceResult.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subRuleId, subInstanceInstanceId, abnormalTableStatus, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubInstanceResult {\n");
        sb.append("    subRuleId: ").append(toIndentedString(subRuleId)).append("\n");
        sb.append("    subInstanceInstanceId: ").append(toIndentedString(subInstanceInstanceId)).append("\n");
        sb.append("    abnormalTableStatus: ").append(toIndentedString(abnormalTableStatus)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
