package com.huaweicloud.sdk.ddm.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUsersDatabases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto update request Object
 */
public class UpdateUserDetailReq  {

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
    @JsonProperty(value="base_authority")
    
    private List<BaseAuthorityEnum> baseAuthority = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<UpdateUsersDatabases> databases = null;
    
    public UpdateUserDetailReq withBaseAuthority(List<BaseAuthorityEnum> baseAuthority) {
        this.baseAuthority = baseAuthority;
        return this;
    }

    
    public UpdateUserDetailReq addBaseAuthorityItem(BaseAuthorityEnum baseAuthorityItem) {
        if(this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        this.baseAuthority.add(baseAuthorityItem);
        return this;
    }

    public UpdateUserDetailReq withBaseAuthority(Consumer<List<BaseAuthorityEnum>> baseAuthoritySetter) {
        if(this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        baseAuthoritySetter.accept(this.baseAuthority);
        return this;
    }

    /**
     * DDM实例帐号的基础权限，默认值为原DDM帐号权限。  取值为：CREATE、DROP、ALTER、INDEX、INSERT、DELETE、UPDATE、SELECT
     * @return baseAuthority
     */
    public List<BaseAuthorityEnum> getBaseAuthority() {
        return baseAuthority;
    }

    public void setBaseAuthority(List<BaseAuthorityEnum> baseAuthority) {
        this.baseAuthority = baseAuthority;
    }

    

    public UpdateUserDetailReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * DDM实例帐号的描述信息，长度不能超过256个字符。  默认值为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateUserDetailReq withDatabases(List<UpdateUsersDatabases> databases) {
        this.databases = databases;
        return this;
    }

    
    public UpdateUserDetailReq addDatabasesItem(UpdateUsersDatabases databasesItem) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public UpdateUserDetailReq withDatabases(Consumer<List<UpdateUsersDatabases>> databasesSetter) {
        if(this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * DDM实例帐号相关信息的集合。
     * @return databases
     */
    public List<UpdateUsersDatabases> getDatabases() {
        return databases;
    }

    public void setDatabases(List<UpdateUsersDatabases> databases) {
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
        UpdateUserDetailReq updateUserDetailReq = (UpdateUserDetailReq) o;
        return Objects.equals(this.baseAuthority, updateUserDetailReq.baseAuthority) &&
            Objects.equals(this.description, updateUserDetailReq.description) &&
            Objects.equals(this.databases, updateUserDetailReq.databases);
    }
    @Override
    public int hashCode() {
        return Objects.hash(baseAuthority, description, databases);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserDetailReq {\n");
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

