package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowClusterAssetStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_num")

    private Integer clusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_load_num")

    private Integer workLoadNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_num")

    private Integer serviceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_num")

    private Integer podNum;

    public ShowClusterAssetStatisticsResponse withClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    /**
     * **参数解释**: 集群数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 65535
     * @return clusterNum
     */
    public Integer getClusterNum() {
        return clusterNum;
    }

    public void setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
    }

    public ShowClusterAssetStatisticsResponse withWorkLoadNum(Integer workLoadNum) {
        this.workLoadNum = workLoadNum;
        return this;
    }

    /**
     * **参数解释**: 工作负载数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 65535
     * @return workLoadNum
     */
    public Integer getWorkLoadNum() {
        return workLoadNum;
    }

    public void setWorkLoadNum(Integer workLoadNum) {
        this.workLoadNum = workLoadNum;
    }

    public ShowClusterAssetStatisticsResponse withServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
        return this;
    }

    /**
     * **参数解释**: 服务数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 65535
     * @return serviceNum
     */
    public Integer getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
    }

    public ShowClusterAssetStatisticsResponse withPodNum(Integer podNum) {
        this.podNum = podNum;
        return this;
    }

    /**
     * **参数解释**: pod数量 **取值范围**: 最小值0，最大值65535 
     * minimum: 0
     * maximum: 65535
     * @return podNum
     */
    public Integer getPodNum() {
        return podNum;
    }

    public void setPodNum(Integer podNum) {
        this.podNum = podNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterAssetStatisticsResponse that = (ShowClusterAssetStatisticsResponse) obj;
        return Objects.equals(this.clusterNum, that.clusterNum) && Objects.equals(this.workLoadNum, that.workLoadNum)
            && Objects.equals(this.serviceNum, that.serviceNum) && Objects.equals(this.podNum, that.podNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterNum, workLoadNum, serviceNum, podNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterAssetStatisticsResponse {\n");
        sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
        sb.append("    workLoadNum: ").append(toIndentedString(workLoadNum)).append("\n");
        sb.append("    serviceNum: ").append(toIndentedString(serviceNum)).append("\n");
        sb.append("    podNum: ").append(toIndentedString(podNum)).append("\n");
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
