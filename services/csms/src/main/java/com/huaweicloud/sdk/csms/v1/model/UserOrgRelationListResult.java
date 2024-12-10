package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserOrgRelationListResult
 */
public class UserOrgRelationListResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_id")

    private String orgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private String relationType;

    public UserOrgRelationListResult withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * 组织id
     * @return orgId
     */
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public UserOrgRelationListResult withRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * 关系类型。
     * @return relationType
     */
    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserOrgRelationListResult that = (UserOrgRelationListResult) obj;
        return Objects.equals(this.orgId, that.orgId) && Objects.equals(this.relationType, that.relationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgId, relationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserOrgRelationListResult {\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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
