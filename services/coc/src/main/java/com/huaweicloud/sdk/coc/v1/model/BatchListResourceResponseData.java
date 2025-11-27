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
 * BatchListResourceResponseData
 */
public class BatchListResourceResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagResponse> tags = null;

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
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingest_properties")

    private Map<String, String> ingestProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegated")

    private Boolean isDelegated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_ip")

    private String innerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operable")

    private String operable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_associate_group")

    private Boolean isAssociateGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_group_list")

    private List<String> associatedGroupList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public BatchListResourceResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** CMDB分配的资源ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchListResourceResponseData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 云服务分配的资源ID。 **取值范围：** 字符串，长度在36个字符。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchListResourceResponseData withDomainId(String domainId) {
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

    public BatchListResourceResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **取值范围：** 字符串，长度3到50个字符之间。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchListResourceResponseData withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释：** 云服务名称。 **取值范围：** 字符串，长度1到64个字符之间。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public BatchListResourceResponseData withType(String type) {
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

    public BatchListResourceResponseData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** Openstack中的项目ID。 **取值范围：** 字符串，长度32个字符。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchListResourceResponseData withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** region的子项目名称。 **取值范围：** 字符串，不超过255个字符。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BatchListResourceResponseData withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * **参数解释：** 区域id。 **取值范围：** 字符串，长度0到64个字符。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public BatchListResourceResponseData withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * **参数解释：** 企业项目ID。 **取值范围：** 请选择[[企业管理](https://support.huaweicloud.com/usermanual-em/em_eps_qs_0400.html)](tag:hws)[[企业管理](https://support.huaweicloud.com/intl/zh-cn/usermanual-em/em_eps_qs_0400.html)](tag:hws_hk)中存在的项目ID。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public BatchListResourceResponseData withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /**
     * **参数解释：** 企业项目名称。 **取值范围：** 由中文、英文字母、数字、下划线、中划线组成，且不能使用任何大小写形式的“default”，不超过255个字符。
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public BatchListResourceResponseData withTags(List<TagResponse> tags) {
        this.tags = tags;
        return this;
    }

    public BatchListResourceResponseData addTagsItem(TagResponse tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchListResourceResponseData withTags(Consumer<List<TagResponse>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签。 **取值范围：** 不涉及。
     * @return tags
     */
    public List<TagResponse> getTags() {
        return tags;
    }

    public void setTags(List<TagResponse> tags) {
        this.tags = tags;
    }

    public BatchListResourceResponseData withAgentId(String agentId) {
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

    public BatchListResourceResponseData withAgentState(AgentStateEnum agentState) {
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

    public BatchListResourceResponseData withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * **参数解释：** 资源详细属性。 **取值范围：** 不涉及。
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public BatchListResourceResponseData withIngestProperties(Map<String, String> ingestProperties) {
        this.ingestProperties = ingestProperties;
        return this;
    }

    public BatchListResourceResponseData putIngestPropertiesItem(String key, String ingestPropertiesItem) {
        if (this.ingestProperties == null) {
            this.ingestProperties = new HashMap<>();
        }
        this.ingestProperties.put(key, ingestPropertiesItem);
        return this;
    }

    public BatchListResourceResponseData withIngestProperties(Consumer<Map<String, String>> ingestPropertiesSetter) {
        if (this.ingestProperties == null) {
            this.ingestProperties = new HashMap<>();
        }
        ingestPropertiesSetter.accept(this.ingestProperties);
        return this;
    }

    /**
     * **参数解释：** 采集属性。 **取值范围：** 不涉及。
     * @return ingestProperties
     */
    public Map<String, String> getIngestProperties() {
        return ingestProperties;
    }

    public void setIngestProperties(Map<String, String> ingestProperties) {
        this.ingestProperties = ingestProperties;
    }

    public BatchListResourceResponseData withIsDelegated(Boolean isDelegated) {
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

    public BatchListResourceResponseData withInnerIp(String innerIp) {
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

    public BatchListResourceResponseData withOperable(String operable) {
        this.operable = operable;
        return this;
    }

    /**
     * **参数解释：** 用户定义资源是否可运维实例。 **取值范围：** - ENABLE：可运维实例。 - DISABLE：不可运维实例operable字段不存在。
     * @return operable
     */
    public String getOperable() {
        return operable;
    }

    public void setOperable(String operable) {
        this.operable = operable;
    }

    public BatchListResourceResponseData withIsAssociateGroup(Boolean isAssociateGroup) {
        this.isAssociateGroup = isAssociateGroup;
        return this;
    }

    /**
     * **参数解释：** 是否已被指定分组关联。 **取值范围：** - true：已被指定分组关联。 - false：未被指定分组关联。
     * @return isAssociateGroup
     */
    public Boolean getIsAssociateGroup() {
        return isAssociateGroup;
    }

    public void setIsAssociateGroup(Boolean isAssociateGroup) {
        this.isAssociateGroup = isAssociateGroup;
    }

    public BatchListResourceResponseData withAssociatedGroupList(List<String> associatedGroupList) {
        this.associatedGroupList = associatedGroupList;
        return this;
    }

    public BatchListResourceResponseData addAssociatedGroupListItem(String associatedGroupListItem) {
        if (this.associatedGroupList == null) {
            this.associatedGroupList = new ArrayList<>();
        }
        this.associatedGroupList.add(associatedGroupListItem);
        return this;
    }

    public BatchListResourceResponseData withAssociatedGroupList(Consumer<List<String>> associatedGroupListSetter) {
        if (this.associatedGroupList == null) {
            this.associatedGroupList = new ArrayList<>();
        }
        associatedGroupListSetter.accept(this.associatedGroupList);
        return this;
    }

    /**
     * **参数解释：** 资源所关联的分组信息组成的列表。 **取值范围：** 不涉及。
     * @return associatedGroupList
     */
    public List<String> getAssociatedGroupList() {
        return associatedGroupList;
    }

    public void setAssociatedGroupList(List<String> associatedGroupList) {
        this.associatedGroupList = associatedGroupList;
    }

    public BatchListResourceResponseData withCreateTime(OffsetDateTime createTime) {
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

    public BatchListResourceResponseData withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释：** 修改时间，参考ISO8601标准格式。 **取值范围：** 不涉及。
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
        BatchListResourceResponseData that = (BatchListResourceResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.type, that.type)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.epId, that.epId)
            && Objects.equals(this.epName, that.epName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentState, that.agentState)
            && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.ingestProperties, that.ingestProperties)
            && Objects.equals(this.isDelegated, that.isDelegated) && Objects.equals(this.innerIp, that.innerIp)
            && Objects.equals(this.operable, that.operable)
            && Objects.equals(this.isAssociateGroup, that.isAssociateGroup)
            && Objects.equals(this.associatedGroupList, that.associatedGroupList)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceId,
            domainId,
            name,
            provider,
            type,
            projectId,
            projectName,
            regionId,
            epId,
            epName,
            tags,
            agentId,
            agentState,
            properties,
            ingestProperties,
            isDelegated,
            innerIp,
            operable,
            isAssociateGroup,
            associatedGroupList,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListResourceResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    ingestProperties: ").append(toIndentedString(ingestProperties)).append("\n");
        sb.append("    isDelegated: ").append(toIndentedString(isDelegated)).append("\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    operable: ").append(toIndentedString(operable)).append("\n");
        sb.append("    isAssociateGroup: ").append(toIndentedString(isAssociateGroup)).append("\n");
        sb.append("    associatedGroupList: ").append(toIndentedString(associatedGroupList)).append("\n");
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
