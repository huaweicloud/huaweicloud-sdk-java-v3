package com.huaweicloud.sdk.css.v1.model;

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
public class ShowLogBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logList")

    private List<LogList> logList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed")

    private Boolean completed;

    public ShowLogBackupResponse withLogList(List<LogList> logList) {
        this.logList = logList;
        return this;
    }

    public ShowLogBackupResponse addLogListItem(LogList logListItem) {
        if (this.logList == null) {
            this.logList = new ArrayList<>();
        }
        this.logList.add(logListItem);
        return this;
    }

    public ShowLogBackupResponse withLogList(Consumer<List<LogList>> logListSetter) {
        if (this.logList == null) {
            this.logList = new ArrayList<>();
        }
        logListSetter.accept(this.logList);
        return this;
    }

    /**
     * Get logList
     * @return logList
     */
    public List<LogList> getLogList() {
        return logList;
    }

    public void setLogList(List<LogList> logList) {
        this.logList = logList;
    }

    public ShowLogBackupResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 查询日志的类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowLogBackupResponse withCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

    /**
     * **参数解释**： 日志文件是否已经查询完。 **取值范围**： - true： 日志文件已经查询完，没有更多结果了。 - false：日志文件未查询完，因日志条数已达到请求条数或者日志大小达到1MB，查询提前返回结果。
     * @return completed
     */
    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLogBackupResponse that = (ShowLogBackupResponse) obj;
        return Objects.equals(this.logList, that.logList) && Objects.equals(this.type, that.type)
            && Objects.equals(this.completed, that.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logList, type, completed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogBackupResponse {\n");
        sb.append("    logList: ").append(toIndentedString(logList)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
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
