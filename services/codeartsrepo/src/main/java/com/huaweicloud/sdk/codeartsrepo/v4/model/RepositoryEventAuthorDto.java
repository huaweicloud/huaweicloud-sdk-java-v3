package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RepositoryEventAuthorDto
 */
public class RepositoryEventAuthorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    /**
     * **参数解释：** 用户状态。 **取值范围：** - active，激活。 - blocked，禁用。
     */
    public static final class StateEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StateEnum ACTIVE = new StateEnum("active");

        /**
         * Enum BLOCKED for value: "blocked"
         */
        public static final StateEnum BLOCKED = new StateEnum("blocked");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("blocked", BLOCKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avatar_url")

    private String avatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    public RepositoryEventAuthorDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 用户id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RepositoryEventAuthorDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryEventAuthorDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释：** 用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RepositoryEventAuthorDto withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 用户状态。 **取值范围：** - active，激活。 - blocked，禁用。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public RepositoryEventAuthorDto withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * **参数解释：** 头像地址。
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public RepositoryEventAuthorDto withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * **参数解释：** 中文名。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public RepositoryEventAuthorDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 昵称。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public RepositoryEventAuthorDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryEventAuthorDto that = (RepositoryEventAuthorDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.username, that.username) && Objects.equals(this.state, that.state)
            && Objects.equals(this.avatarUrl, that.avatarUrl) && Objects.equals(this.nameCn, that.nameCn)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.tenantName, that.tenantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, state, avatarUrl, nameCn, nickName, tenantName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryEventAuthorDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
