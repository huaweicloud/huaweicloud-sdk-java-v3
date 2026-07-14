package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务事件信息响应数据模型
 */
public class ServiceEventResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version_id")

    private String serviceVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_count")

    private Integer eventCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_info")

    private String eventInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_info_cn")

    private String eventInfoCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    public ServiceEventResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 服务事件ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceEventResponse withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * **参数解释：** 服务ID。 **取值范围：** 不涉及。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ServiceEventResponse withServiceVersionId(String serviceVersionId) {
        this.serviceVersionId = serviceVersionId;
        return this;
    }

    /**
     * **参数解释：** 服务版本ID。 **取值范围：** 不涉及。
     * @return serviceVersionId
     */
    public String getServiceVersionId() {
        return serviceVersionId;
    }

    public void setServiceVersionId(String serviceVersionId) {
        this.serviceVersionId = serviceVersionId;
    }

    public ServiceEventResponse withEventCount(Integer eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    /**
     * **参数解释：** 服务事件发生计数 **取值范围：** 不涉及。
     * @return eventCount
     */
    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public ServiceEventResponse withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释：** 服务事件类型：NORMAL/ABNORMAL/WARNING **取值范围：** 不涉及。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ServiceEventResponse withEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }

    /**
     * **参数解释：** 服务事件信息（英文） **取值范围：** 不涉及。
     * @return eventInfo
     */
    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public ServiceEventResponse withEventInfoCn(String eventInfoCn) {
        this.eventInfoCn = eventInfoCn;
        return this;
    }

    /**
     * **参数解释：** 服务事件信息（中文） **取值范围：** 不涉及。
     * @return eventInfoCn
     */
    public String getEventInfoCn() {
        return eventInfoCn;
    }

    public void setEventInfoCn(String eventInfoCn) {
        this.eventInfoCn = eventInfoCn;
    }

    public ServiceEventResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 服务事件第一次发生时间 **取值范围：** 不涉及。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ServiceEventResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 服务事件最后发生时间 **取值范围：** 不涉及。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceEventResponse that = (ServiceEventResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.serviceVersionId, that.serviceVersionId)
            && Objects.equals(this.eventCount, that.eventCount) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.eventInfo, that.eventInfo) && Objects.equals(this.eventInfoCn, that.eventInfoCn)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, serviceId, serviceVersionId, eventCount, eventType, eventInfo, eventInfoCn, createAt, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceEventResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceVersionId: ").append(toIndentedString(serviceVersionId)).append("\n");
        sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventInfo: ").append(toIndentedString(eventInfo)).append("\n");
        sb.append("    eventInfoCn: ").append(toIndentedString(eventInfoCn)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
