package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：更新IP地址组IP列表的请求参数。  **约束限制**：不涉及
 */
public class UpdateIpListOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<UpdateIpGroupIpOption> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateIpListOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：IP地址组的名称。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIpListOption withIpList(List<UpdateIpGroupIpOption> ipList) {
        this.ipList = ipList;
        return this;
    }

    public UpdateIpListOption addIpListItem(UpdateIpGroupIpOption ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public UpdateIpListOption withIpList(Consumer<List<UpdateIpGroupIpOption>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * **参数解释**：IP地址组中包含的IP列表。 只支持添加新的IP地址到IP地址组的IP列表中，或更新已有IP地址的描述。不会删除或修改ip_list中已有的IP地址。  **约束限制**：不涉及
     * @return ipList
     */
    public List<UpdateIpGroupIpOption> getIpList() {
        return ipList;
    }

    public void setIpList(List<UpdateIpGroupIpOption> ipList) {
        this.ipList = ipList;
    }

    public UpdateIpListOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：备注信息。  **约束限制**：不涉及  **取值范围**：长度为0-255个字符。  **默认取值**：不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIpListOption that = (UpdateIpListOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ipList, that.ipList)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ipList, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpListOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
