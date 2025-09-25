package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源类等待事件耗时
 */
public class ResourceWaitEvenTimeDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_io_time")

    private DataIoTime dataIoTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private LockTime lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lwlock_time")

    private LwlockTime lwlockTime;

    public ResourceWaitEvenTimeDetails withDataIoTime(DataIoTime dataIoTime) {
        this.dataIoTime = dataIoTime;
        return this;
    }

    public ResourceWaitEvenTimeDetails withDataIoTime(Consumer<DataIoTime> dataIoTimeSetter) {
        if (this.dataIoTime == null) {
            this.dataIoTime = new DataIoTime();
            dataIoTimeSetter.accept(this.dataIoTime);
        }

        return this;
    }

    /**
     * Get dataIoTime
     * @return dataIoTime
     */
    public DataIoTime getDataIoTime() {
        return dataIoTime;
    }

    public void setDataIoTime(DataIoTime dataIoTime) {
        this.dataIoTime = dataIoTime;
    }

    public ResourceWaitEvenTimeDetails withLockTime(LockTime lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    public ResourceWaitEvenTimeDetails withLockTime(Consumer<LockTime> lockTimeSetter) {
        if (this.lockTime == null) {
            this.lockTime = new LockTime();
            lockTimeSetter.accept(this.lockTime);
        }

        return this;
    }

    /**
     * Get lockTime
     * @return lockTime
     */
    public LockTime getLockTime() {
        return lockTime;
    }

    public void setLockTime(LockTime lockTime) {
        this.lockTime = lockTime;
    }

    public ResourceWaitEvenTimeDetails withLwlockTime(LwlockTime lwlockTime) {
        this.lwlockTime = lwlockTime;
        return this;
    }

    public ResourceWaitEvenTimeDetails withLwlockTime(Consumer<LwlockTime> lwlockTimeSetter) {
        if (this.lwlockTime == null) {
            this.lwlockTime = new LwlockTime();
            lwlockTimeSetter.accept(this.lwlockTime);
        }

        return this;
    }

    /**
     * Get lwlockTime
     * @return lwlockTime
     */
    public LwlockTime getLwlockTime() {
        return lwlockTime;
    }

    public void setLwlockTime(LwlockTime lwlockTime) {
        this.lwlockTime = lwlockTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceWaitEvenTimeDetails that = (ResourceWaitEvenTimeDetails) obj;
        return Objects.equals(this.dataIoTime, that.dataIoTime) && Objects.equals(this.lockTime, that.lockTime)
            && Objects.equals(this.lwlockTime, that.lwlockTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataIoTime, lockTime, lwlockTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceWaitEvenTimeDetails {\n");
        sb.append("    dataIoTime: ").append(toIndentedString(dataIoTime)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    lwlockTime: ").append(toIndentedString(lwlockTime)).append("\n");
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
