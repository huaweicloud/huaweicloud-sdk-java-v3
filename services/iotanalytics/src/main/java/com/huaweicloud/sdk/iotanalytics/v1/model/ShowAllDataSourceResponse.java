package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class ShowAllDataSourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasources")

    private List<DatasourceRestDTO> datasources = null;

    public ShowAllDataSourceResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowAllDataSourceResponse withDatasources(List<DatasourceRestDTO> datasources) {
        this.datasources = datasources;
        return this;
    }

    public ShowAllDataSourceResponse addDatasourcesItem(DatasourceRestDTO datasourcesItem) {
        if (this.datasources == null) {
            this.datasources = new ArrayList<>();
        }
        this.datasources.add(datasourcesItem);
        return this;
    }

    public ShowAllDataSourceResponse withDatasources(Consumer<List<DatasourceRestDTO>> datasourcesSetter) {
        if (this.datasources == null) {
            this.datasources = new ArrayList<>();
        }
        datasourcesSetter.accept(this.datasources);
        return this;
    }

    /**
     * 数据源列表
     * @return datasources
     */
    public List<DatasourceRestDTO> getDatasources() {
        return datasources;
    }

    public void setDatasources(List<DatasourceRestDTO> datasources) {
        this.datasources = datasources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAllDataSourceResponse showAllDataSourceResponse = (ShowAllDataSourceResponse) o;
        return Objects.equals(this.count, showAllDataSourceResponse.count)
            && Objects.equals(this.datasources, showAllDataSourceResponse.datasources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, datasources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAllDataSourceResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
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
