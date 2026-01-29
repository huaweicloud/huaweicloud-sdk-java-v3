package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ListCollectConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_vendors")

    private List<ListCollectConfigResponseBodyAllVendors> allVendors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cofing_statistics")

    private ListCollectConfigResponseBodyCofingStatistics cofingStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ListCollectConfigResponseBodyDataList> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets")

    private List<DatasetInfo> datasets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_name")

    private String dataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_sets")

    private List<LtsResponseVo> ltsSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ListCollectConfigResponse withAllVendors(List<ListCollectConfigResponseBodyAllVendors> allVendors) {
        this.allVendors = allVendors;
        return this;
    }

    public ListCollectConfigResponse addAllVendorsItem(ListCollectConfigResponseBodyAllVendors allVendorsItem) {
        if (this.allVendors == null) {
            this.allVendors = new ArrayList<>();
        }
        this.allVendors.add(allVendorsItem);
        return this;
    }

    public ListCollectConfigResponse withAllVendors(
        Consumer<List<ListCollectConfigResponseBodyAllVendors>> allVendorsSetter) {
        if (this.allVendors == null) {
            this.allVendors = new ArrayList<>();
        }
        allVendorsSetter.accept(this.allVendors);
        return this;
    }

    /**
     * 所有的云厂商、云产品和日志
     * @return allVendors
     */
    public List<ListCollectConfigResponseBodyAllVendors> getAllVendors() {
        return allVendors;
    }

    public void setAllVendors(List<ListCollectConfigResponseBodyAllVendors> allVendors) {
        this.allVendors = allVendors;
    }

    public ListCollectConfigResponse withCofingStatistics(
        ListCollectConfigResponseBodyCofingStatistics cofingStatistics) {
        this.cofingStatistics = cofingStatistics;
        return this;
    }

    public ListCollectConfigResponse withCofingStatistics(
        Consumer<ListCollectConfigResponseBodyCofingStatistics> cofingStatisticsSetter) {
        if (this.cofingStatistics == null) {
            this.cofingStatistics = new ListCollectConfigResponseBodyCofingStatistics();
            cofingStatisticsSetter.accept(this.cofingStatistics);
        }

        return this;
    }

    /**
     * Get cofingStatistics
     * @return cofingStatistics
     */
    public ListCollectConfigResponseBodyCofingStatistics getCofingStatistics() {
        return cofingStatistics;
    }

    public void setCofingStatistics(ListCollectConfigResponseBodyCofingStatistics cofingStatistics) {
        this.cofingStatistics = cofingStatistics;
    }

    public ListCollectConfigResponse withDataList(List<ListCollectConfigResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListCollectConfigResponse addDataListItem(ListCollectConfigResponseBodyDataList dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListCollectConfigResponse withDataList(
        Consumer<List<ListCollectConfigResponseBodyDataList>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 数据
     * @return dataList
     */
    public List<ListCollectConfigResponseBodyDataList> getDataList() {
        return dataList;
    }

    public void setDataList(List<ListCollectConfigResponseBodyDataList> dataList) {
        this.dataList = dataList;
    }

    public ListCollectConfigResponse withDatasets(List<DatasetInfo> datasets) {
        this.datasets = datasets;
        return this;
    }

    public ListCollectConfigResponse addDatasetsItem(DatasetInfo datasetsItem) {
        if (this.datasets == null) {
            this.datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    public ListCollectConfigResponse withDatasets(Consumer<List<DatasetInfo>> datasetsSetter) {
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
    public List<DatasetInfo> getDatasets() {
        return datasets;
    }

    public void setDatasets(List<DatasetInfo> datasets) {
        this.datasets = datasets;
    }

    public ListCollectConfigResponse withDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
        return this;
    }

    /**
     * 数据空间ID
     * @return dataspaceId
     */
    public String getDataspaceId() {
        return dataspaceId;
    }

    public void setDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
    }

    public ListCollectConfigResponse withDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
        return this;
    }

    /**
     * 数据空间名称
     * @return dataspaceName
     */
    public String getDataspaceName() {
        return dataspaceName;
    }

    public void setDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
    }

    public ListCollectConfigResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListCollectConfigResponse withLtsSets(List<LtsResponseVo> ltsSets) {
        this.ltsSets = ltsSets;
        return this;
    }

    public ListCollectConfigResponse addLtsSetsItem(LtsResponseVo ltsSetsItem) {
        if (this.ltsSets == null) {
            this.ltsSets = new ArrayList<>();
        }
        this.ltsSets.add(ltsSetsItem);
        return this;
    }

    public ListCollectConfigResponse withLtsSets(Consumer<List<LtsResponseVo>> ltsSetsSetter) {
        if (this.ltsSets == null) {
            this.ltsSets = new ArrayList<>();
        }
        ltsSetsSetter.accept(this.ltsSets);
        return this;
    }

    /**
     * lts日志配置
     * @return ltsSets
     */
    public List<LtsResponseVo> getLtsSets() {
        return ltsSets;
    }

    public void setLtsSets(List<LtsResponseVo> ltsSets) {
        this.ltsSets = ltsSets;
    }

    public ListCollectConfigResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListCollectConfigResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 所属region
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListCollectConfigResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间 id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponse that = (ListCollectConfigResponse) obj;
        return Objects.equals(this.allVendors, that.allVendors)
            && Objects.equals(this.cofingStatistics, that.cofingStatistics)
            && Objects.equals(this.dataList, that.dataList) && Objects.equals(this.datasets, that.datasets)
            && Objects.equals(this.dataspaceId, that.dataspaceId)
            && Objects.equals(this.dataspaceName, that.dataspaceName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.ltsSets, that.ltsSets) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allVendors,
            cofingStatistics,
            dataList,
            datasets,
            dataspaceId,
            dataspaceName,
            domainId,
            ltsSets,
            projectId,
            regionId,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponse {\n");
        sb.append("    allVendors: ").append(toIndentedString(allVendors)).append("\n");
        sb.append("    cofingStatistics: ").append(toIndentedString(cofingStatistics)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    dataspaceName: ").append(toIndentedString(dataspaceName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    ltsSets: ").append(toIndentedString(ltsSets)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
