package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class UpdateVpcRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc")
    
    private UpdateVpcOption vpc = null;

    public UpdateVpcRequestBody withVpc(UpdateVpcOption vpc) {
        this.vpc = vpc;
        return this;
    }

    public UpdateVpcRequestBody withVpc(Consumer<UpdateVpcOption> vpcSetter) {
        if(this.vpc == null ){
            this.vpc = new UpdateVpcOption();
        }
        vpcSetter.accept(this.vpc);
        return this;
    }


    /**
     * Get vpc
     * @return vpc
     */
    public UpdateVpcOption getVpc() {
        return vpc;
    }

    public void setVpc(UpdateVpcOption vpc) {
        this.vpc = vpc;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcRequestBody updateVpcRequestBody = (UpdateVpcRequestBody) o;
        return Objects.equals(this.vpc, updateVpcRequestBody.vpc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vpc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcRequestBody {\n");
            sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

