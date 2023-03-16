package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateOrganizationalUnit操作的请求体。
 */
public class CreateOrganizationalUnitReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagDto> tags = null;

    public CreateOrganizationalUnitReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 要分配给新组织单元的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOrganizationalUnitReqBody withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 要在其中创建新组织单元的根或组织单元的唯一标识符。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CreateOrganizationalUnitReqBody withTags(List<TagDto> tags) {
        this.tags = tags;
        return this;
    }

    public CreateOrganizationalUnitReqBody addTagsItem(TagDto tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateOrganizationalUnitReqBody withTags(Consumer<List<TagDto>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 要附加到新创建的组织单元的标签列表。
     * @return tags
     */
    public List<TagDto> getTags() {
        return tags;
    }

    public void setTags(List<TagDto> tags) {
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
        CreateOrganizationalUnitReqBody createOrganizationalUnitReqBody = (CreateOrganizationalUnitReqBody) o;
        return Objects.equals(this.name, createOrganizationalUnitReqBody.name)
            && Objects.equals(this.parentId, createOrganizationalUnitReqBody.parentId)
            && Objects.equals(this.tags, createOrganizationalUnitReqBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parentId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrganizationalUnitReqBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
