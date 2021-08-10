package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ResourceRelation */
public class ResourceRelation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private String relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_resource_type")

    private String fromResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_resource_type")

    private String toResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_resource_id")

    private String fromResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_resource_id")

    private String toResourceId;

    public ResourceRelation withRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }

    /** 关系类型
     * 
     * @return relationType */
    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public ResourceRelation withFromResourceType(String fromResourceType) {
        this.fromResourceType = fromResourceType;
        return this;
    }

    /** 源资源类型
     * 
     * @return fromResourceType */
    public String getFromResourceType() {
        return fromResourceType;
    }

    public void setFromResourceType(String fromResourceType) {
        this.fromResourceType = fromResourceType;
    }

    public ResourceRelation withToResourceType(String toResourceType) {
        this.toResourceType = toResourceType;
        return this;
    }

    /** 目的资源类型
     * 
     * @return toResourceType */
    public String getToResourceType() {
        return toResourceType;
    }

    public void setToResourceType(String toResourceType) {
        this.toResourceType = toResourceType;
    }

    public ResourceRelation withFromResourceId(String fromResourceId) {
        this.fromResourceId = fromResourceId;
        return this;
    }

    /** 源资源ID
     * 
     * @return fromResourceId */
    public String getFromResourceId() {
        return fromResourceId;
    }

    public void setFromResourceId(String fromResourceId) {
        this.fromResourceId = fromResourceId;
    }

    public ResourceRelation withToResourceId(String toResourceId) {
        this.toResourceId = toResourceId;
        return this;
    }

    /** 目的资源ID
     * 
     * @return toResourceId */
    public String getToResourceId() {
        return toResourceId;
    }

    public void setToResourceId(String toResourceId) {
        this.toResourceId = toResourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceRelation resourceRelation = (ResourceRelation) o;
        return Objects.equals(this.relationType, resourceRelation.relationType)
            && Objects.equals(this.fromResourceType, resourceRelation.fromResourceType)
            && Objects.equals(this.toResourceType, resourceRelation.toResourceType)
            && Objects.equals(this.fromResourceId, resourceRelation.fromResourceId)
            && Objects.equals(this.toResourceId, resourceRelation.toResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationType, fromResourceType, toResourceType, fromResourceId, toResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceRelation {\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    fromResourceType: ").append(toIndentedString(fromResourceType)).append("\n");
        sb.append("    toResourceType: ").append(toIndentedString(toResourceType)).append("\n");
        sb.append("    fromResourceId: ").append(toIndentedString(fromResourceId)).append("\n");
        sb.append("    toResourceId: ").append(toIndentedString(toResourceId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
