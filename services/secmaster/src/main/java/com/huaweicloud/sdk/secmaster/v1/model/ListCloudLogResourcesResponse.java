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
public class ListCloudLogResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets")

    private List<DatasetItem> datasets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist")

    private Boolean exist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaces")

    private List<String> workspaces = null;

    public ListCloudLogResourcesResponse withDatasets(List<DatasetItem> datasets) {
        this.datasets = datasets;
        return this;
    }

    public ListCloudLogResourcesResponse addDatasetsItem(DatasetItem datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public ListCloudLogResourcesResponse withDatasets(Consumer<List<DatasetItem>> datasetsSetter) {
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
    public List<DatasetItem> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<DatasetItem> datasets) {
        this.datasets = datasets;
    }

    public ListCloudLogResourcesResponse withExist(Boolean exist) {
        this.exist = exist;
        return this;
    }

    /**
     * 表示资源是否存在
     * @return exist
     */
    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

    public ListCloudLogResourcesResponse withWorkspaces(List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    public ListCloudLogResourcesResponse addWorkspacesItem(String workspacesItem) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        this.workspaces.add(workspacesItem);
        return this;
    }

    public ListCloudLogResourcesResponse withWorkspaces(Consumer<List<String>> workspacesSetter) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        workspacesSetter.accept(this.workspaces);
        return this;
    }

    /**
     * 工作空间列表
     * @return workspaces
     */
    public List<String> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<String> workspaces) {
        this.workspaces = workspaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudLogResourcesResponse that = (ListCloudLogResourcesResponse) obj;
        return Objects.equals(this.datasets, that.datasets) && Objects.equals(this.exist, that.exist)
            && Objects.equals(this.workspaces, that.workspaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasets, exist, workspaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudLogResourcesResponse {\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
        sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
        sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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
