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
public class ListKubernetesClusterDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info_list")

    private List<KubernetesClusterInfo> clusterInfoList = null;

    public ListKubernetesClusterDetailsResponse withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最近更新时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ListKubernetesClusterDetailsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 集群总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListKubernetesClusterDetailsResponse withClusterInfoList(List<KubernetesClusterInfo> clusterInfoList) {
        this.clusterInfoList = clusterInfoList;
        return this;
    }

    public ListKubernetesClusterDetailsResponse addClusterInfoListItem(KubernetesClusterInfo clusterInfoListItem) {
        if (this.clusterInfoList == null) {
            this.clusterInfoList = new ArrayList<>();
        }
        this.clusterInfoList.add(clusterInfoListItem);
        return this;
    }

    public ListKubernetesClusterDetailsResponse withClusterInfoList(
        Consumer<List<KubernetesClusterInfo>> clusterInfoListSetter) {
        if (this.clusterInfoList == null) {
            this.clusterInfoList = new ArrayList<>();
        }
        clusterInfoListSetter.accept(this.clusterInfoList);
        return this;
    }

    /**
     * 集群列表
     * @return clusterInfoList
     */
    public List<KubernetesClusterInfo> getClusterInfoList() {
        return clusterInfoList;
    }

    public void setClusterInfoList(List<KubernetesClusterInfo> clusterInfoList) {
        this.clusterInfoList = clusterInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKubernetesClusterDetailsResponse that = (ListKubernetesClusterDetailsResponse) obj;
        return Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.clusterInfoList, that.clusterInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdateTime, totalNum, clusterInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKubernetesClusterDetailsResponse {\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    clusterInfoList: ").append(toIndentedString(clusterInfoList)).append("\n");
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
