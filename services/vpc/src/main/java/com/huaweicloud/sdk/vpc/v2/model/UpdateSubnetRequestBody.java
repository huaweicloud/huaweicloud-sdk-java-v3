package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateSubnetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet")

    private UpdateSubnetOption subnet;

    public UpdateSubnetRequestBody withSubnet(UpdateSubnetOption subnet) {
        this.subnet = subnet;
        return this;
    }

    public UpdateSubnetRequestBody withSubnet(Consumer<UpdateSubnetOption> subnetSetter) {
        if (this.subnet == null) {
            this.subnet = new UpdateSubnetOption();
            subnetSetter.accept(this.subnet);
        }

        return this;
    }

    /**
     * Get subnet
     * @return subnet
     */
    public UpdateSubnetOption getSubnet() {
        return subnet;
    }

    public void setSubnet(UpdateSubnetOption subnet) {
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
        UpdateSubnetRequestBody that = (UpdateSubnetRequestBody) obj;
        return Objects.equals(this.subnet, that.subnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetRequestBody {\n");
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
