package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DelOtpDevicesReq
 */
public class DelOtpDevicesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otp_ids")

    private List<String> otpIds = null;

    public DelOtpDevicesReq withOtpIds(List<String> otpIds) {
        this.otpIds = otpIds;
        return this;
    }

    public DelOtpDevicesReq addOtpIdsItem(String otpIdsItem) {
        if (this.otpIds == null) {
            this.otpIds = new ArrayList<>();
        }
        this.otpIds.add(otpIdsItem);
        return this;
    }

    public DelOtpDevicesReq withOtpIds(Consumer<List<String>> otpIdsSetter) {
        if (this.otpIds == null) {
            this.otpIds = new ArrayList<>();
        }
        otpIdsSetter.accept(this.otpIds);
        return this;
    }

    /**
     * 待解绑的otp配置id数组。
     * @return otpIds
     */
    public List<String> getOtpIds() {
        return otpIds;
    }

    public void setOtpIds(List<String> otpIds) {
        this.otpIds = otpIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelOtpDevicesReq that = (DelOtpDevicesReq) obj;
        return Objects.equals(this.otpIds, that.otpIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otpIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelOtpDevicesReq {\n");
        sb.append("    otpIds: ").append(toIndentedString(otpIds)).append("\n");
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
