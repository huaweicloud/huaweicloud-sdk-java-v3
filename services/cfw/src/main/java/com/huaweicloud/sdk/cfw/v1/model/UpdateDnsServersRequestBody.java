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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check_domain_name")

    private String healthCheckDomainName;

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
     * DNS服务器列表
     * @return dnsServer
     */
    public List<UpdateDnsServersRequestBodyDnsServer> getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(List<UpdateDnsServersRequestBodyDnsServer> dnsServer) {
        this.dnsServer = dnsServer;
    }

    public UpdateDnsServersRequestBody withHealthCheckDomainName(String healthCheckDomainName) {
        this.healthCheckDomainName = healthCheckDomainName;
        return this;
    }

    /**
     * 健康检查域名，可通过[查询dns服务器列表接口](ListDnsServers.xml)查询获得，通过返回值中的data.health_check_domain_name（.表示各对象之间层级的区分）获得。
     * @return healthCheckDomainName
     */
    public String getHealthCheckDomainName() {
        return healthCheckDomainName;
    }

    public void setHealthCheckDomainName(String healthCheckDomainName) {
        this.healthCheckDomainName = healthCheckDomainName;
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
        return Objects.equals(this.dnsServer, that.dnsServer)
            && Objects.equals(this.healthCheckDomainName, that.healthCheckDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnsServer, healthCheckDomainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDnsServersRequestBody {\n");
        sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
        sb.append("    healthCheckDomainName: ").append(toIndentedString(healthCheckDomainName)).append("\n");
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
