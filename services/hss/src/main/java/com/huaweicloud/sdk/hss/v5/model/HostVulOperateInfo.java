package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 主机维度漏洞列表 
 */
public class HostVulOperateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id_list")

    private List<String> vulIdList = null;

    public HostVulOperateInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机id **约束限制**: 不涉及 **取值范围**: 字符长度1-64 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HostVulOperateInfo withVulIdList(List<String> vulIdList) {
        this.vulIdList = vulIdList;
        return this;
    }

    public HostVulOperateInfo addVulIdListItem(String vulIdListItem) {
        if (this.vulIdList == null) {
            this.vulIdList = new ArrayList<>();
        }
        this.vulIdList.add(vulIdListItem);
        return this;
    }

    public HostVulOperateInfo withVulIdList(Consumer<List<String>> vulIdListSetter) {
        if (this.vulIdList == null) {
            this.vulIdList = new ArrayList<>();
        }
        vulIdListSetter.accept(this.vulIdList);
        return this;
    }

    /**
     * **参数解释**: 漏洞列表 **约束限制**: 不涉及 **取值范围**: 取值1-500 **默认取值**: 不涉及 
     * @return vulIdList
     */
    public List<String> getVulIdList() {
        return vulIdList;
    }

    public void setVulIdList(List<String> vulIdList) {
        this.vulIdList = vulIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostVulOperateInfo that = (HostVulOperateInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.vulIdList, that.vulIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, vulIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostVulOperateInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    vulIdList: ").append(toIndentedString(vulIdList)).append("\n");
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
