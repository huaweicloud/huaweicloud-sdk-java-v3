package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.RetentionLog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRetentionHistoriesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_log")
    
    private List<RetentionLog> retentionLog = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Content-Range")
    
    private String contentRange;

    public ListRetentionHistoriesResponse withRetentionLog(List<RetentionLog> retentionLog) {
        this.retentionLog = retentionLog;
        return this;
    }

    
    public ListRetentionHistoriesResponse addRetentionLogItem(RetentionLog retentionLogItem) {
        if (this.retentionLog == null) {
            this.retentionLog = new ArrayList<>();
        }
        this.retentionLog.add(retentionLogItem);
        return this;
    }

    public ListRetentionHistoriesResponse withRetentionLog(Consumer<List<RetentionLog>> retentionLogSetter) {
        if(this.retentionLog == null ){
            this.retentionLog = new ArrayList<>();
        }
        retentionLogSetter.accept(this.retentionLog);
        return this;
    }

    /**
     * 镜像老化日志
     * @return retentionLog
     */
    public List<RetentionLog> getRetentionLog() {
        return retentionLog;
    }

    public void setRetentionLog(List<RetentionLog> retentionLog) {
        this.retentionLog = retentionLog;
    }

    public ListRetentionHistoriesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总个数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRetentionHistoriesResponse withContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    


    /**
     * Get contentRange
     * @return contentRange
     */
    public String getContentRange() {
        return contentRange;
    }

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRetentionHistoriesResponse listRetentionHistoriesResponse = (ListRetentionHistoriesResponse) o;
        return Objects.equals(this.retentionLog, listRetentionHistoriesResponse.retentionLog) &&
            Objects.equals(this.total, listRetentionHistoriesResponse.total) &&
            Objects.equals(this.contentRange, listRetentionHistoriesResponse.contentRange);
    }
    @Override
    public int hashCode() {
        return Objects.hash(retentionLog, total, contentRange);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRetentionHistoriesResponse {\n");
        sb.append("    retentionLog: ").append(toIndentedString(retentionLog)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    contentRange: ").append(toIndentedString(contentRange)).append("\n");
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

