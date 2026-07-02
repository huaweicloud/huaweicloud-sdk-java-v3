package com.huaweicloud.sdk.kafka.v2.model;

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
public class ShowKafkaLogTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_response_list")

    private List<ShowKafkaLogTaskEntity> logResponseList = null;

    public ShowKafkaLogTaskResponse withLogResponseList(List<ShowKafkaLogTaskEntity> logResponseList) {
        this.logResponseList = logResponseList;
        return this;
    }

    public ShowKafkaLogTaskResponse addLogResponseListItem(ShowKafkaLogTaskEntity logResponseListItem) {
        if (this.logResponseList == null) {
            this.logResponseList = new ArrayList<>();
        }
        this.logResponseList.add(logResponseListItem);
        return this;
    }

    public ShowKafkaLogTaskResponse withLogResponseList(Consumer<List<ShowKafkaLogTaskEntity>> logResponseListSetter) {
        if (this.logResponseList == null) {
            this.logResponseList = new ArrayList<>();
        }
        logResponseListSetter.accept(this.logResponseList);
        return this;
    }

    /**
     * **参数解释**： 日志响应列表。
     * @return logResponseList
     */
    public List<ShowKafkaLogTaskEntity> getLogResponseList() {
        return logResponseList;
    }

    public void setLogResponseList(List<ShowKafkaLogTaskEntity> logResponseList) {
        this.logResponseList = logResponseList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKafkaLogTaskResponse that = (ShowKafkaLogTaskResponse) obj;
        return Objects.equals(this.logResponseList, that.logResponseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logResponseList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaLogTaskResponse {\n");
        sb.append("    logResponseList: ").append(toIndentedString(logResponseList)).append("\n");
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
