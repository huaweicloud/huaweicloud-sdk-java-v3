package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMsdtcLocalHostResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<MsdtcHostResult> hosts = null;

    public ShowMsdtcLocalHostResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 查询状态 processing:查询中 success：查询成功 fail:查询失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowMsdtcLocalHostResponse withHosts(List<MsdtcHostResult> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ShowMsdtcLocalHostResponse addHostsItem(MsdtcHostResult hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ShowMsdtcLocalHostResponse withHosts(Consumer<List<MsdtcHostResult>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * host信息列表
     * @return hosts
     */
    public List<MsdtcHostResult> getHosts() {
        return hosts;
    }

    public void setHosts(List<MsdtcHostResult> hosts) {
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
        ShowMsdtcLocalHostResponse that = (ShowMsdtcLocalHostResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.hosts, that.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMsdtcLocalHostResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
