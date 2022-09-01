package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_log")

    @JacksonXmlProperty(localName = "operation_log")

    private OperationLog operationLog;

    public ShowOpLogResponse withOperationLog(OperationLog operationLog) {
        this.operationLog = operationLog;
        return this;
    }

    public ShowOpLogResponse withOperationLog(Consumer<OperationLog> operationLogSetter) {
        if (this.operationLog == null) {
            this.operationLog = new OperationLog();
            operationLogSetter.accept(this.operationLog);
        }

        return this;
    }

    /**
     * Get operationLog
     * @return operationLog
     */
    public OperationLog getOperationLog() {
        return operationLog;
    }

    public void setOperationLog(OperationLog operationLog) {
        this.operationLog = operationLog;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOpLogResponse showOpLogResponse = (ShowOpLogResponse) o;
        return Objects.equals(this.operationLog, showOpLogResponse.operationLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpLogResponse {\n");
        sb.append("    operationLog: ").append(toIndentedString(operationLog)).append("\n");
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
