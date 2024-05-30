package com.huaweicloud.sdk.vpc.v3.model;

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
public class ListClouddcnSubnetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_subnets")

    private List<ClouddcnSubnet> clouddcnSubnets = null;

    public ListClouddcnSubnetsResponse withClouddcnSubnets(List<ClouddcnSubnet> clouddcnSubnets) {
        this.clouddcnSubnets = clouddcnSubnets;
        return this;
    }

    public ListClouddcnSubnetsResponse addClouddcnSubnetsItem(ClouddcnSubnet clouddcnSubnetsItem) {
        if (this.clouddcnSubnets == null) {
            this.clouddcnSubnets = new ArrayList<>();
        }
        this.clouddcnSubnets.add(clouddcnSubnetsItem);
        return this;
    }

    public ListClouddcnSubnetsResponse withClouddcnSubnets(Consumer<List<ClouddcnSubnet>> clouddcnSubnetsSetter) {
        if (this.clouddcnSubnets == null) {
            this.clouddcnSubnets = new ArrayList<>();
        }
        clouddcnSubnetsSetter.accept(this.clouddcnSubnets);
        return this;
    }

    /**
     * clouddcn subnet对象列表
     * @return clouddcnSubnets
     */
    public List<ClouddcnSubnet> getClouddcnSubnets() {
        return clouddcnSubnets;
    }

    public void setClouddcnSubnets(List<ClouddcnSubnet> clouddcnSubnets) {
        this.clouddcnSubnets = clouddcnSubnets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClouddcnSubnetsResponse that = (ListClouddcnSubnetsResponse) obj;
        return Objects.equals(this.clouddcnSubnets, that.clouddcnSubnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clouddcnSubnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClouddcnSubnetsResponse {\n");
        sb.append("    clouddcnSubnets: ").append(toIndentedString(clouddcnSubnets)).append("\n");
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
