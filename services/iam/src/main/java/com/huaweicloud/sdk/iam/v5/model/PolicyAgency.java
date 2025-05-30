package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PolicyAgency
 */
public class PolicyAgency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_at")

    private OffsetDateTime attachedAt;

    public PolicyAgency withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 委托或信任委托ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public PolicyAgency withAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
        return this;
    }

    /**
     * 身份策略的附加时间。
     * @return attachedAt
     */
    public OffsetDateTime getAttachedAt() {
        return attachedAt;
    }

    public void setAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyAgency that = (PolicyAgency) obj;
        return Objects.equals(this.agencyId, that.agencyId) && Objects.equals(this.attachedAt, that.attachedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyId, attachedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAgency {\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
        sb.append("    attachedAt: ").append(toIndentedString(attachedAt)).append("\n");
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
