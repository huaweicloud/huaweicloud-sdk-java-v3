package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateSubscriptionRequestBody
 */
public class UpdateSubscriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code")

    private String verificationCode;

    public UpdateSubscriptionRequestBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 订阅者备注。订阅者备注的最大长度为128byte。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UpdateSubscriptionRequestBody withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /**
     * 订阅终端收到的验证码。
     * @return verificationCode
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSubscriptionRequestBody that = (UpdateSubscriptionRequestBody) obj;
        return Objects.equals(this.remark, that.remark) && Objects.equals(this.verificationCode, that.verificationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remark, verificationCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionRequestBody {\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
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
