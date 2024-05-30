package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建clouddcn子网对象
 */
public class CreateClouddcnSubnetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_subnet")

    private CreateClouddcnSubnetOption clouddcnSubnet;

    public CreateClouddcnSubnetRequestBody withClouddcnSubnet(CreateClouddcnSubnetOption clouddcnSubnet) {
        this.clouddcnSubnet = clouddcnSubnet;
        return this;
    }

    public CreateClouddcnSubnetRequestBody withClouddcnSubnet(
        Consumer<CreateClouddcnSubnetOption> clouddcnSubnetSetter) {
        if (this.clouddcnSubnet == null) {
            this.clouddcnSubnet = new CreateClouddcnSubnetOption();
            clouddcnSubnetSetter.accept(this.clouddcnSubnet);
        }

        return this;
    }

    /**
     * Get clouddcnSubnet
     * @return clouddcnSubnet
     */
    public CreateClouddcnSubnetOption getClouddcnSubnet() {
        return clouddcnSubnet;
    }

    public void setClouddcnSubnet(CreateClouddcnSubnetOption clouddcnSubnet) {
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
        CreateClouddcnSubnetRequestBody that = (CreateClouddcnSubnetRequestBody) obj;
        return Objects.equals(this.clouddcnSubnet, that.clouddcnSubnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clouddcnSubnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClouddcnSubnetRequestBody {\n");
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
