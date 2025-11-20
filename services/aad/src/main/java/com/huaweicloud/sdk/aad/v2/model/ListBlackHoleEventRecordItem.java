package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * item
 */
public class ListBlackHoleEventRecordItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip")

    private String vip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_id")

    private String vipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    public ListBlackHoleEventRecordItem withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListBlackHoleEventRecordItem withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public ListBlackHoleEventRecordItem withVip(String vip) {
        this.vip = vip;
        return this;
    }

    /**
     * 高防ip
     * @return vip
     */
    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public ListBlackHoleEventRecordItem withVipId(String vipId) {
        this.vipId = vipId;
        return this;
    }

    /**
     * ip id
     * @return vipId
     */
    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public ListBlackHoleEventRecordItem withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListBlackHoleEventRecordItem withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型 block-黑洞中，unblock-黑洞结束
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ListBlackHoleEventRecordItem withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 封堵开始时间
     * minimum: 0
     * maximum: 2000
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public ListBlackHoleEventRecordItem withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 封堵结束时间
     * minimum: 0
     * maximum: 2000
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBlackHoleEventRecordItem that = (ListBlackHoleEventRecordItem) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.tenantName, that.tenantName)
            && Objects.equals(this.vip, that.vip) && Objects.equals(this.vipId, that.vipId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, tenantName, vip, vipId, instanceId, eventType, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBlackHoleEventRecordItem {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
