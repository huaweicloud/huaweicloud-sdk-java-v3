package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListViewResponseBodyData
 */
public class ListViewResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_domain_id")

    private String managerDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit_ids")

    private List<String> organizationUnitIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<String> resourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_type")

    private String viewType;

    public ListViewResponseBodyData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 资源视图id。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListViewResponseBodyData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 资源视图名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListViewResponseBodyData withManagerDomainId(String managerDomainId) {
        this.managerDomainId = managerDomainId;
        return this;
    }

    /**
     * **参数解释：** 视图创建者的domainId，视图资源聚合的归属者。 **取值范围：** 不涉及。
     * @return managerDomainId
     */
    public String getManagerDomainId() {
        return managerDomainId;
    }

    public void setManagerDomainId(String managerDomainId) {
        this.managerDomainId = managerDomainId;
    }

    public ListViewResponseBodyData withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * **参数解释：** 视图归属的组织id。 **取值范围：** 不涉及。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public ListViewResponseBodyData withOrganizationUnitIds(List<String> organizationUnitIds) {
        this.organizationUnitIds = organizationUnitIds;
        return this;
    }

    public ListViewResponseBodyData addOrganizationUnitIdsItem(String organizationUnitIdsItem) {
        if (this.organizationUnitIds == null) {
            this.organizationUnitIds = new ArrayList<>();
        }
        this.organizationUnitIds.add(organizationUnitIdsItem);
        return this;
    }

    public ListViewResponseBodyData withOrganizationUnitIds(Consumer<List<String>> organizationUnitIdsSetter) {
        if (this.organizationUnitIds == null) {
            this.organizationUnitIds = new ArrayList<>();
        }
        organizationUnitIdsSetter.accept(this.organizationUnitIds);
        return this;
    }

    /**
     * **参数解释：** 视图所聚合的组织单元id列表。 **取值范围：** 不涉及。
     * @return organizationUnitIds
     */
    public List<String> getOrganizationUnitIds() {
        return organizationUnitIds;
    }

    public void setOrganizationUnitIds(List<String> organizationUnitIds) {
        this.organizationUnitIds = organizationUnitIds;
    }

    public ListViewResponseBodyData withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public ListViewResponseBodyData addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public ListViewResponseBodyData withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * **参数解释：** 视图包含的租户账号id列表。 **取值范围：** 不涉及。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public ListViewResponseBodyData withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public ListViewResponseBodyData addResourceTypesItem(String resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public ListViewResponseBodyData withResourceTypes(Consumer<List<String>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * **参数解释：** 视图包含的资源类型列表。 **取值范围：** 不涉及。
     * @return resourceTypes
     */
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public ListViewResponseBodyData withViewType(String viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * **参数解释：** 视图类型。 **取值范围：** 不涉及。
     * @return viewType
     */
    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListViewResponseBodyData that = (ListViewResponseBodyData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.managerDomainId, that.managerDomainId)
            && Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.organizationUnitIds, that.organizationUnitIds)
            && Objects.equals(this.domainIds, that.domainIds) && Objects.equals(this.resourceTypes, that.resourceTypes)
            && Objects.equals(this.viewType, that.viewType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, managerDomainId, organizationId, organizationUnitIds, domainIds, resourceTypes, viewType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListViewResponseBodyData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    managerDomainId: ").append(toIndentedString(managerDomainId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    organizationUnitIds: ").append(toIndentedString(organizationUnitIds)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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
