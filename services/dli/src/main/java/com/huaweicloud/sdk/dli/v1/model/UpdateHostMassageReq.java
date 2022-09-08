package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改主机信息的请求body体。
 */
public class UpdateHostMassageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<EnhancedConnectionsHost> hosts = null;

    public UpdateHostMassageReq withHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
        return this;
    }

    public UpdateHostMassageReq addHostsItem(EnhancedConnectionsHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public UpdateHostMassageReq withHosts(Consumer<List<EnhancedConnectionsHost>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 用户自定义主机信息，最大支持2万条记录。内容填空表示清除所有已配置的主机信息。
     * @return hosts
     */
    public List<EnhancedConnectionsHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<EnhancedConnectionsHost> hosts) {
        this.hosts = hosts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHostMassageReq updateHostMassageReq = (UpdateHostMassageReq) o;
        return Objects.equals(this.hosts, updateHostMassageReq.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostMassageReq {\n");
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
