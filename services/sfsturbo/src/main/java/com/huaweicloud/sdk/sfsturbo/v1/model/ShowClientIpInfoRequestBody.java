package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取已挂载的客户端ip信息
 */
public class ShowClientIpInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_client_ips")

    private ClientIpInfo getClientIps;

    public ShowClientIpInfoRequestBody withGetClientIps(ClientIpInfo getClientIps) {
        this.getClientIps = getClientIps;
        return this;
    }

    public ShowClientIpInfoRequestBody withGetClientIps(Consumer<ClientIpInfo> getClientIpsSetter) {
        if (this.getClientIps == null) {
            this.getClientIps = new ClientIpInfo();
            getClientIpsSetter.accept(this.getClientIps);
        }

        return this;
    }

    /**
     * Get getClientIps
     * @return getClientIps
     */
    public ClientIpInfo getGetClientIps() {
        return getClientIps;
    }

    public void setGetClientIps(ClientIpInfo getClientIps) {
        this.getClientIps = getClientIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClientIpInfoRequestBody that = (ShowClientIpInfoRequestBody) obj;
        return Objects.equals(this.getClientIps, that.getClientIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClientIpInfoRequestBody {\n");
        sb.append("    getClientIps: ").append(toIndentedString(getClientIps)).append("\n");
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
