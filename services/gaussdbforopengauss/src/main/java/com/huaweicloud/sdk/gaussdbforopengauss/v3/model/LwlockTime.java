package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 轻量级锁耗时信息
 */
public class LwlockTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lwlock_time_details")

    private EventTimeInfo lwlockTimeDetails;

    public LwlockTime withAllTime(Long allTime) {
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

    public LwlockTime withLwlockTimeDetails(EventTimeInfo lwlockTimeDetails) {
        this.lwlockTimeDetails = lwlockTimeDetails;
        return this;
    }

    public LwlockTime withLwlockTimeDetails(Consumer<EventTimeInfo> lwlockTimeDetailsSetter) {
        if (this.lwlockTimeDetails == null) {
            this.lwlockTimeDetails = new EventTimeInfo();
            lwlockTimeDetailsSetter.accept(this.lwlockTimeDetails);
        }

        return this;
    }

    /**
     * Get lwlockTimeDetails
     * @return lwlockTimeDetails
     */
    public EventTimeInfo getLwlockTimeDetails() {
        return lwlockTimeDetails;
    }

    public void setLwlockTimeDetails(EventTimeInfo lwlockTimeDetails) {
        this.lwlockTimeDetails = lwlockTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LwlockTime that = (LwlockTime) obj;
        return Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.lwlockTimeDetails, that.lwlockTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, lwlockTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LwlockTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    lwlockTimeDetails: ").append(toIndentedString(lwlockTimeDetails)).append("\n");
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
