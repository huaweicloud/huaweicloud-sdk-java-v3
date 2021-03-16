package com.huaweicloud.sdk.das.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.das.v3.model.SlowLog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExportSlowQueryLogsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slow_logs")
    
    private List<SlowLog> slowLogs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next_marker")
    
    private String nextMarker;

    public ExportSlowQueryLogsResponse withSlowLogs(List<SlowLog> slowLogs) {
        this.slowLogs = slowLogs;
        return this;
    }

    
    public ExportSlowQueryLogsResponse addSlowLogsItem(SlowLog slowLogsItem) {
        this.slowLogs.add(slowLogsItem);
        return this;
    }

    public ExportSlowQueryLogsResponse withSlowLogs(Consumer<List<SlowLog>> slowLogsSetter) {
        if(this.slowLogs == null ){
            this.slowLogs = new ArrayList<>();
        }
        slowLogsSetter.accept(this.slowLogs);
        return this;
    }

    /**
     * 慢SQL集合。
     * @return slowLogs
     */
    public List<SlowLog> getSlowLogs() {
        return slowLogs;
    }

    public void setSlowLogs(List<SlowLog> slowLogs) {
        this.slowLogs = slowLogs;
    }

    

    public ExportSlowQueryLogsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    


    /**
     * 获取下一页所需的标识符。marker仅在3分钟内有效。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportSlowQueryLogsResponse exportSlowQueryLogsResponse = (ExportSlowQueryLogsResponse) o;
        return Objects.equals(this.slowLogs, exportSlowQueryLogsResponse.slowLogs) &&
            Objects.equals(this.nextMarker, exportSlowQueryLogsResponse.nextMarker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(slowLogs, nextMarker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSlowQueryLogsResponse {\n");
        sb.append("    slowLogs: ").append(toIndentedString(slowLogs)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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

