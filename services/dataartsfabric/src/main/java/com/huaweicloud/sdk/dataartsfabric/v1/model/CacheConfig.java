package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：分布式缓存配置。 **约束限制**：不涉及。 
 */
public class CacheConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mnt_path")

    private String mntPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_ins_id")

    private String cacheInsId;

    public CacheConfig withMntPath(String mntPath) {
        this.mntPath = mntPath;
        return this;
    }

    /**
     * **参数解释**：挂载路径。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return mntPath
     */
    public String getMntPath() {
        return mntPath;
    }

    public void setMntPath(String mntPath) {
        this.mntPath = mntPath;
    }

    public CacheConfig withCacheInsId(String cacheInsId) {
        this.cacheInsId = cacheInsId;
        return this;
    }

    /**
     * **参数解释**：分布式缓存id。 **约束限制**：不涉及。 **取值范围**：已创建的分布式缓存资源id。 **默认取值**：不涉及。 
     * @return cacheInsId
     */
    public String getCacheInsId() {
        return cacheInsId;
    }

    public void setCacheInsId(String cacheInsId) {
        this.cacheInsId = cacheInsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheConfig that = (CacheConfig) obj;
        return Objects.equals(this.mntPath, that.mntPath) && Objects.equals(this.cacheInsId, that.cacheInsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mntPath, cacheInsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CacheConfig {\n");
        sb.append("    mntPath: ").append(toIndentedString(mntPath)).append("\n");
        sb.append("    cacheInsId: ").append(toIndentedString(cacheInsId)).append("\n");
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
