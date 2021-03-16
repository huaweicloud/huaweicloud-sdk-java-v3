package com.huaweicloud.sdk.das.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListProcessesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user_id")
    
    private String dbUserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database")
    
    private String database;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;
    /**
     * Gets or Sets xLanguage
     */
    public static final class XLanguageEnum {

        
        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");
        
        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");
        

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new XLanguageEnum(value);
            }
            return result;
        }

        public static XLanguageEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private XLanguageEnum xLanguage;

    public ListProcessesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListProcessesRequest withDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
        return this;
    }

    


    /**
     * Get dbUserId
     * @return dbUserId
     */
    public String getDbUserId() {
        return dbUserId;
    }

    public void setDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
    }

    

    public ListProcessesRequest withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * Get user
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    

    public ListProcessesRequest withDatabase(String database) {
        this.database = database;
        return this;
    }

    


    /**
     * Get database
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    

    public ListProcessesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListProcessesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListProcessesRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProcessesRequest listProcessesRequest = (ListProcessesRequest) o;
        return Objects.equals(this.instanceId, listProcessesRequest.instanceId) &&
            Objects.equals(this.dbUserId, listProcessesRequest.dbUserId) &&
            Objects.equals(this.user, listProcessesRequest.user) &&
            Objects.equals(this.database, listProcessesRequest.database) &&
            Objects.equals(this.offset, listProcessesRequest.offset) &&
            Objects.equals(this.limit, listProcessesRequest.limit) &&
            Objects.equals(this.xLanguage, listProcessesRequest.xLanguage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, dbUserId, user, database, offset, limit, xLanguage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProcessesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    dbUserId: ").append(toIndentedString(dbUserId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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

