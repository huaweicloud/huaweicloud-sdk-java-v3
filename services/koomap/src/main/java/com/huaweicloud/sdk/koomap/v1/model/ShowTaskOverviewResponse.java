package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished")

    private Integer finished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unfinished")

    private Integer unfinished;

    public ShowTaskOverviewResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 空间下任务总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowTaskOverviewResponse withFinished(Integer finished) {
        this.finished = finished;
        return this;
    }

    /**
     * 空间下已处理完成任务数量。
     * @return finished
     */
    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public ShowTaskOverviewResponse withUnfinished(Integer unfinished) {
        this.unfinished = unfinished;
        return this;
    }

    /**
     * 空间下执行中任务数量。
     * @return unfinished
     */
    public Integer getUnfinished() {
        return unfinished;
    }

    public void setUnfinished(Integer unfinished) {
        this.unfinished = unfinished;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskOverviewResponse that = (ShowTaskOverviewResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.finished, that.finished)
            && Objects.equals(this.unfinished, that.unfinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, finished, unfinished);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskOverviewResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    unfinished: ").append(toIndentedString(unfinished)).append("\n");
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
