package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TypedStatBucket
 */
public class TypedStatBucket {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public TypedStatBucket withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 统计键（如bot类型、域名等） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TypedStatBucket withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 该键对应的命中请求数量 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
     * minimum: 0
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypedStatBucket that = (TypedStatBucket) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypedStatBucket {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
