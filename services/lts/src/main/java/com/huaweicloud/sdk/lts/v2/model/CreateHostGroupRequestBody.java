package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建主机组请求体
 */
public class CreateHostGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_name")

    private String hostGroupName;

    /**
     * 主机组类型。windows：windows类型，linux：linux类型
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
            HostGroupTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HostGroupTypeEnum(value);
            }
            return result;
        }

        public static HostGroupTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            HostGroupTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public CreateHostGroupRequestBody withHostGroupName(String hostGroupName) {
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

    public CreateHostGroupRequestBody withHostGroupType(HostGroupTypeEnum hostGroupType) {
        this.hostGroupType = hostGroupType;
        return this;
    }

    /**
     * 主机组类型。windows：windows类型，linux：linux类型
     * @return hostGroupType
     */
    public HostGroupTypeEnum getHostGroupType() {
        return hostGroupType;
    }

    public void setHostGroupType(HostGroupTypeEnum hostGroupType) {
        this.hostGroupType = hostGroupType;
    }

    public CreateHostGroupRequestBody withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public CreateHostGroupRequestBody addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public CreateHostGroupRequestBody withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 主机组ID列表。主机类型必须与主机组类型一致
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public CreateHostGroupRequestBody withHostGroupTag(List<HostGroupTag> hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
        return this;
    }

    public CreateHostGroupRequestBody addHostGroupTagItem(HostGroupTag hostGroupTagItem) {
        if (this.hostGroupTag == null) {
            this.hostGroupTag = new ArrayList<>();
        }
        this.hostGroupTag.add(hostGroupTagItem);
        return this;
    }

    public CreateHostGroupRequestBody withHostGroupTag(Consumer<List<HostGroupTag>> hostGroupTagSetter) {
        if (this.hostGroupTag == null) {
            this.hostGroupTag = new ArrayList<>();
        }
        hostGroupTagSetter.accept(this.hostGroupTag);
        return this;
    }

    /**
     * 标签信息。KEY不能重复
     * @return hostGroupTag
     */
    public List<HostGroupTag> getHostGroupTag() {
        return hostGroupTag;
    }

    public void setHostGroupTag(List<HostGroupTag> hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHostGroupRequestBody createHostGroupRequestBody = (CreateHostGroupRequestBody) o;
        return Objects.equals(this.hostGroupName, createHostGroupRequestBody.hostGroupName)
            && Objects.equals(this.hostGroupType, createHostGroupRequestBody.hostGroupType)
            && Objects.equals(this.hostIdList, createHostGroupRequestBody.hostIdList)
            && Objects.equals(this.hostGroupTag, createHostGroupRequestBody.hostGroupTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostGroupName, hostGroupType, hostIdList, hostGroupTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHostGroupRequestBody {\n");
        sb.append("    hostGroupName: ").append(toIndentedString(hostGroupName)).append("\n");
        sb.append("    hostGroupType: ").append(toIndentedString(hostGroupType)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    hostGroupTag: ").append(toIndentedString(hostGroupTag)).append("\n");
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
