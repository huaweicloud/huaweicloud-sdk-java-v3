package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AssociateResourceShareResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_associations")

    private List<ResourceShareAssociation> resourceShareAssociations = null;

    public AssociateResourceShareResponse withResourceShareAssociations(
        List<ResourceShareAssociation> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
        return this;
    }

    public AssociateResourceShareResponse addResourceShareAssociationsItem(
        ResourceShareAssociation resourceShareAssociationsItem) {
        if (this.resourceShareAssociations == null) {
            this.resourceShareAssociations = new ArrayList<>();
        }
        this.resourceShareAssociations.add(resourceShareAssociationsItem);
        return this;
    }

    public AssociateResourceShareResponse withResourceShareAssociations(
        Consumer<List<ResourceShareAssociation>> resourceShareAssociationsSetter) {
        if (this.resourceShareAssociations == null) {
            this.resourceShareAssociations = new ArrayList<>();
        }
        resourceShareAssociationsSetter.accept(this.resourceShareAssociations);
        return this;
    }

    /**
     * Get resourceShareAssociations
     * @return resourceShareAssociations
     */
    public List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    public void setResourceShareAssociations(List<ResourceShareAssociation> resourceShareAssociations) {
        this.resourceShareAssociations = resourceShareAssociations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateResourceShareResponse that = (AssociateResourceShareResponse) obj;
        return Objects.equals(this.resourceShareAssociations, that.resourceShareAssociations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareAssociations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateResourceShareResponse {\n");
        sb.append("    resourceShareAssociations: ").append(toIndentedString(resourceShareAssociations)).append("\n");
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
