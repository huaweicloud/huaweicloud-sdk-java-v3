package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUrlTaskInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    @JacksonXmlProperty(localName = "results")

    private List<Urls> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    @JacksonXmlProperty(localName = "X-request-id")

    private String xRequestId;

    public ShowUrlTaskInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowUrlTaskInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询当前页总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowUrlTaskInfoResponse withResults(List<Urls> results) {
        this.results = results;
        return this;
    }

    public ShowUrlTaskInfoResponse addResultsItem(Urls resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public ShowUrlTaskInfoResponse withResults(Consumer<List<Urls>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * url信息
     * @return results
     */
    public List<Urls> getResults() {
        return results;
    }

    public void setResults(List<Urls> results) {
        this.results = results;
    }

    public ShowUrlTaskInfoResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowUrlTaskInfoResponse showUrlTaskInfoResponse = (ShowUrlTaskInfoResponse) o;
        return Objects.equals(this.total, showUrlTaskInfoResponse.total)
            && Objects.equals(this.count, showUrlTaskInfoResponse.count)
            && Objects.equals(this.results, showUrlTaskInfoResponse.results)
            && Objects.equals(this.xRequestId, showUrlTaskInfoResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, count, results, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUrlTaskInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
