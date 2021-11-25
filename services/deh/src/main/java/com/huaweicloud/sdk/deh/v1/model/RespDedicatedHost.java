package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 专属主机结构体。 */
public class RespDedicatedHost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 在创建云服务器时（未指定专属主机ID），是否允许云服务器自动分配在一台可用的专属主机上。 */
    public static final class AutoPlacementEnum {

        /** Enum ON for value: "on" */
        public static final AutoPlacementEnum ON = new AutoPlacementEnum("on");

        /** Enum OFF for value: "off" */
        public static final AutoPlacementEnum OFF = new AutoPlacementEnum("off");

        private static final Map<String, AutoPlacementEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoPlacementEnum> createStaticFields() {
            Map<String, AutoPlacementEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoPlacementEnum(String value) {
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
        public static AutoPlacementEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AutoPlacementEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AutoPlacementEnum(value);
            }
            return result;
        }

        public static AutoPlacementEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AutoPlacementEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoPlacementEnum) {
                return this.value.equals(((AutoPlacementEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_placement")

    private AutoPlacementEnum autoPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_properties")

    private RespHostProperty hostProperties;

    /** 专属主机状态。 */
    public static final class StateEnum {

        /** Enum AVAILABLE for value: "available" */
        public static final StateEnum AVAILABLE = new StateEnum("available");

        /** Enum RELEASED for value: "released" */
        public static final StateEnum RELEASED = new StateEnum("released");

        /** Enum FAULT for value: "fault" */
        public static final StateEnum FAULT = new StateEnum("fault");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("released", RELEASED);
            map.put("fault", FAULT);
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
    @JsonProperty(value = "available_vcpus")

    private Integer availableVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_memory")

    private Integer availableMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated_at")

    private String allocatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "released_at")

    private String releasedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_total")

    private Integer instanceTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_uuids")

    private List<String> instanceUuids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Object tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private Object sysTags;

    public RespDedicatedHost withDedicatedHostId(String dedicatedHostId) {
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

    public RespDedicatedHost withName(String name) {
        this.name = name;
        return this;
    }

    /** 专属主机的名称。 长度限制在255个字符以内，并且不能以空格开头或结尾。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RespDedicatedHost withAutoPlacement(AutoPlacementEnum autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /** 在创建云服务器时（未指定专属主机ID），是否允许云服务器自动分配在一台可用的专属主机上。
     * 
     * @return autoPlacement */
    public AutoPlacementEnum getAutoPlacement() {
        return autoPlacement;
    }

    public void setAutoPlacement(AutoPlacementEnum autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    public RespDedicatedHost withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 专属主机所属的可用区。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public RespDedicatedHost withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 专属主机所属的租户ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RespDedicatedHost withHostProperties(RespHostProperty hostProperties) {
        this.hostProperties = hostProperties;
        return this;
    }

    public RespDedicatedHost withHostProperties(Consumer<RespHostProperty> hostPropertiesSetter) {
        if (this.hostProperties == null) {
            this.hostProperties = new RespHostProperty();
            hostPropertiesSetter.accept(this.hostProperties);
        }

        return this;
    }

    /** Get hostProperties
     * 
     * @return hostProperties */
    public RespHostProperty getHostProperties() {
        return hostProperties;
    }

    public void setHostProperties(RespHostProperty hostProperties) {
        this.hostProperties = hostProperties;
    }

    public RespDedicatedHost withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /** 专属主机状态。
     * 
     * @return state */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public RespDedicatedHost withAvailableVcpus(Integer availableVcpus) {
        this.availableVcpus = availableVcpus;
        return this;
    }

    /** 专属主机可用的vCPU核数。
     * 
     * @return availableVcpus */
    public Integer getAvailableVcpus() {
        return availableVcpus;
    }

    public void setAvailableVcpus(Integer availableVcpus) {
        this.availableVcpus = availableVcpus;
    }

    public RespDedicatedHost withAvailableMemory(Integer availableMemory) {
        this.availableMemory = availableMemory;
        return this;
    }

    /** 专属主机可用的内存大小。
     * 
     * @return availableMemory */
    public Integer getAvailableMemory() {
        return availableMemory;
    }

    public void setAvailableMemory(Integer availableMemory) {
        this.availableMemory = availableMemory;
    }

    public RespDedicatedHost withAllocatedAt(String allocatedAt) {
        this.allocatedAt = allocatedAt;
        return this;
    }

    /** 专属主机的分配时间。
     * 
     * @return allocatedAt */
    public String getAllocatedAt() {
        return allocatedAt;
    }

    public void setAllocatedAt(String allocatedAt) {
        this.allocatedAt = allocatedAt;
    }

    public RespDedicatedHost withReleasedAt(String releasedAt) {
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

    public RespDedicatedHost withInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
        return this;
    }

    /** 专属主机上的实例总数。
     * 
     * @return instanceTotal */
    public Integer getInstanceTotal() {
        return instanceTotal;
    }

    public void setInstanceTotal(Integer instanceTotal) {
        this.instanceTotal = instanceTotal;
    }

    public RespDedicatedHost withInstanceUuids(List<String> instanceUuids) {
        this.instanceUuids = instanceUuids;
        return this;
    }

    public RespDedicatedHost addInstanceUuidsItem(String instanceUuidsItem) {
        if (this.instanceUuids == null) {
            this.instanceUuids = new ArrayList<>();
        }
        this.instanceUuids.add(instanceUuidsItem);
        return this;
    }

    public RespDedicatedHost withInstanceUuids(Consumer<List<String>> instanceUuidsSetter) {
        if (this.instanceUuids == null) {
            this.instanceUuids = new ArrayList<>();
        }
        instanceUuidsSetter.accept(this.instanceUuids);
        return this;
    }

    /** 专属主机上的实例UUID。 查询专属主机列表接口不显示此参数。
     * 
     * @return instanceUuids */
    public List<String> getInstanceUuids() {
        return instanceUuids;
    }

    public void setInstanceUuids(List<String> instanceUuids) {
        this.instanceUuids = instanceUuids;
    }

    public RespDedicatedHost withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /** 专属主机标签。
     * 
     * @return tags */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public RespDedicatedHost withSysTags(Object sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    /** 专属主机系统标签。
     * 
     * @return sysTags */
    public Object getSysTags() {
        return sysTags;
    }

    public void setSysTags(Object sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespDedicatedHost respDedicatedHost = (RespDedicatedHost) o;
        return Objects.equals(this.dedicatedHostId, respDedicatedHost.dedicatedHostId)
            && Objects.equals(this.name, respDedicatedHost.name)
            && Objects.equals(this.autoPlacement, respDedicatedHost.autoPlacement)
            && Objects.equals(this.availabilityZone, respDedicatedHost.availabilityZone)
            && Objects.equals(this.projectId, respDedicatedHost.projectId)
            && Objects.equals(this.hostProperties, respDedicatedHost.hostProperties)
            && Objects.equals(this.state, respDedicatedHost.state)
            && Objects.equals(this.availableVcpus, respDedicatedHost.availableVcpus)
            && Objects.equals(this.availableMemory, respDedicatedHost.availableMemory)
            && Objects.equals(this.allocatedAt, respDedicatedHost.allocatedAt)
            && Objects.equals(this.releasedAt, respDedicatedHost.releasedAt)
            && Objects.equals(this.instanceTotal, respDedicatedHost.instanceTotal)
            && Objects.equals(this.instanceUuids, respDedicatedHost.instanceUuids)
            && Objects.equals(this.tags, respDedicatedHost.tags)
            && Objects.equals(this.sysTags, respDedicatedHost.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostId,
            name,
            autoPlacement,
            availabilityZone,
            projectId,
            hostProperties,
            state,
            availableVcpus,
            availableMemory,
            allocatedAt,
            releasedAt,
            instanceTotal,
            instanceUuids,
            tags,
            sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespDedicatedHost {\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    hostProperties: ").append(toIndentedString(hostProperties)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    availableVcpus: ").append(toIndentedString(availableVcpus)).append("\n");
        sb.append("    availableMemory: ").append(toIndentedString(availableMemory)).append("\n");
        sb.append("    allocatedAt: ").append(toIndentedString(allocatedAt)).append("\n");
        sb.append("    releasedAt: ").append(toIndentedString(releasedAt)).append("\n");
        sb.append("    instanceTotal: ").append(toIndentedString(instanceTotal)).append("\n");
        sb.append("    instanceUuids: ").append(toIndentedString(instanceUuids)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
