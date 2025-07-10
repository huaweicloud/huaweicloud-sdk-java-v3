package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 改写回源URL **约束限制：** 最多配置20条
 */
public class OriginRequestUrlRewriteEngine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_type")

    private String rewriteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_url")

    private String targetUrl;

    public OriginRequestUrlRewriteEngine withRewriteType(String rewriteType) {
        this.rewriteType = rewriteType;
        return this;
    }

    /**
     * **参数解释：** 改写方式 **约束限制：** 不涉及 **取值范围：** - simple: 精确改写 - wildcard: 捕获改写 - regex: 正则改写（白名单功能，请提交工单开放该配置） **默认取值：** 不涉及
     * @return rewriteType
     */
    public String getRewriteType() {
        return rewriteType;
    }

    public void setRewriteType(String rewriteType) {
        this.rewriteType = rewriteType;
    }

    public OriginRequestUrlRewriteEngine withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * **参数解释：** 需要替换的URI **约束限制：** 当rewrite_type为wildcard或regex时，该参数必填 当rewrite_type为regex时，该参数必填必须以“^/”开始，如：^/test **取值范围：** - 1-512个字符 - 支持通配符\\*匹配，如：/test/\\*_/\\*.mp4 - 以正斜线（/）开头的URI，不含http(s)://头及域名 **默认取值：** 不涉及
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public OriginRequestUrlRewriteEngine withTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * **参数解释：** 替换后的URI **约束限制：** **取值范围：** - 1-256个字符 - 以正斜线（/）开头的URI，不含http(s)://头及域名  > 通配符 * 可通过$n捕获（n=1,2,3...，例如：/newtest/$1/$2.jpg）  **默认取值：** 不涉及
     * @return targetUrl
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OriginRequestUrlRewriteEngine that = (OriginRequestUrlRewriteEngine) obj;
        return Objects.equals(this.rewriteType, that.rewriteType) && Objects.equals(this.sourceUrl, that.sourceUrl)
            && Objects.equals(this.targetUrl, that.targetUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewriteType, sourceUrl, targetUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OriginRequestUrlRewriteEngine {\n");
        sb.append("    rewriteType: ").append(toIndentedString(rewriteType)).append("\n");
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
