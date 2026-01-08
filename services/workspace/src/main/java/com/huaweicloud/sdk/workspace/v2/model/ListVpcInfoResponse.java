package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListVpcInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcs")

    private List<VpcInfo> vpcs = null;

    public ListVpcInfoResponse withVpcs(List<VpcInfo> vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    public ListVpcInfoResponse addVpcsItem(VpcInfo vpcsItem) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpcsItem);
        return this;
    }

    public ListVpcInfoResponse withVpcs(Consumer<List<VpcInfo>> vpcsSetter) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        vpcsSetter.accept(this.vpcs);
        return this;
    }

    /**
     * vpc信息列表。
     * @return vpcs
     */
    public List<VpcInfo> getVpcs() {
        return vpcs;
    }

    public void setVpcs(List<VpcInfo> vpcs) {
        this.vpcs = vpcs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVpcInfoResponse that = (ListVpcInfoResponse) obj;
        return Objects.equals(this.vpcs, that.vpcs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcInfoResponse {\n");
        sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
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
