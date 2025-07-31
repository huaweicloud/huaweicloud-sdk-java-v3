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
public class ListK8sDeploymentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_info_list")

    private List<ServerlessDeploymentInfo> resourcesInfoList = null;

    public ListK8sDeploymentsResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * deployment实例总数
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

    public ListK8sDeploymentsResponse withLastUpdateTime(Long lastUpdateTime) {
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

    public ListK8sDeploymentsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型，包含如下四种。   - deploy ：无状态负载   - sts ：有状态负载   - job ： 普通任务   - cronjob ：定时任务
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListK8sDeploymentsResponse withResourcesInfoList(List<ServerlessDeploymentInfo> resourcesInfoList) {
        this.resourcesInfoList = resourcesInfoList;
        return this;
    }

    public ListK8sDeploymentsResponse addResourcesInfoListItem(ServerlessDeploymentInfo resourcesInfoListItem) {
        if (this.resourcesInfoList == null) {
            this.resourcesInfoList = new ArrayList<>();
        }
        this.resourcesInfoList.add(resourcesInfoListItem);
        return this;
    }

    public ListK8sDeploymentsResponse withResourcesInfoList(
        Consumer<List<ServerlessDeploymentInfo>> resourcesInfoListSetter) {
        if (this.resourcesInfoList == null) {
            this.resourcesInfoList = new ArrayList<>();
        }
        resourcesInfoListSetter.accept(this.resourcesInfoList);
        return this;
    }

    /**
     * resources基本信息列表
     * @return resourcesInfoList
     */
    public List<ServerlessDeploymentInfo> getResourcesInfoList() {
        return resourcesInfoList;
    }

    public void setResourcesInfoList(List<ServerlessDeploymentInfo> resourcesInfoList) {
        this.resourcesInfoList = resourcesInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListK8sDeploymentsResponse that = (ListK8sDeploymentsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.type, that.type) && Objects.equals(this.resourcesInfoList, that.resourcesInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, lastUpdateTime, type, resourcesInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListK8sDeploymentsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourcesInfoList: ").append(toIndentedString(resourcesInfoList)).append("\n");
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
