package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CodeWaitEventTime
 */
public class CodeWaitEventTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_wait_event_time_details")

    private EventTimeInfo codeWaitEventTimeDetails;

    public CodeWaitEventTime withAllTime(Long allTime) {
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

    public CodeWaitEventTime withCodeWaitEventTimeDetails(EventTimeInfo codeWaitEventTimeDetails) {
        this.codeWaitEventTimeDetails = codeWaitEventTimeDetails;
        return this;
    }

    public CodeWaitEventTime withCodeWaitEventTimeDetails(Consumer<EventTimeInfo> codeWaitEventTimeDetailsSetter) {
        if (this.codeWaitEventTimeDetails == null) {
            this.codeWaitEventTimeDetails = new EventTimeInfo();
            codeWaitEventTimeDetailsSetter.accept(this.codeWaitEventTimeDetails);
        }

        return this;
    }

    /**
     * Get codeWaitEventTimeDetails
     * @return codeWaitEventTimeDetails
     */
    public EventTimeInfo getCodeWaitEventTimeDetails() {
        return codeWaitEventTimeDetails;
    }

    public void setCodeWaitEventTimeDetails(EventTimeInfo codeWaitEventTimeDetails) {
        this.codeWaitEventTimeDetails = codeWaitEventTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeWaitEventTime that = (CodeWaitEventTime) obj;
        return Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.codeWaitEventTimeDetails, that.codeWaitEventTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, codeWaitEventTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeWaitEventTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    codeWaitEventTimeDetails: ").append(toIndentedString(codeWaitEventTimeDetails)).append("\n");
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
