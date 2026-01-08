package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Quotas
 */
public class Quotas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_limit")

    private Integer quotaLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_domain_id")

    private String userDomainId;

    public Quotas withQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }

    /**
     * 配额上限。
     * @return quotaLimit
     */
    public Integer getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    public Quotas withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 配额类型。取值意义： - file_refresh：文件级别刷新配额 - dir_refresh：目录级别刷新配额 - preheat：预热配额 - domain：加速域名配额 - ip_filter：IP黑白名单配额 - browser_cache_rule：浏览器缓存规则配额 - http_response_header：HTTP响应头配额 - referer：REFERER防盗链配额 - flexible_origin：高级回源配额 - flexible_origin_match_value：高级回源匹配内容配额 - cache_rule：缓存规则配额 - custom_cache_key：自定义CACHE KEY配额 - custom_cache_key_match_value：自定义CACHE KEY匹配内容配额 - rule：规则引擎配额 - edge_function：函数阶段配额 - origin_request_url_rewrite：回源URL改写配额 - origin_request_header：回源请求头配额 - request_url_rewrite：请求URL改写配额 - access_area_filter：区域访问控制配额 - request_limit_rules：请求限速配置配额 - user_agent：UA配额
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Quotas withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用配额数。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Quotas withUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
        return this;
    }

    /**
     * 域名所属用户的domain_id。
     * @return userDomainId
     */
    public String getUserDomainId() {
        return userDomainId;
    }

    public void setUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quotas that = (Quotas) obj;
        return Objects.equals(this.quotaLimit, that.quotaLimit) && Objects.equals(this.type, that.type)
            && Objects.equals(this.used, that.used) && Objects.equals(this.userDomainId, that.userDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaLimit, type, used, userDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quotas {\n");
        sb.append("    quotaLimit: ").append(toIndentedString(quotaLimit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    userDomainId: ").append(toIndentedString(userDomainId)).append("\n");
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
