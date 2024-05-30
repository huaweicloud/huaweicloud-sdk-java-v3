package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateClouddcnSubnetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_subnet")

    private ClouddcnSubnet clouddcnSubnet;

    public UpdateClouddcnSubnetResponse withClouddcnSubnet(ClouddcnSubnet clouddcnSubnet) {
        this.clouddcnSubnet = clouddcnSubnet;
        return this;
    }

    public UpdateClouddcnSubnetResponse withClouddcnSubnet(Consumer<ClouddcnSubnet> clouddcnSubnetSetter) {
        if (this.clouddcnSubnet == null) {
            this.clouddcnSubnet = new ClouddcnSubnet();
            clouddcnSubnetSetter.accept(this.clouddcnSubnet);
        }

        return this;
    }

    /**
     * Get clouddcnSubnet
     * @return clouddcnSubnet
     */
    public ClouddcnSubnet getClouddcnSubnet() {
        return clouddcnSubnet;
    }

    public void setClouddcnSubnet(ClouddcnSubnet clouddcnSubnet) {
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
        UpdateClouddcnSubnetResponse that = (UpdateClouddcnSubnetResponse) obj;
        return Objects.equals(this.clouddcnSubnet, that.clouddcnSubnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clouddcnSubnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClouddcnSubnetResponse {\n");
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
