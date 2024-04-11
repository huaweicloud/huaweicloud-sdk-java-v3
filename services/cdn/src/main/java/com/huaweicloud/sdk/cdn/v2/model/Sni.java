package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回源SNI。
 */
public class Sni {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    public Sni withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 是否开启回源SNI，on：打开，off：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Sni withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * CDN节点回源需要访问的源站域名。如test.example.com。   > 1. 开启回源SNI时必填。   > 2. 不支持泛域名，仅支持输入数字、“-”、“.”、英文大小写字符。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sni that = (Sni) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.serverName, that.serverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, serverName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sni {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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
