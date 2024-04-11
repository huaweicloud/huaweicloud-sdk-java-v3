package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 浏览器缓存过期时间。
 */
public class BrowserCacheRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private BrowserCacheRulesCondition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_type")

    private String cacheType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_unit")

    private String ttlUnit;

    public BrowserCacheRules withCondition(BrowserCacheRulesCondition condition) {
        this.condition = condition;
        return this;
    }

    public BrowserCacheRules withCondition(Consumer<BrowserCacheRulesCondition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new BrowserCacheRulesCondition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public BrowserCacheRulesCondition getCondition() {
        return condition;
    }

    public void setCondition(BrowserCacheRulesCondition condition) {
        this.condition = condition;
    }

    public BrowserCacheRules withCacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }

    /**
     * 缓存生效类型：   - follow_origin：遵循源站的缓存策略，即Cache-Control头部的设置，   - ttl：浏览器缓存遵循当前规则设置的过期时间，   - never：浏览器不缓存资源。
     * @return cacheType
     */
    public String getCacheType() {
        return cacheType;
    }

    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }

    public BrowserCacheRules withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 缓存过期时间，最大支持365天。   > 当缓存生效类型为ttl时必填。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public BrowserCacheRules withTtlUnit(String ttlUnit) {
        this.ttlUnit = ttlUnit;
        return this;
    }

    /**
     * 缓存过期时间单位，s：秒；m：分种；h：小时；d：天。   > 当缓存生效类型为ttl时必填。
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
        BrowserCacheRules that = (BrowserCacheRules) obj;
        return Objects.equals(this.condition, that.condition) && Objects.equals(this.cacheType, that.cacheType)
            && Objects.equals(this.ttl, that.ttl) && Objects.equals(this.ttlUnit, that.ttlUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, cacheType, ttl, ttlUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrowserCacheRules {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
