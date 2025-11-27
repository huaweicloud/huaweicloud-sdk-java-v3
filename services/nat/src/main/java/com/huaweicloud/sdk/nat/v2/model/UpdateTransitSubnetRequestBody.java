package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateTransitSubnetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_subnet")

    private UpdateTransitSubnetOption transitSubnet;

    public UpdateTransitSubnetRequestBody withTransitSubnet(UpdateTransitSubnetOption transitSubnet) {
        this.transitSubnet = transitSubnet;
        return this;
    }

    public UpdateTransitSubnetRequestBody withTransitSubnet(Consumer<UpdateTransitSubnetOption> transitSubnetSetter) {
        if (this.transitSubnet == null) {
            this.transitSubnet = new UpdateTransitSubnetOption();
            transitSubnetSetter.accept(this.transitSubnet);
        }

        return this;
    }

    /**
     * Get transitSubnet
     * @return transitSubnet
     */
    public UpdateTransitSubnetOption getTransitSubnet() {
        return transitSubnet;
    }

    public void setTransitSubnet(UpdateTransitSubnetOption transitSubnet) {
        this.transitSubnet = transitSubnet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTransitSubnetRequestBody that = (UpdateTransitSubnetRequestBody) obj;
        return Objects.equals(this.transitSubnet, that.transitSubnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitSubnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTransitSubnetRequestBody {\n");
        sb.append("    transitSubnet: ").append(toIndentedString(transitSubnet)).append("\n");
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
