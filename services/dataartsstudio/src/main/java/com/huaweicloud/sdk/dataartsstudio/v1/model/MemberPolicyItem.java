package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MemberPolicyItem
 */
public class MemberPolicyItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_name")

    private String memberName;

    /**
     * 成员类型:USER,USER_GROUP,WORKSPACE_ROLE，分别代表空间用户、空间用户组、空间角色
     */
    public static final class MemberTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final MemberTypeEnum USER = new MemberTypeEnum("USER");

        /**
         * Enum USER_GROUP for value: "USER_GROUP"
         */
        public static final MemberTypeEnum USER_GROUP = new MemberTypeEnum("USER_GROUP");

        /**
         * Enum WORKSPACE_ROLE for value: "WORKSPACE_ROLE"
         */
        public static final MemberTypeEnum WORKSPACE_ROLE = new MemberTypeEnum("WORKSPACE_ROLE");

        private static final Map<String, MemberTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemberTypeEnum> createStaticFields() {
            Map<String, MemberTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("USER_GROUP", USER_GROUP);
            map.put("WORKSPACE_ROLE", WORKSPACE_ROLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemberTypeEnum(String value) {
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
        public static MemberTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MemberTypeEnum(value));
        }

        public static MemberTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemberTypeEnum) {
                return this.value.equals(((MemberTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_type")

    private MemberTypeEnum memberType;

    public MemberPolicyItem withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 成员id
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public MemberPolicyItem withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * 成员名称
     * @return memberName
     */
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public MemberPolicyItem withMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * 成员类型:USER,USER_GROUP,WORKSPACE_ROLE，分别代表空间用户、空间用户组、空间角色
     * @return memberType
     */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberPolicyItem that = (MemberPolicyItem) obj;
        return Objects.equals(this.memberId, that.memberId) && Objects.equals(this.memberName, that.memberName)
            && Objects.equals(this.memberType, that.memberType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName, memberType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberPolicyItem {\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    memberName: ").append(toIndentedString(memberName)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
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
