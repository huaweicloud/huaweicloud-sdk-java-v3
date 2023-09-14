package com.huaweicloud.sdk.codeartsinspector.v3.model;

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
public class ShowResultsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<VulnItem> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private VulnsLevel statistics;

    public ShowResultsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 网站漏洞总数
     * minimum: 0
     * maximum: 100000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowResultsResponse withData(List<VulnItem> data) {
        this.data = data;
        return this;
    }

    public ShowResultsResponse addDataItem(VulnItem dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ShowResultsResponse withData(Consumer<List<VulnItem>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 网站漏洞信息列表
     * @return data
     */
    public List<VulnItem> getData() {
        return data;
    }

    public void setData(List<VulnItem> data) {
        this.data = data;
    }

    public ShowResultsResponse withStatistics(VulnsLevel statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowResultsResponse withStatistics(Consumer<VulnsLevel> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new VulnsLevel();
            statisticsSetter.accept(this.statistics);
        }

        return this;
    }

    /**
     * Get statistics
     * @return statistics
     */
    public VulnsLevel getStatistics() {
        return statistics;
    }

    public void setStatistics(VulnsLevel statistics) {
        this.statistics = statistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResultsResponse that = (ShowResultsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.data, that.data)
            && Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, data, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResultsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
