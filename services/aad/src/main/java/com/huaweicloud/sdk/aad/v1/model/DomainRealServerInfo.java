package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 域名源站信息
 */
public class DomainRealServerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_server_type")

    private Integer realServerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_servers")

    private String realServers;

    public DomainRealServerInfo withRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
        return this;
    }

    /**
     * 源站类型
     * @return realServerType
     */
    public Integer getRealServerType() {
        return realServerType;
    }

    public void setRealServerType(Integer realServerType) {
        this.realServerType = realServerType;
    }

    public DomainRealServerInfo withRealServers(String realServers) {
        this.realServers = realServers;
        return this;
    }

    /**
     * 源站
     * @return realServers
     */
    public String getRealServers() {
        return realServers;
    }

    public void setRealServers(String realServers) {
        this.realServers = realServers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainRealServerInfo that = (DomainRealServerInfo) obj;
        return Objects.equals(this.realServerType, that.realServerType)
            && Objects.equals(this.realServers, that.realServers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realServerType, realServers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainRealServerInfo {\n");
        sb.append("    realServerType: ").append(toIndentedString(realServerType)).append("\n");
        sb.append("    realServers: ").append(toIndentedString(realServers)).append("\n");
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
