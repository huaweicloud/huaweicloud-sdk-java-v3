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
public class ListSubnetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<SingleSubnetInfo> subnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_size")

    private Integer subnetSize;

    public ListSubnetsResponse withSubnets(List<SingleSubnetInfo> subnets) {
        this.subnets = subnets;
        return this;
    }

    public ListSubnetsResponse addSubnetsItem(SingleSubnetInfo subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public ListSubnetsResponse withSubnets(Consumer<List<SingleSubnetInfo>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * 子网列表。
     * @return subnets
     */
    public List<SingleSubnetInfo> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<SingleSubnetInfo> subnets) {
        this.subnets = subnets;
    }

    public ListSubnetsResponse withSubnetSize(Integer subnetSize) {
        this.subnetSize = subnetSize;
        return this;
    }

    /**
     * 子网数量。
     * @return subnetSize
     */
    public Integer getSubnetSize() {
        return subnetSize;
    }

    public void setSubnetSize(Integer subnetSize) {
        this.subnetSize = subnetSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubnetsResponse that = (ListSubnetsResponse) obj;
        return Objects.equals(this.subnets, that.subnets) && Objects.equals(this.subnetSize, that.subnetSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnets, subnetSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubnetsResponse {\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
        sb.append("    subnetSize: ").append(toIndentedString(subnetSize)).append("\n");
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
