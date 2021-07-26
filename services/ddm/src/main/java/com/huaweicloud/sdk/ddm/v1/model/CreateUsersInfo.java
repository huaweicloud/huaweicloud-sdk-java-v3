package com.huaweicloud.sdk.ddm.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersDatabases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateUsersInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BaseAuthorityEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BaseAuthorityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BaseAuthorityEnum(value);
            }
            return result;
        }

        public static BaseAuthorityEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BaseAuthorityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof BaseAuthorityEnum) {
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
    @JsonProperty(value="base_authority")
    
    private List<BaseAuthorityEnum> baseAuthority = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<CreateUsersDatabases> databases = null;
    
    public CreateUsersInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * DDM实例帐号名称，命名要求如下。  - 长度为6-32个字符。 - 必须以字母开头。 - 可以包含字母，数字、下划线，不能包含其它特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateUsersInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * DDM实例帐号密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public CreateUsersInfo withBaseAuthority(List<BaseAuthorityEnum> baseAuthority) {
        this.baseAuthority = baseAuthority;
        return this;
    }

    
    public CreateUsersInfo addBaseAuthorityItem(BaseAuthorityEnum baseAuthorityItem) {
        if(this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        this.baseAuthority.add(baseAuthorityItem);
        return this;
    }

    public CreateUsersInfo withBaseAuthority(Consumer<List<BaseAuthorityEnum>> baseAuthoritySetter) {
        if(this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        baseAuthoritySetter.accept(this.baseAuthority);
        return this;
    }

    /**
     * DDM实例帐号的基础权限。  取值为：CREATE、DROP、ALTER、INDEX、INSERT、DELETE、UPDATE、SELECT
     * @return baseAuthority
     */
    public List<BaseAuthorityEnum> getBaseAuthority() {
        return baseAuthority;
    }

    public void setBaseAuthority(List<BaseAuthorityEnum> baseAuthority) {
        this.baseAuthority = baseAuthority;
    }

    

    public CreateUsersInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * DDM实例帐号的描述，最大长度不能超过256。默认值为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateUsersInfo withDatabases(List<CreateUsersDatabases> databases) {
        this.databases = databases;
        return this;
    }

    
    public CreateUsersInfo addDatabasesItem(CreateUsersDatabases databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateUsersInfo withDatabases(Consumer<List<CreateUsersDatabases>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 关联的逻辑库的集合。 databases字段可以省略，即创建用户时可以不关联逻辑库。
     * @return databases
     */
    public List<CreateUsersDatabases> getDatabases() {
        return databases;
    }

    public void setDatabases(List<CreateUsersDatabases> databases) {
        this.databases = databases;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUsersInfo createUsersInfo = (CreateUsersInfo) o;
        return Objects.equals(this.name, createUsersInfo.name) &&
            Objects.equals(this.password, createUsersInfo.password) &&
            Objects.equals(this.baseAuthority, createUsersInfo.baseAuthority) &&
            Objects.equals(this.description, createUsersInfo.description) &&
            Objects.equals(this.databases, createUsersInfo.databases);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, password, baseAuthority, description, databases);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUsersInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    baseAuthority: ").append(toIndentedString(baseAuthority)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

