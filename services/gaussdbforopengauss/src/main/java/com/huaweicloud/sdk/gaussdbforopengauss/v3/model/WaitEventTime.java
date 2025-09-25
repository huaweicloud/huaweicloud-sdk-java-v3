package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WaitEventTime
 */
public class WaitEventTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_wait_event_time")

    private CodeWaitEventTime codeWaitEventTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_wait_event_time")

    private ResourceWaitEventTime resourceWaitEventTime;

    public WaitEventTime withCodeWaitEventTime(CodeWaitEventTime codeWaitEventTime) {
        this.codeWaitEventTime = codeWaitEventTime;
        return this;
    }

    public WaitEventTime withCodeWaitEventTime(Consumer<CodeWaitEventTime> codeWaitEventTimeSetter) {
        if (this.codeWaitEventTime == null) {
            this.codeWaitEventTime = new CodeWaitEventTime();
            codeWaitEventTimeSetter.accept(this.codeWaitEventTime);
        }

        return this;
    }

    /**
     * Get codeWaitEventTime
     * @return codeWaitEventTime
     */
    public CodeWaitEventTime getCodeWaitEventTime() {
        return codeWaitEventTime;
    }

    public void setCodeWaitEventTime(CodeWaitEventTime codeWaitEventTime) {
        this.codeWaitEventTime = codeWaitEventTime;
    }

    public WaitEventTime withResourceWaitEventTime(ResourceWaitEventTime resourceWaitEventTime) {
        this.resourceWaitEventTime = resourceWaitEventTime;
        return this;
    }

    public WaitEventTime withResourceWaitEventTime(Consumer<ResourceWaitEventTime> resourceWaitEventTimeSetter) {
        if (this.resourceWaitEventTime == null) {
            this.resourceWaitEventTime = new ResourceWaitEventTime();
            resourceWaitEventTimeSetter.accept(this.resourceWaitEventTime);
        }

        return this;
    }

    /**
     * Get resourceWaitEventTime
     * @return resourceWaitEventTime
     */
    public ResourceWaitEventTime getResourceWaitEventTime() {
        return resourceWaitEventTime;
    }

    public void setResourceWaitEventTime(ResourceWaitEventTime resourceWaitEventTime) {
        this.resourceWaitEventTime = resourceWaitEventTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WaitEventTime that = (WaitEventTime) obj;
        return Objects.equals(this.codeWaitEventTime, that.codeWaitEventTime)
            && Objects.equals(this.resourceWaitEventTime, that.resourceWaitEventTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeWaitEventTime, resourceWaitEventTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WaitEventTime {\n");
        sb.append("    codeWaitEventTime: ").append(toIndentedString(codeWaitEventTime)).append("\n");
        sb.append("    resourceWaitEventTime: ").append(toIndentedString(resourceWaitEventTime)).append("\n");
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
