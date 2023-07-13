package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDnsServersRequestBody
 */
public class UpdateDnsServersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_server")

    private List<UpdateDnsServersRequestBodyDnsServer> dnsServer = null;

    public UpdateDnsServersRequestBody withDnsServer(List<UpdateDnsServersRequestBodyDnsServer> dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }

    public UpdateDnsServersRequestBody addDnsServerItem(UpdateDnsServersRequestBodyDnsServer dnsServerItem) {
        if (this.dnsServer == null) {
            this.dnsServer = new ArrayList<>();
        }
        this.dnsServer.add(dnsServerItem);
        return this;
    }

    public UpdateDnsServersRequestBody withDnsServer(
        Consumer<List<UpdateDnsServersRequestBodyDnsServer>> dnsServerSetter) {
        if (this.dnsServer == null) {
            this.dnsServer = new ArrayList<>();
        }
        dnsServerSetter.accept(this.dnsServer);
        return this;
    }

    /**
     * DNS服务器
     * @return dnsServer
     */
    public List<UpdateDnsServersRequestBodyDnsServer> getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(List<UpdateDnsServersRequestBodyDnsServer> dnsServer) {
        this.dnsServer = dnsServer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDnsServersRequestBody that = (UpdateDnsServersRequestBody) obj;
        return Objects.equals(this.dnsServer, that.dnsServer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsServer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDnsServersRequestBody {\n");
        sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
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
