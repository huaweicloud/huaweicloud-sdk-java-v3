package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterFlavorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private ClusterFlavorDetailInfo flavor;

    public ShowClusterFlavorResponse withFlavor(ClusterFlavorDetailInfo flavor) {
        this.flavor = flavor;
        return this;
    }

    public ShowClusterFlavorResponse withFlavor(Consumer<ClusterFlavorDetailInfo> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ClusterFlavorDetailInfo();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public ClusterFlavorDetailInfo getFlavor() {
        return flavor;
    }

    public void setFlavor(ClusterFlavorDetailInfo flavor) {
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
        ShowClusterFlavorResponse that = (ShowClusterFlavorResponse) obj;
        return Objects.equals(this.flavor, that.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterFlavorResponse {\n");
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
