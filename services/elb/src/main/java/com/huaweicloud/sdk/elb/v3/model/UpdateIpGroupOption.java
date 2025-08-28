package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：更新IP地址组请求参数。  **约束限制**：不涉及
 */
public class UpdateIpGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<UpdateIpGroupIpOption> ipList = null;

    public UpdateIpGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：IP地址组的描述信息。  **约束限制**：不涉及  **取值范围**：长度为0-255个字符。  **默认取值**：不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateIpGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：IP地址组的名称  **约束限制**：不涉及  **取值范围**：长度为0-255个字符。  **默认取值**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIpGroupOption withIpList(List<UpdateIpGroupIpOption> ipList) {
        this.ipList = ipList;
        return this;
    }

    public UpdateIpGroupOption addIpListItem(UpdateIpGroupIpOption ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public UpdateIpGroupOption withIpList(Consumer<List<UpdateIpGroupIpOption>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * **参数解释**：IP地址组的IP列表。 注意：只支持全量更新，即IP地址组中的ip_list将被全量覆盖，不在请求参数中的IP地址将被移除。  **约束限制**：不涉及
     * @return ipList
     */
    public List<UpdateIpGroupIpOption> getIpList() {
        return ipList;
    }

    public void setIpList(List<UpdateIpGroupIpOption> ipList) {
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
        UpdateIpGroupOption that = (UpdateIpGroupOption) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ipList, that.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpGroupOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
