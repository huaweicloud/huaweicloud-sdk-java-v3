package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DnsDomain
 */
public class DnsDomain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    private List<Server> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_port")

    private String protectPort;

    public DnsDomain withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DnsDomain withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DnsDomain withServers(List<Server> servers) {
        this.servers = servers;
        return this;
    }

    public DnsDomain addServersItem(Server serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public DnsDomain withServers(Consumer<List<Server>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * Get servers
     * @return servers
     */
    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    public DnsDomain withProtectPort(String protectPort) {
        this.protectPort = protectPort;
        return this;
    }

    /**
     * Get protectPort
     * @return protectPort
     */
    public String getProtectPort() {
        return protectPort;
    }

    public void setProtectPort(String protectPort) {
        this.protectPort = protectPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DnsDomain that = (DnsDomain) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.servers, that.servers) && Objects.equals(this.protectPort, that.protectPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, domain, servers, protectPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsDomain {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    protectPort: ").append(toIndentedString(protectPort)).append("\n");
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
