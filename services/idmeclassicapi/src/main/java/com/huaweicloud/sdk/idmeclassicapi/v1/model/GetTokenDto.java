package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetTokenDto
 */
public class GetTokenDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_id")

    private String docId;

    public GetTokenDto withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释**：  认证类型。  **约束限制**：  不涉及。  **取值范围**：  - read: 只读 - write: 读写  **默认取值**：  不涉及。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public GetTokenDto withDocId(String docId) {
        this.docId = docId;
        return this;
    }

    /**
     * **参数解释**：  文档ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return docId
     */
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetTokenDto that = (GetTokenDto) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.docId, that.docId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, docId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTokenDto {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
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
