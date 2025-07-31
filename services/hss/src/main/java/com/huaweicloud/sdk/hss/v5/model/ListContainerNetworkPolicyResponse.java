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
public class ListContainerNetworkPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<GetNetworkPolicy> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    public ListContainerNetworkPolicyResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListContainerNetworkPolicyResponse withDataList(List<GetNetworkPolicy> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListContainerNetworkPolicyResponse addDataListItem(GetNetworkPolicy dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListContainerNetworkPolicyResponse withDataList(Consumer<List<GetNetworkPolicy>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 网络策略列表
     * @return dataList
     */
    public List<GetNetworkPolicy> getDataList() {
        return dataList;
    }

    public void setDataList(List<GetNetworkPolicy> dataList) {
        this.dataList = dataList;
    }

    public ListContainerNetworkPolicyResponse withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 数据最近同步时间
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListContainerNetworkPolicyResponse that = (ListContainerNetworkPolicyResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.dataList, that.dataList)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList, lastUpdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContainerNetworkPolicyResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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
