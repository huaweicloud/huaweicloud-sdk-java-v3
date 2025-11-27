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
public class CountResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_list")

    private List<String> resourceIdList = null;

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
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegated")

    private String isDelegated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_collected")

    private Boolean isCollected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_name")

    private String flavorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    public CountResourcesRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释：** 云服务名称。 **约束限制：** 不涉及。 **取值范围：** 可选ecs,cce，rds等服务资源。 **默认取值：** 不涉及。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CountResourcesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型名称。 **约束限制：** 不涉及。 **取值范围：** 资源类型较多，根据实际业务选择资源类型、常用资源类型如下： - cloudservers：弹性云服务器 。 - servers：裸金属服务器。 - clusters：云容器引擎。 - instances：云数据库。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CountResourcesRequest withResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    public CountResourcesRequest addResourceIdListItem(String resourceIdListItem) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdListItem);
        return this;
    }

    public CountResourcesRequest withResourceIdList(Consumer<List<String>> resourceIdListSetter) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        resourceIdListSetter.accept(this.resourceIdList);
        return this;
    }

    /**
     * **参数解释：** 资源id列表。 **约束限制：** 不涉及。 **取值范围：** 自定义,资源id组成的集合。 **默认取值：** 不涉及。
     * @return resourceIdList
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    public CountResourcesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 云资源名称。 **约束限制：** 不涉及。 **取值范围：** 自定义，可参考：裸金属服务器 BMS。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountResourcesRequest withRegionId(String regionId) {
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

    public CountResourcesRequest withAzId(String azId) {
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

    public CountResourcesRequest withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * **参数解释：** ip类型。 **约束限制：** 不涉及。 **取值范围：** fixed：内网IP，floating：弹性公网IP。 **默认取值：** 不涉及。
     * @return ipType
     */
    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public CountResourcesRequest withIp(String ip) {
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

    public CountResourcesRequest withStatus(String status) {
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

    public CountResourcesRequest withAgentState(String agentState) {
        this.agentState = agentState;
        return this;
    }

    /**
     * **参数解释：** agent状态。 **约束限制：** 不涉及。 **取值范围：** - 运行中。 - 异常。 - 安装中。 - 安装失败。 - 已卸载。 - 未安装。 **默认取值：** 不涉及。
     * @return agentState
     */
    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState;
    }

    public CountResourcesRequest withImageName(String imageName) {
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

    public CountResourcesRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释：** 系统类型。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public CountResourcesRequest withTag(String tag) {
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

    public CountResourcesRequest withTagKey(String tagKey) {
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

    public CountResourcesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 云资源下的分组ID。 **约束限制：** 不涉及。 **取值范围：** 设置null值时获取未绑定分组的资源。 **默认取值：** 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CountResourcesRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释：** 云资源下组件ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public CountResourcesRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释：** 云资源下应用ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public CountResourcesRequest withCceClusterId(String cceClusterId) {
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

    public CountResourcesRequest withEpId(String epId) {
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

    public CountResourcesRequest withIsDelegated(String isDelegated) {
        this.isDelegated = isDelegated;
        return this;
    }

    /**
     * **参数解释：** 是否已托管。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return isDelegated
     */
    public String getIsDelegated() {
        return isDelegated;
    }

    public void setIsDelegated(String isDelegated) {
        this.isDelegated = isDelegated;
    }

    public CountResourcesRequest withIsCollected(Boolean isCollected) {
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

    public CountResourcesRequest withFlavorName(String flavorName) {
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

    public CountResourcesRequest withChargingMode(String chargingMode) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountResourcesRequest that = (CountResourcesRequest) obj;
        return Objects.equals(this.provider, that.provider) && Objects.equals(this.type, that.type)
            && Objects.equals(this.resourceIdList, that.resourceIdList) && Objects.equals(this.name, that.name)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.azId, that.azId)
            && Objects.equals(this.ipType, that.ipType) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.status, that.status) && Objects.equals(this.agentState, that.agentState)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.tagKey, that.tagKey)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.cceClusterId, that.cceClusterId) && Objects.equals(this.epId, that.epId)
            && Objects.equals(this.isDelegated, that.isDelegated) && Objects.equals(this.isCollected, that.isCollected)
            && Objects.equals(this.flavorName, that.flavorName) && Objects.equals(this.chargingMode, that.chargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider,
            type,
            resourceIdList,
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
            epId,
            isDelegated,
            isCollected,
            flavorName,
            chargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountResourcesRequest {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceIdList: ").append(toIndentedString(resourceIdList)).append("\n");
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
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    isDelegated: ").append(toIndentedString(isDelegated)).append("\n");
        sb.append("    isCollected: ").append(toIndentedString(isCollected)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
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
