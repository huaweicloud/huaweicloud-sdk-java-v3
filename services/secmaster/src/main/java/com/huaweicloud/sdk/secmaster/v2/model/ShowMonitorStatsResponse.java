package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMonitorStatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "es_result")

    private EsMonitorBody esResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<Map<String, Object>> result = null;

    public ShowMonitorStatsResponse withEsResult(EsMonitorBody esResult) {
        this.esResult = esResult;
        return this;
    }

    public ShowMonitorStatsResponse withEsResult(Consumer<EsMonitorBody> esResultSetter) {
        if (this.esResult == null) {
            this.esResult = new EsMonitorBody();
            esResultSetter.accept(this.esResult);
        }

        return this;
    }

    /**
     * Get esResult
     * @return esResult
     */
    public EsMonitorBody getEsResult() {
        return esResult;
    }

    public void setEsResult(EsMonitorBody esResult) {
        this.esResult = esResult;
    }

    public ShowMonitorStatsResponse withResult(List<Map<String, Object>> result) {
        this.result = result;
        return this;
    }

    public ShowMonitorStatsResponse addResultItem(Map<String, Object> resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ShowMonitorStatsResponse withResult(Consumer<List<Map<String, Object>>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * pulsar返回的结果列表
     * @return result
     */
    public List<Map<String, Object>> getResult() {
        return result;
    }

    public void setResult(List<Map<String, Object>> result) {
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
        ShowMonitorStatsResponse that = (ShowMonitorStatsResponse) obj;
        return Objects.equals(this.esResult, that.esResult) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(esResult, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonitorStatsResponse {\n");
        sb.append("    esResult: ").append(toIndentedString(esResult)).append("\n");
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
