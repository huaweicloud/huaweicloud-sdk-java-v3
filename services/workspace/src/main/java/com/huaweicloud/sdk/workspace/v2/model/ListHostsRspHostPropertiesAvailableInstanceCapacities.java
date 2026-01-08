package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListHostsRspHostPropertiesAvailableInstanceCapacities
 */
public class ListHostsRspHostPropertiesAvailableInstanceCapacities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    public ListHostsRspHostPropertiesAvailableInstanceCapacities withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 规格id。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHostsRspHostPropertiesAvailableInstanceCapacities that =
            (ListHostsRspHostPropertiesAvailableInstanceCapacities) obj;
        return Objects.equals(this.flavor, that.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsRspHostPropertiesAvailableInstanceCapacities {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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
