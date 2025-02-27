package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResRelation
 */
public class ResRelation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_resource_id")

    private String selfResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_infos")

    private List<RelationInfo> relationInfos = null;

    public ResRelation withSelfResourceId(String selfResourceId) {
        this.selfResourceId = selfResourceId;
        return this;
    }

    /**
     * |参数名称：当前费用对应的资源ID| |参数约束及描述：当前费用对应的资源ID|
     * @return selfResourceId
     */
    public String getSelfResourceId() {
        return selfResourceId;
    }

    public void setSelfResourceId(String selfResourceId) {
        this.selfResourceId = selfResourceId;
    }

    public ResRelation withRelationInfos(List<RelationInfo> relationInfos) {
        this.relationInfos = relationInfos;
        return this;
    }

    public ResRelation addRelationInfosItem(RelationInfo relationInfosItem) {
        if (this.relationInfos == null) {
            this.relationInfos = new ArrayList<>();
        }
        this.relationInfos.add(relationInfosItem);
        return this;
    }

    public ResRelation withRelationInfos(Consumer<List<RelationInfo>> relationInfosSetter) {
        if (this.relationInfos == null) {
            this.relationInfos = new ArrayList<>();
        }
        relationInfosSetter.accept(this.relationInfos);
        return this;
    }

    /**
     * |参数名称：当前费用对应资源ID关联的资源信息。| |参数约束及描述：当前费用对应资源ID关联的资源信息，数组个数不超过2层|
     * @return relationInfos
     */
    public List<RelationInfo> getRelationInfos() {
        return relationInfos;
    }

    public void setRelationInfos(List<RelationInfo> relationInfos) {
        this.relationInfos = relationInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResRelation that = (ResRelation) obj;
        return Objects.equals(this.selfResourceId, that.selfResourceId)
            && Objects.equals(this.relationInfos, that.relationInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selfResourceId, relationInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResRelation {\n");
        sb.append("    selfResourceId: ").append(toIndentedString(selfResourceId)).append("\n");
        sb.append("    relationInfos: ").append(toIndentedString(relationInfos)).append("\n");
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
