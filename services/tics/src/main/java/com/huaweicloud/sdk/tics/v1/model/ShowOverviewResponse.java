package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_cnt")

    private Long agentCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_cnt")

    private Long instanceCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_cnt")

    private Long leagueCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_to_handle_cnt")

    private Long noticeToHandleCnt;

    public ShowOverviewResponse withAgentCnt(Long agentCnt) {
        this.agentCnt = agentCnt;
        return this;
    }

    /**
     * 可信节点数
     * @return agentCnt
     */
    public Long getAgentCnt() {
        return agentCnt;
    }

    public void setAgentCnt(Long agentCnt) {
        this.agentCnt = agentCnt;
    }

    public ShowOverviewResponse withInstanceCnt(Long instanceCnt) {
        this.instanceCnt = instanceCnt;
        return this;
    }

    /**
     * 作业执行历史数
     * @return instanceCnt
     */
    public Long getInstanceCnt() {
        return instanceCnt;
    }

    public void setInstanceCnt(Long instanceCnt) {
        this.instanceCnt = instanceCnt;
    }

    public ShowOverviewResponse withLeagueCnt(Long leagueCnt) {
        this.leagueCnt = leagueCnt;
        return this;
    }

    /**
     * 有效联盟数
     * @return leagueCnt
     */
    public Long getLeagueCnt() {
        return leagueCnt;
    }

    public void setLeagueCnt(Long leagueCnt) {
        this.leagueCnt = leagueCnt;
    }

    public ShowOverviewResponse withNoticeToHandleCnt(Long noticeToHandleCnt) {
        this.noticeToHandleCnt = noticeToHandleCnt;
        return this;
    }

    /**
     * 待处理消息通知数
     * @return noticeToHandleCnt
     */
    public Long getNoticeToHandleCnt() {
        return noticeToHandleCnt;
    }

    public void setNoticeToHandleCnt(Long noticeToHandleCnt) {
        this.noticeToHandleCnt = noticeToHandleCnt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOverviewResponse showOverviewResponse = (ShowOverviewResponse) o;
        return Objects.equals(this.agentCnt, showOverviewResponse.agentCnt)
            && Objects.equals(this.instanceCnt, showOverviewResponse.instanceCnt)
            && Objects.equals(this.leagueCnt, showOverviewResponse.leagueCnt)
            && Objects.equals(this.noticeToHandleCnt, showOverviewResponse.noticeToHandleCnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentCnt, instanceCnt, leagueCnt, noticeToHandleCnt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOverviewResponse {\n");
        sb.append("    agentCnt: ").append(toIndentedString(agentCnt)).append("\n");
        sb.append("    instanceCnt: ").append(toIndentedString(instanceCnt)).append("\n");
        sb.append("    leagueCnt: ").append(toIndentedString(leagueCnt)).append("\n");
        sb.append("    noticeToHandleCnt: ").append(toIndentedString(noticeToHandleCnt)).append("\n");
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
