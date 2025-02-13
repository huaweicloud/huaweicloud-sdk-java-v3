package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShareDocsParamDto
 */
public class ShareDocsParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structured_doc_id")

    private String structuredDocId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_user_id")

    private String sharedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_user_name")

    private String sharedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_user_id")

    private String shareUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_user_name")

    private String shareUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    public ShareDocsParamDto withStructuredDocId(String structuredDocId) {
        this.structuredDocId = structuredDocId;
        return this;
    }

    /**
     * **参数解释**：  结构化文档ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return structuredDocId
     */
    public String getStructuredDocId() {
        return structuredDocId;
    }

    public void setStructuredDocId(String structuredDocId) {
        this.structuredDocId = structuredDocId;
    }

    public ShareDocsParamDto withSharedUserId(String sharedUserId) {
        this.sharedUserId = sharedUserId;
        return this;
    }

    /**
     * **参数解释**：  被分享用户UserId。  **约束限制**：  不涉及。  **取值范围**：  all：表示所有人。  **默认取值**：  不涉及。
     * @return sharedUserId
     */
    public String getSharedUserId() {
        return sharedUserId;
    }

    public void setSharedUserId(String sharedUserId) {
        this.sharedUserId = sharedUserId;
    }

    public ShareDocsParamDto withSharedUserName(String sharedUserName) {
        this.sharedUserName = sharedUserName;
        return this;
    }

    /**
     * **参数解释**：  被分享用户名。  **约束限制**：  不涉及。  **取值范围**：  all：表示所有人。  **默认取值**：  不涉及。
     * @return sharedUserName
     */
    public String getSharedUserName() {
        return sharedUserName;
    }

    public void setSharedUserName(String sharedUserName) {
        this.sharedUserName = sharedUserName;
    }

    public ShareDocsParamDto withShareUserId(String shareUserId) {
        this.shareUserId = shareUserId;
        return this;
    }

    /**
     * **参数解释**：  分享用户UserId。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return shareUserId
     */
    public String getShareUserId() {
        return shareUserId;
    }

    public void setShareUserId(String shareUserId) {
        this.shareUserId = shareUserId;
    }

    public ShareDocsParamDto withShareUserName(String shareUserName) {
        this.shareUserName = shareUserName;
        return this;
    }

    /**
     * **参数解释**：  分享用户名。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return shareUserName
     */
    public String getShareUserName() {
        return shareUserName;
    }

    public void setShareUserName(String shareUserName) {
        this.shareUserName = shareUserName;
    }

    public ShareDocsParamDto withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释**：  认证类型。  **约束限制**：  不涉及。  **取值范围**：  - read：只读。 - write：读写。  **默认取值**：  不涉及。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ShareDocsParamDto withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释**：  修改人。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareDocsParamDto that = (ShareDocsParamDto) obj;
        return Objects.equals(this.structuredDocId, that.structuredDocId)
            && Objects.equals(this.sharedUserId, that.sharedUserId)
            && Objects.equals(this.sharedUserName, that.sharedUserName)
            && Objects.equals(this.shareUserId, that.shareUserId)
            && Objects.equals(this.shareUserName, that.shareUserName) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(structuredDocId, sharedUserId, sharedUserName, shareUserId, shareUserName, authType, modifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareDocsParamDto {\n");
        sb.append("    structuredDocId: ").append(toIndentedString(structuredDocId)).append("\n");
        sb.append("    sharedUserId: ").append(toIndentedString(sharedUserId)).append("\n");
        sb.append("    sharedUserName: ").append(toIndentedString(sharedUserName)).append("\n");
        sb.append("    shareUserId: ").append(toIndentedString(shareUserId)).append("\n");
        sb.append("    shareUserName: ").append(toIndentedString(shareUserName)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
