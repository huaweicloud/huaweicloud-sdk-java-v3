package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSubnetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    @JacksonXmlProperty(localName = "subnet")

    private Subnet subnet;

    public CreateSubnetResponse withSubnet(Subnet subnet) {
        this.subnet = subnet;
        return this;
    }

    public CreateSubnetResponse withSubnet(Consumer<Subnet> subnetSetter) {
        if (this.subnet == null) {
            this.subnet = new Subnet();
            subnetSetter.accept(this.subnet);
        }

        return this;
    }

    /**
     * Get subnet
     * @return subnet
     */
    public Subnet getSubnet() {
        return subnet;
    }

    public void setSubnet(Subnet subnet) {
        this.subnet = subnet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSubnetResponse createSubnetResponse = (CreateSubnetResponse) o;
        return Objects.equals(this.subnet, createSubnetResponse.subnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubnetResponse {\n");
        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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
