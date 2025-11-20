package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子账号控制配置
 */
public class SubAccountControlConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "separately_controlled")

    private Boolean separatelyControlled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_account_type")

    private String subAccountType;

    public SubAccountControlConfig withSeparatelyControlled(Boolean separatelyControlled) {
        this.separatelyControlled = separatelyControlled;
        return this;
    }

    /**
     * 子账号业务是否单独控制。
     * @return separatelyControlled
     */
    public Boolean getSeparatelyControlled() {
        return separatelyControlled;
    }

    public void setSeparatelyControlled(Boolean separatelyControlled) {
        this.separatelyControlled = separatelyControlled;
    }

    public SubAccountControlConfig withSubAccountType(String subAccountType) {
        this.subAccountType = subAccountType;
        return this;
    }

    /**
     * 子账号类型。 * IAM_USER: 使用调用者IAM user id填充 X-App-UserId。如果请求中携带X-App-UserId，也会被忽略替换。
     * @return subAccountType
     */
    public String getSubAccountType() {
        return subAccountType;
    }

    public void setSubAccountType(String subAccountType) {
        this.subAccountType = subAccountType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubAccountControlConfig that = (SubAccountControlConfig) obj;
        return Objects.equals(this.separatelyControlled, that.separatelyControlled)
            && Objects.equals(this.subAccountType, that.subAccountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(separatelyControlled, subAccountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubAccountControlConfig {\n");
        sb.append("    separatelyControlled: ").append(toIndentedString(separatelyControlled)).append("\n");
        sb.append("    subAccountType: ").append(toIndentedString(subAccountType)).append("\n");
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
