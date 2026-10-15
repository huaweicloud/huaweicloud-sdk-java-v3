package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListFlinkJobAutoscalingHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling_histories")

    private List<AutoscalingHistory> autoscalingHistories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListFlinkJobAutoscalingHistoriesResponse withAutoscalingHistories(
        List<AutoscalingHistory> autoscalingHistories) {
        this.autoscalingHistories = autoscalingHistories;
        return this;
    }

    public ListFlinkJobAutoscalingHistoriesResponse addAutoscalingHistoriesItem(
        AutoscalingHistory autoscalingHistoriesItem) {
        if (this.autoscalingHistories == null) {
            this.autoscalingHistories = new ArrayList<>();
        }
        this.autoscalingHistories.add(autoscalingHistoriesItem);
        return this;
    }

    public ListFlinkJobAutoscalingHistoriesResponse withAutoscalingHistories(
        Consumer<List<AutoscalingHistory>> autoscalingHistoriesSetter) {
        if (this.autoscalingHistories == null) {
            this.autoscalingHistories = new ArrayList<>();
        }
        autoscalingHistoriesSetter.accept(this.autoscalingHistories);
        return this;
    }

    /**
     * **参数解释**：调优历史记录列表。
     * @return autoscalingHistories
     */
    public List<AutoscalingHistory> getAutoscalingHistories() {
        return autoscalingHistories;
    }

    public void setAutoscalingHistories(List<AutoscalingHistory> autoscalingHistories) {
        this.autoscalingHistories = autoscalingHistories;
    }

    public ListFlinkJobAutoscalingHistoriesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：调优历史记录总数。 **取值范围**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkJobAutoscalingHistoriesResponse that = (ListFlinkJobAutoscalingHistoriesResponse) obj;
        return Objects.equals(this.autoscalingHistories, that.autoscalingHistories)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoscalingHistories, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkJobAutoscalingHistoriesResponse {\n");
        sb.append("    autoscalingHistories: ").append(toIndentedString(autoscalingHistories)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
