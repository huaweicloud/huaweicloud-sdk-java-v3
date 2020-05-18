package com.huaweicloud.sdk.cts.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cts.v1.model.MetaData;
import com.huaweicloud.sdk.cts.v1.model.Traces;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListTracesV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="traces")
    
    private List<Traces> traces = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private MetaData metaData = null;

    public ListTracesV2Response withTraces(List<Traces> traces) {
        this.traces = traces;
        return this;
    }

    
    public ListTracesV2Response addTracesItem(Traces tracesItem) {
        if (this.traces == null) {
            this.traces = new ArrayList<>();
        }
        this.traces.add(tracesItem);
        return this;
    }

    public ListTracesV2Response withTraces(Consumer<List<Traces>> tracesSetter) {
        if(this.traces == null ){
            this.traces = new ArrayList<>();
        }
        tracesSetter.accept(this.traces);
        return this;
    }

    /**
     * 本次查询事件列表返回事件数组。
     * @return traces
     */
    public List<Traces> getTraces() {
        return traces;
    }

    public void setTraces(List<Traces> traces) {
        this.traces = traces;
    }

    public ListTracesV2Response withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListTracesV2Response withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaData();
        }
        metaDataSetter.accept(this.metaData);
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTracesV2Response listTracesV2Response = (ListTracesV2Response) o;
        return Objects.equals(this.traces, listTracesV2Response.traces) &&
            Objects.equals(this.metaData, listTracesV2Response.metaData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(traces, metaData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTracesV2Response {\n");
            sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
            sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

