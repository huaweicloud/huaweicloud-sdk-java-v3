package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowDatamapLineageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private String instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_types")

    private List<String> relationshipTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_type_categories")

    private List<String> relationshipTypeCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_entity_types")

    private List<String> relatedEntityTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_process_data_flow")

    private Boolean extendProcessDataFlow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_parent_entity")

    private Boolean includeParentEntity;

    public ShowDatamapLineageRequest withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * 实例id
     * @return instance
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public ShowDatamapLineageRequest withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 资产guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public ShowDatamapLineageRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 血缘查询方向，默认值:BOTH。枚举值[IN OUT BOTH]
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ShowDatamapLineageRequest withRelationshipTypes(List<String> relationshipTypes) {
        this.relationshipTypes = relationshipTypes;
        return this;
    }

    public ShowDatamapLineageRequest addRelationshipTypesItem(String relationshipTypesItem) {
        if (this.relationshipTypes == null) {
            this.relationshipTypes = new ArrayList<>();
        }
        this.relationshipTypes.add(relationshipTypesItem);
        return this;
    }

    public ShowDatamapLineageRequest withRelationshipTypes(Consumer<List<String>> relationshipTypesSetter) {
        if (this.relationshipTypes == null) {
            this.relationshipTypes = new ArrayList<>();
        }
        relationshipTypesSetter.accept(this.relationshipTypes);
        return this;
    }

    /**
     * 关联关系类型列表，默认空
     * @return relationshipTypes
     */
    public List<String> getRelationshipTypes() {
        return relationshipTypes;
    }

    public void setRelationshipTypes(List<String> relationshipTypes) {
        this.relationshipTypes = relationshipTypes;
    }

    public ShowDatamapLineageRequest withRelationshipTypeCategories(List<String> relationshipTypeCategories) {
        this.relationshipTypeCategories = relationshipTypeCategories;
        return this;
    }

    public ShowDatamapLineageRequest addRelationshipTypeCategoriesItem(String relationshipTypeCategoriesItem) {
        if (this.relationshipTypeCategories == null) {
            this.relationshipTypeCategories = new ArrayList<>();
        }
        this.relationshipTypeCategories.add(relationshipTypeCategoriesItem);
        return this;
    }

    public ShowDatamapLineageRequest withRelationshipTypeCategories(
        Consumer<List<String>> relationshipTypeCategoriesSetter) {
        if (this.relationshipTypeCategories == null) {
            this.relationshipTypeCategories = new ArrayList<>();
        }
        relationshipTypeCategoriesSetter.accept(this.relationshipTypeCategories);
        return this;
    }

    /**
     * 关联关系类型类别，默认空。血缘查询使用DATA_FLOW
     * @return relationshipTypeCategories
     */
    public List<String> getRelationshipTypeCategories() {
        return relationshipTypeCategories;
    }

    public void setRelationshipTypeCategories(List<String> relationshipTypeCategories) {
        this.relationshipTypeCategories = relationshipTypeCategories;
    }

    public ShowDatamapLineageRequest withRelatedEntityTypes(List<String> relatedEntityTypes) {
        this.relatedEntityTypes = relatedEntityTypes;
        return this;
    }

    public ShowDatamapLineageRequest addRelatedEntityTypesItem(String relatedEntityTypesItem) {
        if (this.relatedEntityTypes == null) {
            this.relatedEntityTypes = new ArrayList<>();
        }
        this.relatedEntityTypes.add(relatedEntityTypesItem);
        return this;
    }

    public ShowDatamapLineageRequest withRelatedEntityTypes(Consumer<List<String>> relatedEntityTypesSetter) {
        if (this.relatedEntityTypes == null) {
            this.relatedEntityTypes = new ArrayList<>();
        }
        relatedEntityTypesSetter.accept(this.relatedEntityTypes);
        return this;
    }

    /**
     * 关联实体类型，默认空
     * @return relatedEntityTypes
     */
    public List<String> getRelatedEntityTypes() {
        return relatedEntityTypes;
    }

    public void setRelatedEntityTypes(List<String> relatedEntityTypes) {
        this.relatedEntityTypes = relatedEntityTypes;
    }

    public ShowDatamapLineageRequest withExtendProcessDataFlow(Boolean extendProcessDataFlow) {
        this.extendProcessDataFlow = extendProcessDataFlow;
        return this;
    }

    /**
     * 是否扩展数据，默认false
     * @return extendProcessDataFlow
     */
    public Boolean getExtendProcessDataFlow() {
        return extendProcessDataFlow;
    }

    public void setExtendProcessDataFlow(Boolean extendProcessDataFlow) {
        this.extendProcessDataFlow = extendProcessDataFlow;
    }

    public ShowDatamapLineageRequest withIncludeParentEntity(Boolean includeParentEntity) {
        this.includeParentEntity = includeParentEntity;
        return this;
    }

    /**
     * 是否包含父类实体，默认false
     * @return includeParentEntity
     */
    public Boolean getIncludeParentEntity() {
        return includeParentEntity;
    }

    public void setIncludeParentEntity(Boolean includeParentEntity) {
        this.includeParentEntity = includeParentEntity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatamapLineageRequest that = (ShowDatamapLineageRequest) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.relationshipTypes, that.relationshipTypes)
            && Objects.equals(this.relationshipTypeCategories, that.relationshipTypeCategories)
            && Objects.equals(this.relatedEntityTypes, that.relatedEntityTypes)
            && Objects.equals(this.extendProcessDataFlow, that.extendProcessDataFlow)
            && Objects.equals(this.includeParentEntity, that.includeParentEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance,
            guid,
            direction,
            relationshipTypes,
            relationshipTypeCategories,
            relatedEntityTypes,
            extendProcessDataFlow,
            includeParentEntity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatamapLineageRequest {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    relationshipTypes: ").append(toIndentedString(relationshipTypes)).append("\n");
        sb.append("    relationshipTypeCategories: ").append(toIndentedString(relationshipTypeCategories)).append("\n");
        sb.append("    relatedEntityTypes: ").append(toIndentedString(relatedEntityTypes)).append("\n");
        sb.append("    extendProcessDataFlow: ").append(toIndentedString(extendProcessDataFlow)).append("\n");
        sb.append("    includeParentEntity: ").append(toIndentedString(includeParentEntity)).append("\n");
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
