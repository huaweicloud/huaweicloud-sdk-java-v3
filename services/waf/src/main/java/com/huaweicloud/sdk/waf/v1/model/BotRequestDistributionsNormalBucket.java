package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 正常请求的统计数据 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class BotRequestDistributionsNormalBucket {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public BotRequestDistributionsNormalBucket withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 正常请求总数 **约束限制：** 不涉及 **取值范围：** ≥0 **默认取值：** 0
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
        BotRequestDistributionsNormalBucket that = (BotRequestDistributionsNormalBucket) obj;
        return Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BotRequestDistributionsNormalBucket {\n");
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
