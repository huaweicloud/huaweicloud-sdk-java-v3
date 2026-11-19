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
public class ShowSecurityRiskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_risk_info")

    private HostRiskInfo hostRiskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_risk_info")

    private ContainerRiskInfo containerRiskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_data_list")

    private List<TrendRiskInfo> trendDataList = null;

    public ShowSecurityRiskResponse withHostRiskInfo(HostRiskInfo hostRiskInfo) {
        this.hostRiskInfo = hostRiskInfo;
        return this;
    }

    public ShowSecurityRiskResponse withHostRiskInfo(Consumer<HostRiskInfo> hostRiskInfoSetter) {
        if (this.hostRiskInfo == null) {
            this.hostRiskInfo = new HostRiskInfo();
            hostRiskInfoSetter.accept(this.hostRiskInfo);
        }

        return this;
    }

    /**
     * Get hostRiskInfo
     * @return hostRiskInfo
     */
    public HostRiskInfo getHostRiskInfo() {
        return hostRiskInfo;
    }

    public void setHostRiskInfo(HostRiskInfo hostRiskInfo) {
        this.hostRiskInfo = hostRiskInfo;
    }

    public ShowSecurityRiskResponse withContainerRiskInfo(ContainerRiskInfo containerRiskInfo) {
        this.containerRiskInfo = containerRiskInfo;
        return this;
    }

    public ShowSecurityRiskResponse withContainerRiskInfo(Consumer<ContainerRiskInfo> containerRiskInfoSetter) {
        if (this.containerRiskInfo == null) {
            this.containerRiskInfo = new ContainerRiskInfo();
            containerRiskInfoSetter.accept(this.containerRiskInfo);
        }

        return this;
    }

    /**
     * Get containerRiskInfo
     * @return containerRiskInfo
     */
    public ContainerRiskInfo getContainerRiskInfo() {
        return containerRiskInfo;
    }

    public void setContainerRiskInfo(ContainerRiskInfo containerRiskInfo) {
        this.containerRiskInfo = containerRiskInfo;
    }

    public ShowSecurityRiskResponse withTrendDataList(List<TrendRiskInfo> trendDataList) {
        this.trendDataList = trendDataList;
        return this;
    }

    public ShowSecurityRiskResponse addTrendDataListItem(TrendRiskInfo trendDataListItem) {
        if (this.trendDataList == null) {
            this.trendDataList = new ArrayList<>();
        }
        this.trendDataList.add(trendDataListItem);
        return this;
    }

    public ShowSecurityRiskResponse withTrendDataList(Consumer<List<TrendRiskInfo>> trendDataListSetter) {
        if (this.trendDataList == null) {
            this.trendDataList = new ArrayList<>();
        }
        trendDataListSetter.accept(this.trendDataList);
        return this;
    }

    /**
     * **参数解释**: 安全风险趋势 **取值范围**: 取值0-30个TrendRiskInfo对象 
     * @return trendDataList
     */
    public List<TrendRiskInfo> getTrendDataList() {
        return trendDataList;
    }

    public void setTrendDataList(List<TrendRiskInfo> trendDataList) {
        this.trendDataList = trendDataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityRiskResponse that = (ShowSecurityRiskResponse) obj;
        return Objects.equals(this.hostRiskInfo, that.hostRiskInfo)
            && Objects.equals(this.containerRiskInfo, that.containerRiskInfo)
            && Objects.equals(this.trendDataList, that.trendDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostRiskInfo, containerRiskInfo, trendDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityRiskResponse {\n");
        sb.append("    hostRiskInfo: ").append(toIndentedString(hostRiskInfo)).append("\n");
        sb.append("    containerRiskInfo: ").append(toIndentedString(containerRiskInfo)).append("\n");
        sb.append("    trendDataList: ").append(toIndentedString(trendDataList)).append("\n");
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
