package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AppCodeCreate
 */
public class AppCodeCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_code")

    private String appCode;

    public AppCodeCreate withAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * App Code值  支持英文，+_!@#$%+/=，且只能以英文和+、/开头。
     * @return appCode
     */
    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppCodeCreate that = (AppCodeCreate) obj;
        return Objects.equals(this.appCode, that.appCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppCodeCreate {\n");
        sb.append("    appCode: ").append(toIndentedString(appCode)).append("\n");
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
