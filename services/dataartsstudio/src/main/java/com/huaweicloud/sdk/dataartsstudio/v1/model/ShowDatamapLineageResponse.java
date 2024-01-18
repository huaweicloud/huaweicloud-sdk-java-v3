package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDatamapLineageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationships")

    private List<Lineage> relationships = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_types")

    private Object relationshipTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<Entity> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_types")

    private Object entityTypes;

    public ShowDatamapLineageResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 查询命中总条数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShowDatamapLineageResponse withRelationships(List<Lineage> relationships) {
        this.relationships = relationships;
        return this;
    }

    public ShowDatamapLineageResponse addRelationshipsItem(Lineage relationshipsItem) {
        if (this.relationships == null) {
            this.relationships = new ArrayList<>();
        }
        this.relationships.add(relationshipsItem);
        return this;
    }

    public ShowDatamapLineageResponse withRelationships(Consumer<List<Lineage>> relationshipsSetter) {
        if (this.relationships == null) {
            this.relationships = new ArrayList<>();
        }
        relationshipsSetter.accept(this.relationships);
        return this;
    }

    /**
     * 关系列表
     * @return relationships
     */
    public List<Lineage> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Lineage> relationships) {
        this.relationships = relationships;
    }

    public ShowDatamapLineageResponse withRelationshipTypes(Object relationshipTypes) {
        this.relationshipTypes = relationshipTypes;
        return this;
    }

    /**
     * 关系类型
     * @return relationshipTypes
     */
    public Object getRelationshipTypes() {
        return relationshipTypes;
    }

    public void setRelationshipTypes(Object relationshipTypes) {
        this.relationshipTypes = relationshipTypes;
    }

    public ShowDatamapLineageResponse withEntities(List<Entity> entities) {
        this.entities = entities;
        return this;
    }

    public ShowDatamapLineageResponse addEntitiesItem(Entity entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ShowDatamapLineageResponse withEntities(Consumer<List<Entity>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 资产信息
     * @return entities
     */
    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public ShowDatamapLineageResponse withEntityTypes(Object entityTypes) {
        this.entityTypes = entityTypes;
        return this;
    }

    /**
     * 实体类型
     * @return entityTypes
     */
    public Object getEntityTypes() {
        return entityTypes;
    }

    public void setEntityTypes(Object entityTypes) {
        this.entityTypes = entityTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatamapLineageResponse that = (ShowDatamapLineageResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.relationships, that.relationships)
            && Objects.equals(this.relationshipTypes, that.relationshipTypes)
            && Objects.equals(this.entities, that.entities) && Objects.equals(this.entityTypes, that.entityTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, relationships, relationshipTypes, entities, entityTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatamapLineageResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
        sb.append("    relationshipTypes: ").append(toIndentedString(relationshipTypes)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
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
