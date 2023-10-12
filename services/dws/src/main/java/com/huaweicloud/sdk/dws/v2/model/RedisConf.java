package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重分布配置信息
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

    public RedisConf withRedisMode(String redisMode) {
        this.redisMode = redisMode;
        return this;
    }

    /**
     * 重分布模式
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
     * 并行作业数量
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
     * 并行作业数量
     * @return parallelJob
     */
    public Integer getParallelJob() {
        return parallelJob;
    }

    public void setParallelJob(Integer parallelJob) {
        this.parallelJob = parallelJob;
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
            && Objects.equals(this.parallelJob, that.parallelJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisMode, scheduleConf, parallelJobs, parallelJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisConf {\n");
        sb.append("    redisMode: ").append(toIndentedString(redisMode)).append("\n");
        sb.append("    scheduleConf: ").append(toIndentedString(scheduleConf)).append("\n");
        sb.append("    parallelJobs: ").append(toIndentedString(parallelJobs)).append("\n");
        sb.append("    parallelJob: ").append(toIndentedString(parallelJob)).append("\n");
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
