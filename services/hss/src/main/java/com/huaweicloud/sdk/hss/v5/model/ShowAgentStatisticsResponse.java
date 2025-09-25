package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAgentStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_upgrade_num")

    private Integer waitUpgradeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_num")

    private Integer onlineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_online_num")

    private Integer notOnlineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_num")

    private Integer offlineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incluster_num")

    private Integer inclusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_incluster_num")

    private Integer notInclusterNum;

    public ShowAgentStatisticsResponse withWaitUpgradeNum(Integer waitUpgradeNum) {
        this.waitUpgradeNum = waitUpgradeNum;
        return this;
    }

    /**
     * 待升级数量
     * @return waitUpgradeNum
     */
    public Integer getWaitUpgradeNum() {
        return waitUpgradeNum;
    }

    public void setWaitUpgradeNum(Integer waitUpgradeNum) {
        this.waitUpgradeNum = waitUpgradeNum;
    }

    public ShowAgentStatisticsResponse withOnlineNum(Integer onlineNum) {
        this.onlineNum = onlineNum;
        return this;
    }

    /**
     * 在线数量
     * @return onlineNum
     */
    public Integer getOnlineNum() {
        return onlineNum;
    }

    public void setOnlineNum(Integer onlineNum) {
        this.onlineNum = onlineNum;
    }

    public ShowAgentStatisticsResponse withNotOnlineNum(Integer notOnlineNum) {
        this.notOnlineNum = notOnlineNum;
        return this;
    }

    /**
     * 不在线数量
     * @return notOnlineNum
     */
    public Integer getNotOnlineNum() {
        return notOnlineNum;
    }

    public void setNotOnlineNum(Integer notOnlineNum) {
        this.notOnlineNum = notOnlineNum;
    }

    public ShowAgentStatisticsResponse withOfflineNum(Integer offlineNum) {
        this.offlineNum = offlineNum;
        return this;
    }

    /**
     * 离线数量
     * @return offlineNum
     */
    public Integer getOfflineNum() {
        return offlineNum;
    }

    public void setOfflineNum(Integer offlineNum) {
        this.offlineNum = offlineNum;
    }

    public ShowAgentStatisticsResponse withInclusterNum(Integer inclusterNum) {
        this.inclusterNum = inclusterNum;
        return this;
    }

    /**
     * 集群内节点数
     * @return inclusterNum
     */
    public Integer getInclusterNum() {
        return inclusterNum;
    }

    public void setInclusterNum(Integer inclusterNum) {
        this.inclusterNum = inclusterNum;
    }

    public ShowAgentStatisticsResponse withNotInclusterNum(Integer notInclusterNum) {
        this.notInclusterNum = notInclusterNum;
        return this;
    }

    /**
     * 非集群内节点数
     * @return notInclusterNum
     */
    public Integer getNotInclusterNum() {
        return notInclusterNum;
    }

    public void setNotInclusterNum(Integer notInclusterNum) {
        this.notInclusterNum = notInclusterNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgentStatisticsResponse that = (ShowAgentStatisticsResponse) obj;
        return Objects.equals(this.waitUpgradeNum, that.waitUpgradeNum)
            && Objects.equals(this.onlineNum, that.onlineNum) && Objects.equals(this.notOnlineNum, that.notOnlineNum)
            && Objects.equals(this.offlineNum, that.offlineNum) && Objects.equals(this.inclusterNum, that.inclusterNum)
            && Objects.equals(this.notInclusterNum, that.notInclusterNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waitUpgradeNum, onlineNum, notOnlineNum, offlineNum, inclusterNum, notInclusterNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgentStatisticsResponse {\n");
        sb.append("    waitUpgradeNum: ").append(toIndentedString(waitUpgradeNum)).append("\n");
        sb.append("    onlineNum: ").append(toIndentedString(onlineNum)).append("\n");
        sb.append("    notOnlineNum: ").append(toIndentedString(notOnlineNum)).append("\n");
        sb.append("    offlineNum: ").append(toIndentedString(offlineNum)).append("\n");
        sb.append("    inclusterNum: ").append(toIndentedString(inclusterNum)).append("\n");
        sb.append("    notInclusterNum: ").append(toIndentedString(notInclusterNum)).append("\n");
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
