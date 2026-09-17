package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 重分布请求。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class RedistributionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_mode")

    private String redisMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_jobs")

    private Integer parallelJobs;

    public RedistributionReq withRedisMode(String redisMode) {
        this.redisMode = redisMode;
        return this;
    }

    /**
     * **参数解释**： 重分布模式 **约束限制**： 不涉及。 **取值范围**： online：在线重分布； offline：离线重分布； **默认取值**： offline
     * @return redisMode
     */
    public String getRedisMode() {
        return redisMode;
    }

    public void setRedisMode(String redisMode) {
        this.redisMode = redisMode;
    }

    public RedistributionReq withParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
        return this;
    }

    /**
     * **参数解释**： 重分布并发数。 **约束限制**： 不涉及。 **取值范围**： 4~200 **默认取值**： 4
     * minimum: 4
     * maximum: 200
     * @return parallelJobs
     */
    public Integer getParallelJobs() {
        return parallelJobs;
    }

    public void setParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedistributionReq that = (RedistributionReq) obj;
        return Objects.equals(this.redisMode, that.redisMode) && Objects.equals(this.parallelJobs, that.parallelJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisMode, parallelJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedistributionReq {\n");
        sb.append("    redisMode: ").append(toIndentedString(redisMode)).append("\n");
        sb.append("    parallelJobs: ").append(toIndentedString(parallelJobs)).append("\n");
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
