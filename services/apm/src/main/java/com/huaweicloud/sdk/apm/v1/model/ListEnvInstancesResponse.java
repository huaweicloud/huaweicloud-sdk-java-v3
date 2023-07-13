package com.huaweicloud.sdk.apm.v1.model;

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
public class ListEnvInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info_list")

    private List<InstanceInfo> instanceInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_count")

    private Integer onlineCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_count")

    private Integer offlineCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_count")

    private Integer disableCount;

    public ListEnvInstancesResponse withInstanceInfoList(List<InstanceInfo> instanceInfoList) {
        this.instanceInfoList = instanceInfoList;
        return this;
    }

    public ListEnvInstancesResponse addInstanceInfoListItem(InstanceInfo instanceInfoListItem) {
        if (this.instanceInfoList == null) {
            this.instanceInfoList = new ArrayList<>();
        }
        this.instanceInfoList.add(instanceInfoListItem);
        return this;
    }

    public ListEnvInstancesResponse withInstanceInfoList(Consumer<List<InstanceInfo>> instanceInfoListSetter) {
        if (this.instanceInfoList == null) {
            this.instanceInfoList = new ArrayList<>();
        }
        instanceInfoListSetter.accept(this.instanceInfoList);
        return this;
    }

    /**
     * 实例信息列表。
     * @return instanceInfoList
     */
    public List<InstanceInfo> getInstanceInfoList() {
        return instanceInfoList;
    }

    public void setInstanceInfoList(List<InstanceInfo> instanceInfoList) {
        this.instanceInfoList = instanceInfoList;
    }

    public ListEnvInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 实例总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListEnvInstancesResponse withOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
        return this;
    }

    /**
     * 在线实例总数。
     * @return onlineCount
     */
    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public ListEnvInstancesResponse withOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
        return this;
    }

    /**
     * 离线实例总数。
     * @return offlineCount
     */
    public Integer getOfflineCount() {
        return offlineCount;
    }

    public void setOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
    }

    public ListEnvInstancesResponse withDisableCount(Integer disableCount) {
        this.disableCount = disableCount;
        return this;
    }

    /**
     * 停止实例总数。
     * @return disableCount
     */
    public Integer getDisableCount() {
        return disableCount;
    }

    public void setDisableCount(Integer disableCount) {
        this.disableCount = disableCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnvInstancesResponse that = (ListEnvInstancesResponse) obj;
        return Objects.equals(this.instanceInfoList, that.instanceInfoList)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.onlineCount, that.onlineCount)
            && Objects.equals(this.offlineCount, that.offlineCount)
            && Objects.equals(this.disableCount, that.disableCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceInfoList, totalCount, onlineCount, offlineCount, disableCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvInstancesResponse {\n");
        sb.append("    instanceInfoList: ").append(toIndentedString(instanceInfoList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    onlineCount: ").append(toIndentedString(onlineCount)).append("\n");
        sb.append("    offlineCount: ").append(toIndentedString(offlineCount)).append("\n");
        sb.append("    disableCount: ").append(toIndentedString(disableCount)).append("\n");
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
