package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateResourceViewsRequestBody
 */
public class CreateResourceViewsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit_ids")

    private List<String> organizationUnitIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<String> resourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_type")

    private String viewType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CreateResourceViewsRequestBody withOrganizationUnitIds(List<String> organizationUnitIds) {
        this.organizationUnitIds = organizationUnitIds;
        return this;
    }

    public CreateResourceViewsRequestBody addOrganizationUnitIdsItem(String organizationUnitIdsItem) {
        if (this.organizationUnitIds == null) {
            this.organizationUnitIds = new ArrayList<>();
        }
        this.organizationUnitIds.add(organizationUnitIdsItem);
        return this;
    }

    public CreateResourceViewsRequestBody withOrganizationUnitIds(Consumer<List<String>> organizationUnitIdsSetter) {
        if (this.organizationUnitIds == null) {
            this.organizationUnitIds = new ArrayList<>();
        }
        organizationUnitIdsSetter.accept(this.organizationUnitIds);
        return this;
    }

    /**
     * **参数解释：** 组织单元id。 **约束限制：** 不涉及。 **取值范围：** 自定义，视图所聚合的组织单元id列表。 **默认取值：** 不涉及。
     * @return organizationUnitIds
     */
    public List<String> getOrganizationUnitIds() {
        return organizationUnitIds;
    }

    public void setOrganizationUnitIds(List<String> organizationUnitIds) {
        this.organizationUnitIds = organizationUnitIds;
    }

    public CreateResourceViewsRequestBody withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public CreateResourceViewsRequestBody addResourceTypesItem(String resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public CreateResourceViewsRequestBody withResourceTypes(Consumer<List<String>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * **参数解释：** 资源类型列表。 **约束限制：** 不涉及。 **取值范围：** 自定义，用户创建视图时，选择的资源，资源对应类别组合成资源类型列表。 **默认取值：** 不涉及。
     * @return resourceTypes
     */
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public CreateResourceViewsRequestBody withViewType(String viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * **参数解释：** 视图类型。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return viewType
     */
    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public CreateResourceViewsRequestBody withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * **参数解释：** 组织ID。 **约束限制：** 不涉及。 **取值范围：** 视图归属的组织id。 **默认取值：** 不涉及。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public CreateResourceViewsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 视图名称。 **约束限制：** 不涉及。 **取值范围：** 用户自定义编辑。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResourceViewsRequestBody that = (CreateResourceViewsRequestBody) obj;
        return Objects.equals(this.organizationUnitIds, that.organizationUnitIds)
            && Objects.equals(this.resourceTypes, that.resourceTypes) && Objects.equals(this.viewType, that.viewType)
            && Objects.equals(this.organizationId, that.organizationId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationUnitIds, resourceTypes, viewType, organizationId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceViewsRequestBody {\n");
        sb.append("    organizationUnitIds: ").append(toIndentedString(organizationUnitIds)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
