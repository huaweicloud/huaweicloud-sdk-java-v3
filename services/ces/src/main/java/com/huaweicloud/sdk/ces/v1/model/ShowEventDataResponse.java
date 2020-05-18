package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.EventDataInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowEventDataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datapoints")
    
    private List<EventDataInfo> datapoints = null;
    
    public ShowEventDataResponse withDatapoints(List<EventDataInfo> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    
    public ShowEventDataResponse addDatapointsItem(EventDataInfo datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ShowEventDataResponse withDatapoints(Consumer<List<EventDataInfo>> datapointsSetter) {
        if(this.datapoints == null ){
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 
     * @return datapoints
     */
    public List<EventDataInfo> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<EventDataInfo> datapoints) {
        this.datapoints = datapoints;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEventDataResponse showEventDataResponse = (ShowEventDataResponse) o;
        return Objects.equals(this.datapoints, showEventDataResponse.datapoints);
    }
    @Override
    public int hashCode() {
        return Objects.hash(datapoints);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventDataResponse {\n");
            sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
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

