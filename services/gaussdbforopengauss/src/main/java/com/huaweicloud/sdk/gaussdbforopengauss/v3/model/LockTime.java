package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LockTime
 */
public class LockTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time_details")

    private EventTimeInfo lockTimeDetails;

    public LockTime withAllTime(Long allTime) {
        this.allTime = allTime;
        return this;
    }

    /**
     * **参数解释**: 总耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return allTime
     */
    public Long getAllTime() {
        return allTime;
    }

    public void setAllTime(Long allTime) {
        this.allTime = allTime;
    }

    public LockTime withLockTimeDetails(EventTimeInfo lockTimeDetails) {
        this.lockTimeDetails = lockTimeDetails;
        return this;
    }

    public LockTime withLockTimeDetails(Consumer<EventTimeInfo> lockTimeDetailsSetter) {
        if (this.lockTimeDetails == null) {
            this.lockTimeDetails = new EventTimeInfo();
            lockTimeDetailsSetter.accept(this.lockTimeDetails);
        }

        return this;
    }

    /**
     * Get lockTimeDetails
     * @return lockTimeDetails
     */
    public EventTimeInfo getLockTimeDetails() {
        return lockTimeDetails;
    }

    public void setLockTimeDetails(EventTimeInfo lockTimeDetails) {
        this.lockTimeDetails = lockTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LockTime that = (LockTime) obj;
        return Objects.equals(this.allTime, that.allTime) && Objects.equals(this.lockTimeDetails, that.lockTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, lockTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LockTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    lockTimeDetails: ").append(toIndentedString(lockTimeDetails)).append("\n");
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
