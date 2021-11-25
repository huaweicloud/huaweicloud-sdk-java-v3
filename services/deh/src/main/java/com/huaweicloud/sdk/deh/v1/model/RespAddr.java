package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 云服务器的vpc信息。 */
public class RespAddr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public RespAddr withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /** 云服务器的vpc ip。
     * 
     * @return addr */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public RespAddr withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 云服务器的vpc版本。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespAddr respAddr = (RespAddr) o;
        return Objects.equals(this.addr, respAddr.addr) && Objects.equals(this.version, respAddr.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespAddr {\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
