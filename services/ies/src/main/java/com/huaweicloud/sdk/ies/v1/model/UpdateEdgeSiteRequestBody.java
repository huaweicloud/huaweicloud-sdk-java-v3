package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEdgeSiteRequestBody
 */
public class UpdateEdgeSiteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_site")

    @JacksonXmlProperty(localName = "edge_site")

    private UpdateEdgeSite edgeSite;

    public UpdateEdgeSiteRequestBody withEdgeSite(UpdateEdgeSite edgeSite) {
        this.edgeSite = edgeSite;
        return this;
    }

    public UpdateEdgeSiteRequestBody withEdgeSite(Consumer<UpdateEdgeSite> edgeSiteSetter) {
        if (this.edgeSite == null) {
            this.edgeSite = new UpdateEdgeSite();
            edgeSiteSetter.accept(this.edgeSite);
        }

        return this;
    }

    /**
     * Get edgeSite
     * @return edgeSite
     */
    public UpdateEdgeSite getEdgeSite() {
        return edgeSite;
    }

    public void setEdgeSite(UpdateEdgeSite edgeSite) {
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
        UpdateEdgeSiteRequestBody updateEdgeSiteRequestBody = (UpdateEdgeSiteRequestBody) o;
        return Objects.equals(this.edgeSite, updateEdgeSiteRequestBody.edgeSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeSite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeSiteRequestBody {\n");
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
