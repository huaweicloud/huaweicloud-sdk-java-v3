package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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

    @JacksonXmlProperty(localName = "subnets")

    private List<Subnet> subnets = null;

    public ListSubnetsResponse withSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    public ListSubnetsResponse addSubnetsItem(Subnet subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public ListSubnetsResponse withSubnets(Consumer<List<Subnet>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * subnet对象列表
     * @return subnets
     */
    public List<Subnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubnetsResponse listSubnetsResponse = (ListSubnetsResponse) o;
        return Objects.equals(this.subnets, listSubnetsResponse.subnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubnetsResponse {\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
