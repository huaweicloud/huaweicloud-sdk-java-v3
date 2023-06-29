package com.huaweicloud.sdk.rds.v3.model;

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
public class ListDrRelationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_dr_relations")

    private List<InstanceDrRelation> instanceDrRelations = null;

    public ListDrRelationsResponse withInstanceDrRelations(List<InstanceDrRelation> instanceDrRelations) {
        this.instanceDrRelations = instanceDrRelations;
        return this;
    }

    public ListDrRelationsResponse addInstanceDrRelationsItem(InstanceDrRelation instanceDrRelationsItem) {
        if (this.instanceDrRelations == null) {
            this.instanceDrRelations = new ArrayList<>();
        }
        this.instanceDrRelations.add(instanceDrRelationsItem);
        return this;
    }

    public ListDrRelationsResponse withInstanceDrRelations(
        Consumer<List<InstanceDrRelation>> instanceDrRelationsSetter) {
        if (this.instanceDrRelations == null) {
            this.instanceDrRelations = new ArrayList<>();
        }
        instanceDrRelationsSetter.accept(this.instanceDrRelations);
        return this;
    }

    /**
     * Get instanceDrRelations
     * @return instanceDrRelations
     */
    public List<InstanceDrRelation> getInstanceDrRelations() {
        return instanceDrRelations;
    }

    public void setInstanceDrRelations(List<InstanceDrRelation> instanceDrRelations) {
        this.instanceDrRelations = instanceDrRelations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDrRelationsResponse that = (ListDrRelationsResponse) obj;
        return Objects.equals(this.instanceDrRelations, that.instanceDrRelations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceDrRelations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDrRelationsResponse {\n");
        sb.append("    instanceDrRelations: ").append(toIndentedString(instanceDrRelations)).append("\n");
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
