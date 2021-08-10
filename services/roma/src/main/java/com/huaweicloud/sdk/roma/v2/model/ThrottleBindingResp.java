package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** ThrottleBindingResp */
public class ThrottleBindingResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    private String publishId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private Integer scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    private String strategyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private OffsetDateTime applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ThrottleBindingResp withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /** API的发布记录编号
     * 
     * @return publishId */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public ThrottleBindingResp withScope(Integer scope) {
        this.scope = scope;
        return this;
    }

    /** 策略作用域，取值如下： - 1：整个API - 2： 单个用户 - 3：单个APP 目前只支持1
     * 
     * @return scope */
    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public ThrottleBindingResp withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /** 流控策略的ID
     * 
     * @return strategyId */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public ThrottleBindingResp withApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /** 绑定时间
     * 
     * @return applyTime */
    public OffsetDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public ThrottleBindingResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 绑定关系的ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleBindingResp throttleBindingResp = (ThrottleBindingResp) o;
        return Objects.equals(this.publishId, throttleBindingResp.publishId)
            && Objects.equals(this.scope, throttleBindingResp.scope)
            && Objects.equals(this.strategyId, throttleBindingResp.strategyId)
            && Objects.equals(this.applyTime, throttleBindingResp.applyTime)
            && Objects.equals(this.id, throttleBindingResp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishId, scope, strategyId, applyTime, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleBindingResp {\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
