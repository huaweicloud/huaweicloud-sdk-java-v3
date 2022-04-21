package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNumberOfInstancesInDifferentStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis")

    private StatusStatistic redis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memcached")

    private StatusStatistic memcached;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paying_count")

    private Integer payingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezing_count")

    private Integer freezingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrating_count")

    private Integer migratingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flushing_count")

    private Integer flushingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrading_count")

    private Integer upgradingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoring_count")

    private Integer restoringCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extending_count")

    private Integer extendingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creating_count")

    private Integer creatingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private Integer runningCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    private Integer errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_count")

    private Integer frozenCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createfailed_count")

    private Integer createfailedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restarting_count")

    private Integer restartingCount;

    public ListNumberOfInstancesInDifferentStatusResponse withRedis(StatusStatistic redis) {
        this.redis = redis;
        return this;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withRedis(Consumer<StatusStatistic> redisSetter) {
        if (this.redis == null) {
            this.redis = new StatusStatistic();
            redisSetter.accept(this.redis);
        }

        return this;
    }

    /**
     * Get redis
     * @return redis
     */
    public StatusStatistic getRedis() {
        return redis;
    }

    public void setRedis(StatusStatistic redis) {
        this.redis = redis;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withMemcached(StatusStatistic memcached) {
        this.memcached = memcached;
        return this;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withMemcached(Consumer<StatusStatistic> memcachedSetter) {
        if (this.memcached == null) {
            this.memcached = new StatusStatistic();
            memcachedSetter.accept(this.memcached);
        }

        return this;
    }

    /**
     * Get memcached
     * @return memcached
     */
    public StatusStatistic getMemcached() {
        return memcached;
    }

    public void setMemcached(StatusStatistic memcached) {
        this.memcached = memcached;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withPayingCount(Integer payingCount) {
        this.payingCount = payingCount;
        return this;
    }

    /**
     * 支付中的实例数。
     * @return payingCount
     */
    public Integer getPayingCount() {
        return payingCount;
    }

    public void setPayingCount(Integer payingCount) {
        this.payingCount = payingCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withFreezingCount(Integer freezingCount) {
        this.freezingCount = freezingCount;
        return this;
    }

    /**
     * 冻结中的实例数。
     * @return freezingCount
     */
    public Integer getFreezingCount() {
        return freezingCount;
    }

    public void setFreezingCount(Integer freezingCount) {
        this.freezingCount = freezingCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withMigratingCount(Integer migratingCount) {
        this.migratingCount = migratingCount;
        return this;
    }

    /**
     * 迁移中的实例数。
     * @return migratingCount
     */
    public Integer getMigratingCount() {
        return migratingCount;
    }

    public void setMigratingCount(Integer migratingCount) {
        this.migratingCount = migratingCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withFlushingCount(Integer flushingCount) {
        this.flushingCount = flushingCount;
        return this;
    }

    /**
     * 清空中的实例数。
     * @return flushingCount
     */
    public Integer getFlushingCount() {
        return flushingCount;
    }

    public void setFlushingCount(Integer flushingCount) {
        this.flushingCount = flushingCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withUpgradingCount(Integer upgradingCount) {
        this.upgradingCount = upgradingCount;
        return this;
    }

    /**
     * 升级中的实例数。
     * @return upgradingCount
     */
    public Integer getUpgradingCount() {
        return upgradingCount;
    }

    public void setUpgradingCount(Integer upgradingCount) {
        this.upgradingCount = upgradingCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withRestoringCount(Integer restoringCount) {
        this.restoringCount = restoringCount;
        return this;
    }

    /**
     * 恢复中的实例数。
     * @return restoringCount
     */
    public Integer getRestoringCount() {
        return restoringCount;
    }

    public void setRestoringCount(Integer restoringCount) {
        this.restoringCount = restoringCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withExtendingCount(Integer extendingCount) {
        this.extendingCount = extendingCount;
        return this;
    }

    /**
     * 扩容中的实例数。
     * @return extendingCount
     */
    public Integer getExtendingCount() {
        return extendingCount;
    }

    public void setExtendingCount(Integer extendingCount) {
        this.extendingCount = extendingCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withCreatingCount(Integer creatingCount) {
        this.creatingCount = creatingCount;
        return this;
    }

    /**
     * 正在创建的实例数。
     * @return creatingCount
     */
    public Integer getCreatingCount() {
        return creatingCount;
    }

    public void setCreatingCount(Integer creatingCount) {
        this.creatingCount = creatingCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * 正在运行的实例数。
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * 异常的实例数。
     * @return errorCount
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withFrozenCount(Integer frozenCount) {
        this.frozenCount = frozenCount;
        return this;
    }

    /**
     * 已冻结的实例数。
     * @return frozenCount
     */
    public Integer getFrozenCount() {
        return frozenCount;
    }

    public void setFrozenCount(Integer frozenCount) {
        this.frozenCount = frozenCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withCreatefailedCount(Integer createfailedCount) {
        this.createfailedCount = createfailedCount;
        return this;
    }

    /**
     * 创建失败的实例数。
     * @return createfailedCount
     */
    public Integer getCreatefailedCount() {
        return createfailedCount;
    }

    public void setCreatefailedCount(Integer createfailedCount) {
        this.createfailedCount = createfailedCount;
    }

    public ListNumberOfInstancesInDifferentStatusResponse withRestartingCount(Integer restartingCount) {
        this.restartingCount = restartingCount;
        return this;
    }

    /**
     * 正在重启的实例数。
     * @return restartingCount
     */
    public Integer getRestartingCount() {
        return restartingCount;
    }

    public void setRestartingCount(Integer restartingCount) {
        this.restartingCount = restartingCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNumberOfInstancesInDifferentStatusResponse listNumberOfInstancesInDifferentStatusResponse =
            (ListNumberOfInstancesInDifferentStatusResponse) o;
        return Objects.equals(this.redis, listNumberOfInstancesInDifferentStatusResponse.redis)
            && Objects.equals(this.memcached, listNumberOfInstancesInDifferentStatusResponse.memcached)
            && Objects.equals(this.payingCount, listNumberOfInstancesInDifferentStatusResponse.payingCount)
            && Objects.equals(this.freezingCount, listNumberOfInstancesInDifferentStatusResponse.freezingCount)
            && Objects.equals(this.migratingCount, listNumberOfInstancesInDifferentStatusResponse.migratingCount)
            && Objects.equals(this.flushingCount, listNumberOfInstancesInDifferentStatusResponse.flushingCount)
            && Objects.equals(this.upgradingCount, listNumberOfInstancesInDifferentStatusResponse.upgradingCount)
            && Objects.equals(this.restoringCount, listNumberOfInstancesInDifferentStatusResponse.restoringCount)
            && Objects.equals(this.extendingCount, listNumberOfInstancesInDifferentStatusResponse.extendingCount)
            && Objects.equals(this.creatingCount, listNumberOfInstancesInDifferentStatusResponse.creatingCount)
            && Objects.equals(this.runningCount, listNumberOfInstancesInDifferentStatusResponse.runningCount)
            && Objects.equals(this.errorCount, listNumberOfInstancesInDifferentStatusResponse.errorCount)
            && Objects.equals(this.frozenCount, listNumberOfInstancesInDifferentStatusResponse.frozenCount)
            && Objects.equals(this.createfailedCount, listNumberOfInstancesInDifferentStatusResponse.createfailedCount)
            && Objects.equals(this.restartingCount, listNumberOfInstancesInDifferentStatusResponse.restartingCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redis,
            memcached,
            payingCount,
            freezingCount,
            migratingCount,
            flushingCount,
            upgradingCount,
            restoringCount,
            extendingCount,
            creatingCount,
            runningCount,
            errorCount,
            frozenCount,
            createfailedCount,
            restartingCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNumberOfInstancesInDifferentStatusResponse {\n");
        sb.append("    redis: ").append(toIndentedString(redis)).append("\n");
        sb.append("    memcached: ").append(toIndentedString(memcached)).append("\n");
        sb.append("    payingCount: ").append(toIndentedString(payingCount)).append("\n");
        sb.append("    freezingCount: ").append(toIndentedString(freezingCount)).append("\n");
        sb.append("    migratingCount: ").append(toIndentedString(migratingCount)).append("\n");
        sb.append("    flushingCount: ").append(toIndentedString(flushingCount)).append("\n");
        sb.append("    upgradingCount: ").append(toIndentedString(upgradingCount)).append("\n");
        sb.append("    restoringCount: ").append(toIndentedString(restoringCount)).append("\n");
        sb.append("    extendingCount: ").append(toIndentedString(extendingCount)).append("\n");
        sb.append("    creatingCount: ").append(toIndentedString(creatingCount)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    frozenCount: ").append(toIndentedString(frozenCount)).append("\n");
        sb.append("    createfailedCount: ").append(toIndentedString(createfailedCount)).append("\n");
        sb.append("    restartingCount: ").append(toIndentedString(restartingCount)).append("\n");
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
