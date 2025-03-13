package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtendedAvailabilityZone
 */
public class ExtendedAvailabilityZone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_specs")

    private List<AvailableSpec> availableSpecs = null;

    public ExtendedAvailabilityZone withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 可用区名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtendedAvailabilityZone withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 公共边界组
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ExtendedAvailabilityZone withAvailableSpecs(List<AvailableSpec> availableSpecs) {
        this.availableSpecs = availableSpecs;
        return this;
    }

    public ExtendedAvailabilityZone addAvailableSpecsItem(AvailableSpec availableSpecsItem) {
        if (this.availableSpecs == null) {
            this.availableSpecs = new ArrayList<>();
        }
        this.availableSpecs.add(availableSpecsItem);
        return this;
    }

    public ExtendedAvailabilityZone withAvailableSpecs(Consumer<List<AvailableSpec>> availableSpecsSetter) {
        if (this.availableSpecs == null) {
            this.availableSpecs = new ArrayList<>();
        }
        availableSpecsSetter.accept(this.availableSpecs);
        return this;
    }

    /**
     * Get availableSpecs
     * @return availableSpecs
     */
    public List<AvailableSpec> getAvailableSpecs() {
        return availableSpecs;
    }

    public void setAvailableSpecs(List<AvailableSpec> availableSpecs) {
        this.availableSpecs = availableSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendedAvailabilityZone that = (ExtendedAvailabilityZone) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.availableSpecs, that.availableSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicBorderGroup, availableSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendedAvailabilityZone {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    availableSpecs: ").append(toIndentedString(availableSpecs)).append("\n");
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
