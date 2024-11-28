package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteMsdtcLocalHostRequestBody
 */
public class DeleteMsdtcLocalHostRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<MsdtcHostOption> hosts = null;

    public DeleteMsdtcLocalHostRequestBody withHosts(List<MsdtcHostOption> hosts) {
        this.hosts = hosts;
        return this;
    }

    public DeleteMsdtcLocalHostRequestBody addHostsItem(MsdtcHostOption hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public DeleteMsdtcLocalHostRequestBody withHosts(Consumer<List<MsdtcHostOption>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 删除msdtc中的host
     * @return hosts
     */
    public List<MsdtcHostOption> getHosts() {
        return hosts;
    }

    public void setHosts(List<MsdtcHostOption> hosts) {
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
        DeleteMsdtcLocalHostRequestBody that = (DeleteMsdtcLocalHostRequestBody) obj;
        return Objects.equals(this.hosts, that.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMsdtcLocalHostRequestBody {\n");
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
