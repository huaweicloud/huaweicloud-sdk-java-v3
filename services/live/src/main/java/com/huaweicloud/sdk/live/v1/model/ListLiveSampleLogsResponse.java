package com.huaweicloud.sdk.live.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.LogInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListLiveSampleLogsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logs")
    
    private List<LogInfo> logs = null;
    
    public ListLiveSampleLogsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 符合查询条件的总条目数
     * minimum: 0
     * maximum: 2016
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListLiveSampleLogsResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 播放域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public ListLiveSampleLogsResponse withLogs(List<LogInfo> logs) {
        this.logs = logs;
        return this;
    }

    
    public ListLiveSampleLogsResponse addLogsItem(LogInfo logsItem) {
        if(this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public ListLiveSampleLogsResponse withLogs(Consumer<List<LogInfo>> logsSetter) {
        if(this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 日志信息列表
     * @return logs
     */
    public List<LogInfo> getLogs() {
        return logs;
    }

    public void setLogs(List<LogInfo> logs) {
        this.logs = logs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveSampleLogsResponse listLiveSampleLogsResponse = (ListLiveSampleLogsResponse) o;
        return Objects.equals(this.total, listLiveSampleLogsResponse.total) &&
            Objects.equals(this.domain, listLiveSampleLogsResponse.domain) &&
            Objects.equals(this.logs, listLiveSampleLogsResponse.logs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, domain, logs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveSampleLogsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

