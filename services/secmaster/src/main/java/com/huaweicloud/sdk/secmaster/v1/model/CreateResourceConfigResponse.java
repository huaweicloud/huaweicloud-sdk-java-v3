package com.huaweicloud.sdk.secmaster.v1.model;

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
public class CreateResourceConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets")

    private List<DatasetItem> datasets = null;

    public CreateResourceConfigResponse withDatasets(List<DatasetItem> datasets) {
        this.datasets = datasets;
        return this;
    }

    public CreateResourceConfigResponse addDatasetsItem(DatasetItem datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public CreateResourceConfigResponse withDatasets(Consumer<List<DatasetItem>> datasetsSetter) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        datasetsSetter.accept(this.datasets);
        return this;
    }

    /**
     * 数据集列表，包含多个数据集对象
     * @return datasets
     */
    public List<DatasetItem> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<DatasetItem> datasets) {
        this.datasets = datasets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResourceConfigResponse that = (CreateResourceConfigResponse) obj;
        return Objects.equals(this.datasets, that.datasets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceConfigResponse {\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
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
