package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 通过不同参数控制源站资源在CDN节点的缓存时长 **约束限制：** 不涉及
 */
public class CacheRulesEngine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_unit")

    private String ttlUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow_origin")

    private String followOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_cache")

    private String forceCache;

    public CacheRulesEngine withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释：** 资源在CDN节点的缓存过期时间 **约束限制：** 最大支持365天 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public CacheRulesEngine withTtlUnit(String ttlUnit) {
        this.ttlUnit = ttlUnit;
        return this;
    }

    /**
     * **参数解释：** 缓存过期时间单位 **约束限制：** 不涉及 **取值范围：** - s: 秒 - m: 分 - h: 小时 - d: 天 **默认取值：** 不涉及
     * @return ttlUnit
     */
    public String getTtlUnit() {
        return ttlUnit;
    }

    public void setTtlUnit(String ttlUnit) {
        this.ttlUnit = ttlUnit;
    }

    public CacheRulesEngine withFollowOrigin(String followOrigin) {
        this.followOrigin = followOrigin;
        return this;
    }

    /**
     * **参数解释：** 缓存过期时间来源，设置CDN节点的缓存遵循源站还是CDN侧的配置 **约束限制：** 不涉及 **取值范围：** - on: CDN节点的缓存过期时间遵循源站的设置 - off: CDN节点的缓存过期时间遵循“缓存规则”中的“缓存过期时间” - min_ttl: CDN节点的缓存过期时间取缓存规则和源站二者的最小值 **默认取值：** off: CDN节点的缓存过期时间遵循“缓存规则”中的“缓存过期时间”
     * @return followOrigin
     */
    public String getFollowOrigin() {
        return followOrigin;
    }

    public void setFollowOrigin(String followOrigin) {
        this.followOrigin = followOrigin;
    }

    public CacheRulesEngine withForceCache(String forceCache) {
        this.forceCache = forceCache;
        return this;
    }

    /**
     * **参数解释：** 强制缓存：CDN节点缓存过期时间是否忽略源站响应头Cache-Control中的no-cache、private、no-store字段 **约束限制：** 强制缓存与缓存过期时间来源功能配合使用，具体使用限制及配置效果请参考CDN用户指南的配置节点缓存规则章节 **取值范围：** - on: 打开强制缓存 - off: 关闭强制缓存 **默认取值：** off: 关闭强制缓存
     * @return forceCache
     */
    public String getForceCache() {
        return forceCache;
    }

    public void setForceCache(String forceCache) {
        this.forceCache = forceCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheRulesEngine that = (CacheRulesEngine) obj;
        return Objects.equals(this.ttl, that.ttl) && Objects.equals(this.ttlUnit, that.ttlUnit)
            && Objects.equals(this.followOrigin, that.followOrigin) && Objects.equals(this.forceCache, that.forceCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttl, ttlUnit, followOrigin, forceCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CacheRulesEngine {\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    ttlUnit: ").append(toIndentedString(ttlUnit)).append("\n");
        sb.append("    followOrigin: ").append(toIndentedString(followOrigin)).append("\n");
        sb.append("    forceCache: ").append(toIndentedString(forceCache)).append("\n");
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
