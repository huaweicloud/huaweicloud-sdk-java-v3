package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * usergroup
 */
public class UserGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    /**
     * 用户组类型
     */
    public static final class GroupSourceEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final GroupSourceEnum IAM = new GroupSourceEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final GroupSourceEnum SAML = new GroupSourceEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final GroupSourceEnum LDAP = new GroupSourceEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final GroupSourceEnum LOCAL = new GroupSourceEnum("LOCAL");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final GroupSourceEnum OTHER = new GroupSourceEnum("OTHER");

        private static final Map<String, GroupSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupSourceEnum> createStaticFields() {
            Map<String, GroupSourceEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupSourceEnum(String value) {
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
        public static GroupSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupSourceEnum(value));
        }

        public static GroupSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupSourceEnum) {
                return this.value.equals(((GroupSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_source")

    private GroupSourceEnum groupSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public UserGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 用户组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public UserGroup withGroupSource(GroupSourceEnum groupSource) {
        this.groupSource = groupSource;
        return this;
    }

    /**
     * 用户组类型
     * @return groupSource
     */
    public GroupSourceEnum getGroupSource() {
        return groupSource;
    }

    public void setGroupSource(GroupSourceEnum groupSource) {
        this.groupSource = groupSource;
    }

    public UserGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 用户组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserGroup that = (UserGroup) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupSource, that.groupSource)
            && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupSource, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserGroup {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupSource: ").append(toIndentedString(groupSource)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
