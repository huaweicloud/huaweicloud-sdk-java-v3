package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowTechnicalAssetsStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_statistics")

    private List<DataSource> datasourceStatistics = null;

    public ShowTechnicalAssetsStatisticResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数据连接总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowTechnicalAssetsStatisticResponse withDatasourceStatistics(List<DataSource> datasourceStatistics) {
        this.datasourceStatistics = datasourceStatistics;
        return this;
    }

    public ShowTechnicalAssetsStatisticResponse addDatasourceStatisticsItem(DataSource datasourceStatisticsItem) {
        if (this.datasourceStatistics == null) {
            this.datasourceStatistics = new ArrayList<>();
        }
        this.datasourceStatistics.add(datasourceStatisticsItem);
        return this;
    }

    public ShowTechnicalAssetsStatisticResponse withDatasourceStatistics(
        Consumer<List<DataSource>> datasourceStatisticsSetter) {
        if (this.datasourceStatistics == null) {
            this.datasourceStatistics = new ArrayList<>();
        }
        datasourceStatisticsSetter.accept(this.datasourceStatistics);
        return this;
    }

    /**
     * 数据连接统计信息
     * @return datasourceStatistics
     */
    public List<DataSource> getDatasourceStatistics() {
        return datasourceStatistics;
    }

    public void setDatasourceStatistics(List<DataSource> datasourceStatistics) {
        this.datasourceStatistics = datasourceStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTechnicalAssetsStatisticResponse that = (ShowTechnicalAssetsStatisticResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.datasourceStatistics, that.datasourceStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, datasourceStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTechnicalAssetsStatisticResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    datasourceStatistics: ").append(toIndentedString(datasourceStatistics)).append("\n");
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
