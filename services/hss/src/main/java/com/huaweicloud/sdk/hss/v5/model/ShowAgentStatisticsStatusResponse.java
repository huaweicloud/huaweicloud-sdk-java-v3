package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAgentStatisticsStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online")

    private Integer online;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline")

    private Integer offline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_installed")

    private Integer notInstalled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ShowAgentStatisticsStatusResponse withOnline(Integer online) {
        this.online = online;
        return this;
    }

    /**
     * 主机Agent在线数
     * @return online
     */
    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public ShowAgentStatisticsStatusResponse withOffline(Integer offline) {
        this.offline = offline;
        return this;
    }

    /**
     * 主机Agent离线数
     * @return offline
     */
    public Integer getOffline() {
        return offline;
    }

    public void setOffline(Integer offline) {
        this.offline = offline;
    }

    public ShowAgentStatisticsStatusResponse withNotInstalled(Integer notInstalled) {
        this.notInstalled = notInstalled;
        return this;
    }

    /**
     * 未安装主机Agent的主机数
     * @return notInstalled
     */
    public Integer getNotInstalled() {
        return notInstalled;
    }

    public void setNotInstalled(Integer notInstalled) {
        this.notInstalled = notInstalled;
    }

    public ShowAgentStatisticsStatusResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 主机总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgentStatisticsStatusResponse that = (ShowAgentStatisticsStatusResponse) obj;
        return Objects.equals(this.online, that.online) && Objects.equals(this.offline, that.offline)
            && Objects.equals(this.notInstalled, that.notInstalled) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(online, offline, notInstalled, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgentStatisticsStatusResponse {\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    notInstalled: ").append(toIndentedString(notInstalled)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
