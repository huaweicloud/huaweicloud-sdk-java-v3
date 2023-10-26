package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * hpc缓存型配置信息请求
 */
public class ReqConfigHpcCacheBackend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_hpc_cache")

    private ReqUpdateHpcCacheInfo updateHpcCache;

    public ReqConfigHpcCacheBackend withUpdateHpcCache(ReqUpdateHpcCacheInfo updateHpcCache) {
        this.updateHpcCache = updateHpcCache;
        return this;
    }

    public ReqConfigHpcCacheBackend withUpdateHpcCache(Consumer<ReqUpdateHpcCacheInfo> updateHpcCacheSetter) {
        if (this.updateHpcCache == null) {
            this.updateHpcCache = new ReqUpdateHpcCacheInfo();
            updateHpcCacheSetter.accept(this.updateHpcCache);
        }

        return this;
    }

    /**
     * Get updateHpcCache
     * @return updateHpcCache
     */
    public ReqUpdateHpcCacheInfo getUpdateHpcCache() {
        return updateHpcCache;
    }

    public void setUpdateHpcCache(ReqUpdateHpcCacheInfo updateHpcCache) {
        this.updateHpcCache = updateHpcCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqConfigHpcCacheBackend that = (ReqConfigHpcCacheBackend) obj;
        return Objects.equals(this.updateHpcCache, that.updateHpcCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateHpcCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqConfigHpcCacheBackend {\n");
        sb.append("    updateHpcCache: ").append(toIndentedString(updateHpcCache)).append("\n");
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
