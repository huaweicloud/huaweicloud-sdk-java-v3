package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsDatasetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets")

    private List<OpsDatasetSummary> datasets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListOpsDatasetsResponse withDatasets(List<OpsDatasetSummary> datasets) {
        this.datasets = datasets;
        return this;
    }

    public ListOpsDatasetsResponse addDatasetsItem(OpsDatasetSummary datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public ListOpsDatasetsResponse withDatasets(Consumer<List<OpsDatasetSummary>> datasetsSetter) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        datasetsSetter.accept(this.datasets);
        return this;
    }

    /**
     * **参数解释：** 评测集列表，包含当前分页返回的评测集摘要信息。 **取值范围：** 符合OpsDatasetSummary结构定义的对象数组。 
     * @return datasets
     */
    public List<OpsDatasetSummary> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<OpsDatasetSummary> datasets) {
        this.datasets = datasets;
    }

    public ListOpsDatasetsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足查询条件的评测集总数量。 **取值范围：** 0到1000000。 
     * minimum: 0
     * maximum: 1000000
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsDatasetsResponse that = (ListOpsDatasetsResponse) obj;
        return Objects.equals(this.datasets, that.datasets) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasets, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsDatasetsResponse {\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
