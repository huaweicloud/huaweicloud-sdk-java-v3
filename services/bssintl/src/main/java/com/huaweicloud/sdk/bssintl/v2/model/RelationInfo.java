package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RelationInfo
 */
public class RelationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_resource_id")

    private String relativeResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_type")

    private String relativeType;

    public RelationInfo withRelativeResourceId(String relativeResourceId) {
        this.relativeResourceId = relativeResourceId;
        return this;
    }

    /**
     * |参数名称：关联资源ID。| |参数约束及描述：关联资源ID。|
     * @return relativeResourceId
     */
    public String getRelativeResourceId() {
        return relativeResourceId;
    }

    public void setRelativeResourceId(String relativeResourceId) {
        this.relativeResourceId = relativeResourceId;
    }

    public RelationInfo withRelativeType(String relativeType) {
        this.relativeType = relativeType;
        return this;
    }

    /**
     * |参数名称：关联资源类型。| |参数约束及描述：关联资源类型，父资源：PARENT；根资源：ROOT|
     * @return relativeType
     */
    public String getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(String relativeType) {
        this.relativeType = relativeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelationInfo that = (RelationInfo) obj;
        return Objects.equals(this.relativeResourceId, that.relativeResourceId)
            && Objects.equals(this.relativeType, that.relativeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relativeResourceId, relativeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationInfo {\n");
        sb.append("    relativeResourceId: ").append(toIndentedString(relativeResourceId)).append("\n");
        sb.append("    relativeType: ").append(toIndentedString(relativeType)).append("\n");
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
