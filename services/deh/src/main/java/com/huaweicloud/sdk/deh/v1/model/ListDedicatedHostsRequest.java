package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListDedicatedHostsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type_name")

    private String hostTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    /** 专属主机状态。 取值范围：“available”、“fault”或“released”。 */
    public static final class StateEnum {

        /** Enum AVAILABLE for value: "available" */
        public static final StateEnum AVAILABLE = new StateEnum("available");

        /** Enum FAULT for value: "fault" */
        public static final StateEnum FAULT = new StateEnum("fault");

        /** Enum RELEASED for value: "released" */
        public static final StateEnum RELEASED = new StateEnum("released");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("fault", FAULT);
            map.put("released", RELEASED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private String tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_uuid")

    private String instanceUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "released_at")

    private String releasedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changes-since")

    private String changesSince;

    public ListDedicatedHostsRequest withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /** 专属主机ID。
     * 
     * @return dedicatedHostId */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public ListDedicatedHostsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 专属主机名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDedicatedHostsRequest withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /** 专属主机类型。
     * 
     * @return hostType */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public ListDedicatedHostsRequest withHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
        return this;
    }

    /** 专属主机类型的名称。
     * 
     * @return hostTypeName */
    public String getHostTypeName() {
        return hostTypeName;
    }

    public void setHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
    }

    public ListDedicatedHostsRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /** 规格ID。
     * 
     * @return flavor */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ListDedicatedHostsRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /** 专属主机状态。 取值范围：“available”、“fault”或“released”。
     * 
     * @return state */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListDedicatedHostsRequest withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    /** 取值范围：租户ID或“all”。 只有管理员可以指定该参数。
     * 
     * @return tenant */
    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public ListDedicatedHostsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 专属主机所属AZ。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListDedicatedHostsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每个页面上显示的条目数。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDedicatedHostsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 该值是上一页最后一条记录的ID。 如果“marker”取值无效，将会返回“400”错误码。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListDedicatedHostsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /** 专属主机标签。
     * 
     * @return tags */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListDedicatedHostsRequest withInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }

    /** 专属主机上的云服务器ID。
     * 
     * @return instanceUuid */
    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public ListDedicatedHostsRequest withReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
        return this;
    }

    /** 专属主机的释放时间。
     * 
     * @return releasedAt */
    public String getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(String releasedAt) {
        this.releasedAt = releasedAt;
    }

    public ListDedicatedHostsRequest withChangesSince(String changesSince) {
        this.changesSince = changesSince;
        return this;
    }

    /** 当专属主机更新了状态时，按日期和时间戳过滤响应。为了便于记录更改，还可能返回最近删除的专属主机。 日期和时间戳的格式为ISO 8601：CCYY-MM-DDThh:mm:ss±hh:mm
     * 如果包含“hh:mm”值，则将时区作为UTC的偏移量返回。例如，“2015-08-27T09:49:58-05:00”。如果您省略时区，则假定为UTC时区。
     * 
     * @return changesSince */
    public String getChangesSince() {
        return changesSince;
    }

    public void setChangesSince(String changesSince) {
        this.changesSince = changesSince;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDedicatedHostsRequest listDedicatedHostsRequest = (ListDedicatedHostsRequest) o;
        return Objects.equals(this.dedicatedHostId, listDedicatedHostsRequest.dedicatedHostId)
            && Objects.equals(this.name, listDedicatedHostsRequest.name)
            && Objects.equals(this.hostType, listDedicatedHostsRequest.hostType)
            && Objects.equals(this.hostTypeName, listDedicatedHostsRequest.hostTypeName)
            && Objects.equals(this.flavor, listDedicatedHostsRequest.flavor)
            && Objects.equals(this.state, listDedicatedHostsRequest.state)
            && Objects.equals(this.tenant, listDedicatedHostsRequest.tenant)
            && Objects.equals(this.availabilityZone, listDedicatedHostsRequest.availabilityZone)
            && Objects.equals(this.limit, listDedicatedHostsRequest.limit)
            && Objects.equals(this.marker, listDedicatedHostsRequest.marker)
            && Objects.equals(this.tags, listDedicatedHostsRequest.tags)
            && Objects.equals(this.instanceUuid, listDedicatedHostsRequest.instanceUuid)
            && Objects.equals(this.releasedAt, listDedicatedHostsRequest.releasedAt)
            && Objects.equals(this.changesSince, listDedicatedHostsRequest.changesSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostId,
            name,
            hostType,
            hostTypeName,
            flavor,
            state,
            tenant,
            availabilityZone,
            limit,
            marker,
            tags,
            instanceUuid,
            releasedAt,
            changesSince);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDedicatedHostsRequest {\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    hostTypeName: ").append(toIndentedString(hostTypeName)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    instanceUuid: ").append(toIndentedString(instanceUuid)).append("\n");
        sb.append("    releasedAt: ").append(toIndentedString(releasedAt)).append("\n");
        sb.append("    changesSince: ").append(toIndentedString(changesSince)).append("\n");
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
