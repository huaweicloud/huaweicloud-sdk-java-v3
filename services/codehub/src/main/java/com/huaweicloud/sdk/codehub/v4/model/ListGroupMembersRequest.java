package com.huaweicloud.sdk.codehub.v4.model;

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
public class ListGroupMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    /**
     * **参数解释：** 成员加入方式 domain 租户 normal 普通 inherit 继承
     */
    public static final class JoinWayEnum {

        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final JoinWayEnum DOMAIN = new JoinWayEnum("domain");

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final JoinWayEnum NORMAL = new JoinWayEnum("normal");

        /**
         * Enum INHERIT for value: "inherit"
         */
        public static final JoinWayEnum INHERIT = new JoinWayEnum("inherit");

        private static final Map<String, JoinWayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JoinWayEnum> createStaticFields() {
            Map<String, JoinWayEnum> map = new HashMap<>();
            map.put("domain", DOMAIN);
            map.put("normal", NORMAL);
            map.put("inherit", INHERIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JoinWayEnum(String value) {
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
        public static JoinWayEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JoinWayEnum(value));
        }

        public static JoinWayEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JoinWayEnum) {
                return this.value.equals(((JoinWayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_way")

    private JoinWayEnum joinWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_level")

    private Integer accessLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListGroupMembersRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id，代码组首页，Group ID后的数字Id
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public ListGroupMembersRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **取值范围：** 字符串长度32。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListGroupMembersRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释：** 成员搜索字符串
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListGroupMembersRequest withJoinWay(JoinWayEnum joinWay) {
        this.joinWay = joinWay;
        return this;
    }

    /**
     * **参数解释：** 成员加入方式 domain 租户 normal 普通 inherit 继承
     * @return joinWay
     */
    public JoinWayEnum getJoinWay() {
        return joinWay;
    }

    public void setJoinWay(JoinWayEnum joinWay) {
        this.joinWay = joinWay;
    }

    public ListGroupMembersRequest withAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * **参数解释：** 过滤成员的access level， 10待审核 20浏览者 30开发者 40管理员 50所有者
     * minimum: 1
     * maximum: 2147483647
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    public ListGroupMembersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListGroupMembersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGroupMembersRequest that = (ListGroupMembersRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.query, that.query) && Objects.equals(this.joinWay, that.joinWay)
            && Objects.equals(this.accessLevel, that.accessLevel) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, projectId, query, joinWay, accessLevel, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupMembersRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    joinWay: ").append(toIndentedString(joinWay)).append("\n");
        sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
