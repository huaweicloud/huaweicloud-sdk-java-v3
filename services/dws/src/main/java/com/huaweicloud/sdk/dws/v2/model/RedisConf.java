package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 重分布配置信息。 **取值范围**： 不涉及。
 */
public class RedisConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_mode")

    private String redisMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_conf")

    private ScheduleConf scheduleConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_jobs")

    private Integer parallelJobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_job")

    private Integer parallelJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_policy")

    private String priorityPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_split_info")

    private BucketSplitInfo bucketSplitInfo;

    public RedisConf withRedisMode(String redisMode) {
        this.redisMode = redisMode;
        return this;
    }

    /**
     * **参数解释**： 重分布模式。 **取值范围**： online|offline。
     * @return redisMode
     */
    public String getRedisMode() {
        return redisMode;
    }

    public void setRedisMode(String redisMode) {
        this.redisMode = redisMode;
    }

    public RedisConf withScheduleConf(ScheduleConf scheduleConf) {
        this.scheduleConf = scheduleConf;
        return this;
    }

    public RedisConf withScheduleConf(Consumer<ScheduleConf> scheduleConfSetter) {
        if (this.scheduleConf == null) {
            this.scheduleConf = new ScheduleConf();
            scheduleConfSetter.accept(this.scheduleConf);
        }

        return this;
    }

    /**
     * Get scheduleConf
     * @return scheduleConf
     */
    public ScheduleConf getScheduleConf() {
        return scheduleConf;
    }

    public void setScheduleConf(ScheduleConf scheduleConf) {
        this.scheduleConf = scheduleConf;
    }

    public RedisConf withParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
        return this;
    }

    /**
     * **参数解释**： 重分布并发数。 **取值范围**： 1~200。
     * @return parallelJobs
     */
    public Integer getParallelJobs() {
        return parallelJobs;
    }

    public void setParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
    }

    public RedisConf withParallelJob(Integer parallelJob) {
        this.parallelJob = parallelJob;
        return this;
    }

    /**
     * **参数解释**： 重分布并发数，已经废弃。 **取值范围**： 1~200。
     * @return parallelJob
     */
    public Integer getParallelJob() {
        return parallelJob;
    }

    public void setParallelJob(Integer parallelJob) {
        this.parallelJob = parallelJob;
    }

    public RedisConf withPriorityPolicy(String priorityPolicy) {
        this.priorityPolicy = priorityPolicy;
        return this;
    }

    /**
     * **参数解释**： 优先级策略。 **取值范围**： large：优先对大表进行重分布。 small：优先对小表进行重分布。 default：默认顺序进行重分布。
     * @return priorityPolicy
     */
    public String getPriorityPolicy() {
        return priorityPolicy;
    }

    public void setPriorityPolicy(String priorityPolicy) {
        this.priorityPolicy = priorityPolicy;
    }

    public RedisConf withBucketSplitInfo(BucketSplitInfo bucketSplitInfo) {
        this.bucketSplitInfo = bucketSplitInfo;
        return this;
    }

    public RedisConf withBucketSplitInfo(Consumer<BucketSplitInfo> bucketSplitInfoSetter) {
        if (this.bucketSplitInfo == null) {
            this.bucketSplitInfo = new BucketSplitInfo();
            bucketSplitInfoSetter.accept(this.bucketSplitInfo);
        }

        return this;
    }

    /**
     * Get bucketSplitInfo
     * @return bucketSplitInfo
     */
    public BucketSplitInfo getBucketSplitInfo() {
        return bucketSplitInfo;
    }

    public void setBucketSplitInfo(BucketSplitInfo bucketSplitInfo) {
        this.bucketSplitInfo = bucketSplitInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisConf that = (RedisConf) obj;
        return Objects.equals(this.redisMode, that.redisMode) && Objects.equals(this.scheduleConf, that.scheduleConf)
            && Objects.equals(this.parallelJobs, that.parallelJobs)
            && Objects.equals(this.parallelJob, that.parallelJob)
            && Objects.equals(this.priorityPolicy, that.priorityPolicy)
            && Objects.equals(this.bucketSplitInfo, that.bucketSplitInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisMode, scheduleConf, parallelJobs, parallelJob, priorityPolicy, bucketSplitInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisConf {\n");
        sb.append("    redisMode: ").append(toIndentedString(redisMode)).append("\n");
        sb.append("    scheduleConf: ").append(toIndentedString(scheduleConf)).append("\n");
        sb.append("    parallelJobs: ").append(toIndentedString(parallelJobs)).append("\n");
        sb.append("    parallelJob: ").append(toIndentedString(parallelJob)).append("\n");
        sb.append("    priorityPolicy: ").append(toIndentedString(priorityPolicy)).append("\n");
        sb.append("    bucketSplitInfo: ").append(toIndentedString(bucketSplitInfo)).append("\n");
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
