package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The request body of AssociateResourceShare and DisassociateResourceShare operations.
 */
public class ResourceShareAssociationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principals")

    private List<String> principals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urns")

    private List<String> resourceUrns = null;

    public ResourceShareAssociationReqBody withPrincipals(List<String> principals) {
        this.principals = principals;
        return this;
    }

    public ResourceShareAssociationReqBody addPrincipalsItem(String principalsItem) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        this.principals.add(principalsItem);
        return this;
    }

    public ResourceShareAssociationReqBody withPrincipals(Consumer<List<String>> principalsSetter) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        principalsSetter.accept(this.principals);
        return this;
    }

    /**
     * 指定与资源共享实例关联的一个或多个资源使用者的列表。
     * @return principals
     */
    public List<String> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<String> principals) {
        this.principals = principals;
    }

    public ResourceShareAssociationReqBody withResourceUrns(List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
        return this;
    }

    public ResourceShareAssociationReqBody addResourceUrnsItem(String resourceUrnsItem) {
        if (this.resourceUrns == null) {
            this.resourceUrns = new ArrayList<>();
        }
        this.resourceUrns.add(resourceUrnsItem);
        return this;
    }

    public ResourceShareAssociationReqBody withResourceUrns(Consumer<List<String>> resourceUrnsSetter) {
        if (this.resourceUrns == null) {
            this.resourceUrns = new ArrayList<>();
        }
        resourceUrnsSetter.accept(this.resourceUrns);
        return this;
    }

    /**
     * 指定与资源共享实例关联的一个或多个共享资源URN的列表。
     * @return resourceUrns
     */
    public List<String> getResourceUrns() {
        return resourceUrns;
    }

    public void setResourceUrns(List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceShareAssociationReqBody that = (ResourceShareAssociationReqBody) obj;
        return Objects.equals(this.principals, that.principals) && Objects.equals(this.resourceUrns, that.resourceUrns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principals, resourceUrns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceShareAssociationReqBody {\n");
        sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
        sb.append("    resourceUrns: ").append(toIndentedString(resourceUrns)).append("\n");
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
