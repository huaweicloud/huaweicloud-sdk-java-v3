package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListDatasetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets")

    private List<Dataset> datasets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PagedInfo pageInfo;

    public ListDatasetsResponse withDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
        return this;
    }

    public ListDatasetsResponse addDatasetsItem(Dataset datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public ListDatasetsResponse withDatasets(Consumer<List<Dataset>> datasetsSetter) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        datasetsSetter.accept(this.datasets);
        return this;
    }

    /**
     * 数据集列表
     * @return datasets
     */
    public List<Dataset> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
    }

    public ListDatasetsResponse withPageInfo(PagedInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListDatasetsResponse withPageInfo(Consumer<PagedInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PagedInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PagedInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PagedInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatasetsResponse that = (ListDatasetsResponse) obj;
        return Objects.equals(this.datasets, that.datasets) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasets, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatasetsResponse {\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
