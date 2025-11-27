package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GroupRmsResourceRelationQueryResponseData
 */
public class GroupRmsResourceRelationQueryResponseData {

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
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

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
    @JsonProperty(value = "tags")

    private List<GroupRmsResourceRelationQueryResponseTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingest_properties")

    private Object ingestProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operable")

    private String operable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public GroupRmsResourceRelationQueryResponseData withId(String id) {
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

    public GroupRmsResourceRelationQueryResponseData withCmdbResourceId(String cmdbResourceId) {
        this.cmdbResourceId = cmdbResourceId;
        return this;
    }

    /**
     * **参数解释：** CloudCMDB分配的资源uuid。
     * @return cmdbResourceId
     */
    public String getCmdbResourceId() {
        return cmdbResourceId;
    }

    public void setCmdbResourceId(String cmdbResourceId) {
        this.cmdbResourceId = cmdbResourceId;
    }

    public GroupRmsResourceRelationQueryResponseData withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 分组id。 **取值范围：** 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public GroupRmsResourceRelationQueryResponseData withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释：** 分组名称。 **取值范围：** 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public GroupRmsResourceRelationQueryResponseData withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释：** 应用id。 **取值范围：** 长度24。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public GroupRmsResourceRelationQueryResponseData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 资源id。 **取值范围：** 长度36
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public GroupRmsResourceRelationQueryResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **取值范围：** 长度3到50之间。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupRmsResourceRelationQueryResponseData withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * **参数解释：** 企业项目id。 **取值范围：** 不涉及。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public GroupRmsResourceRelationQueryResponseData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目id。 **取值范围：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public GroupRmsResourceRelationQueryResponseData withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /**
     * **参数解释：** 企业项目名称。 **取值范围：** 不涉及。
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public GroupRmsResourceRelationQueryResponseData withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释：** 云服务名称。 **取值范围：** 不涉及。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public GroupRmsResourceRelationQueryResponseData withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GroupRmsResourceRelationQueryResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **取值范围：** 资源类型较多，根据实际业务选择资源类型、常用资源类型如下： - cloudservers：弹性云服务器。 - servers：裸金属服务器。 - clusters：云容器引擎。 - instances：云数据库。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GroupRmsResourceRelationQueryResponseData withRegionId(String regionId) {
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

    public GroupRmsResourceRelationQueryResponseData withInnerIp(String innerIp) {
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

    public GroupRmsResourceRelationQueryResponseData withAgentId(String agentId) {
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

    public GroupRmsResourceRelationQueryResponseData withAgentState(AgentStateEnum agentState) {
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

    public GroupRmsResourceRelationQueryResponseData withTags(List<GroupRmsResourceRelationQueryResponseTags> tags) {
        this.tags = tags;
        return this;
    }

    public GroupRmsResourceRelationQueryResponseData addTagsItem(GroupRmsResourceRelationQueryResponseTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GroupRmsResourceRelationQueryResponseData withTags(
        Consumer<List<GroupRmsResourceRelationQueryResponseTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 标签键值对。 **取值范围：** 不涉及。
     * @return tags
     */
    public List<GroupRmsResourceRelationQueryResponseTags> getTags() {
        return tags;
    }

    public void setTags(List<GroupRmsResourceRelationQueryResponseTags> tags) {
        this.tags = tags;
    }

    public GroupRmsResourceRelationQueryResponseData withIngestProperties(Object ingestProperties) {
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

    public GroupRmsResourceRelationQueryResponseData withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public GroupRmsResourceRelationQueryResponseData putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public GroupRmsResourceRelationQueryResponseData withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * **参数解释：** 属性。 **取值范围：** 不涉及。
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public GroupRmsResourceRelationQueryResponseData withOperable(String operable) {
        this.operable = operable;
        return this;
    }

    /**
     * **参数解释：** 用户定义资源是否可运维实例。 **取值范围：** - ENABLE：可运维。 - DISABLE：不可运维实例operable字段不存在。
     * @return operable
     */
    public String getOperable() {
        return operable;
    }

    public void setOperable(String operable) {
        this.operable = operable;
    }

    public GroupRmsResourceRelationQueryResponseData withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间，参考ISO8601标准格式。 **取值范围：** 不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupRmsResourceRelationQueryResponseData that = (GroupRmsResourceRelationQueryResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cmdbResourceId, that.cmdbResourceId)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.epId, that.epId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.epName, that.epName) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.innerIp, that.innerIp)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentState, that.agentState)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.ingestProperties, that.ingestProperties)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.operable, that.operable)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            cmdbResourceId,
            groupId,
            groupName,
            applicationId,
            resourceId,
            name,
            epId,
            projectId,
            epName,
            provider,
            domainId,
            type,
            regionId,
            innerIp,
            agentId,
            agentState,
            tags,
            ingestProperties,
            properties,
            operable,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupRmsResourceRelationQueryResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cmdbResourceId: ").append(toIndentedString(cmdbResourceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ingestProperties: ").append(toIndentedString(ingestProperties)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    operable: ").append(toIndentedString(operable)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
