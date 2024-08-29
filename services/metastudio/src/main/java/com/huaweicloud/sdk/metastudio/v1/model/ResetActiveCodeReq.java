package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重置激活码请求。
 */
public class ResetActiveCodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_auth_credential")

    private Boolean cleanAuthCredential;

    public ResetActiveCodeReq withCleanAuthCredential(Boolean cleanAuthCredential) {
        this.cleanAuthCredential = cleanAuthCredential;
        return this;
    }

    /**
     * 是否清除鉴权凭证。
     * @return cleanAuthCredential
     */
    public Boolean getCleanAuthCredential() {
        return cleanAuthCredential;
    }

    public void setCleanAuthCredential(Boolean cleanAuthCredential) {
        this.cleanAuthCredential = cleanAuthCredential;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetActiveCodeReq that = (ResetActiveCodeReq) obj;
        return Objects.equals(this.cleanAuthCredential, that.cleanAuthCredential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cleanAuthCredential);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetActiveCodeReq {\n");
        sb.append("    cleanAuthCredential: ").append(toIndentedString(cleanAuthCredential)).append("\n");
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
