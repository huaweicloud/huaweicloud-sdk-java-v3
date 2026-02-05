package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ElbIpGroupOpsReq
 */
public class ElbIpGroupOpsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ip_group")

    private Boolean enableIpGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<IpGroupItem> ipList = null;

    public ElbIpGroupOpsReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  弹性负载均衡ip组名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ElbIpGroupOpsReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  弹性负载均衡ip组类型。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ElbIpGroupOpsReq withEnableIpGroup(Boolean enableIpGroup) {
        this.enableIpGroup = enableIpGroup;
        return this;
    }

    /**
     * **参数解释**：  是否开启弹性负载均衡ip组。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return enableIpGroup
     */
    public Boolean getEnableIpGroup() {
        return enableIpGroup;
    }

    public void setEnableIpGroup(Boolean enableIpGroup) {
        this.enableIpGroup = enableIpGroup;
    }

    public ElbIpGroupOpsReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**：  弹性负载均衡ip组id。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ElbIpGroupOpsReq withIpList(List<IpGroupItem> ipList) {
        this.ipList = ipList;
        return this;
    }

    public ElbIpGroupOpsReq addIpListItem(IpGroupItem ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public ElbIpGroupOpsReq withIpList(Consumer<List<IpGroupItem>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * **参数解释**：  ip列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return ipList
     */
    public List<IpGroupItem> getIpList() {
        return ipList;
    }

    public void setIpList(List<IpGroupItem> ipList) {
        this.ipList = ipList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElbIpGroupOpsReq that = (ElbIpGroupOpsReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.enableIpGroup, that.enableIpGroup) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.ipList, that.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, enableIpGroup, groupId, ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElbIpGroupOpsReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enableIpGroup: ").append(toIndentedString(enableIpGroup)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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
