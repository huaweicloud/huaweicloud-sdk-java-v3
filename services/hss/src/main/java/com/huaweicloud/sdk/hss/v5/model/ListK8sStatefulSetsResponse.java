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
public class ListK8sStatefulSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statefulset_info_list")

    private List<ServerlessStatefulSetInfo> statefulsetInfoList = null;

    public ListK8sStatefulSetsResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 有状态工作负载总量
     * minimum: 0
     * maximum: 65535
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public ListK8sStatefulSetsResponse withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最近更新时间
     * minimum: 0
     * maximum: 4071095999000
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ListK8sStatefulSetsResponse withStatefulsetInfoList(List<ServerlessStatefulSetInfo> statefulsetInfoList) {
        this.statefulsetInfoList = statefulsetInfoList;
        return this;
    }

    public ListK8sStatefulSetsResponse addStatefulsetInfoListItem(ServerlessStatefulSetInfo statefulsetInfoListItem) {
        if (this.statefulsetInfoList == null) {
            this.statefulsetInfoList = new ArrayList<>();
        }
        this.statefulsetInfoList.add(statefulsetInfoListItem);
        return this;
    }

    public ListK8sStatefulSetsResponse withStatefulsetInfoList(
        Consumer<List<ServerlessStatefulSetInfo>> statefulsetInfoListSetter) {
        if (this.statefulsetInfoList == null) {
            this.statefulsetInfoList = new ArrayList<>();
        }
        statefulsetInfoListSetter.accept(this.statefulsetInfoList);
        return this;
    }

    /**
     * 有状态工作负载基本信息列表
     * @return statefulsetInfoList
     */
    public List<ServerlessStatefulSetInfo> getStatefulsetInfoList() {
        return statefulsetInfoList;
    }

    public void setStatefulsetInfoList(List<ServerlessStatefulSetInfo> statefulsetInfoList) {
        this.statefulsetInfoList = statefulsetInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListK8sStatefulSetsResponse that = (ListK8sStatefulSetsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.statefulsetInfoList, that.statefulsetInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, lastUpdateTime, statefulsetInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListK8sStatefulSetsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    statefulsetInfoList: ").append(toIndentedString(statefulsetInfoList)).append("\n");
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
