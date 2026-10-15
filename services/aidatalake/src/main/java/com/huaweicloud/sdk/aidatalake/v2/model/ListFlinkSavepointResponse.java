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
public class ListFlinkSavepointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoints")

    private List<FlinkSavepointSummary> savepoints = null;

    public ListFlinkSavepointResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：Savepoint总数。 **取值范围**：0~2147483647。 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListFlinkSavepointResponse withSavepoints(List<FlinkSavepointSummary> savepoints) {
        this.savepoints = savepoints;
        return this;
    }

    public ListFlinkSavepointResponse addSavepointsItem(FlinkSavepointSummary savepointsItem) {
        if (this.savepoints == null) {
            this.savepoints = new ArrayList<>();
        }
        this.savepoints.add(savepointsItem);
        return this;
    }

    public ListFlinkSavepointResponse withSavepoints(Consumer<List<FlinkSavepointSummary>> savepointsSetter) {
        if (this.savepoints == null) {
            this.savepoints = new ArrayList<>();
        }
        savepointsSetter.accept(this.savepoints);
        return this;
    }

    /**
     * **参数解释**：Savepoint摘要信息列表。可显示0~1000个FlinkSavepointSummary对象。 
     * @return savepoints
     */
    public List<FlinkSavepointSummary> getSavepoints() {
        return savepoints;
    }

    public void setSavepoints(List<FlinkSavepointSummary> savepoints) {
        this.savepoints = savepoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkSavepointResponse that = (ListFlinkSavepointResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.savepoints, that.savepoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, savepoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkSavepointResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    savepoints: ").append(toIndentedString(savepoints)).append("\n");
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
