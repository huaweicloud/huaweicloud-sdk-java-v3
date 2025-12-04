package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StepDetail
 */
public class StepDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public StepDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 任务名称。  **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StepDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 任务状态。 **取值范围**： - COMPLETED：任务已完成。 - IN_PROGRESS：任务正在进行。 - FAILED：任务失败。 - WAITING：等待开始。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StepDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。     **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public StepDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。 **取值范围**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StepDetail that = (StepDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
