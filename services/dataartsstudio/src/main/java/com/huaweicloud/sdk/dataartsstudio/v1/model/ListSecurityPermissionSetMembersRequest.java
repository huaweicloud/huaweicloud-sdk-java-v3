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
 * Request Object
 */
public class ListSecurityPermissionSetMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_name")

    private String memberName;

    /**
     * 成员类型,USER,USER_GROUP,WORKSPACE_ROLE
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_asc")

    private Boolean orderByAsc;

    /**
     * 排序参数, CREATE_TIME, MEMBER_NAME
     */
    public static final class OrderByEnum {

        /**
         * Enum CREATE_TIME for value: "CREATE_TIME"
         */
        public static final OrderByEnum CREATE_TIME = new OrderByEnum("CREATE_TIME");

        /**
         * Enum MEMBER_NAME for value: "MEMBER_NAME"
         */
        public static final OrderByEnum MEMBER_NAME = new OrderByEnum("MEMBER_NAME");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("CREATE_TIME", CREATE_TIME);
            map.put("MEMBER_NAME", MEMBER_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
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
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    public ListSecurityPermissionSetMembersRequest withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集id
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public ListSecurityPermissionSetMembersRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * workspace 信息
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListSecurityPermissionSetMembersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityPermissionSetMembersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * minimum: 0
     * maximum: 99999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSecurityPermissionSetMembersRequest withMemberName(String memberName) {
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

    public ListSecurityPermissionSetMembersRequest withMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * 成员类型,USER,USER_GROUP,WORKSPACE_ROLE
     * @return memberType
     */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
    }

    public ListSecurityPermissionSetMembersRequest withOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
        return this;
    }

    /**
     * 是否升序（仅指定排序参数时有效）
     * @return orderByAsc
     */
    public Boolean getOrderByAsc() {
        return orderByAsc;
    }

    public void setOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
    }

    public ListSecurityPermissionSetMembersRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序参数, CREATE_TIME, MEMBER_NAME
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityPermissionSetMembersRequest that = (ListSecurityPermissionSetMembersRequest) obj;
        return Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.workspace, that.workspace) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.memberName, that.memberName)
            && Objects.equals(this.memberType, that.memberType) && Objects.equals(this.orderByAsc, that.orderByAsc)
            && Objects.equals(this.orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSetId, workspace, limit, offset, memberName, memberType, orderByAsc, orderBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityPermissionSetMembersRequest {\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    memberName: ").append(toIndentedString(memberName)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    orderByAsc: ").append(toIndentedString(orderByAsc)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
