package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EntityInfo
 */
public class EntityInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_name")

    private String entityName;

    public EntityInfo withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * **参数解释：** 组ID或节点ID。 **取值范围：** 不涉及。
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public EntityInfo withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * **参数解释：** 组名称或节点名称。 **取值范围：** 不涉及。
     * @return entityName
     */
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EntityInfo that = (EntityInfo) obj;
        return Objects.equals(this.entityId, that.entityId) && Objects.equals(this.entityName, that.entityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityId, entityName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityInfo {\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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
