package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSearchFactoryBaselinesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baselines")

    private List<BaselineV2> baselines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListSearchFactoryBaselinesResponse withBaselines(List<BaselineV2> baselines) {
        this.baselines = baselines;
        return this;
    }

    public ListSearchFactoryBaselinesResponse addBaselinesItem(BaselineV2 baselinesItem) {
        if (this.baselines == null) {
            this.baselines = new ArrayList<>();
        }
        this.baselines.add(baselinesItem);
        return this;
    }

    public ListSearchFactoryBaselinesResponse withBaselines(Consumer<List<BaselineV2>> baselinesSetter) {
        if (this.baselines == null) {
            this.baselines = new ArrayList<>();
        }
        baselinesSetter.accept(this.baselines);
        return this;
    }

    /**
     * 基线任务。
     * @return baselines
     */
    public List<BaselineV2> getBaselines() {
        return baselines;
    }

    public void setBaselines(List<BaselineV2> baselines) {
        this.baselines = baselines;
    }

    public ListSearchFactoryBaselinesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSearchFactoryBaselinesResponse that = (ListSearchFactoryBaselinesResponse) obj;
        return Objects.equals(this.baselines, that.baselines) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselines, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSearchFactoryBaselinesResponse {\n");
        sb.append("    baselines: ").append(toIndentedString(baselines)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
