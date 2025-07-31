package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 沙箱类型,RDP沙箱专用
 */
public class ContainerExtraRdpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proto_env")

    private String protoEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system")

    private String system;

    public ContainerExtraRdpInfo withProtoEnv(String protoEnv) {
        this.protoEnv = protoEnv;
        return this;
    }

    /**
     * 协议类型: - 0 : 协议模拟 - 1 : 系统模拟
     * @return protoEnv
     */
    public String getProtoEnv() {
        return protoEnv;
    }

    public void setProtoEnv(String protoEnv) {
        this.protoEnv = protoEnv;
    }

    public ContainerExtraRdpInfo withSystem(String system) {
        this.system = system;
        return this;
    }

    /**
     * 系统类型，系统模拟时使用: - win7 : win 7 - win8 : win 8 - win10 : win 10 - win-server2012 : win-server 2012 - win-server2016 : win-server 2016
     * @return system
     */
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerExtraRdpInfo that = (ContainerExtraRdpInfo) obj;
        return Objects.equals(this.protoEnv, that.protoEnv) && Objects.equals(this.system, that.system);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protoEnv, system);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerExtraRdpInfo {\n");
        sb.append("    protoEnv: ").append(toIndentedString(protoEnv)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
