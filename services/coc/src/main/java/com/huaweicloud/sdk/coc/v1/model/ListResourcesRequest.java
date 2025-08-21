package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_list")

    private List<String> resourceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<String> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_id")

    private String azId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private String ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_state")

    private String agentState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_cluster_id")

    private String cceClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegated")

    private Boolean isDelegated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_collected")

    private Boolean isCollected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_name")

    private String flavorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_field")

    private String orderField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_associated_groups")

    private String showAssociatedGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operable")

    private String operable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_since")

    private String createSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_until")

    private String createUntil;

    public ListResourcesRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释：** 云服务名称。 **约束限制：** - 创建的云资源数量（count字段对应的值）大于1时，可以使用“自动排序”和“正则排序”设置有序的云资源名称。 - 创建的云资源数量（count字段对应的值）大于1时，为区分不同云资源，创建过程中系统会自动在名称后加“-0000”的类似标记。若用户在名称后已指定“-0000”的类似标记，系统将从该标记后继续顺序递增编号。故此时名称的长度为[1-59]个字符。 **取值范围：** - 只能由中文字符、英文字母、数字及“_”、“-”、“.”组成，且长度为[1-128]个英文字符或[1-64]个中文字符。 **默认取值：** 不涉及。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ListResourcesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **约束限制：** 不涉及。 **取值范围：** 资源类型较多，根据实际业务选择资源类型、常用资源类型如下： - cloudservers：弹性云服务器。 - servers：裸金属服务器。 - clusters：云容器引擎。 - instances：云数据库。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 分页查询每页显示的条目数量。 **约束限制：** 不涉及。 **取值范围：** 自定义，在1-500范围。 **默认取值：** 不涉及。
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResourcesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释：** 用于分页查询。 **约束限制：** 不涉及。 **取值范围：** 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页。 **默认取值：** 不涉及。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListResourcesRequest withResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    public ListResourcesRequest addResourceIdListItem(String resourceIdListItem) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdListItem);
        return this;
    }

    public ListResourcesRequest withResourceIdList(Consumer<List<String>> resourceIdListSetter) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        resourceIdListSetter.accept(this.resourceIdList);
        return this;
    }

    /**
     * **参数解释：** 资源id列表。 **约束限制：** 不涉及。 **取值范围：** 资源id列表，最大值100。 **默认取值：** 不涉及。
     * @return resourceIdList
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    public ListResourcesRequest withIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    public ListResourcesRequest addIpListItem(String ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public ListResourcesRequest withIpList(Consumer<List<String>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * **参数解释：** ip列表。 **约束限制：** 不涉及。 **取值范围：** 列表，最大值100。 **默认取值：** 不涉及。
     * @return ipList
     */
    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }

    public ListResourcesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 云资源名称。 **约束限制：** 不涉及。 **取值范围：** 字符串，可参考：裸金属服务器BMS。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListResourcesRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * **参数解释：** 区域id。 **约束限制：** 不涉及。 **取值范围：** 关联的区域region的id。 **默认取值：** 不涉及。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListResourcesRequest withAzId(String azId) {
        this.azId = azId;
        return this;
    }

    /**
     * **参数解释：** 可用区id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return azId
     */
    public String getAzId() {
        return azId;
    }

    public void setAzId(String azId) {
        this.azId = azId;
    }

    public ListResourcesRequest withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * **参数解释：** ip类型。 **约束限制：** 不涉及。 **取值范围：** - fixed：内网IP。 - floating：弹性公网IP。 **默认取值：** 不涉及。
     * @return ipType
     */
    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public ListResourcesRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释：** 云资源IP。 **约束限制：** 不涉及。 **取值范围：** IPv4地址过滤结果，匹配规则为模糊匹配。 **默认取值：** 不涉及。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ListResourcesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 云资源状态。 **约束限制：** 不涉及。 **取值范围：** 请选择[[弹性云服务器 ECS](https://support.huaweicloud.com/api-ecs/ecs_08_0002.html)](tag:hws)[[弹性云服务器 ECS](https://support.huaweicloud.com/api-ecs/ecs_08_0002.html)](tag:hws_hk)中存在的云服务器状态。 **默认取值：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListResourcesRequest withAgentState(String agentState) {
        this.agentState = agentState;
        return this;
    }

    /**
     * **参数解释：** agent状态。 **约束限制：** 不涉及。 **取值范围：** - ONLINE：运行中。 - OFFLINE：异常。 - INSTALLING：安装中。 - FAILED：安装失败。 - UNINSTALLED：已卸载。 - null：未安装。 **默认取值：** 不涉及。
     * @return agentState
     */
    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState;
    }

    public ListResourcesRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释：** 镜像名称，模糊匹配。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListResourcesRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释：** 系统类型。 **约束限制：** 不涉及。 **取值范围：** - windows：windows操作系统类型。 - linux：linux操作系统类型。 **默认取值：** 不涉及。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListResourcesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释：** 云资源的标签。 **约束限制：** 标签的格式为“key.value”。其中，key的长度不超过36个字符，value的长度不超过43个字符。 **取值范围：** 标签命名时，需满足如下要求：标签的key值只能包含大写字母（A~Z）、小写字母（a~z）、数字（0-9）、下划线（）、中划线（-）以及中文字符。 标签的value值只能包含大写字母（A~Z）、小写字母（a~z）、数字（0-9）、下划线（）、中划线（-）、小数点（.）以及中文字符。 **默认取值：** 不涉及。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListResourcesRequest withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * **参数解释：** 云资源的标签key。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public ListResourcesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 云资源下的分组ID。 **约束限制：** 传分组id，就查询分组下的资源数量。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListResourcesRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释：** 云资源下组件ID。 **约束限制：** 传组件id，就查询组件下的资源数量。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListResourcesRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释：** 云资源下应用ID。 **约束限制：** 传应用id，就查询应用下的资源数量。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ListResourcesRequest withCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
        return this;
    }

    /**
     * **参数解释：** cce集群ID。 **约束限制：** 不涉及。 **取值范围：** 资源属于的cce的ID。 **默认取值：** 不涉及。
     * @return cceClusterId
     */
    public String getCceClusterId() {
        return cceClusterId;
    }

    public void setCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
    }

    public ListResourcesRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 待创建云资源所属虚拟私有云（简称VPC），需要指定已创建VPC的ID，UUID格式。。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListResourcesRequest withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * **参数解释：** 企业项目id。 **约束限制：** 不涉及。 **取值范围：** 请选择[[企业管理](https://support.huaweicloud.com/usermanual-em/em_eps_qs_0400.html)](tag:hws)[[企业管理](https://support.huaweicloud.com/intl/zh-cn/usermanual-em/em_eps_qs_0400.html)](tag:hws_hk)中存在的项目ID。 **默认取值：** 不涉及。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ListResourcesRequest withIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
        return this;
    }

    /**
     * **参数解释：** 是否已托管。 **约束限制：** 不涉及。 **取值范围：** - true：已经托管。 - false：未托管。 **默认取值：** 不涉及。
     * @return isDelegated
     */
    public Boolean getIsDelegated() {
        return isDelegated;
    }

    public void setIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
    }

    public ListResourcesRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListResourcesRequest withIsCollected(Boolean isCollected) {
        this.isCollected = isCollected;
        return this;
    }

    /**
     * **参数解释：** 是否已收藏。 **约束限制：** 不涉及。 **取值范围：** - true：已收藏的企业项目。 - false：未收藏的企业项目。 **默认取值：** 不涉及。
     * @return isCollected
     */
    public Boolean getIsCollected() {
        return isCollected;
    }

    public void setIsCollected(Boolean isCollected) {
        this.isCollected = isCollected;
    }

    public ListResourcesRequest withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * **参数解释：** 云资源规格名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return flavorName
     */
    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public ListResourcesRequest withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释：** 云服务器的计费类型。 **约束限制：** 不涉及。 **取值范围：** 计费模式： - 0：按需计费。 - 1：包年包月。 - 2：竞价计费。 **默认取值：** 不涉及。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListResourcesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 分页查询偏移量，表示从此偏移量开始查询。 **约束限制：** 不涉及。 **取值范围：** 0-2147483647。 **默认取值：** 0。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListResourcesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 企业项目id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListResourcesRequest withOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }

    /**
     * **参数解释：** 根据排序字段对资源进行排序显示。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return orderField
     */
    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public ListResourcesRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释：** 排序。 **约束限制：** 不涉及。 **取值范围：** - DESC:倒序。 - ASC:正序。 **默认取值：** 不涉及。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ListResourcesRequest withShowAssociatedGroups(String showAssociatedGroups) {
        this.showAssociatedGroups = showAssociatedGroups;
        return this;
    }

    /**
     * **参数解释：** 显示关联应用。 **约束限制：** 不涉及。 **取值范围：** - true：显示关联应用信息。 - false：不显示关联应用信息。 **默认取值：** 不涉及。
     * @return showAssociatedGroups
     */
    public String getShowAssociatedGroups() {
        return showAssociatedGroups;
    }

    public void setShowAssociatedGroups(String showAssociatedGroups) {
        this.showAssociatedGroups = showAssociatedGroups;
    }

    public ListResourcesRequest withOperable(String operable) {
        this.operable = operable;
        return this;
    }

    /**
     * **参数解释：** 用户定义资源是否可运维实例。 **约束限制：** 不涉及。 **取值范围：** - ENABLE：可运维实例。 - DISABLE：不可运维实例operable字段不存在。 **默认取值：** 不涉及。
     * @return operable
     */
    public String getOperable() {
        return operable;
    }

    public void setOperable(String operable) {
        this.operable = operable;
    }

    public ListResourcesRequest withCreateSince(String createSince) {
        this.createSince = createSince;
        return this;
    }

    /**
     * **参数解释：** 创建时间中的开始日期，参考ISO8601标准格式。 **约束限制：** 开始日期和结束日期，至少有一个日期存在。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return createSince
     */
    public String getCreateSince() {
        return createSince;
    }

    public void setCreateSince(String createSince) {
        this.createSince = createSince;
    }

    public ListResourcesRequest withCreateUntil(String createUntil) {
        this.createUntil = createUntil;
        return this;
    }

    /**
     * **参数解释：** 创建时间中的结束日期，参考ISO8601标准格式。 **约束限制：** 开始日期和结束日期，至少有一个日期存在。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return createUntil
     */
    public String getCreateUntil() {
        return createUntil;
    }

    public void setCreateUntil(String createUntil) {
        this.createUntil = createUntil;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourcesRequest that = (ListResourcesRequest) obj;
        return Objects.equals(this.provider, that.provider) && Objects.equals(this.type, that.type)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.resourceIdList, that.resourceIdList) && Objects.equals(this.ipList, that.ipList)
            && Objects.equals(this.name, that.name) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.azId, that.azId) && Objects.equals(this.ipType, that.ipType)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.status, that.status)
            && Objects.equals(this.agentState, that.agentState) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.tagKey, that.tagKey) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.cceClusterId, that.cceClusterId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.epId, that.epId) && Objects.equals(this.isDelegated, that.isDelegated)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.isCollected, that.isCollected)
            && Objects.equals(this.flavorName, that.flavorName) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.orderField, that.orderField) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.showAssociatedGroups, that.showAssociatedGroups)
            && Objects.equals(this.operable, that.operable) && Objects.equals(this.createSince, that.createSince)
            && Objects.equals(this.createUntil, that.createUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider,
            type,
            limit,
            marker,
            resourceIdList,
            ipList,
            name,
            regionId,
            azId,
            ipType,
            ip,
            status,
            agentState,
            imageName,
            osType,
            tag,
            tagKey,
            groupId,
            componentId,
            applicationId,
            cceClusterId,
            vpcId,
            epId,
            isDelegated,
            projectId,
            isCollected,
            flavorName,
            chargingMode,
            offset,
            enterpriseProjectId,
            orderField,
            direction,
            showAssociatedGroups,
            operable,
            createSince,
            createUntil);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcesRequest {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    resourceIdList: ").append(toIndentedString(resourceIdList)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    azId: ").append(toIndentedString(azId)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    cceClusterId: ").append(toIndentedString(cceClusterId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    isDelegated: ").append(toIndentedString(isDelegated)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isCollected: ").append(toIndentedString(isCollected)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    showAssociatedGroups: ").append(toIndentedString(showAssociatedGroups)).append("\n");
        sb.append("    operable: ").append(toIndentedString(operable)).append("\n");
        sb.append("    createSince: ").append(toIndentedString(createSince)).append("\n");
        sb.append("    createUntil: ").append(toIndentedString(createUntil)).append("\n");
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
