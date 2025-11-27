package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * GroupAliResourceRelationQueryResponseData
 */
public class GroupAliResourceRelationQueryResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingest_properties")

    private Object ingestProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_ip")

    private String innerIp;

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
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private String datasource;

    public GroupAliResourceRelationQueryResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 分组资源关联的id。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupAliResourceRelationQueryResponseData withCmdbResourceId(String cmdbResourceId) {
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

    public GroupAliResourceRelationQueryResponseData withGroupId(String groupId) {
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

    public GroupAliResourceRelationQueryResponseData withGroupName(String groupName) {
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

    public GroupAliResourceRelationQueryResponseData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 在阿里云存的资源id。 **取值范围：** 不涉及。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public GroupAliResourceRelationQueryResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupAliResourceRelationQueryResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **取值范围：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GroupAliResourceRelationQueryResponseData withIngestProperties(Object ingestProperties) {
        this.ingestProperties = ingestProperties;
        return this;
    }

    /**
     * **参数解释：** 数据采集属性。 **取值范围：** 不涉及。
     * @return ingestProperties
     */
    public Object getIngestProperties() {
        return ingestProperties;
    }

    public void setIngestProperties(Object ingestProperties) {
        this.ingestProperties = ingestProperties;
    }

    public GroupAliResourceRelationQueryResponseData withZoneId(String zoneId) {
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

    public GroupAliResourceRelationQueryResponseData withInnerIp(String innerIp) {
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

    public GroupAliResourceRelationQueryResponseData withAgentId(String agentId) {
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

    public GroupAliResourceRelationQueryResponseData withAgentState(AgentStateEnum agentState) {
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

    public GroupAliResourceRelationQueryResponseData withRegionId(String regionId) {
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

    public GroupAliResourceRelationQueryResponseData withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 资源创建时间。 **取值范围：** 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public GroupAliResourceRelationQueryResponseData withDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * **参数解释：** 云厂商账户id。 **取值范围：** 不涉及。
     * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupAliResourceRelationQueryResponseData that = (GroupAliResourceRelationQueryResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cmdbResourceId, that.cmdbResourceId)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.ingestProperties, that.ingestProperties)
            && Objects.equals(this.zoneId, that.zoneId) && Objects.equals(this.innerIp, that.innerIp)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentState, that.agentState)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.datasource, that.datasource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            cmdbResourceId,
            groupId,
            groupName,
            resourceId,
            name,
            type,
            ingestProperties,
            zoneId,
            innerIp,
            agentId,
            agentState,
            regionId,
            createTime,
            datasource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupAliResourceRelationQueryResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cmdbResourceId: ").append(toIndentedString(cmdbResourceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ingestProperties: ").append(toIndentedString(ingestProperties)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
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
