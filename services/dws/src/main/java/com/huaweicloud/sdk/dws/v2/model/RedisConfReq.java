package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重分布配置请求信息
 */
public class RedisConfReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_mode")

    private String redisMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_jobs")

    private Integer parallelJobs;

    public RedisConfReq withRedisMode(String redisMode) {
        this.redisMode = redisMode;
        return this;
    }

    /**
     * **参数解释**： 重分布模式，不同模式对业务影响不同，修改建议联系运维人员评估后再决定。 **约束限制**： 必须是有效的dws集群ID。 **取值范围**： offLine：离线模式。 onLine：在线模式。 **默认取值**： offLine
     * @return redisMode
     */
    public String getRedisMode() {
        return redisMode;
    }

    public void setRedisMode(String redisMode) {
        this.redisMode = redisMode;
    }

    public RedisConfReq withParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
        return this;
    }

    /**
     * **参数解释**： 并行作业数量，默认4。 **约束限制**： 不涉及。 **取值范围**： 1~200 **默认取值**： 4
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
        RedisConfReq that = (RedisConfReq) obj;
        return Objects.equals(this.redisMode, that.redisMode) && Objects.equals(this.parallelJobs, that.parallelJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisMode, parallelJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisConfReq {\n");
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
