package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GroupOtherResourceRelationQueryResponseData
 */
public class GroupOtherResourceRelationQueryResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdb_resource_id")

    private String cmdbResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 资源类型。 **取值范围：** - PM：物理机。 - VM：虚拟机。
     */
    public static final class TypeEnum {

        /**
         * Enum PM for value: "PM"
         */
        public static final TypeEnum PM = new TypeEnum("PM");

        /**
         * Enum VM for value: "VM"
         */
        public static final TypeEnum VM = new TypeEnum("VM");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("PM", PM);
            map.put("VM", VM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegated")

    private Boolean isDelegated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_ip")

    private String innerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_host")

    private Boolean isHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    /**
     * **参数解释：** uniagent的状态。 **取值范围：** - ONLINE：运行中。 - OFFLINE：异常。 - INSTALLING：安装中。 - FAILED：安装失败。 - UNINSTALLED：已卸载。 - null：未安装。
     */
    public static final class AgentStateEnum {

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final AgentStateEnum ONLINE = new AgentStateEnum("ONLINE");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final AgentStateEnum OFFLINE = new AgentStateEnum("OFFLINE");

        /**
         * Enum INSTALLING for value: "INSTALLING"
         */
        public static final AgentStateEnum INSTALLING = new AgentStateEnum("INSTALLING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final AgentStateEnum FAILED = new AgentStateEnum("FAILED");

        /**
         * Enum UNINSTALLED for value: "UNINSTALLED"
         */
        public static final AgentStateEnum UNINSTALLED = new AgentStateEnum("UNINSTALLED");

        private static final Map<String, AgentStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentStateEnum> createStaticFields() {
            Map<String, AgentStateEnum> map = new HashMap<>();
            map.put("ONLINE", ONLINE);
            map.put("OFFLINE", OFFLINE);
            map.put("INSTALLING", INSTALLING);
            map.put("FAILED", FAILED);
            map.put("UNINSTALLED", UNINSTALLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentStateEnum(String value) {
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
        public static AgentStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentStateEnum(value));
        }

        public static AgentStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentStateEnum) {
                return this.value.equals(((AgentStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_state")

    private AgentStateEnum agentState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private String datasource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, Object> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingest_properties")

    private Map<String, Object> ingestProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xrn")

    private String xrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public GroupOtherResourceRelationQueryResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** CMDB生成uuid。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupOtherResourceRelationQueryResponseData withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 字符串，长度32个字符。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GroupOtherResourceRelationQueryResponseData withCmdbResourceId(String cmdbResourceId) {
        this.cmdbResourceId = cmdbResourceId;
        return this;
    }

    /**
     * **参数解释：** CloudCMDB分配的资源uuid。 **取值范围：** 不涉及。
     * @return cmdbResourceId
     */
    public String getCmdbResourceId() {
        return cmdbResourceId;
    }

    public void setCmdbResourceId(String cmdbResourceId) {
        this.cmdbResourceId = cmdbResourceId;
    }

    public GroupOtherResourceRelationQueryResponseData withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 分组id。 **取值范围：** 字符串，长度24个字符。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public GroupOtherResourceRelationQueryResponseData withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释：** 分组名称。 **取值范围：** 字符串，长度3~60个字符。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public GroupOtherResourceRelationQueryResponseData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 资源id。 **取值范围：** 字符串，长度36个字符。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public GroupOtherResourceRelationQueryResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **取值范围：** 字符串，长度3到50个字符串。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupOtherResourceRelationQueryResponseData withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **取值范围：** - PM：物理机。 - VM：虚拟机。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public GroupOtherResourceRelationQueryResponseData withIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
        return this;
    }

    /**
     * **参数解释：** 是否已托管。 **取值范围：** - true：已经托管。 - false：未托管。
     * @return isDelegated
     */
    public Boolean getIsDelegated() {
        return isDelegated;
    }

    public void setIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
    }

    public GroupOtherResourceRelationQueryResponseData withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * **参数解释：** 区域id。 **取值范围：** 字符串，长度在0到64个字符之间。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public GroupOtherResourceRelationQueryResponseData withInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }

    /**
     * **参数解释：** 资源内网ip。 **取值范围：** 不涉及。
     * @return innerIp
     */
    public String getInnerIp() {
        return innerIp;
    }

    public void setInnerIp(String innerIp) {
        this.innerIp = innerIp;
    }

    public GroupOtherResourceRelationQueryResponseData withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * **参数解释：** 可用区id。 **取值范围：** 不涉及。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public GroupOtherResourceRelationQueryResponseData withIsHost(Boolean isHost) {
        this.isHost = isHost;
        return this;
    }

    /**
     * **参数解释：** 是否为主机。 **取值范围：** - true：为主机。 - false： 非主机。
     * @return isHost
     */
    public Boolean getIsHost() {
        return isHost;
    }

    public void setIsHost(Boolean isHost) {
        this.isHost = isHost;
    }

    public GroupOtherResourceRelationQueryResponseData withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释：** uniagent的id值。 **取值范围：** 不涉及。
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public GroupOtherResourceRelationQueryResponseData withAgentState(AgentStateEnum agentState) {
        this.agentState = agentState;
        return this;
    }

    /**
     * **参数解释：** uniagent的状态。 **取值范围：** - ONLINE：运行中。 - OFFLINE：异常。 - INSTALLING：安装中。 - FAILED：安装失败。 - UNINSTALLED：已卸载。 - null：未安装。
     * @return agentState
     */
    public AgentStateEnum getAgentState() {
        return agentState;
    }

    public void setAgentState(AgentStateEnum agentState) {
        this.agentState = agentState;
    }

    public GroupOtherResourceRelationQueryResponseData withDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * **参数解释：** 云厂商账户id。 **取值范围：** 字符串，长度在0到24个字符之间。
     * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public GroupOtherResourceRelationQueryResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 字符串，长度在1到256个字符之间。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GroupOtherResourceRelationQueryResponseData withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public GroupOtherResourceRelationQueryResponseData putPropertiesItem(String key, Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public GroupOtherResourceRelationQueryResponseData withProperties(Consumer<Map<String, Object>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * **参数解释：** 属性信息。 **取值范围：** 不涉及。
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public GroupOtherResourceRelationQueryResponseData withIngestProperties(Map<String, Object> ingestProperties) {
        this.ingestProperties = ingestProperties;
        return this;
    }

    public GroupOtherResourceRelationQueryResponseData putIngestPropertiesItem(String key,
        Object ingestPropertiesItem) {
        if (this.ingestProperties == null) {
            this.ingestProperties = new HashMap<>();
        }
        this.ingestProperties.put(key, ingestPropertiesItem);
        return this;
    }

    public GroupOtherResourceRelationQueryResponseData withIngestProperties(
        Consumer<Map<String, Object>> ingestPropertiesSetter) {
        if (this.ingestProperties == null) {
            this.ingestProperties = new HashMap<>();
        }
        ingestPropertiesSetter.accept(this.ingestProperties);
        return this;
    }

    /**
     * **参数解释：** 数据采集属性，描述视图系统采集该资源时所记录的附加信息。 **取值范围：** 不涉及。
     * @return ingestProperties
     */
    public Map<String, Object> getIngestProperties() {
        return ingestProperties;
    }

    public void setIngestProperties(Map<String, Object> ingestProperties) {
        this.ingestProperties = ingestProperties;
    }

    public GroupOtherResourceRelationQueryResponseData withXrn(String xrn) {
        this.xrn = xrn;
        return this;
    }

    /**
     * **参数解释：** 设备标识。 **取值范围：** 字符串，长度3到50个字符之间。
     * @return xrn
     */
    public String getXrn() {
        return xrn;
    }

    public void setXrn(String xrn) {
        this.xrn = xrn;
    }

    public GroupOtherResourceRelationQueryResponseData withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public GroupOtherResourceRelationQueryResponseData withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** 不涉及。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupOtherResourceRelationQueryResponseData that = (GroupOtherResourceRelationQueryResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.cmdbResourceId, that.cmdbResourceId) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.isDelegated, that.isDelegated) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.innerIp, that.innerIp) && Objects.equals(this.zoneId, that.zoneId)
            && Objects.equals(this.isHost, that.isHost) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.agentState, that.agentState) && Objects.equals(this.datasource, that.datasource)
            && Objects.equals(this.description, that.description) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.ingestProperties, that.ingestProperties) && Objects.equals(this.xrn, that.xrn)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            cmdbResourceId,
            groupId,
            groupName,
            resourceId,
            name,
            type,
            isDelegated,
            regionId,
            innerIp,
            zoneId,
            isHost,
            agentId,
            agentState,
            datasource,
            description,
            properties,
            ingestProperties,
            xrn,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupOtherResourceRelationQueryResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    cmdbResourceId: ").append(toIndentedString(cmdbResourceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isDelegated: ").append(toIndentedString(isDelegated)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    isHost: ").append(toIndentedString(isHost)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    ingestProperties: ").append(toIndentedString(ingestProperties)).append("\n");
        sb.append("    xrn: ").append(toIndentedString(xrn)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
