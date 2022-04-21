package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BindingVifDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_interface")

    private Boolean primaryInterface;

    public BindingVifDetails withPrimaryInterface(Boolean primaryInterface) {
        this.primaryInterface = primaryInterface;
        return this;
    }

    /**
     * 功能说明：取值为true，表示是虚拟机的主网卡。
     * @return primaryInterface
     */
    public Boolean getPrimaryInterface() {
        return primaryInterface;
    }

    public void setPrimaryInterface(Boolean primaryInterface) {
        this.primaryInterface = primaryInterface;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BindingVifDetails bindingVifDetails = (BindingVifDetails) o;
        return Objects.equals(this.primaryInterface, bindingVifDetails.primaryInterface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryInterface);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindingVifDetails {\n");
        sb.append("    primaryInterface: ").append(toIndentedString(primaryInterface)).append("\n");
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
