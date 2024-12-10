package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 授权传入参数
 */
public class GrantSecretReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grantee_type")

    private String granteeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grantee_target_id")

    private String granteeTargetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity_time")

    private LocalDate validityTime;

    public GrantSecretReqBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public GrantSecretReqBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型（SECRET、GROUP）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GrantSecretReqBody withGranteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }

    /**
     * 被授权类型，（0：USER；2：GROUP）个人，群组
     * @return granteeType
     */
    public String getGranteeType() {
        return granteeType;
    }

    public void setGranteeType(String granteeType) {
        this.granteeType = granteeType;
    }

    public GrantSecretReqBody withGranteeTargetId(String granteeTargetId) {
        this.granteeTargetId = granteeTargetId;
        return this;
    }

    /**
     * 被授权id
     * @return granteeTargetId
     */
    public String getGranteeTargetId() {
        return granteeTargetId;
    }

    public void setGranteeTargetId(String granteeTargetId) {
        this.granteeTargetId = granteeTargetId;
    }

    public GrantSecretReqBody withValidityTime(LocalDate validityTime) {
        this.validityTime = validityTime;
        return this;
    }

    /**
     * 有效期截止时间
     * @return validityTime
     */
    public LocalDate getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(LocalDate validityTime) {
        this.validityTime = validityTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GrantSecretReqBody that = (GrantSecretReqBody) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.granteeType, that.granteeType)
            && Objects.equals(this.granteeTargetId, that.granteeTargetId)
            && Objects.equals(this.validityTime, that.validityTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, type, granteeType, granteeTargetId, validityTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantSecretReqBody {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    granteeType: ").append(toIndentedString(granteeType)).append("\n");
        sb.append("    granteeTargetId: ").append(toIndentedString(granteeTargetId)).append("\n");
        sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
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
