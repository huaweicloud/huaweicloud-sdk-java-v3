package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListMongodbErrorLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_logs")

    private List<MongodbErrorLogDetail> errorLogs = null;

    public ListMongodbErrorLogsResponse withErrorLogs(List<MongodbErrorLogDetail> errorLogs) {
        this.errorLogs = errorLogs;
        return this;
    }

    public ListMongodbErrorLogsResponse addErrorLogsItem(MongodbErrorLogDetail errorLogsItem) {
        if (this.errorLogs == null) {
            this.errorLogs = new ArrayList<>();
        }
        this.errorLogs.add(errorLogsItem);
        return this;
    }

    public ListMongodbErrorLogsResponse withErrorLogs(Consumer<List<MongodbErrorLogDetail>> errorLogsSetter) {
        if (this.errorLogs == null) {
            this.errorLogs = new ArrayList<>();
        }
        errorLogsSetter.accept(this.errorLogs);
        return this;
    }

    /**
     * 错误日志具体信息。
     * @return errorLogs
     */
    public List<MongodbErrorLogDetail> getErrorLogs() {
        return errorLogs;
    }

    public void setErrorLogs(List<MongodbErrorLogDetail> errorLogs) {
        this.errorLogs = errorLogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMongodbErrorLogsResponse that = (ListMongodbErrorLogsResponse) obj;
        return Objects.equals(this.errorLogs, that.errorLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMongodbErrorLogsResponse {\n");
        sb.append("    errorLogs: ").append(toIndentedString(errorLogs)).append("\n");
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
