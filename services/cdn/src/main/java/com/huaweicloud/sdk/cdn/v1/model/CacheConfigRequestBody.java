package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CacheConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_config")

    private CacheConfigRequest cacheConfig;

    public CacheConfigRequestBody withCacheConfig(CacheConfigRequest cacheConfig) {
        this.cacheConfig = cacheConfig;
        return this;
    }

    public CacheConfigRequestBody withCacheConfig(Consumer<CacheConfigRequest> cacheConfigSetter) {
        if (this.cacheConfig == null) {
            this.cacheConfig = new CacheConfigRequest();
            cacheConfigSetter.accept(this.cacheConfig);
        }

        return this;
    }

    /**
     * Get cacheConfig
     * @return cacheConfig
     */
    public CacheConfigRequest getCacheConfig() {
        return cacheConfig;
    }

    public void setCacheConfig(CacheConfigRequest cacheConfig) {
        this.cacheConfig = cacheConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CacheConfigRequestBody cacheConfigRequestBody = (CacheConfigRequestBody) o;
        return Objects.equals(this.cacheConfig, cacheConfigRequestBody.cacheConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cacheConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CacheConfigRequestBody {\n");
        sb.append("    cacheConfig: ").append(toIndentedString(cacheConfig)).append("\n");
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
