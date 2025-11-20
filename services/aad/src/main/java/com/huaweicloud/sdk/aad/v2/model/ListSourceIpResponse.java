package com.huaweicloud.sdk.aad.v2.model;

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
public class ListSourceIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<SourceIp> ips = null;

    public ListSourceIpResponse withIps(List<SourceIp> ips) {
        this.ips = ips;
        return this;
    }

    public ListSourceIpResponse addIpsItem(SourceIp ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public ListSourceIpResponse withIps(Consumer<List<SourceIp>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * ip
     * @return ips
     */
    public List<SourceIp> getIps() {
        return ips;
    }

    public void setIps(List<SourceIp> ips) {
        this.ips = ips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSourceIpResponse that = (ListSourceIpResponse) obj;
        return Objects.equals(this.ips, that.ips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSourceIpResponse {\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
