package com.huaweicloud.sdk.dns.v2.model;

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
public class ListEndpointIpaddressesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddresses")

    private List<IpaddressesData> ipaddresses = null;

    public ListEndpointIpaddressesResponse withIpaddresses(List<IpaddressesData> ipaddresses) {
        this.ipaddresses = ipaddresses;
        return this;
    }

    public ListEndpointIpaddressesResponse addIpaddressesItem(IpaddressesData ipaddressesItem) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        this.ipaddresses.add(ipaddressesItem);
        return this;
    }

    public ListEndpointIpaddressesResponse withIpaddresses(Consumer<List<IpaddressesData>> ipaddressesSetter) {
        if (this.ipaddresses == null) {
            this.ipaddresses = new ArrayList<>();
        }
        ipaddressesSetter.accept(this.ipaddresses);
        return this;
    }

    /**
     * 列表数据结构。
     * @return ipaddresses
     */
    public List<IpaddressesData> getIpaddresses() {
        return ipaddresses;
    }

    public void setIpaddresses(List<IpaddressesData> ipaddresses) {
        this.ipaddresses = ipaddresses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEndpointIpaddressesResponse that = (ListEndpointIpaddressesResponse) obj;
        return Objects.equals(this.ipaddresses, that.ipaddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipaddresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndpointIpaddressesResponse {\n");
        sb.append("    ipaddresses: ").append(toIndentedString(ipaddresses)).append("\n");
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
