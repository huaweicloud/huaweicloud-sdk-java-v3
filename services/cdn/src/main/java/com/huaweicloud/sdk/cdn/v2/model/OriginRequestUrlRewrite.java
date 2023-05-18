package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 改写回源URL，最多配置20条。
 */
public class OriginRequestUrlRewrite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_url")

    private String targetUrl;

    public OriginRequestUrlRewrite withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 回源URL改写规则的优先级。 优先级设置具有唯一性，不支持多条回源URL改写规则设置同一优先级，且优先级不能输入为空。 多条规则下，不同规则中的相同资源内容，CDN按照优先级高的规则执行URL改写。 取值为1~100之间的整数，数值越大优先级越高。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public OriginRequestUrlRewrite withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配类型， all：所有文件， file_path：URL路径， wildcard：通配符。 full_path: 全路径
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public OriginRequestUrlRewrite withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * 需要替换的URI。 以正斜线（/）开头的URI，不含http(s)://头及域名。 长度不超过512个字符。 支持通配符\\*匹配，如：/test/\\*_/\\*.mp4。 匹配方式为“所有文件”时，不支持配置参数。
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public OriginRequestUrlRewrite withTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * 以正斜线（/）开头的URI，不含http(s)://头及域名。 长度不超过256个字符。 通配符 * 可通过$n捕获（n=1,2,3...，例如：/newtest/$1/$2.jpg）。
     * @return targetUrl
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OriginRequestUrlRewrite originRequestUrlRewrite = (OriginRequestUrlRewrite) o;
        return Objects.equals(this.priority, originRequestUrlRewrite.priority)
            && Objects.equals(this.matchType, originRequestUrlRewrite.matchType)
            && Objects.equals(this.sourceUrl, originRequestUrlRewrite.sourceUrl)
            && Objects.equals(this.targetUrl, originRequestUrlRewrite.targetUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, matchType, sourceUrl, targetUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OriginRequestUrlRewrite {\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
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
