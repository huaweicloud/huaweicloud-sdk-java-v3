package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CertRevokeConfigRequestBody
 */
public class CertRevokeConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userId")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencyId")

    private String agencyId;

    public CertRevokeConfigRequestBody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户ID，获取方式参见本接口的接口约束 **约束限制**： 与agencyId互斥，二选一填写 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CertRevokeConfigRequestBody withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * **参数解释**： 用户ID，获取方式参见[如何获取用户ID](cce_02_0249.xml#section1) **约束限制**： 与agencyId互斥，二选一填写 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertRevokeConfigRequestBody that = (CertRevokeConfigRequestBody) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.agencyId, that.agencyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, agencyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertRevokeConfigRequestBody {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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
