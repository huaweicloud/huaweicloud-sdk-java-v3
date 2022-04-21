package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Calculation
 */
public class Calculation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "never_connected")

    private Integer neverConnected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online")

    private Integer online;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline")

    private Integer offline;

    public Calculation withNeverConnected(Integer neverConnected) {
        this.neverConnected = neverConnected;
        return this;
    }

    /**
     * 从未连接过的设备数量
     * minimum: 0
     * maximum: 999999999
     * @return neverConnected
     */
    public Integer getNeverConnected() {
        return neverConnected;
    }

    public void setNeverConnected(Integer neverConnected) {
        this.neverConnected = neverConnected;
    }

    public Calculation withOnline(Integer online) {
        this.online = online;
        return this;
    }

    /**
     * 在线设备数量
     * minimum: 0
     * maximum: 999999999
     * @return online
     */
    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Calculation withOffline(Integer offline) {
        this.offline = offline;
        return this;
    }

    /**
     * 离线设备数量
     * minimum: 0
     * maximum: 999999999
     * @return offline
     */
    public Integer getOffline() {
        return offline;
    }

    public void setOffline(Integer offline) {
        this.offline = offline;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Calculation calculation = (Calculation) o;
        return Objects.equals(this.neverConnected, calculation.neverConnected)
            && Objects.equals(this.online, calculation.online) && Objects.equals(this.offline, calculation.offline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neverConnected, online, offline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Calculation {\n");
        sb.append("    neverConnected: ").append(toIndentedString(neverConnected)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
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
