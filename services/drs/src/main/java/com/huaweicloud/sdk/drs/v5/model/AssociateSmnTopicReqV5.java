package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联SMN主题请求体
 */
public class AssociateSmnTopicReqV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment_delay_threshold")

    private Long incrementDelayThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto_delay_threshold")

    private Long rtoDelayThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rpo_delay_threshold")

    private Long rpoDelayThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_alarm_to_user")

    private Boolean isAlarmToUser;

    public AssociateSmnTopicReqV5 withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题资源标识
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public AssociateSmnTopicReqV5 withIncrementDelayThreshold(Long incrementDelayThreshold) {
        this.incrementDelayThreshold = incrementDelayThreshold;
        return this;
    }

    /**
     * 增量时延阈值, 单位：秒（s）
     * @return incrementDelayThreshold
     */
    public Long getIncrementDelayThreshold() {
        return incrementDelayThreshold;
    }

    public void setIncrementDelayThreshold(Long incrementDelayThreshold) {
        this.incrementDelayThreshold = incrementDelayThreshold;
    }

    public AssociateSmnTopicReqV5 withRtoDelayThreshold(Long rtoDelayThreshold) {
        this.rtoDelayThreshold = rtoDelayThreshold;
        return this;
    }

    /**
     * RTO时延阈值，灾备场景下可配置，单位：秒（s）
     * @return rtoDelayThreshold
     */
    public Long getRtoDelayThreshold() {
        return rtoDelayThreshold;
    }

    public void setRtoDelayThreshold(Long rtoDelayThreshold) {
        this.rtoDelayThreshold = rtoDelayThreshold;
    }

    public AssociateSmnTopicReqV5 withRpoDelayThreshold(Long rpoDelayThreshold) {
        this.rpoDelayThreshold = rpoDelayThreshold;
        return this;
    }

    /**
     * RPO时延阈值，灾备场景下可配置，单位：秒（s）
     * @return rpoDelayThreshold
     */
    public Long getRpoDelayThreshold() {
        return rpoDelayThreshold;
    }

    public void setRpoDelayThreshold(Long rpoDelayThreshold) {
        this.rpoDelayThreshold = rpoDelayThreshold;
    }

    public AssociateSmnTopicReqV5 withIsAlarmToUser(Boolean isAlarmToUser) {
        this.isAlarmToUser = isAlarmToUser;
        return this;
    }

    /**
     * 异常告警是否通知用户，取值范围[true,false]
     * @return isAlarmToUser
     */
    public Boolean getIsAlarmToUser() {
        return isAlarmToUser;
    }

    public void setIsAlarmToUser(Boolean isAlarmToUser) {
        this.isAlarmToUser = isAlarmToUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateSmnTopicReqV5 that = (AssociateSmnTopicReqV5) obj;
        return Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.incrementDelayThreshold, that.incrementDelayThreshold)
            && Objects.equals(this.rtoDelayThreshold, that.rtoDelayThreshold)
            && Objects.equals(this.rpoDelayThreshold, that.rpoDelayThreshold)
            && Objects.equals(this.isAlarmToUser, that.isAlarmToUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, incrementDelayThreshold, rtoDelayThreshold, rpoDelayThreshold, isAlarmToUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateSmnTopicReqV5 {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    incrementDelayThreshold: ").append(toIndentedString(incrementDelayThreshold)).append("\n");
        sb.append("    rtoDelayThreshold: ").append(toIndentedString(rtoDelayThreshold)).append("\n");
        sb.append("    rpoDelayThreshold: ").append(toIndentedString(rpoDelayThreshold)).append("\n");
        sb.append("    isAlarmToUser: ").append(toIndentedString(isAlarmToUser)).append("\n");
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
