package com.huaweicloud.sdk.ddm.v1.model;

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
 * 创建账号的请求对象
 */
public class CreateUserRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    /**
     * Gets or Sets baseAuthority
     */
    public static final class BaseAuthorityEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final BaseAuthorityEnum CREATE = new BaseAuthorityEnum("CREATE");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final BaseAuthorityEnum DROP = new BaseAuthorityEnum("DROP");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final BaseAuthorityEnum ALTER = new BaseAuthorityEnum("ALTER");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final BaseAuthorityEnum INDEX = new BaseAuthorityEnum("INDEX");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final BaseAuthorityEnum INSERT = new BaseAuthorityEnum("INSERT");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final BaseAuthorityEnum DELETE = new BaseAuthorityEnum("DELETE");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final BaseAuthorityEnum UPDATE = new BaseAuthorityEnum("UPDATE");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final BaseAuthorityEnum SELECT = new BaseAuthorityEnum("SELECT");

        private static final Map<String, BaseAuthorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BaseAuthorityEnum> createStaticFields() {
            Map<String, BaseAuthorityEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("DROP", DROP);
            map.put("ALTER", ALTER);
            map.put("INDEX", INDEX);
            map.put("INSERT", INSERT);
            map.put("DELETE", DELETE);
            map.put("UPDATE", UPDATE);
            map.put("SELECT", SELECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BaseAuthorityEnum(String value) {
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
        public static BaseAuthorityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BaseAuthorityEnum(value));
        }

        public static BaseAuthorityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BaseAuthorityEnum) {
                return this.value.equals(((BaseAuthorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_authority")

    private List<BaseAuthorityEnum> baseAuthority = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_lifetime")

    private Long passwordLifetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<CreateUserRelatedLogicDbV3> databases = null;

    public CreateUserRequestV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  实例账号名称。  **约束限制**：  - 长度为1-32个字符。 - 必须以字母开头。 - 可以包含字母、数字、下划线，不能包含其它特殊字符。  **取值范围**：  不涉及。  **默认取值**：    不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateUserRequestV3 withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**：  实例账号密码。  **约束限制**：  - 长度为8~32个字符。 - 至少包含三种字符组合：小写字母、大写字母、数字、特殊字符 ~ ! @ # % ^ * - _ + ? - 不能使用简单、强度不够、容易被猜测的密码。 - 不能与账号名称或者倒序的账号名称相同。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateUserRequestV3 withBaseAuthority(List<BaseAuthorityEnum> baseAuthority) {
        this.baseAuthority = baseAuthority;
        return this;
    }

    public CreateUserRequestV3 addBaseAuthorityItem(BaseAuthorityEnum baseAuthorityItem) {
        if (this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        this.baseAuthority.add(baseAuthorityItem);
        return this;
    }

    public CreateUserRequestV3 withBaseAuthority(Consumer<List<BaseAuthorityEnum>> baseAuthoritySetter) {
        if (this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        baseAuthoritySetter.accept(this.baseAuthority);
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号的基础权限。  **约束限制**：  无  **取值范围**：  CREATE、DROP、ALTER、INDEX、INSERT、DELETE、UPDATE、SELECT的任意集合  **默认取值**：  不涉及。
     * @return baseAuthority
     */
    public List<BaseAuthorityEnum> getBaseAuthority() {
        return baseAuthority;
    }

    public void setBaseAuthority(List<BaseAuthorityEnum> baseAuthority) {
        this.baseAuthority = baseAuthority;
    }

    public CreateUserRequestV3 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：  实例账号的描述信息。  **约束限制**：  - 长度不超过256个字符。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateUserRequestV3 withPasswordLifetime(Long passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号的密码有效期。  **约束限制**：  不涉及。   **取值范围**：  取值范围为0-65535的整数，单位为天。  0与空表示密码永不过期。  **默认取值**：  默认值为空，永不过期。
     * @return passwordLifetime
     */
    public Long getPasswordLifetime() {
        return passwordLifetime;
    }

    public void setPasswordLifetime(Long passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
    }

    public CreateUserRequestV3 withDatabases(List<CreateUserRelatedLogicDbV3> databases) {
        this.databases = databases;
        return this;
    }

    public CreateUserRequestV3 addDatabasesItem(CreateUserRelatedLogicDbV3 databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateUserRequestV3 withDatabases(Consumer<List<CreateUserRelatedLogicDbV3>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 关联的逻辑库的集合。 databases字段可以省略，即创建用户时可以不关联逻辑库。
     * @return databases
     */
    public List<CreateUserRelatedLogicDbV3> getDatabases() {
        return databases;
    }

    public void setDatabases(List<CreateUserRelatedLogicDbV3> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserRequestV3 that = (CreateUserRequestV3) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.password, that.password)
            && Objects.equals(this.baseAuthority, that.baseAuthority)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.passwordLifetime, that.passwordLifetime)
            && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, baseAuthority, description, passwordLifetime, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserRequestV3 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    baseAuthority: ").append(toIndentedString(baseAuthority)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    passwordLifetime: ").append(toIndentedString(passwordLifetime)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
