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
public class ListK8sPodsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<PodBaseInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_info_list")

    private List<ServerlessPodInfo> podInfoList = null;

    public ListK8sPodsResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * pod总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public ListK8sPodsResponse withDataList(List<PodBaseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListK8sPodsResponse addDataListItem(PodBaseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListK8sPodsResponse withDataList(Consumer<List<PodBaseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * pod列表
     * @return dataList
     */
    public List<PodBaseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<PodBaseInfo> dataList) {
        this.dataList = dataList;
    }

    public ListK8sPodsResponse withPodInfoList(List<ServerlessPodInfo> podInfoList) {
        this.podInfoList = podInfoList;
        return this;
    }

    public ListK8sPodsResponse addPodInfoListItem(ServerlessPodInfo podInfoListItem) {
        if (this.podInfoList == null) {
            this.podInfoList = new ArrayList<>();
        }
        this.podInfoList.add(podInfoListItem);
        return this;
    }

    public ListK8sPodsResponse withPodInfoList(Consumer<List<ServerlessPodInfo>> podInfoListSetter) {
        if (this.podInfoList == null) {
            this.podInfoList = new ArrayList<>();
        }
        podInfoListSetter.accept(this.podInfoList);
        return this;
    }

    /**
     * 实例基本信息列表
     * @return podInfoList
     */
    public List<ServerlessPodInfo> getPodInfoList() {
        return podInfoList;
    }

    public void setPodInfoList(List<ServerlessPodInfo> podInfoList) {
        this.podInfoList = podInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListK8sPodsResponse that = (ListK8sPodsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.dataList, that.dataList)
            && Objects.equals(this.podInfoList, that.podInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList, podInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListK8sPodsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    podInfoList: ").append(toIndentedString(podInfoList)).append("\n");
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
