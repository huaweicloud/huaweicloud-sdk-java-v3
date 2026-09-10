package com.huaweicloud.sdk.rds.v3.model;

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
public class ListOperateRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traces")

    private List<OperateRecord> traces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_operate_type")

    private List<String> allOperateType = null;

    public ListOperateRecordResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 本次查询事件列表返回的事件记录的总条数
     * minimum: 0
     * maximum: 2000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListOperateRecordResponse withTraces(List<OperateRecord> traces) {
        this.traces = traces;
        return this;
    }

    public ListOperateRecordResponse addTracesItem(OperateRecord tracesItem) {
        if (this.traces == null) {
            this.traces = new ArrayList<>();
        }
        this.traces.add(tracesItem);
        return this;
    }

    public ListOperateRecordResponse withTraces(Consumer<List<OperateRecord>> tracesSetter) {
        if (this.traces == null) {
            this.traces = new ArrayList<>();
        }
        tracesSetter.accept(this.traces);
        return this;
    }

    /**
     * 本次查询事件列表返回的事件记录
     * @return traces
     */
    public List<OperateRecord> getTraces() {
        return traces;
    }

    public void setTraces(List<OperateRecord> traces) {
        this.traces = traces;
    }

    public ListOperateRecordResponse withAllOperateType(List<String> allOperateType) {
        this.allOperateType = allOperateType;
        return this;
    }

    public ListOperateRecordResponse addAllOperateTypeItem(String allOperateTypeItem) {
        if (this.allOperateType == null) {
            this.allOperateType = new ArrayList<>();
        }
        this.allOperateType.add(allOperateTypeItem);
        return this;
    }

    public ListOperateRecordResponse withAllOperateType(Consumer<List<String>> allOperateTypeSetter) {
        if (this.allOperateType == null) {
            this.allOperateType = new ArrayList<>();
        }
        allOperateTypeSetter.accept(this.allOperateType);
        return this;
    }

    /**
     * 所有事件类型
     * @return allOperateType
     */
    public List<String> getAllOperateType() {
        return allOperateType;
    }

    public void setAllOperateType(List<String> allOperateType) {
        this.allOperateType = allOperateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOperateRecordResponse that = (ListOperateRecordResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.traces, that.traces)
            && Objects.equals(this.allOperateType, that.allOperateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, traces, allOperateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOperateRecordResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
        sb.append("    allOperateType: ").append(toIndentedString(allOperateType)).append("\n");
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
