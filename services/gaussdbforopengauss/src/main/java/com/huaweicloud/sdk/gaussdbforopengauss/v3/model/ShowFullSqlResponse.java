package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowFullSqlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_statistics")

    private Object traceStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<FullSqlComponetResult> components = null;

    public ShowFullSqlResponse withTraceStatistics(Object traceStatistics) {
        this.traceStatistics = traceStatistics;
        return this;
    }

    /**
     * **参数解释**: 链路详情。
     * @return traceStatistics
     */
    public Object getTraceStatistics() {
        return traceStatistics;
    }

    public void setTraceStatistics(Object traceStatistics) {
        this.traceStatistics = traceStatistics;
    }

    public ShowFullSqlResponse withComponents(List<FullSqlComponetResult> components) {
        this.components = components;
        return this;
    }

    public ShowFullSqlResponse addComponentsItem(FullSqlComponetResult componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public ShowFullSqlResponse withComponents(Consumer<List<FullSqlComponetResult>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * **参数解释**: 组件上SQL执行记录列表。
     * @return components
     */
    public List<FullSqlComponetResult> getComponents() {
        return components;
    }

    public void setComponents(List<FullSqlComponetResult> components) {
        this.components = components;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFullSqlResponse that = (ShowFullSqlResponse) obj;
        return Objects.equals(this.traceStatistics, that.traceStatistics)
            && Objects.equals(this.components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceStatistics, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFullSqlResponse {\n");
        sb.append("    traceStatistics: ").append(toIndentedString(traceStatistics)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
