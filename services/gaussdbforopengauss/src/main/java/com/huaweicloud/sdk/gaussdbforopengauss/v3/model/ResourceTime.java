package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源耗时信息
 */
public class ResourceTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_time_details")

    private ResourceTimeDetails resourceTimeDetails;

    public ResourceTime withAllTime(Long allTime) {
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

    public ResourceTime withResourceTimeDetails(ResourceTimeDetails resourceTimeDetails) {
        this.resourceTimeDetails = resourceTimeDetails;
        return this;
    }

    public ResourceTime withResourceTimeDetails(Consumer<ResourceTimeDetails> resourceTimeDetailsSetter) {
        if (this.resourceTimeDetails == null) {
            this.resourceTimeDetails = new ResourceTimeDetails();
            resourceTimeDetailsSetter.accept(this.resourceTimeDetails);
        }

        return this;
    }

    /**
     * Get resourceTimeDetails
     * @return resourceTimeDetails
     */
    public ResourceTimeDetails getResourceTimeDetails() {
        return resourceTimeDetails;
    }

    public void setResourceTimeDetails(ResourceTimeDetails resourceTimeDetails) {
        this.resourceTimeDetails = resourceTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceTime that = (ResourceTime) obj;
        return Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.resourceTimeDetails, that.resourceTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, resourceTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    resourceTimeDetails: ").append(toIndentedString(resourceTimeDetails)).append("\n");
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
