package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器电源状态对象
 */
public class ServerPowerStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on")

    private Integer on;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "off")

    private Integer off;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknown")

    private Integer unknown;

    public ServerPowerStatus withOn(Integer on) {
        this.on = on;
        return this;
    }

    /**
     * 开机状态的数量
     * @return on
     */
    public Integer getOn() {
        return on;
    }

    public void setOn(Integer on) {
        this.on = on;
    }

    public ServerPowerStatus withOff(Integer off) {
        this.off = off;
        return this;
    }

    /**
     * 关机状态的数量
     * @return off
     */
    public Integer getOff() {
        return off;
    }

    public void setOff(Integer off) {
        this.off = off;
    }

    public ServerPowerStatus withUnknown(Integer unknown) {
        this.unknown = unknown;
        return this;
    }

    /**
     * 未知状态的数量
     * @return unknown
     */
    public Integer getUnknown() {
        return unknown;
    }

    public void setUnknown(Integer unknown) {
        this.unknown = unknown;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerPowerStatus that = (ServerPowerStatus) obj;
        return Objects.equals(this.on, that.on) && Objects.equals(this.off, that.off)
            && Objects.equals(this.unknown, that.unknown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(on, off, unknown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerPowerStatus {\n");
        sb.append("    on: ").append(toIndentedString(on)).append("\n");
        sb.append("    off: ").append(toIndentedString(off)).append("\n");
        sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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
