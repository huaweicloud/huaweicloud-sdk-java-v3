package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 登录状态统计响应。
 */
public class DesktopLoginStatisticsRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_use_num")

    private Integer inUseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_num")

    private Integer stopNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unregistered_num")

    private Integer unregisteredNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unable_to_connect_num")

    private Integer unableToConnectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ready_num")

    private Integer readyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnected_num")

    private Integer disconnectedNum;

    public DesktopLoginStatisticsRsp withInUseNum(Integer inUseNum) {
        this.inUseNum = inUseNum;
        return this;
    }

    /**
     * 使用中。
     * minimum: 0
     * maximum: 2147483647
     * @return inUseNum
     */
    public Integer getInUseNum() {
        return inUseNum;
    }

    public void setInUseNum(Integer inUseNum) {
        this.inUseNum = inUseNum;
    }

    public DesktopLoginStatisticsRsp withStopNum(Integer stopNum) {
        this.stopNum = stopNum;
        return this;
    }

    /**
     * 关机数目(关机中、已关机)。
     * minimum: 0
     * maximum: 2147483647
     * @return stopNum
     */
    public Integer getStopNum() {
        return stopNum;
    }

    public void setStopNum(Integer stopNum) {
        this.stopNum = stopNum;
    }

    public DesktopLoginStatisticsRsp withUnregisteredNum(Integer unregisteredNum) {
        this.unregisteredNum = unregisteredNum;
        return this;
    }

    /**
     * 未注册数目。
     * minimum: 0
     * maximum: 2147483647
     * @return unregisteredNum
     */
    public Integer getUnregisteredNum() {
        return unregisteredNum;
    }

    public void setUnregisteredNum(Integer unregisteredNum) {
        this.unregisteredNum = unregisteredNum;
    }

    public DesktopLoginStatisticsRsp withUnableToConnectNum(Integer unableToConnectNum) {
        this.unableToConnectNum = unableToConnectNum;
        return this;
    }

    /**
     * 未注册数目。
     * minimum: 0
     * maximum: 2147483647
     * @return unableToConnectNum
     */
    public Integer getUnableToConnectNum() {
        return unableToConnectNum;
    }

    public void setUnableToConnectNum(Integer unableToConnectNum) {
        this.unableToConnectNum = unableToConnectNum;
    }

    public DesktopLoginStatisticsRsp withReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
        return this;
    }

    /**
     * 空闲数目。
     * minimum: 0
     * maximum: 2147483647
     * @return readyNum
     */
    public Integer getReadyNum() {
        return readyNum;
    }

    public void setReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
    }

    public DesktopLoginStatisticsRsp withDisconnectedNum(Integer disconnectedNum) {
        this.disconnectedNum = disconnectedNum;
        return this;
    }

    /**
     * 断开连接数目。
     * minimum: 0
     * maximum: 2147483647
     * @return disconnectedNum
     */
    public Integer getDisconnectedNum() {
        return disconnectedNum;
    }

    public void setDisconnectedNum(Integer disconnectedNum) {
        this.disconnectedNum = disconnectedNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopLoginStatisticsRsp that = (DesktopLoginStatisticsRsp) obj;
        return Objects.equals(this.inUseNum, that.inUseNum) && Objects.equals(this.stopNum, that.stopNum)
            && Objects.equals(this.unregisteredNum, that.unregisteredNum)
            && Objects.equals(this.unableToConnectNum, that.unableToConnectNum)
            && Objects.equals(this.readyNum, that.readyNum)
            && Objects.equals(this.disconnectedNum, that.disconnectedNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inUseNum, stopNum, unregisteredNum, unableToConnectNum, readyNum, disconnectedNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopLoginStatisticsRsp {\n");
        sb.append("    inUseNum: ").append(toIndentedString(inUseNum)).append("\n");
        sb.append("    stopNum: ").append(toIndentedString(stopNum)).append("\n");
        sb.append("    unregisteredNum: ").append(toIndentedString(unregisteredNum)).append("\n");
        sb.append("    unableToConnectNum: ").append(toIndentedString(unableToConnectNum)).append("\n");
        sb.append("    readyNum: ").append(toIndentedString(readyNum)).append("\n");
        sb.append("    disconnectedNum: ").append(toIndentedString(disconnectedNum)).append("\n");
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
