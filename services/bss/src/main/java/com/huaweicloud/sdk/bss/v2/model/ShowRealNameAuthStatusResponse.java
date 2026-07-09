package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRealNameAuthStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_status")

    private Integer verifiedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_type")

    private Integer verifiedType;

    public ShowRealNameAuthStatusResponse withVerifiedStatus(Integer verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
        return this;
    }

    /**
     * 实名认证状态。enum:-1,0,1,2。 -1未实名认证、0实名认证审核中、1实名认证不通过、2已实名认证
     * @return verifiedStatus
     */
    public Integer getVerifiedStatus() {
        return verifiedStatus;
    }

    public void setVerifiedStatus(Integer verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }

    public ShowRealNameAuthStatusResponse withVerifiedType(Integer verifiedType) {
        this.verifiedType = verifiedType;
        return this;
    }

    /**
     * 实名认证类型。实名认证状态为-1未实名认证返回null。enum:0,1。 0个人实名认证、1企业实名认证
     * @return verifiedType
     */
    public Integer getVerifiedType() {
        return verifiedType;
    }

    public void setVerifiedType(Integer verifiedType) {
        this.verifiedType = verifiedType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRealNameAuthStatusResponse that = (ShowRealNameAuthStatusResponse) obj;
        return Objects.equals(this.verifiedStatus, that.verifiedStatus)
            && Objects.equals(this.verifiedType, that.verifiedType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verifiedStatus, verifiedType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRealNameAuthStatusResponse {\n");
        sb.append("    verifiedStatus: ").append(toIndentedString(verifiedStatus)).append("\n");
        sb.append("    verifiedType: ").append(toIndentedString(verifiedType)).append("\n");
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
