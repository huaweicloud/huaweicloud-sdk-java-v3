package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSecurityEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_days")

    private Integer lastDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_types")

    private List<Integer> eventTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListSecurityEventsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region id
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListSecurityEventsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 租户企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListSecurityEventsRequest withLastDays(Integer lastDays) {
        this.lastDays = lastDays;
        return this;
    }

    /**
     * 查询时间范围天数，与自定义查询时间begin_time，end_time互斥
     * minimum: 1
     * maximum: 30
     * @return lastDays
     */
    public Integer getLastDays() {
        return lastDays;
    }

    public void setLastDays(Integer lastDays) {
        this.lastDays = lastDays;
    }

    public ListSecurityEventsRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListSecurityEventsRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListSecurityEventsRequest withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListSecurityEventsRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListSecurityEventsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSecurityEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityEventsRequest withEventTypes(List<Integer> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public ListSecurityEventsRequest addEventTypesItem(Integer eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    public ListSecurityEventsRequest withEventTypes(Consumer<List<Integer>> eventTypesSetter) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        eventTypesSetter.accept(this.eventTypes);
        return this;
    }

    /**
     * 事件类型，包含如下:   - 1001 : 恶意软件   - 1010 : Rootkit   - 1011 : 勒索软件   - 1015 : Webshell   - 1017 : 反弹Shell   - 2001 : 一般漏洞利用   - 3002 : 文件提权   - 3003 : 进程提权   - 3004 : 关键文件变更   - 3005 : 文件/目录变更   - 3007 : 进程异常行为   - 3015 : 高危命令执行   - 3018 : 异常Shell   - 3027 : Crontab可疑任务   - 4002 : 暴力破解   - 4004 : 异常登录   - 4006 : 非法系统账号
     * @return eventTypes
     */
    public List<Integer> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<Integer> eventTypes) {
        this.eventTypes = eventTypes;
    }

    public ListSecurityEventsRequest withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 处置状态，包含如下:   - unhandled ：未处理   - handled : 已处理
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListSecurityEventsRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 威胁等级，包含如下:   - Security ：安全   - Low : 低危   - Medium : 中危   - High : 高危   - Critical : 危急
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ListSecurityEventsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 事件类别，包含如下:   - host : 主机安全事件   - container : 容器安全事件
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListSecurityEventsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 自定义查询时间，与查询时间范围天数互斥，查询时间段的起始时间，毫秒级时间戳，end_time减去begin_time小于等于2天，与查询时间范围天数互斥
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListSecurityEventsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 自定义时间，查询时间段的终止时间，毫秒级时间戳，end_time减去begin_time小于等于2天，与查询时间范围天数互斥
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecurityEventsRequest listSecurityEventsRequest = (ListSecurityEventsRequest) o;
        return Objects.equals(this.region, listSecurityEventsRequest.region)
            && Objects.equals(this.enterpriseProjectId, listSecurityEventsRequest.enterpriseProjectId)
            && Objects.equals(this.lastDays, listSecurityEventsRequest.lastDays)
            && Objects.equals(this.hostName, listSecurityEventsRequest.hostName)
            && Objects.equals(this.hostId, listSecurityEventsRequest.hostId)
            && Objects.equals(this.privateIp, listSecurityEventsRequest.privateIp)
            && Objects.equals(this.containerName, listSecurityEventsRequest.containerName)
            && Objects.equals(this.offset, listSecurityEventsRequest.offset)
            && Objects.equals(this.limit, listSecurityEventsRequest.limit)
            && Objects.equals(this.eventTypes, listSecurityEventsRequest.eventTypes)
            && Objects.equals(this.handleStatus, listSecurityEventsRequest.handleStatus)
            && Objects.equals(this.severity, listSecurityEventsRequest.severity)
            && Objects.equals(this.category, listSecurityEventsRequest.category)
            && Objects.equals(this.beginTime, listSecurityEventsRequest.beginTime)
            && Objects.equals(this.endTime, listSecurityEventsRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            enterpriseProjectId,
            lastDays,
            hostName,
            hostId,
            privateIp,
            containerName,
            offset,
            limit,
            eventTypes,
            handleStatus,
            severity,
            category,
            beginTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityEventsRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    lastDays: ").append(toIndentedString(lastDays)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
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
