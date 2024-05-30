package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateClouddcnSubnetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_subnet")

    private UpdateClouddcnSubnetOption clouddcnSubnet;

    public UpdateClouddcnSubnetRequestBody withClouddcnSubnet(UpdateClouddcnSubnetOption clouddcnSubnet) {
        this.clouddcnSubnet = clouddcnSubnet;
        return this;
    }

    public UpdateClouddcnSubnetRequestBody withClouddcnSubnet(
        Consumer<UpdateClouddcnSubnetOption> clouddcnSubnetSetter) {
        if (this.clouddcnSubnet == null) {
            this.clouddcnSubnet = new UpdateClouddcnSubnetOption();
            clouddcnSubnetSetter.accept(this.clouddcnSubnet);
        }

        return this;
    }

    /**
     * Get clouddcnSubnet
     * @return clouddcnSubnet
     */
    public UpdateClouddcnSubnetOption getClouddcnSubnet() {
        return clouddcnSubnet;
    }

    public void setClouddcnSubnet(UpdateClouddcnSubnetOption clouddcnSubnet) {
        this.clouddcnSubnet = clouddcnSubnet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClouddcnSubnetRequestBody that = (UpdateClouddcnSubnetRequestBody) obj;
        return Objects.equals(this.clouddcnSubnet, that.clouddcnSubnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clouddcnSubnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClouddcnSubnetRequestBody {\n");
        sb.append("    clouddcnSubnet: ").append(toIndentedString(clouddcnSubnet)).append("\n");
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
