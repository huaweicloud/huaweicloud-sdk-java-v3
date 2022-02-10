package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListAlarmHistoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAlarmHistoriesRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /** 告警ID,以al开头，后跟22位由字母或数字组成的字符串
     * 
     * @return alarmId */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ListAlarmHistoriesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 告警规则名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAlarmHistoriesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 告警规则状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAlarmHistoriesRequest withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /** 告警规则等级
     * 
     * @return level */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ListAlarmHistoriesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /** 服务的命名空间
     * 
     * @return namespace */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmHistoriesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 告警资源ID，多维度情况使用逗号分隔
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListAlarmHistoriesRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /** 通过时间筛选traces的起始时间(不包括传入时间) 例如：2022-02-10T10:05:46+08:00
     * 
     * @return from */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ListAlarmHistoriesRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /** 通过时间筛选traces的终止时间(不包括传入时间) 例如：2022-02-10T10:05:47+08:00
     * 
     * @return to */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListAlarmHistoriesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlarmHistoriesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 希望的查询的数据量
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmHistoriesRequest listAlarmHistoriesRequest = (ListAlarmHistoriesRequest) o;
        return Objects.equals(this.alarmId, listAlarmHistoriesRequest.alarmId)
            && Objects.equals(this.name, listAlarmHistoriesRequest.name)
            && Objects.equals(this.status, listAlarmHistoriesRequest.status)
            && Objects.equals(this.level, listAlarmHistoriesRequest.level)
            && Objects.equals(this.namespace, listAlarmHistoriesRequest.namespace)
            && Objects.equals(this.resourceId, listAlarmHistoriesRequest.resourceId)
            && Objects.equals(this.from, listAlarmHistoriesRequest.from)
            && Objects.equals(this.to, listAlarmHistoriesRequest.to)
            && Objects.equals(this.offset, listAlarmHistoriesRequest.offset)
            && Objects.equals(this.limit, listAlarmHistoriesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId, name, status, level, namespace, resourceId, from, to, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmHistoriesRequest {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
