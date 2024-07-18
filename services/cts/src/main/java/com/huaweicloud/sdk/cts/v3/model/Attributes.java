package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 临时安全凭据的属性。
 */
public class Attributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mfa_authenticated")

    private String mfaAuthenticated;

    public Attributes withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 颁发临时安全凭证时的时间（timestamp，为标准UTC时间，毫秒级，13位数字）。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Attributes withMfaAuthenticated(String mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
        return this;
    }

    /**
     * 是否已经通过MFA身份认证。
     * @return mfaAuthenticated
     */
    public String getMfaAuthenticated() {
        return mfaAuthenticated;
    }

    public void setMfaAuthenticated(String mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes that = (Attributes) obj;
        return Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.mfaAuthenticated, that.mfaAuthenticated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, mfaAuthenticated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attributes {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    mfaAuthenticated: ").append(toIndentedString(mfaAuthenticated)).append("\n");
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
