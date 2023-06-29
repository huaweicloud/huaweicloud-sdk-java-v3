package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HostAlias
 */
public class HostAlias {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostnames")

    private List<String> hostnames = null;

    public HostAlias withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public HostAlias withHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }

    public HostAlias addHostnamesItem(String hostnamesItem) {
        if (this.hostnames == null) {
            this.hostnames = new ArrayList<>();
        }
        this.hostnames.add(hostnamesItem);
        return this;
    }

    public HostAlias withHostnames(Consumer<List<String>> hostnamesSetter) {
        if (this.hostnames == null) {
            this.hostnames = new ArrayList<>();
        }
        hostnamesSetter.accept(this.hostnames);
        return this;
    }

    /**
     * Get hostnames
     * @return hostnames
     */
    public List<String> getHostnames() {
        return hostnames;
    }

    public void setHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostAlias that = (HostAlias) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.hostnames, that.hostnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, hostnames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostAlias {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
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
