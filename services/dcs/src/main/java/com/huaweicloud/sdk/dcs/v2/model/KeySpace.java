package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 键值空间
 */
public class KeySpace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_idx")

    private String dbIdx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private String keys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires")

    private String expires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_ttl")

    private String avgTtl;

    public KeySpace withDbIdx(String dbIdx) {
        this.dbIdx = dbIdx;
        return this;
    }

    /**
     * **参数解释**： db索引值。 **取值范围**： 不涉及。 
     * @return dbIdx
     */
    public String getDbIdx() {
        return dbIdx;
    }

    public void setDbIdx(String dbIdx) {
        this.dbIdx = dbIdx;
    }

    public KeySpace withKeys(String keys) {
        this.keys = keys;
        return this;
    }

    /**
     * **参数解释**： 节点键数量。 **取值范围**： 不涉及。 
     * @return keys
     */
    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public KeySpace withExpires(String expires) {
        this.expires = expires;
        return this;
    }

    /**
     * **参数解释**： 节点过期键数量。 **取值范围**： 不涉及。 
     * @return expires
     */
    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public KeySpace withAvgTtl(String avgTtl) {
        this.avgTtl = avgTtl;
        return this;
    }

    /**
     * **参数解释**： 节点键的平均过期时间。 **取值范围**： 不涉及。
     * @return avgTtl
     */
    public String getAvgTtl() {
        return avgTtl;
    }

    public void setAvgTtl(String avgTtl) {
        this.avgTtl = avgTtl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeySpace that = (KeySpace) obj;
        return Objects.equals(this.dbIdx, that.dbIdx) && Objects.equals(this.keys, that.keys)
            && Objects.equals(this.expires, that.expires) && Objects.equals(this.avgTtl, that.avgTtl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbIdx, keys, expires, avgTtl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeySpace {\n");
        sb.append("    dbIdx: ").append(toIndentedString(dbIdx)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
        sb.append("    avgTtl: ").append(toIndentedString(avgTtl)).append("\n");
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
