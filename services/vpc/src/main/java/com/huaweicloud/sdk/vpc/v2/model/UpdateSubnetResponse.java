package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.SubnetResult;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class UpdateSubnetResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet")
    
    private SubnetResult subnet = null;

    public UpdateSubnetResponse withSubnet(SubnetResult subnet) {
        this.subnet = subnet;
        return this;
    }

    public UpdateSubnetResponse withSubnet(Consumer<SubnetResult> subnetSetter) {
        if(this.subnet == null ){
            this.subnet = new SubnetResult();
        }
        subnetSetter.accept(this.subnet);
        return this;
    }


    /**
     * Get subnet
     * @return subnet
     */
    public SubnetResult getSubnet() {
        return subnet;
    }

    public void setSubnet(SubnetResult subnet) {
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
        UpdateSubnetResponse updateSubnetResponse = (UpdateSubnetResponse) o;
        return Objects.equals(this.subnet, updateSubnetResponse.subnet);
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

