package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 重分布信息。 **取值范围**： 不涉及。
 */
public class RdsRedisInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_conf")

    private RedisConf redisConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_progress")

    private RedisProgress redisProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_table_detail")

    private RedisTableDetail redisTableDetail;

    public RdsRedisInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 重分布信息ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RdsRedisInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。 **取值范围**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RdsRedisInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。 **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public RdsRedisInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。 **取值范围**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public RdsRedisInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： - PREPARE：准备。 - RUNNING：运行中。 - WAITING：等待中。 - PAUSE：已暂停。 - PAUSING：暂停中。 - SUCCESS：成功。 - FAIL：失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RdsRedisInfo withRedisConf(RedisConf redisConf) {
        this.redisConf = redisConf;
        return this;
    }

    public RdsRedisInfo withRedisConf(Consumer<RedisConf> redisConfSetter) {
        if (this.redisConf == null) {
            this.redisConf = new RedisConf();
            redisConfSetter.accept(this.redisConf);
        }

        return this;
    }

    /**
     * Get redisConf
     * @return redisConf
     */
    public RedisConf getRedisConf() {
        return redisConf;
    }

    public void setRedisConf(RedisConf redisConf) {
        this.redisConf = redisConf;
    }

    public RdsRedisInfo withRedisProgress(RedisProgress redisProgress) {
        this.redisProgress = redisProgress;
        return this;
    }

    public RdsRedisInfo withRedisProgress(Consumer<RedisProgress> redisProgressSetter) {
        if (this.redisProgress == null) {
            this.redisProgress = new RedisProgress();
            redisProgressSetter.accept(this.redisProgress);
        }

        return this;
    }

    /**
     * Get redisProgress
     * @return redisProgress
     */
    public RedisProgress getRedisProgress() {
        return redisProgress;
    }

    public void setRedisProgress(RedisProgress redisProgress) {
        this.redisProgress = redisProgress;
    }

    public RdsRedisInfo withRedisTableDetail(RedisTableDetail redisTableDetail) {
        this.redisTableDetail = redisTableDetail;
        return this;
    }

    public RdsRedisInfo withRedisTableDetail(Consumer<RedisTableDetail> redisTableDetailSetter) {
        if (this.redisTableDetail == null) {
            this.redisTableDetail = new RedisTableDetail();
            redisTableDetailSetter.accept(this.redisTableDetail);
        }

        return this;
    }

    /**
     * Get redisTableDetail
     * @return redisTableDetail
     */
    public RedisTableDetail getRedisTableDetail() {
        return redisTableDetail;
    }

    public void setRedisTableDetail(RedisTableDetail redisTableDetail) {
        this.redisTableDetail = redisTableDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdsRedisInfo that = (RdsRedisInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.redisConf, that.redisConf)
            && Objects.equals(this.redisProgress, that.redisProgress)
            && Objects.equals(this.redisTableDetail, that.redisTableDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clusterId, startTime, endTime, status, redisConf, redisProgress, redisTableDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RdsRedisInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    redisConf: ").append(toIndentedString(redisConf)).append("\n");
        sb.append("    redisProgress: ").append(toIndentedString(redisProgress)).append("\n");
        sb.append("    redisTableDetail: ").append(toIndentedString(redisTableDetail)).append("\n");
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
