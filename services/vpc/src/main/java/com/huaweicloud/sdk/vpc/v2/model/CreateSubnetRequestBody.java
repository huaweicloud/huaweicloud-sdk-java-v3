package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.CreateSubnetOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 创建子网对象
 */
public class CreateSubnetRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet")
    
    private CreateSubnetOption subnet = null;

    public CreateSubnetRequestBody withSubnet(CreateSubnetOption subnet) {
        this.subnet = subnet;
        return this;
    }

    public CreateSubnetRequestBody withSubnet(Consumer<CreateSubnetOption> subnetSetter) {
        if(this.subnet == null ){
            this.subnet = new CreateSubnetOption();
        }
        subnetSetter.accept(this.subnet);
        return this;
    }


    /**
     * Get subnet
     * @return subnet
     */
    public CreateSubnetOption getSubnet() {
        return subnet;
    }

    public void setSubnet(CreateSubnetOption subnet) {
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
        CreateSubnetRequestBody createSubnetRequestBody = (CreateSubnetRequestBody) o;
        return Objects.equals(this.subnet, createSubnetRequestBody.subnet);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subnet);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubnetRequestBody {\n");
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

