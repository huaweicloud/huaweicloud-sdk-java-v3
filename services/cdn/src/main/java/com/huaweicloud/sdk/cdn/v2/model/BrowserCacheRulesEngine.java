package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 浏览器缓存过期时间，当终端用户请求资源时，如果浏览器有缓存，直接返回给用户 **约束限制：** 不涉及
 */
public class BrowserCacheRulesEngine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_type")

    private String cacheType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_unit")

    private String ttlUnit;

    public BrowserCacheRulesEngine withCacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }

    /**
     * **参数解释：** 缓存生效类型 **约束限制：** 不涉及 **取值范围：** - follow_origin: 遵循源站的缓存策略，即Cache-Control头部的设置 - ttl: 浏览器缓存遵循当前规则设置的过期时间 - never: 浏览器不缓存资源 **默认取值：** 不涉及
     * @return cacheType
     */
    public String getCacheType() {
        return cacheType;
    }

    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }

    public BrowserCacheRulesEngine withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释：** 缓存过期时间 **约束限制：** - 最大支持365天 - 当缓存生效类型为ttl时必填 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public BrowserCacheRulesEngine withTtlUnit(String ttlUnit) {
        this.ttlUnit = ttlUnit;
        return this;
    }

    /**
     * **参数解释：** 缓存过期时间单位 **约束限制：** 当缓存生效类型为ttl时必填 **取值范围：** - s：秒 - m：分种 - h：小时 - d：天 **默认取值：** 不涉及
     * @return ttlUnit
     */
    public String getTtlUnit() {
        return ttlUnit;
    }

    public void setTtlUnit(String ttlUnit) {
        this.ttlUnit = ttlUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BrowserCacheRulesEngine that = (BrowserCacheRulesEngine) obj;
        return Objects.equals(this.cacheType, that.cacheType) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.ttlUnit, that.ttlUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cacheType, ttl, ttlUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrowserCacheRulesEngine {\n");
        sb.append("    cacheType: ").append(toIndentedString(cacheType)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    ttlUnit: ").append(toIndentedString(ttlUnit)).append("\n");
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
