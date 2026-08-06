package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新主机组请求体
 */
public class UpdateHostGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_id")

    private String hostGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_name")

    private String hostGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_tag")

    private List<HostGroupTag> hostGroupTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_access_type")

    private String agentAccessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    public UpdateHostGroupRequestBody withHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }

    /**
     * 主机组ID
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return hostGroupId;
    }

    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    public UpdateHostGroupRequestBody withHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }

    /**
     * 主机组名称
     * @return hostGroupName
     */
    public String getHostGroupName() {
        return hostGroupName;
    }

    public void setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
    }

    public UpdateHostGroupRequestBody withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public UpdateHostGroupRequestBody addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public UpdateHostGroupRequestBody withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 主机ID列表。主机类型必须与主机组类型一致
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public UpdateHostGroupRequestBody withHostGroupTag(List<HostGroupTag> hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
        return this;
    }

    public UpdateHostGroupRequestBody addHostGroupTagItem(HostGroupTag hostGroupTagItem) {
        if (this.hostGroupTag == null) {
            this.hostGroupTag = new ArrayList<>();
        }
        this.hostGroupTag.add(hostGroupTagItem);
        return this;
    }

    public UpdateHostGroupRequestBody withHostGroupTag(Consumer<List<HostGroupTag>> hostGroupTagSetter) {
        if (this.hostGroupTag == null) {
            this.hostGroupTag = new ArrayList<>();
        }
        hostGroupTagSetter.accept(this.hostGroupTag);
        return this;
    }

    /**
     * 主机组标签。KEY不能重复
     * @return hostGroupTag
     */
    public List<HostGroupTag> getHostGroupTag() {
        return hostGroupTag;
    }

    public void setHostGroupTag(List<HostGroupTag> hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
    }

    public UpdateHostGroupRequestBody withAgentAccessType(String agentAccessType) {
        this.agentAccessType = agentAccessType;
        return this;
    }

    /**
     * **参数解释：** 主机组类型。支持两种主机组类型，分别为IP类型和LABEL类型。 **约束限制：** 不涉及 **取值范围：** - IP - LABEL **默认取值：** IP。
     * @return agentAccessType
     */
    public String getAgentAccessType() {
        return agentAccessType;
    }

    public void setAgentAccessType(String agentAccessType) {
        this.agentAccessType = agentAccessType;
    }

    public UpdateHostGroupRequestBody withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public UpdateHostGroupRequestBody addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public UpdateHostGroupRequestBody withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释：** 自定义标识。主机组类型为LABEL类型，该字段必填。 **约束限制：** 不涉及。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHostGroupRequestBody that = (UpdateHostGroupRequestBody) obj;
        return Objects.equals(this.hostGroupId, that.hostGroupId)
            && Objects.equals(this.hostGroupName, that.hostGroupName)
            && Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.hostGroupTag, that.hostGroupTag)
            && Objects.equals(this.agentAccessType, that.agentAccessType) && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostGroupId, hostGroupName, hostIdList, hostGroupTag, agentAccessType, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostGroupRequestBody {\n");
        sb.append("    hostGroupId: ").append(toIndentedString(hostGroupId)).append("\n");
        sb.append("    hostGroupName: ").append(toIndentedString(hostGroupName)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    hostGroupTag: ").append(toIndentedString(hostGroupTag)).append("\n");
        sb.append("    agentAccessType: ").append(toIndentedString(agentAccessType)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
