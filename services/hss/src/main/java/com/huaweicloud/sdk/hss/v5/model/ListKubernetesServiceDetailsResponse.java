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
public class ListKubernetesServiceDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_info_list")

    private List<KubernetesServiceInfo> serviceInfoList = null;

    public ListKubernetesServiceDetailsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 服务总数
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

    public ListKubernetesServiceDetailsResponse withLastUpdateTime(Long lastUpdateTime) {
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

    public ListKubernetesServiceDetailsResponse withServiceInfoList(List<KubernetesServiceInfo> serviceInfoList) {
        this.serviceInfoList = serviceInfoList;
        return this;
    }

    public ListKubernetesServiceDetailsResponse addServiceInfoListItem(KubernetesServiceInfo serviceInfoListItem) {
        if (this.serviceInfoList == null) {
            this.serviceInfoList = new ArrayList<>();
        }
        this.serviceInfoList.add(serviceInfoListItem);
        return this;
    }

    public ListKubernetesServiceDetailsResponse withServiceInfoList(
        Consumer<List<KubernetesServiceInfo>> serviceInfoListSetter) {
        if (this.serviceInfoList == null) {
            this.serviceInfoList = new ArrayList<>();
        }
        serviceInfoListSetter.accept(this.serviceInfoList);
        return this;
    }

    /**
     * 服务列表
     * @return serviceInfoList
     */
    public List<KubernetesServiceInfo> getServiceInfoList() {
        return serviceInfoList;
    }

    public void setServiceInfoList(List<KubernetesServiceInfo> serviceInfoList) {
        this.serviceInfoList = serviceInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKubernetesServiceDetailsResponse that = (ListKubernetesServiceDetailsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.serviceInfoList, that.serviceInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, lastUpdateTime, serviceInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKubernetesServiceDetailsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    serviceInfoList: ").append(toIndentedString(serviceInfoList)).append("\n");
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
