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
public class CountOtherResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegated")

    private Boolean isDelegated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegate_domain")

    private Boolean isDelegateDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_list")

    private List<String> nameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_since")

    private String createSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_until")

    private String createUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version_list")

    private String osVersionList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_state")

    private String agentState;

    public CountOtherResourceRequest withIsDelegated(Boolean isDelegated) {
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

    public CountOtherResourceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **约束限制：** 不涉及。 **取值范围：** - vm：虚拟机。 - PM：物理机。 - Middleware：中间件设备。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CountOtherResourceRequest withIsDelegateDomain(Boolean isDelegateDomain) {
        this.isDelegateDomain = isDelegateDomain;
        return this;
    }

    /**
     * **参数解释：** 是否为sre。 **约束限制：** 不涉及。 **取值范围：** - true：是sre。 - false：非sre。 **默认取值：** 不涉及。
     * @return isDelegateDomain
     */
    public Boolean getIsDelegateDomain() {
        return isDelegateDomain;
    }

    public void setIsDelegateDomain(Boolean isDelegateDomain) {
        this.isDelegateDomain = isDelegateDomain;
    }

    public CountOtherResourceRequest withNameList(List<String> nameList) {
        this.nameList = nameList;
        return this;
    }

    public CountOtherResourceRequest addNameListItem(String nameListItem) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        this.nameList.add(nameListItem);
        return this;
    }

    public CountOtherResourceRequest withNameList(Consumer<List<String>> nameListSetter) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        nameListSetter.accept(this.nameList);
        return this;
    }

    /**
     * **参数解释：** 资源名称，支持模糊查询。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return nameList
     */
    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public CountOtherResourceRequest withRegionId(String regionId) {
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

    public CountOtherResourceRequest withCreateSince(String createSince) {
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

    public CountOtherResourceRequest withCreateUntil(String createUntil) {
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

    public CountOtherResourceRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释：** 私有ip。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public CountOtherResourceRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释：** 操作系统。 **约束限制：** 不涉及。 **取值范围：** - windows：windows操作系统类型。 - linux：linux操作系统类型。 **默认取值：** 不涉及。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public CountOtherResourceRequest withOsVersionList(String osVersionList) {
        this.osVersionList = osVersionList;
        return this;
    }

    /**
     * **参数解释：** OS版本。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return osVersionList
     */
    public String getOsVersionList() {
        return osVersionList;
    }

    public void setOsVersionList(String osVersionList) {
        this.osVersionList = osVersionList;
    }

    public CountOtherResourceRequest withAgentState(String agentState) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountOtherResourceRequest that = (CountOtherResourceRequest) obj;
        return Objects.equals(this.isDelegated, that.isDelegated) && Objects.equals(this.type, that.type)
            && Objects.equals(this.isDelegateDomain, that.isDelegateDomain)
            && Objects.equals(this.nameList, that.nameList) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.createSince, that.createSince) && Objects.equals(this.createUntil, that.createUntil)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.osVersionList, that.osVersionList)
            && Objects.equals(this.agentState, that.agentState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDelegated,
            type,
            isDelegateDomain,
            nameList,
            regionId,
            createSince,
            createUntil,
            ip,
            osType,
            osVersionList,
            agentState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountOtherResourceRequest {\n");
        sb.append("    isDelegated: ").append(toIndentedString(isDelegated)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isDelegateDomain: ").append(toIndentedString(isDelegateDomain)).append("\n");
        sb.append("    nameList: ").append(toIndentedString(nameList)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    createSince: ").append(toIndentedString(createSince)).append("\n");
        sb.append("    createUntil: ").append(toIndentedString(createUntil)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersionList: ").append(toIndentedString(osVersionList)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
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
