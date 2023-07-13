package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateEdgeSiteRequestBody
 */
public class CreateEdgeSiteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_site")

    private CreateEdgeSite edgeSite;

    public CreateEdgeSiteRequestBody withEdgeSite(CreateEdgeSite edgeSite) {
        this.edgeSite = edgeSite;
        return this;
    }

    public CreateEdgeSiteRequestBody withEdgeSite(Consumer<CreateEdgeSite> edgeSiteSetter) {
        if (this.edgeSite == null) {
            this.edgeSite = new CreateEdgeSite();
            edgeSiteSetter.accept(this.edgeSite);
        }

        return this;
    }

    /**
     * Get edgeSite
     * @return edgeSite
     */
    public CreateEdgeSite getEdgeSite() {
        return edgeSite;
    }

    public void setEdgeSite(CreateEdgeSite edgeSite) {
        this.edgeSite = edgeSite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEdgeSiteRequestBody that = (CreateEdgeSiteRequestBody) obj;
        return Objects.equals(this.edgeSite, that.edgeSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeSite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeSiteRequestBody {\n");
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
