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
public class ListKubernetesEndpointDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_info_list")

    private List<KubernetesEndpointInfo> endpointInfoList = null;

    public ListKubernetesEndpointDetailsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 端点总数
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

    public ListKubernetesEndpointDetailsResponse withLastUpdateTime(Long lastUpdateTime) {
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

    public ListKubernetesEndpointDetailsResponse withEndpointInfoList(List<KubernetesEndpointInfo> endpointInfoList) {
        this.endpointInfoList = endpointInfoList;
        return this;
    }

    public ListKubernetesEndpointDetailsResponse addEndpointInfoListItem(KubernetesEndpointInfo endpointInfoListItem) {
        if (this.endpointInfoList == null) {
            this.endpointInfoList = new ArrayList<>();
        }
        this.endpointInfoList.add(endpointInfoListItem);
        return this;
    }

    public ListKubernetesEndpointDetailsResponse withEndpointInfoList(
        Consumer<List<KubernetesEndpointInfo>> endpointInfoListSetter) {
        if (this.endpointInfoList == null) {
            this.endpointInfoList = new ArrayList<>();
        }
        endpointInfoListSetter.accept(this.endpointInfoList);
        return this;
    }

    /**
     * 端点列表
     * @return endpointInfoList
     */
    public List<KubernetesEndpointInfo> getEndpointInfoList() {
        return endpointInfoList;
    }

    public void setEndpointInfoList(List<KubernetesEndpointInfo> endpointInfoList) {
        this.endpointInfoList = endpointInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKubernetesEndpointDetailsResponse that = (ListKubernetesEndpointDetailsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.endpointInfoList, that.endpointInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, lastUpdateTime, endpointInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKubernetesEndpointDetailsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    endpointInfoList: ").append(toIndentedString(endpointInfoList)).append("\n");
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
