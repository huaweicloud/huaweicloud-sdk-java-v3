package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AvailableResourceResp
 */
public class AvailableResourceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<FlavorResource> flavors = null;

    public AvailableResourceResp withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get availabilityZone
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public AvailableResourceResp withFlavors(List<FlavorResource> flavors) {
        this.flavors = flavors;
        return this;
    }

    public AvailableResourceResp addFlavorsItem(FlavorResource flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public AvailableResourceResp withFlavors(Consumer<List<FlavorResource>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * Get flavors
     * @return flavors
     */
    public List<FlavorResource> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<FlavorResource> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailableResourceResp that = (AvailableResourceResp) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.flavors, that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableResourceResp {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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
