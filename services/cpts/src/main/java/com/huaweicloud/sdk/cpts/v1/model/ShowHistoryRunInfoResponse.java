package com.huaweicloud.sdk.cpts.v1.model;

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
public class ShowHistoryRunInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_list")

    private List<HistoryRunInfo> logList = null;

    public ShowHistoryRunInfoResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowHistoryRunInfoResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowHistoryRunInfoResponse withLogList(List<HistoryRunInfo> logList) {
        this.logList = logList;
        return this;
    }

    public ShowHistoryRunInfoResponse addLogListItem(HistoryRunInfo logListItem) {
        if (this.logList == null) {
            this.logList = new ArrayList<>();
        }
        this.logList.add(logListItem);
        return this;
    }

    public ShowHistoryRunInfoResponse withLogList(Consumer<List<HistoryRunInfo>> logListSetter) {
        if (this.logList == null) {
            this.logList = new ArrayList<>();
        }
        logListSetter.accept(this.logList);
        return this;
    }

    /**
     * log_list
     * @return logList
     */
    public List<HistoryRunInfo> getLogList() {
        return logList;
    }

    public void setLogList(List<HistoryRunInfo> logList) {
        this.logList = logList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHistoryRunInfoResponse showHistoryRunInfoResponse = (ShowHistoryRunInfoResponse) o;
        return Objects.equals(this.code, showHistoryRunInfoResponse.code)
            && Objects.equals(this.message, showHistoryRunInfoResponse.message)
            && Objects.equals(this.logList, showHistoryRunInfoResponse.logList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, logList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryRunInfoResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    logList: ").append(toIndentedString(logList)).append("\n");
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
