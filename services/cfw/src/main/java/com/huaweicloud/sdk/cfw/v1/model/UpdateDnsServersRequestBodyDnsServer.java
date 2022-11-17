package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDnsServersRequestBodyDnsServer
 */
public class UpdateDnsServersRequestBodyDnsServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_customized")

    private Integer isCustomized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_applied")

    private Integer isApplied;

    public UpdateDnsServersRequestBodyDnsServer withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * DNS服务器IP
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public UpdateDnsServersRequestBodyDnsServer withIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
        return this;
    }

    /**
     * 是否是用户自定义的dns服务器，0否 1是
     * @return isCustomized
     */
    public Integer getIsCustomized() {
        return isCustomized;
    }

    public void setIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
    }

    public UpdateDnsServersRequestBodyDnsServer withIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * 是否应用，0否 1是
     * @return isApplied
     */
    public Integer getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDnsServersRequestBodyDnsServer updateDnsServersRequestBodyDnsServer =
            (UpdateDnsServersRequestBodyDnsServer) o;
        return Objects.equals(this.serverIp, updateDnsServersRequestBodyDnsServer.serverIp)
            && Objects.equals(this.isCustomized, updateDnsServersRequestBodyDnsServer.isCustomized)
            && Objects.equals(this.isApplied, updateDnsServersRequestBodyDnsServer.isApplied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIp, isCustomized, isApplied);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDnsServersRequestBodyDnsServer {\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    isCustomized: ").append(toIndentedString(isCustomized)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
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
