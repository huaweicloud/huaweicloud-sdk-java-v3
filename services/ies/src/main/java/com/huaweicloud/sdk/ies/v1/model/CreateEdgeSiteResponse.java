package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateEdgeSiteResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_site")

    private EdgeSiteDetail edgeSite;

    public CreateEdgeSiteResponse withEdgeSite(EdgeSiteDetail edgeSite) {
        this.edgeSite = edgeSite;
        return this;
    }

    public CreateEdgeSiteResponse withEdgeSite(Consumer<EdgeSiteDetail> edgeSiteSetter) {
        if (this.edgeSite == null) {
            this.edgeSite = new EdgeSiteDetail();
            edgeSiteSetter.accept(this.edgeSite);
        }

        return this;
    }

    /**
     * Get edgeSite
     * @return edgeSite
     */
    public EdgeSiteDetail getEdgeSite() {
        return edgeSite;
    }

    public void setEdgeSite(EdgeSiteDetail edgeSite) {
        this.edgeSite = edgeSite;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEdgeSiteResponse createEdgeSiteResponse = (CreateEdgeSiteResponse) o;
        return Objects.equals(this.edgeSite, createEdgeSiteResponse.edgeSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeSite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeSiteResponse {\n");
        sb.append("    edgeSite: ").append(toIndentedString(edgeSite)).append("\n");
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
