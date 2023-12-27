package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLineageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_entity_guid")

    private String baseEntityGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid_entity_map")

    private Object guidEntityMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relations")

    private List<LineageRelation> relations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referred_entities")

    private Object referredEntities;

    public ShowLineageResponse withBaseEntityGuid(String baseEntityGuid) {
        this.baseEntityGuid = baseEntityGuid;
        return this;
    }

    /**
     * 当前资产的guid
     * @return baseEntityGuid
     */
    public String getBaseEntityGuid() {
        return baseEntityGuid;
    }

    public void setBaseEntityGuid(String baseEntityGuid) {
        this.baseEntityGuid = baseEntityGuid;
    }

    public ShowLineageResponse withGuidEntityMap(Object guidEntityMap) {
        this.guidEntityMap = guidEntityMap;
        return this;
    }

    /**
     * 实体集合Map(String, OpenEntityHeader)
     * @return guidEntityMap
     */
    public Object getGuidEntityMap() {
        return guidEntityMap;
    }

    public void setGuidEntityMap(Object guidEntityMap) {
        this.guidEntityMap = guidEntityMap;
    }

    public ShowLineageResponse withRelations(List<LineageRelation> relations) {
        this.relations = relations;
        return this;
    }

    public ShowLineageResponse addRelationsItem(LineageRelation relationsItem) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        this.relations.add(relationsItem);
        return this;
    }

    public ShowLineageResponse withRelations(Consumer<List<LineageRelation>> relationsSetter) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * 血缘关系
     * @return relations
     */
    public List<LineageRelation> getRelations() {
        return relations;
    }

    public void setRelations(List<LineageRelation> relations) {
        this.relations = relations;
    }

    public ShowLineageResponse withReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

    /**
     * 相关实体集合Map(String, OpenEntity)
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
        ShowLineageResponse that = (ShowLineageResponse) obj;
        return Objects.equals(this.baseEntityGuid, that.baseEntityGuid)
            && Objects.equals(this.guidEntityMap, that.guidEntityMap) && Objects.equals(this.relations, that.relations)
            && Objects.equals(this.referredEntities, that.referredEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseEntityGuid, guidEntityMap, relations, referredEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLineageResponse {\n");
        sb.append("    baseEntityGuid: ").append(toIndentedString(baseEntityGuid)).append("\n");
        sb.append("    guidEntityMap: ").append(toIndentedString(guidEntityMap)).append("\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
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
