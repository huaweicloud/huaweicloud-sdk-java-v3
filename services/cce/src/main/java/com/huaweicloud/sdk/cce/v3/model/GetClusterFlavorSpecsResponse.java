package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetClusterFlavorSpecsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterFlavorSpecs")

    private ClusterFlavorSpecification clusterFlavorSpecs;

    public GetClusterFlavorSpecsResponse withClusterFlavorSpecs(ClusterFlavorSpecification clusterFlavorSpecs) {
        this.clusterFlavorSpecs = clusterFlavorSpecs;
        return this;
    }

    public GetClusterFlavorSpecsResponse withClusterFlavorSpecs(
        Consumer<ClusterFlavorSpecification> clusterFlavorSpecsSetter) {
        if (this.clusterFlavorSpecs == null) {
            this.clusterFlavorSpecs = new ClusterFlavorSpecification();
            clusterFlavorSpecsSetter.accept(this.clusterFlavorSpecs);
        }

        return this;
    }

    /**
     * Get clusterFlavorSpecs
     * @return clusterFlavorSpecs
     */
    public ClusterFlavorSpecification getClusterFlavorSpecs() {
        return clusterFlavorSpecs;
    }

    public void setClusterFlavorSpecs(ClusterFlavorSpecification clusterFlavorSpecs) {
        this.clusterFlavorSpecs = clusterFlavorSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetClusterFlavorSpecsResponse that = (GetClusterFlavorSpecsResponse) obj;
        return Objects.equals(this.clusterFlavorSpecs, that.clusterFlavorSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterFlavorSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClusterFlavorSpecsResponse {\n");
        sb.append("    clusterFlavorSpecs: ").append(toIndentedString(clusterFlavorSpecs)).append("\n");
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
