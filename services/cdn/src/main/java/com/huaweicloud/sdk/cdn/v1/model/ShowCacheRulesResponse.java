package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowCacheRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_config")

    private CacheConfig cacheConfig;

    public ShowCacheRulesResponse withCacheConfig(CacheConfig cacheConfig) {
        this.cacheConfig = cacheConfig;
        return this;
    }

    public ShowCacheRulesResponse withCacheConfig(Consumer<CacheConfig> cacheConfigSetter) {
        if (this.cacheConfig == null) {
            this.cacheConfig = new CacheConfig();
            cacheConfigSetter.accept(this.cacheConfig);
        }

        return this;
    }

    /** Get cacheConfig
     * 
     * @return cacheConfig */
    public CacheConfig getCacheConfig() {
        return cacheConfig;
    }

    public void setCacheConfig(CacheConfig cacheConfig) {
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
        ShowCacheRulesResponse showCacheRulesResponse = (ShowCacheRulesResponse) o;
        return Objects.equals(this.cacheConfig, showCacheRulesResponse.cacheConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cacheConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCacheRulesResponse {\n");
        sb.append("    cacheConfig: ").append(toIndentedString(cacheConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
