package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListQueryHttpCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_series")

    private List<HttpCodeSummary> dataSeries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListQueryHttpCodeResponse withDataSeries(List<HttpCodeSummary> dataSeries) {
        this.dataSeries = dataSeries;
        return this;
    }

    public ListQueryHttpCodeResponse addDataSeriesItem(HttpCodeSummary dataSeriesItem) {
        if (this.dataSeries == null) {
            this.dataSeries = new ArrayList<>();
        }
        this.dataSeries.add(dataSeriesItem);
        return this;
    }

    public ListQueryHttpCodeResponse withDataSeries(Consumer<List<HttpCodeSummary>> dataSeriesSetter) {
        if (this.dataSeries == null) {
            this.dataSeries = new ArrayList<>();
        }
        dataSeriesSetter.accept(this.dataSeries);
        return this;
    }

    /** 基于时间轴的状态码
     * 
     * @return dataSeries */
    public List<HttpCodeSummary> getDataSeries() {
        return dataSeries;
    }

    public void setDataSeries(List<HttpCodeSummary> dataSeries) {
        this.dataSeries = dataSeries;
    }

    public ListQueryHttpCodeResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** Get xRequestId
     * 
     * @return xRequestId */
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
        ListQueryHttpCodeResponse listQueryHttpCodeResponse = (ListQueryHttpCodeResponse) o;
        return Objects.equals(this.dataSeries, listQueryHttpCodeResponse.dataSeries)
            && Objects.equals(this.xRequestId, listQueryHttpCodeResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSeries, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueryHttpCodeResponse {\n");
        sb.append("    dataSeries: ").append(toIndentedString(dataSeries)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
