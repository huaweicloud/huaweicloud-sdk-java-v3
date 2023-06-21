package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产详情
 */
public class EntityWithExtInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private AtlasAssetEntity entity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referred_entities")

    private Object referredEntities;

    public EntityWithExtInfo withEntity(AtlasAssetEntity entity) {
        this.entity = entity;
        return this;
    }

    public EntityWithExtInfo withEntity(Consumer<AtlasAssetEntity> entitySetter) {
        if (this.entity == null) {
            this.entity = new AtlasAssetEntity();
            entitySetter.accept(this.entity);
        }

        return this;
    }

    /**
     * Get entity
     * @return entity
     */
    public AtlasAssetEntity getEntity() {
        return entity;
    }

    public void setEntity(AtlasAssetEntity entity) {
        this.entity = entity;
    }

    public EntityWithExtInfo withReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

    /**
     * 关联资产map Map<String, AtlasAssetEntity>
     * @return referredEntities
     */
    public Object getReferredEntities() {
        return referredEntities;
    }

    public void setReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityWithExtInfo entityWithExtInfo = (EntityWithExtInfo) o;
        return Objects.equals(this.entity, entityWithExtInfo.entity)
            && Objects.equals(this.referredEntities, entityWithExtInfo.referredEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, referredEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityWithExtInfo {\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    referredEntities: ").append(toIndentedString(referredEntities)).append("\n");
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
