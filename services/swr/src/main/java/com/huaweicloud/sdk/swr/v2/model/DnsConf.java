package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DnsConf
 */
public class DnsConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private Map<String, String> hosts = null;

    public DnsConf withHosts(Map<String, String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public DnsConf putHostsItem(String key, String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new HashMap<>();
        }
        this.hosts.put(key, hostsItem);
        return this;
    }

    public DnsConf withHosts(Consumer<Map<String, String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new HashMap<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 主机映射，键为域名，值为对应的 IP 地址
     * @return hosts
     */
    public Map<String, String> getHosts() {
        return hosts;
    }

    public void setHosts(Map<String, String> hosts) {
        this.hosts = hosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DnsConf that = (DnsConf) obj;
        return Objects.equals(this.hosts, that.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsConf {\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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
