package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.OperationLog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListOpLogsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_logs")
    
    private List<OperationLog> operationLogs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public ListOpLogsResponse withOperationLogs(List<OperationLog> operationLogs) {
        this.operationLogs = operationLogs;
        return this;
    }

    
    public ListOpLogsResponse addOperationLogsItem(OperationLog operationLogsItem) {
        if (this.operationLogs == null) {
            this.operationLogs = new ArrayList<>();
        }
        this.operationLogs.add(operationLogsItem);
        return this;
    }

    public ListOpLogsResponse withOperationLogs(Consumer<List<OperationLog>> operationLogsSetter) {
        if(this.operationLogs == null ){
            this.operationLogs = new ArrayList<>();
        }
        operationLogsSetter.accept(this.operationLogs);
        return this;
    }

    /**
     * 任务列表
     * @return operationLogs
     */
    public List<OperationLog> getOperationLogs() {
        return operationLogs;
    }

    public void setOperationLogs(List<OperationLog> operationLogs) {
        this.operationLogs = operationLogs;
    }

    public ListOpLogsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 任务个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOpLogsResponse listOpLogsResponse = (ListOpLogsResponse) o;
        return Objects.equals(this.operationLogs, listOpLogsResponse.operationLogs) &&
            Objects.equals(this.count, listOpLogsResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(operationLogs, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpLogsResponse {\n");
        sb.append("    operationLogs: ").append(toIndentedString(operationLogs)).append("\n");
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

