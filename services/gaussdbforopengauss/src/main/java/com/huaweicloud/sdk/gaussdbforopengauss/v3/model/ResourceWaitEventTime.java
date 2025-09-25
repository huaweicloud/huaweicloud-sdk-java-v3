package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceWaitEventTime
 */
public class ResourceWaitEventTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_wait_event_time_details")

    private ResourceWaitEvenTimeDetails resourceWaitEventTimeDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_time")

    private Long otherTime;

    public ResourceWaitEventTime withAllTime(Long allTime) {
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

    public ResourceWaitEventTime withResourceWaitEventTimeDetails(
        ResourceWaitEvenTimeDetails resourceWaitEventTimeDetails) {
        this.resourceWaitEventTimeDetails = resourceWaitEventTimeDetails;
        return this;
    }

    public ResourceWaitEventTime withResourceWaitEventTimeDetails(
        Consumer<ResourceWaitEvenTimeDetails> resourceWaitEventTimeDetailsSetter) {
        if (this.resourceWaitEventTimeDetails == null) {
            this.resourceWaitEventTimeDetails = new ResourceWaitEvenTimeDetails();
            resourceWaitEventTimeDetailsSetter.accept(this.resourceWaitEventTimeDetails);
        }

        return this;
    }

    /**
     * Get resourceWaitEventTimeDetails
     * @return resourceWaitEventTimeDetails
     */
    public ResourceWaitEvenTimeDetails getResourceWaitEventTimeDetails() {
        return resourceWaitEventTimeDetails;
    }

    public void setResourceWaitEventTimeDetails(ResourceWaitEvenTimeDetails resourceWaitEventTimeDetails) {
        this.resourceWaitEventTimeDetails = resourceWaitEventTimeDetails;
    }

    public ResourceWaitEventTime withOtherTime(Long otherTime) {
        this.otherTime = otherTime;
        return this;
    }

    /**
     * **参数解释**: 资源类等待事件外耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return otherTime
     */
    public Long getOtherTime() {
        return otherTime;
    }

    public void setOtherTime(Long otherTime) {
        this.otherTime = otherTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceWaitEventTime that = (ResourceWaitEventTime) obj;
        return Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.resourceWaitEventTimeDetails, that.resourceWaitEventTimeDetails)
            && Objects.equals(this.otherTime, that.otherTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, resourceWaitEventTimeDetails, otherTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceWaitEventTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    resourceWaitEventTimeDetails: ")
            .append(toIndentedString(resourceWaitEventTimeDetails))
            .append("\n");
        sb.append("    otherTime: ").append(toIndentedString(otherTime)).append("\n");
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
