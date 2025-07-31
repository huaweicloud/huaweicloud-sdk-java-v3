package com.huaweicloud.sdk.hss.v5.model;

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
public class ListTaskResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_scan_data_list")

    private List<ListTaskResourcesResponseInfoClusterScanDataList> clusterScanDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iac_scan_data_list")

    private List<ListTaskResourcesResponseInfoIacScanDataList> iacScanDataList = null;

    public ListTaskResourcesResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 任务关联的资源数量
     * minimum: 0
     * maximum: 2000000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListTaskResourcesResponse withClusterScanDataList(
        List<ListTaskResourcesResponseInfoClusterScanDataList> clusterScanDataList) {
        this.clusterScanDataList = clusterScanDataList;
        return this;
    }

    public ListTaskResourcesResponse addClusterScanDataListItem(
        ListTaskResourcesResponseInfoClusterScanDataList clusterScanDataListItem) {
        if (this.clusterScanDataList == null) {
            this.clusterScanDataList = new ArrayList<>();
        }
        this.clusterScanDataList.add(clusterScanDataListItem);
        return this;
    }

    public ListTaskResourcesResponse withClusterScanDataList(
        Consumer<List<ListTaskResourcesResponseInfoClusterScanDataList>> clusterScanDataListSetter) {
        if (this.clusterScanDataList == null) {
            this.clusterScanDataList = new ArrayList<>();
        }
        clusterScanDataListSetter.accept(this.clusterScanDataList);
        return this;
    }

    /**
     * 本次任务关联的集群扫描详情列表，任务类型为“cluster_scan”时查询结果为该列表
     * @return clusterScanDataList
     */
    public List<ListTaskResourcesResponseInfoClusterScanDataList> getClusterScanDataList() {
        return clusterScanDataList;
    }

    public void setClusterScanDataList(List<ListTaskResourcesResponseInfoClusterScanDataList> clusterScanDataList) {
        this.clusterScanDataList = clusterScanDataList;
    }

    public ListTaskResourcesResponse withIacScanDataList(
        List<ListTaskResourcesResponseInfoIacScanDataList> iacScanDataList) {
        this.iacScanDataList = iacScanDataList;
        return this;
    }

    public ListTaskResourcesResponse addIacScanDataListItem(
        ListTaskResourcesResponseInfoIacScanDataList iacScanDataListItem) {
        if (this.iacScanDataList == null) {
            this.iacScanDataList = new ArrayList<>();
        }
        this.iacScanDataList.add(iacScanDataListItem);
        return this;
    }

    public ListTaskResourcesResponse withIacScanDataList(
        Consumer<List<ListTaskResourcesResponseInfoIacScanDataList>> iacScanDataListSetter) {
        if (this.iacScanDataList == null) {
            this.iacScanDataList = new ArrayList<>();
        }
        iacScanDataListSetter.accept(this.iacScanDataList);
        return this;
    }

    /**
     * 本次任务关联的文件扫描详情列表，任务类型为“iac_scan”时查询结果为该列表
     * @return iacScanDataList
     */
    public List<ListTaskResourcesResponseInfoIacScanDataList> getIacScanDataList() {
        return iacScanDataList;
    }

    public void setIacScanDataList(List<ListTaskResourcesResponseInfoIacScanDataList> iacScanDataList) {
        this.iacScanDataList = iacScanDataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskResourcesResponse that = (ListTaskResourcesResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.clusterScanDataList, that.clusterScanDataList)
            && Objects.equals(this.iacScanDataList, that.iacScanDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, clusterScanDataList, iacScanDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskResourcesResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    clusterScanDataList: ").append(toIndentedString(clusterScanDataList)).append("\n");
        sb.append("    iacScanDataList: ").append(toIndentedString(iacScanDataList)).append("\n");
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
