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
public class ShowMetaLockResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infos")

    private List<MetaLockInfo> infos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

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

    public ShowMetaLockResponse withInfos(List<MetaLockInfo> infos) {
        this.infos = infos;
        return this;
    }

    public ShowMetaLockResponse addInfosItem(MetaLockInfo infosItem) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        this.infos.add(infosItem);
        return this;
    }

    public ShowMetaLockResponse withInfos(Consumer<List<MetaLockInfo>> infosSetter) {
        if (this.infos == null) {
            this.infos = new ArrayList<>();
        }
        infosSetter.accept(this.infos);
        return this;
    }

    /**
     * MDL锁等待信息
     * @return infos
     */
    public List<MetaLockInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<MetaLockInfo> infos) {
        this.infos = infos;
    }

    public ShowMetaLockResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * MDL锁总数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowMetaLockResponse withWaitLockCount(Integer waitLockCount) {
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

    public ShowMetaLockResponse withHoldLockCount(Integer holdLockCount) {
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

    public ShowMetaLockResponse withTimeGreaterThanCount(Integer timeGreaterThanCount) {
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

    public ShowMetaLockResponse withLockWaitThresholdSecond(Long lockWaitThresholdSecond) {
        this.lockWaitThresholdSecond = lockWaitThresholdSecond;
        return this;
    }

    /**
     * MDL锁等待时间阈值
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
        ShowMetaLockResponse that = (ShowMetaLockResponse) obj;
        return Objects.equals(this.infos, that.infos) && Objects.equals(this.count, that.count)
            && Objects.equals(this.waitLockCount, that.waitLockCount)
            && Objects.equals(this.holdLockCount, that.holdLockCount)
            && Objects.equals(this.timeGreaterThanCount, that.timeGreaterThanCount)
            && Objects.equals(this.lockWaitThresholdSecond, that.lockWaitThresholdSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infos, count, waitLockCount, holdLockCount, timeGreaterThanCount, lockWaitThresholdSecond);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetaLockResponse {\n");
        sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
