package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资讯
 */
public class Tips {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_action")

    private Integer nextAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_action_remain_day")

    private Integer nextActionRemainDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_action_url")

    private String nextActionUrl;

    public Tips withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Tips withNextAction(Integer nextAction) {
        this.nextAction = nextAction;
        return this;
    }

    /**
     * 下一个活动日
     * @return nextAction
     */
    public Integer getNextAction() {
        return nextAction;
    }

    public void setNextAction(Integer nextAction) {
        this.nextAction = nextAction;
    }

    public Tips withNextActionRemainDay(Integer nextActionRemainDay) {
        this.nextActionRemainDay = nextActionRemainDay;
        return this;
    }

    /**
     * 下一个活动日剩余时间
     * @return nextActionRemainDay
     */
    public Integer getNextActionRemainDay() {
        return nextActionRemainDay;
    }

    public void setNextActionRemainDay(Integer nextActionRemainDay) {
        this.nextActionRemainDay = nextActionRemainDay;
    }

    public Tips withNextActionUrl(String nextActionUrl) {
        this.nextActionUrl = nextActionUrl;
        return this;
    }

    /**
     * 名称
     * @return nextActionUrl
     */
    public String getNextActionUrl() {
        return nextActionUrl;
    }

    public void setNextActionUrl(String nextActionUrl) {
        this.nextActionUrl = nextActionUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tips that = (Tips) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.nextAction, that.nextAction)
            && Objects.equals(this.nextActionRemainDay, that.nextActionRemainDay)
            && Objects.equals(this.nextActionUrl, that.nextActionUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, nextAction, nextActionRemainDay, nextActionUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tips {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    nextAction: ").append(toIndentedString(nextAction)).append("\n");
        sb.append("    nextActionRemainDay: ").append(toIndentedString(nextActionRemainDay)).append("\n");
        sb.append("    nextActionUrl: ").append(toIndentedString(nextActionUrl)).append("\n");
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
