package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LineageRelation
 */
public class LineageRelation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_entity_id")

    private String fromEntityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_id")

    private String relationshipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_entity_id")

    private String toEntityId;

    public LineageRelation withFromEntityId(String fromEntityId) {
        this.fromEntityId = fromEntityId;
        return this;
    }

    /**
     * 血缘来源
     * @return fromEntityId
     */
    public String getFromEntityId() {
        return fromEntityId;
    }

    public void setFromEntityId(String fromEntityId) {
        this.fromEntityId = fromEntityId;
    }

    public LineageRelation withRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
        return this;
    }

    /**
     * 关系id
     * @return relationshipId
     */
    public String getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(String relationshipId) {
        this.relationshipId = relationshipId;
    }

    public LineageRelation withToEntityId(String toEntityId) {
        this.toEntityId = toEntityId;
        return this;
    }

    /**
     * 血缘流向
     * @return toEntityId
     */
    public String getToEntityId() {
        return toEntityId;
    }

    public void setToEntityId(String toEntityId) {
        this.toEntityId = toEntityId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineageRelation that = (LineageRelation) obj;
        return Objects.equals(this.fromEntityId, that.fromEntityId)
            && Objects.equals(this.relationshipId, that.relationshipId)
            && Objects.equals(this.toEntityId, that.toEntityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromEntityId, relationshipId, toEntityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineageRelation {\n");
        sb.append("    fromEntityId: ").append(toIndentedString(fromEntityId)).append("\n");
        sb.append("    relationshipId: ").append(toIndentedString(relationshipId)).append("\n");
        sb.append("    toEntityId: ").append(toIndentedString(toEntityId)).append("\n");
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
