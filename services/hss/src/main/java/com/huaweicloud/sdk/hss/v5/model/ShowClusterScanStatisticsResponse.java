package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowClusterScanStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_cluster_num")

    private Integer riskClusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_vul_cluster_num")

    private Integer appVulClusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unscan_cluster_num")

    private Integer unscanClusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_cluster_num")

    private Integer allClusterNum;

    public ShowClusterScanStatisticsResponse withRiskClusterNum(Integer riskClusterNum) {
        this.riskClusterNum = riskClusterNum;
        return this;
    }

    /**
     * 有风险集群数量
     * minimum: 0
     * maximum: 2147483547
     * @return riskClusterNum
     */
    public Integer getRiskClusterNum() {
        return riskClusterNum;
    }

    public void setRiskClusterNum(Integer riskClusterNum) {
        this.riskClusterNum = riskClusterNum;
    }

    public ShowClusterScanStatisticsResponse withAppVulClusterNum(Integer appVulClusterNum) {
        this.appVulClusterNum = appVulClusterNum;
        return this;
    }

    /**
     * 存在应用漏洞的集群数量
     * minimum: 0
     * maximum: 2147483547
     * @return appVulClusterNum
     */
    public Integer getAppVulClusterNum() {
        return appVulClusterNum;
    }

    public void setAppVulClusterNum(Integer appVulClusterNum) {
        this.appVulClusterNum = appVulClusterNum;
    }

    public ShowClusterScanStatisticsResponse withUnscanClusterNum(Integer unscanClusterNum) {
        this.unscanClusterNum = unscanClusterNum;
        return this;
    }

    /**
     * 未扫描集群数量
     * minimum: 0
     * maximum: 2147483547
     * @return unscanClusterNum
     */
    public Integer getUnscanClusterNum() {
        return unscanClusterNum;
    }

    public void setUnscanClusterNum(Integer unscanClusterNum) {
        this.unscanClusterNum = unscanClusterNum;
    }

    public ShowClusterScanStatisticsResponse withAllClusterNum(Integer allClusterNum) {
        this.allClusterNum = allClusterNum;
        return this;
    }

    /**
     * 集群总数量
     * minimum: 0
     * maximum: 2147483547
     * @return allClusterNum
     */
    public Integer getAllClusterNum() {
        return allClusterNum;
    }

    public void setAllClusterNum(Integer allClusterNum) {
        this.allClusterNum = allClusterNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterScanStatisticsResponse that = (ShowClusterScanStatisticsResponse) obj;
        return Objects.equals(this.riskClusterNum, that.riskClusterNum)
            && Objects.equals(this.appVulClusterNum, that.appVulClusterNum)
            && Objects.equals(this.unscanClusterNum, that.unscanClusterNum)
            && Objects.equals(this.allClusterNum, that.allClusterNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskClusterNum, appVulClusterNum, unscanClusterNum, allClusterNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterScanStatisticsResponse {\n");
        sb.append("    riskClusterNum: ").append(toIndentedString(riskClusterNum)).append("\n");
        sb.append("    appVulClusterNum: ").append(toIndentedString(appVulClusterNum)).append("\n");
        sb.append("    unscanClusterNum: ").append(toIndentedString(unscanClusterNum)).append("\n");
        sb.append("    allClusterNum: ").append(toIndentedString(allClusterNum)).append("\n");
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
