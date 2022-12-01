package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddMsdtcRequestBody
 */
public class AddMsdtcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<MsdtcHostOption> hosts = null;

    public AddMsdtcRequestBody withHosts(List<MsdtcHostOption> hosts) {
        this.hosts = hosts;
        return this;
    }

    public AddMsdtcRequestBody addHostsItem(MsdtcHostOption hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public AddMsdtcRequestBody withHosts(Consumer<List<MsdtcHostOption>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 主机信息，key为hostname ，value 为IP
     * @return hosts
     */
    public List<MsdtcHostOption> getHosts() {
        return hosts;
    }

    public void setHosts(List<MsdtcHostOption> hosts) {
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
        AddMsdtcRequestBody addMsdtcRequestBody = (AddMsdtcRequestBody) o;
        return Objects.equals(this.hosts, addMsdtcRequestBody.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddMsdtcRequestBody {\n");
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
