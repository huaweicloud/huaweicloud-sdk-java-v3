package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateHostGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_id")

    private String hostGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_name")

    private String hostGroupName;

    /**
     * 主机组类型。linux：linux类型，windows：windows类型
     */
    public static final class HostGroupTypeEnum {

        /**
         * Enum LINUX for value: "linux"
         */
        public static final HostGroupTypeEnum LINUX = new HostGroupTypeEnum("linux");

        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final HostGroupTypeEnum WINDOWS = new HostGroupTypeEnum("windows");

        private static final Map<String, HostGroupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostGroupTypeEnum> createStaticFields() {
            Map<String, HostGroupTypeEnum> map = new HashMap<>();
            map.put("linux", LINUX);
            map.put("windows", WINDOWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostGroupTypeEnum(String value) {
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
        public static HostGroupTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HostGroupTypeEnum(value));
        }

        public static HostGroupTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostGroupTypeEnum) {
                return this.value.equals(((HostGroupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_type")

    private HostGroupTypeEnum hostGroupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_tag")

    private List<HostGroupTag> hostGroupTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_access_type")

    private String agentAccessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    public CreateHostGroupResponse withHostGroupId(String hostGroupId) {
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

    public CreateHostGroupResponse withHostGroupName(String hostGroupName) {
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

    public CreateHostGroupResponse withHostGroupType(HostGroupTypeEnum hostGroupType) {
        this.hostGroupType = hostGroupType;
        return this;
    }

    /**
     * 主机组类型。linux：linux类型，windows：windows类型
     * @return hostGroupType
     */
    public HostGroupTypeEnum getHostGroupType() {
        return hostGroupType;
    }

    public void setHostGroupType(HostGroupTypeEnum hostGroupType) {
        this.hostGroupType = hostGroupType;
    }

    public CreateHostGroupResponse withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public CreateHostGroupResponse addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public CreateHostGroupResponse withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 主机ID列表
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public CreateHostGroupResponse withHostGroupTag(List<HostGroupTag> hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
        return this;
    }

    public CreateHostGroupResponse addHostGroupTagItem(HostGroupTag hostGroupTagItem) {
        if (this.hostGroupTag == null) {
            this.hostGroupTag = new ArrayList<>();
        }
        this.hostGroupTag.add(hostGroupTagItem);
        return this;
    }

    public CreateHostGroupResponse withHostGroupTag(Consumer<List<HostGroupTag>> hostGroupTagSetter) {
        if (this.hostGroupTag == null) {
            this.hostGroupTag = new ArrayList<>();
        }
        hostGroupTagSetter.accept(this.hostGroupTag);
        return this;
    }

    /**
     * 标签信息
     * @return hostGroupTag
     */
    public List<HostGroupTag> getHostGroupTag() {
        return hostGroupTag;
    }

    public void setHostGroupTag(List<HostGroupTag> hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
    }

    public CreateHostGroupResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateHostGroupResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CreateHostGroupResponse withAgentAccessType(String agentAccessType) {
        this.agentAccessType = agentAccessType;
        return this;
    }

    /**
     * **参数解释：** 主机组类型。分别为IP、LABEL类型。 **取值范围：** - IP。 - LABEL。
     * @return agentAccessType
     */
    public String getAgentAccessType() {
        return agentAccessType;
    }

    public void setAgentAccessType(String agentAccessType) {
        this.agentAccessType = agentAccessType;
    }

    public CreateHostGroupResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public CreateHostGroupResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateHostGroupResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释：** 主机组自定义标识。
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
        CreateHostGroupResponse that = (CreateHostGroupResponse) obj;
        return Objects.equals(this.hostGroupId, that.hostGroupId)
            && Objects.equals(this.hostGroupName, that.hostGroupName)
            && Objects.equals(this.hostGroupType, that.hostGroupType)
            && Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.hostGroupTag, that.hostGroupTag)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.agentAccessType, that.agentAccessType) && Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostGroupId,
            hostGroupName,
            hostGroupType,
            hostIdList,
            hostGroupTag,
            createTime,
            updateTime,
            agentAccessType,
            labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHostGroupResponse {\n");
        sb.append("    hostGroupId: ").append(toIndentedString(hostGroupId)).append("\n");
        sb.append("    hostGroupName: ").append(toIndentedString(hostGroupName)).append("\n");
        sb.append("    hostGroupType: ").append(toIndentedString(hostGroupType)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    hostGroupTag: ").append(toIndentedString(hostGroupTag)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
