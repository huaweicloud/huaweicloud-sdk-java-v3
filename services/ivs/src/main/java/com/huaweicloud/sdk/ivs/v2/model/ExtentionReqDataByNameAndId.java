package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtentionReqDataByNameAndId
 */
public class ExtentionReqDataByNameAndId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_name")

    private String verificationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_id")

    private String verificationId;

    public ExtentionReqDataByNameAndId withVerificationName(String verificationName) {
        this.verificationName = verificationName;
        return this;
    }

    /**
     * 被验证人的姓名。
     * @return verificationName
     */
    public String getVerificationName() {
        return verificationName;
    }

    public void setVerificationName(String verificationName) {
        this.verificationName = verificationName;
    }

    public ExtentionReqDataByNameAndId withVerificationId(String verificationId) {
        this.verificationId = verificationId;
        return this;
    }

    /**
     * 被验证人的身份证号码。
     * @return verificationId
     */
    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtentionReqDataByNameAndId extentionReqDataByNameAndId = (ExtentionReqDataByNameAndId) o;
        return Objects.equals(this.verificationName, extentionReqDataByNameAndId.verificationName)
            && Objects.equals(this.verificationId, extentionReqDataByNameAndId.verificationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verificationName, verificationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtentionReqDataByNameAndId {\n");
        sb.append("    verificationName: ").append(toIndentedString(verificationName)).append("\n");
        sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
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
