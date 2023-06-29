package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSubnetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    private UpdateSubnetResponseObject subnet;

    public UpdateSubnetResponse withSubnet(UpdateSubnetResponseObject subnet) {
        this.subnet = subnet;
        return this;
    }

    public UpdateSubnetResponse withSubnet(Consumer<UpdateSubnetResponseObject> subnetSetter) {
        if (this.subnet == null) {
            this.subnet = new UpdateSubnetResponseObject();
            subnetSetter.accept(this.subnet);
        }

        return this;
    }

    /**
     * Get subnet
     * @return subnet
     */
    public UpdateSubnetResponseObject getSubnet() {
        return subnet;
    }

    public void setSubnet(UpdateSubnetResponseObject subnet) {
        this.subnet = subnet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSubnetResponse that = (UpdateSubnetResponse) obj;
        return Objects.equals(this.subnet, that.subnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetResponse {\n");
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
