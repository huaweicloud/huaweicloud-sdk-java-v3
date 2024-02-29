package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产详情
 */
public class DataEntityWithExtInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private Entity entity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referred_entities")

    private Object referredEntities;

    public DataEntityWithExtInfo withEntity(Entity entity) {
        this.entity = entity;
        return this;
    }

    public DataEntityWithExtInfo withEntity(Consumer<Entity> entitySetter) {
        if (this.entity == null) {
            this.entity = new Entity();
            entitySetter.accept(this.entity);
        }

        return this;
    }

    /**
     * Get entity
     * @return entity
     */
    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public DataEntityWithExtInfo withReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

    /**
     * 关联资产信息，结构体Map<String, Entity>
     * @return referredEntities
     */
    public Object getReferredEntities() {
        return referredEntities;
    }

    public void setReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataEntityWithExtInfo that = (DataEntityWithExtInfo) obj;
        return Objects.equals(this.entity, that.entity) && Objects.equals(this.referredEntities, that.referredEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, referredEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataEntityWithExtInfo {\n");
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
