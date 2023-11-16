package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HSTS：配置HSTS后，将强制客户端（如浏览器）使用 HTTPS 协议访问服务器，提升访问安全性。
 */
public class HstsQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_age")

    private Integer maxAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_subdomains")

    private String includeSubdomains;

    public HstsQuery withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，on：打开，off：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HstsQuery withMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * 过期时间,即：响应头“Strict-Transport-Security”在客户端的缓存时间。单位:秒。
     * @return maxAge
     */
    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public HstsQuery withIncludeSubdomains(String includeSubdomains) {
        this.includeSubdomains = includeSubdomains;
        return this;
    }

    /**
     * 包含子域名，on：包含，off：不包含。
     * @return includeSubdomains
     */
    public String getIncludeSubdomains() {
        return includeSubdomains;
    }

    public void setIncludeSubdomains(String includeSubdomains) {
        this.includeSubdomains = includeSubdomains;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HstsQuery that = (HstsQuery) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.maxAge, that.maxAge)
            && Objects.equals(this.includeSubdomains, that.includeSubdomains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, maxAge, includeSubdomains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HstsQuery {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
        sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
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
