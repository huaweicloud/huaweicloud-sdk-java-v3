package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWaitingLocksSnapshotResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx")

    private List<InnodbTrxInfo> trx = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_waits_infos")

    private List<Object> lockWaitsInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_lock_count")

    private Integer waitLockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hold_lock_count")

    private Integer holdLockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_greater_than_count")

    private Integer timeGreaterThanCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_wait_threshold_second")

    private Long lockWaitThresholdSecond;

    public ShowWaitingLocksSnapshotResponse withTrx(List<InnodbTrxInfo> trx) {
        this.trx = trx;
        return this;
    }

    public ShowWaitingLocksSnapshotResponse addTrxItem(InnodbTrxInfo trxItem) {
        if (this.trx == null) {
            this.trx = new ArrayList<>();
        }
        this.trx.add(trxItem);
        return this;
    }

    public ShowWaitingLocksSnapshotResponse withTrx(Consumer<List<InnodbTrxInfo>> trxSetter) {
        if (this.trx == null) {
            this.trx = new ArrayList<>();
        }
        trxSetter.accept(this.trx);
        return this;
    }

    /**
     * InnoDB锁对应的事务的信息
     * @return trx
     */
    public List<InnodbTrxInfo> getTrx() {
        return trx;
    }

    public void setTrx(List<InnodbTrxInfo> trx) {
        this.trx = trx;
    }

    public ShowWaitingLocksSnapshotResponse withLockWaitsInfos(List<Object> lockWaitsInfos) {
        this.lockWaitsInfos = lockWaitsInfos;
        return this;
    }

    public ShowWaitingLocksSnapshotResponse addLockWaitsInfosItem(Object lockWaitsInfosItem) {
        if (this.lockWaitsInfos == null) {
            this.lockWaitsInfos = new ArrayList<>();
        }
        this.lockWaitsInfos.add(lockWaitsInfosItem);
        return this;
    }

    public ShowWaitingLocksSnapshotResponse withLockWaitsInfos(Consumer<List<Object>> lockWaitsInfosSetter) {
        if (this.lockWaitsInfos == null) {
            this.lockWaitsInfos = new ArrayList<>();
        }
        lockWaitsInfosSetter.accept(this.lockWaitsInfos);
        return this;
    }

    /**
     * InnoDB锁等待信息
     * @return lockWaitsInfos
     */
    public List<Object> getLockWaitsInfos() {
        return lockWaitsInfos;
    }

    public void setLockWaitsInfos(List<Object> lockWaitsInfos) {
        this.lockWaitsInfos = lockWaitsInfos;
    }

    public ShowWaitingLocksSnapshotResponse withWaitLockCount(Integer waitLockCount) {
        this.waitLockCount = waitLockCount;
        return this;
    }

    /**
     * 等待锁的会话的数量
     * @return waitLockCount
     */
    public Integer getWaitLockCount() {
        return waitLockCount;
    }

    public void setWaitLockCount(Integer waitLockCount) {
        this.waitLockCount = waitLockCount;
    }

    public ShowWaitingLocksSnapshotResponse withHoldLockCount(Integer holdLockCount) {
        this.holdLockCount = holdLockCount;
        return this;
    }

    /**
     * 持有锁的会话的数量
     * @return holdLockCount
     */
    public Integer getHoldLockCount() {
        return holdLockCount;
    }

    public void setHoldLockCount(Integer holdLockCount) {
        this.holdLockCount = holdLockCount;
    }

    public ShowWaitingLocksSnapshotResponse withTimeGreaterThanCount(Integer timeGreaterThanCount) {
        this.timeGreaterThanCount = timeGreaterThanCount;
        return this;
    }

    /**
     * 等锁时间大于阈值的会话的数量
     * @return timeGreaterThanCount
     */
    public Integer getTimeGreaterThanCount() {
        return timeGreaterThanCount;
    }

    public void setTimeGreaterThanCount(Integer timeGreaterThanCount) {
        this.timeGreaterThanCount = timeGreaterThanCount;
    }

    public ShowWaitingLocksSnapshotResponse withLockWaitThresholdSecond(Long lockWaitThresholdSecond) {
        this.lockWaitThresholdSecond = lockWaitThresholdSecond;
        return this;
    }

    /**
     * InnoDB锁等待时间阈值
     * @return lockWaitThresholdSecond
     */
    public Long getLockWaitThresholdSecond() {
        return lockWaitThresholdSecond;
    }

    public void setLockWaitThresholdSecond(Long lockWaitThresholdSecond) {
        this.lockWaitThresholdSecond = lockWaitThresholdSecond;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWaitingLocksSnapshotResponse that = (ShowWaitingLocksSnapshotResponse) obj;
        return Objects.equals(this.trx, that.trx) && Objects.equals(this.lockWaitsInfos, that.lockWaitsInfos)
            && Objects.equals(this.waitLockCount, that.waitLockCount)
            && Objects.equals(this.holdLockCount, that.holdLockCount)
            && Objects.equals(this.timeGreaterThanCount, that.timeGreaterThanCount)
            && Objects.equals(this.lockWaitThresholdSecond, that.lockWaitThresholdSecond);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(trx, lockWaitsInfos, waitLockCount, holdLockCount, timeGreaterThanCount, lockWaitThresholdSecond);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWaitingLocksSnapshotResponse {\n");
        sb.append("    trx: ").append(toIndentedString(trx)).append("\n");
        sb.append("    lockWaitsInfos: ").append(toIndentedString(lockWaitsInfos)).append("\n");
        sb.append("    waitLockCount: ").append(toIndentedString(waitLockCount)).append("\n");
        sb.append("    holdLockCount: ").append(toIndentedString(holdLockCount)).append("\n");
        sb.append("    timeGreaterThanCount: ").append(toIndentedString(timeGreaterThanCount)).append("\n");
        sb.append("    lockWaitThresholdSecond: ").append(toIndentedString(lockWaitThresholdSecond)).append("\n");
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
