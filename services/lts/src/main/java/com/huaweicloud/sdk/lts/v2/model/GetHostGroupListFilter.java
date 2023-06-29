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
 * 主机组过滤参数
 */
public class GetHostGroupListFilter {

    /**
     * 主机组类型。windows：windows类型，linux：linux类型
     */
    public static final class HostGroupTypeEnum {

        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final HostGroupTypeEnum WINDOWS = new HostGroupTypeEnum("windows");

        /**
         * Enum LINUX for value: "linux"
         */
        public static final HostGroupTypeEnum LINUX = new HostGroupTypeEnum("linux");

        private static final Map<String, HostGroupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostGroupTypeEnum> createStaticFields() {
            Map<String, HostGroupTypeEnum> map = new HashMap<>();
            map.put("windows", WINDOWS);
            map.put("linux", LINUX);
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
    @JsonProperty(value = "host_group_name_list")

    private List<String> hostGroupNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name_list")

    private List<String> hostNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_tag")

    private GetHostGroupListTag hostGroupTag;

    public GetHostGroupListFilter withHostGroupType(HostGroupTypeEnum hostGroupType) {
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

    public GetHostGroupListFilter withHostGroupNameList(List<String> hostGroupNameList) {
        this.hostGroupNameList = hostGroupNameList;
        return this;
    }

    public GetHostGroupListFilter addHostGroupNameListItem(String hostGroupNameListItem) {
        if (this.hostGroupNameList == null) {
            this.hostGroupNameList = new ArrayList<>();
        }
        this.hostGroupNameList.add(hostGroupNameListItem);
        return this;
    }

    public GetHostGroupListFilter withHostGroupNameList(Consumer<List<String>> hostGroupNameListSetter) {
        if (this.hostGroupNameList == null) {
            this.hostGroupNameList = new ArrayList<>();
        }
        hostGroupNameListSetter.accept(this.hostGroupNameList);
        return this;
    }

    /**
     * 主机组名称列表。
     * @return hostGroupNameList
     */
    public List<String> getHostGroupNameList() {
        return hostGroupNameList;
    }

    public void setHostGroupNameList(List<String> hostGroupNameList) {
        this.hostGroupNameList = hostGroupNameList;
    }

    public GetHostGroupListFilter withHostNameList(List<String> hostNameList) {
        this.hostNameList = hostNameList;
        return this;
    }

    public GetHostGroupListFilter addHostNameListItem(String hostNameListItem) {
        if (this.hostNameList == null) {
            this.hostNameList = new ArrayList<>();
        }
        this.hostNameList.add(hostNameListItem);
        return this;
    }

    public GetHostGroupListFilter withHostNameList(Consumer<List<String>> hostNameListSetter) {
        if (this.hostNameList == null) {
            this.hostNameList = new ArrayList<>();
        }
        hostNameListSetter.accept(this.hostNameList);
        return this;
    }

    /**
     * 主机名称列表。
     * @return hostNameList
     */
    public List<String> getHostNameList() {
        return hostNameList;
    }

    public void setHostNameList(List<String> hostNameList) {
        this.hostNameList = hostNameList;
    }

    public GetHostGroupListFilter withHostGroupTag(GetHostGroupListTag hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
        return this;
    }

    public GetHostGroupListFilter withHostGroupTag(Consumer<GetHostGroupListTag> hostGroupTagSetter) {
        if (this.hostGroupTag == null) {
            this.hostGroupTag = new GetHostGroupListTag();
            hostGroupTagSetter.accept(this.hostGroupTag);
        }

        return this;
    }

    /**
     * Get hostGroupTag
     * @return hostGroupTag
     */
    public GetHostGroupListTag getHostGroupTag() {
        return hostGroupTag;
    }

    public void setHostGroupTag(GetHostGroupListTag hostGroupTag) {
        this.hostGroupTag = hostGroupTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetHostGroupListFilter that = (GetHostGroupListFilter) obj;
        return Objects.equals(this.hostGroupType, that.hostGroupType)
            && Objects.equals(this.hostGroupNameList, that.hostGroupNameList)
            && Objects.equals(this.hostNameList, that.hostNameList)
            && Objects.equals(this.hostGroupTag, that.hostGroupTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostGroupType, hostGroupNameList, hostNameList, hostGroupTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHostGroupListFilter {\n");
        sb.append("    hostGroupType: ").append(toIndentedString(hostGroupType)).append("\n");
        sb.append("    hostGroupNameList: ").append(toIndentedString(hostGroupNameList)).append("\n");
        sb.append("    hostNameList: ").append(toIndentedString(hostNameList)).append("\n");
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
