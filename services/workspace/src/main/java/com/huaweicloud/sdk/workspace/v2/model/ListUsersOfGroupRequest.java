package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListUsersOfGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 激活类型。 - USER_ACTIVATE：用户激活 - ADMIN_ACTIVATE：管理员激活
     */
    public static final class ActiveTypeEnum {

        /**
         * Enum USER_ACTIVATE for value: "USER_ACTIVATE"
         */
        public static final ActiveTypeEnum USER_ACTIVATE = new ActiveTypeEnum("USER_ACTIVATE");

        /**
         * Enum ADMIN_ACTIVATE for value: "ADMIN_ACTIVATE"
         */
        public static final ActiveTypeEnum ADMIN_ACTIVATE = new ActiveTypeEnum("ADMIN_ACTIVATE");

        private static final Map<String, ActiveTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActiveTypeEnum> createStaticFields() {
            Map<String, ActiveTypeEnum> map = new HashMap<>();
            map.put("USER_ACTIVATE", USER_ACTIVATE);
            map.put("ADMIN_ACTIVATE", ADMIN_ACTIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActiveTypeEnum(String value) {
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
        public static ActiveTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActiveTypeEnum(value));
        }

        public static ActiveTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActiveTypeEnum) {
                return this.value.equals(((ActiveTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_type")

    private ActiveTypeEnum activeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    public ListUsersOfGroupRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名支持模糊查询。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListUsersOfGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 用户组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListUsersOfGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述支持模糊查询。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListUsersOfGroupRequest withActiveType(ActiveTypeEnum activeType) {
        this.activeType = activeType;
        return this;
    }

    /**
     * 激活类型。 - USER_ACTIVATE：用户激活 - ADMIN_ACTIVATE：管理员激活
     * @return activeType
     */
    public ActiveTypeEnum getActiveType() {
        return activeType;
    }

    public void setActiveType(ActiveTypeEnum activeType) {
        this.activeType = activeType;
    }

    public ListUsersOfGroupRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，返回桌面数量限制。如果不指定或为0，默认2000，最大2000。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListUsersOfGroupRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUsersOfGroupRequest that = (ListUsersOfGroupRequest) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.activeType, that.activeType)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, groupId, description, activeType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersOfGroupRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    activeType: ").append(toIndentedString(activeType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
