package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ShowOpsSubscriptionLtsInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_list")

    private List<LtsLogStream> logStreamList = null;

    public ShowOpsSubscriptionLtsInfoResponse withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 创建的日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public ShowOpsSubscriptionLtsInfoResponse withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 创建的日志组名称
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public ShowOpsSubscriptionLtsInfoResponse withLogStreamList(List<LtsLogStream> logStreamList) {
        this.logStreamList = logStreamList;
        return this;
    }

    public ShowOpsSubscriptionLtsInfoResponse addLogStreamListItem(LtsLogStream logStreamListItem) {
        if (this.logStreamList == null) {
            this.logStreamList = new ArrayList<>();
        }
        this.logStreamList.add(logStreamListItem);
        return this;
    }

    public ShowOpsSubscriptionLtsInfoResponse withLogStreamList(Consumer<List<LtsLogStream>> logStreamListSetter) {
        if (this.logStreamList == null) {
            this.logStreamList = new ArrayList<>();
        }
        logStreamListSetter.accept(this.logStreamList);
        return this;
    }

    /**
     * 日志组下的日志流信息
     * @return logStreamList
     */
    public List<LtsLogStream> getLogStreamList() {
        return logStreamList;
    }

    public void setLogStreamList(List<LtsLogStream> logStreamList) {
        this.logStreamList = logStreamList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsSubscriptionLtsInfoResponse that = (ShowOpsSubscriptionLtsInfoResponse) obj;
        return Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreamList, that.logStreamList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logGroupName, logStreamList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsSubscriptionLtsInfoResponse {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamList: ").append(toIndentedString(logStreamList)).append("\n");
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
