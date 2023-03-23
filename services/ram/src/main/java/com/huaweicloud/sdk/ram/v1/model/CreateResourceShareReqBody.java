package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The request body of the CreateResourceShare operation.
 */
public class CreateResourceShareReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_ids")

    private List<String> permissionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principals")

    private List<String> principals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urns")

    private List<String> resourceUrns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateResourceShareReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源共享实例的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateResourceShareReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 资源共享实例的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateResourceShareReqBody withPermissionIds(List<String> permissionIds) {
        this.permissionIds = permissionIds;
        return this;
    }

    public CreateResourceShareReqBody addPermissionIdsItem(String permissionIdsItem) {
        if (this.permissionIds == null) {
            this.permissionIds = new ArrayList<>();
        }
        this.permissionIds.add(permissionIdsItem);
        return this;
    }

    public CreateResourceShareReqBody withPermissionIds(Consumer<List<String>> permissionIdsSetter) {
        if (this.permissionIds == null) {
            this.permissionIds = new ArrayList<>();
        }
        permissionIdsSetter.accept(this.permissionIds);
        return this;
    }

    /**
     * 资源共享实例关联的RAM权限列表。一种资源类型只能关联一个RAM权限。如果您没有指定权限ID，RAM将自动为每个资源类型关联默认权限。
     * @return permissionIds
     */
    public List<String> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<String> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public CreateResourceShareReqBody withPrincipals(List<String> principals) {
        this.principals = principals;
        return this;
    }

    public CreateResourceShareReqBody addPrincipalsItem(String principalsItem) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        this.principals.add(principalsItem);
        return this;
    }

    public CreateResourceShareReqBody withPrincipals(Consumer<List<String>> principalsSetter) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        principalsSetter.accept(this.principals);
        return this;
    }

    /**
     * 资源共享实例关联的一个或多个资源使用者的列表。
     * @return principals
     */
    public List<String> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<String> principals) {
        this.principals = principals;
    }

    public CreateResourceShareReqBody withResourceUrns(List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
        return this;
    }

    public CreateResourceShareReqBody addResourceUrnsItem(String resourceUrnsItem) {
        if (this.resourceUrns == null) {
            this.resourceUrns = new ArrayList<>();
        }
        this.resourceUrns.add(resourceUrnsItem);
        return this;
    }

    public CreateResourceShareReqBody withResourceUrns(Consumer<List<String>> resourceUrnsSetter) {
        if (this.resourceUrns == null) {
            this.resourceUrns = new ArrayList<>();
        }
        resourceUrnsSetter.accept(this.resourceUrns);
        return this;
    }

    /**
     * 资源共享实例关联的一个或多个共享资源URN的列表。
     * @return resourceUrns
     */
    public List<String> getResourceUrns() {
        return resourceUrns;
    }

    public void setResourceUrns(List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
    }

    public CreateResourceShareReqBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateResourceShareReqBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateResourceShareReqBody withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源共享标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResourceShareReqBody createResourceShareReqBody = (CreateResourceShareReqBody) o;
        return Objects.equals(this.name, createResourceShareReqBody.name)
            && Objects.equals(this.description, createResourceShareReqBody.description)
            && Objects.equals(this.permissionIds, createResourceShareReqBody.permissionIds)
            && Objects.equals(this.principals, createResourceShareReqBody.principals)
            && Objects.equals(this.resourceUrns, createResourceShareReqBody.resourceUrns)
            && Objects.equals(this.tags, createResourceShareReqBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, permissionIds, principals, resourceUrns, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceShareReqBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    permissionIds: ").append(toIndentedString(permissionIds)).append("\n");
        sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
        sb.append("    resourceUrns: ").append(toIndentedString(resourceUrns)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
