package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVulTaskStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unread_task_num")

    private Integer unreadTaskNum;

    public ShowVulTaskStatisticsResponse withUnreadTaskNum(Integer unreadTaskNum) {
        this.unreadTaskNum = unreadTaskNum;
        return this;
    }

    /**
     * 未读的已完成的任务
     * @return unreadTaskNum
     */
    public Integer getUnreadTaskNum() {
        return unreadTaskNum;
    }

    public void setUnreadTaskNum(Integer unreadTaskNum) {
        this.unreadTaskNum = unreadTaskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulTaskStatisticsResponse that = (ShowVulTaskStatisticsResponse) obj;
        return Objects.equals(this.unreadTaskNum, that.unreadTaskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unreadTaskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulTaskStatisticsResponse {\n");
        sb.append("    unreadTaskNum: ").append(toIndentedString(unreadTaskNum)).append("\n");
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
