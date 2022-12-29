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
public class ListEndpointVpcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcs")

    private List<VpcsData> vpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public ListEndpointVpcsResponse withVpcs(List<VpcsData> vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    public ListEndpointVpcsResponse addVpcsItem(VpcsData vpcsItem) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpcsItem);
        return this;
    }

    public ListEndpointVpcsResponse withVpcs(Consumer<List<VpcsData>> vpcsSetter) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        vpcsSetter.accept(this.vpcs);
        return this;
    }

    /**
     * 查询公网Zone的列表响应。
     * @return vpcs
     */
    public List<VpcsData> getVpcs() {
        return vpcs;
    }

    public void setVpcs(List<VpcsData> vpcs) {
        this.vpcs = vpcs;
    }

    public ListEndpointVpcsResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListEndpointVpcsResponse withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEndpointVpcsResponse listEndpointVpcsResponse = (ListEndpointVpcsResponse) o;
        return Objects.equals(this.vpcs, listEndpointVpcsResponse.vpcs)
            && Objects.equals(this.metadata, listEndpointVpcsResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcs, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndpointVpcsResponse {\n");
        sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
