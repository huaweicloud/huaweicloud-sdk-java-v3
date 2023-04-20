package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 强制跳转。
 */
public class ForceRedirectConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_code")

    private Integer redirectCode;

    public ForceRedirectConfig withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 强制跳转开关（on：打开，off：关闭）。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ForceRedirectConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 强制跳转类型（http：强制跳转HTTP，https：强制跳转HTTPS）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ForceRedirectConfig withRedirectCode(Integer redirectCode) {
        this.redirectCode = redirectCode;
        return this;
    }

    /**
     * 重定向跳转码301,302。
     * @return redirectCode
     */
    public Integer getRedirectCode() {
        return redirectCode;
    }

    public void setRedirectCode(Integer redirectCode) {
        this.redirectCode = redirectCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForceRedirectConfig forceRedirectConfig = (ForceRedirectConfig) o;
        return Objects.equals(this.status, forceRedirectConfig.status)
            && Objects.equals(this.type, forceRedirectConfig.type)
            && Objects.equals(this.redirectCode, forceRedirectConfig.redirectCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, redirectCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForceRedirectConfig {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    redirectCode: ").append(toIndentedString(redirectCode)).append("\n");
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
