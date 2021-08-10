package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 操作参数，scale和rollback时提供。 */
public class InstanceActionParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public InstanceActionParameters withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /** 实例数，在scale操作时提供。
     * 
     * @return replica */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public InstanceActionParameters withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public InstanceActionParameters addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public InstanceActionParameters withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /** ECS ID列表，指定虚机扩容时部署的ECS主机。
     * 
     * @return hosts */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public InstanceActionParameters withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 版本号，在rollback操作时提供，通过查询快照接口获取。
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceActionParameters instanceActionParameters = (InstanceActionParameters) o;
        return Objects.equals(this.replica, instanceActionParameters.replica)
            && Objects.equals(this.hosts, instanceActionParameters.hosts)
            && Objects.equals(this.version, instanceActionParameters.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replica, hosts, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceActionParameters {\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
