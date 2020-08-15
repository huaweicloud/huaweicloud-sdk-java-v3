package com.huaweicloud.sdk.rds.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 参数模板信息。
 */
public class ConfigurationSummaryForCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_version_name")
    
    private String datastoreVersionName;
    /**
     * 引擎名。
     */
    public static class DatastoreNameEnum {

        
        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final DatastoreNameEnum MYSQL = new DatastoreNameEnum("mysql");
        
        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final DatastoreNameEnum POSTGRESQL = new DatastoreNameEnum("postgresql");
        
        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final DatastoreNameEnum SQLSERVER = new DatastoreNameEnum("sqlserver");
        

        public static final Map<String, DatastoreNameEnum> staticFields = new HashMap<String, DatastoreNameEnum>() {
            { 
                put("mysql", MYSQL);
                put("postgresql", POSTGRESQL);
                put("sqlserver", SQLSERVER);
            }
        };

        private String value;

        DatastoreNameEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DatastoreNameEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DatastoreNameEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DatastoreNameEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DatastoreNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DatastoreNameEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DatastoreNameEnum) {
                return this.value.equals(((DatastoreNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_name")
    
    private DatastoreNameEnum datastoreName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;

    public ConfigurationSummaryForCreate withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 参数组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConfigurationSummaryForCreate withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigurationSummaryForCreate withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationSummaryForCreate withDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
        return this;
    }

    


    /**
     * 引擎版本。
     * @return datastoreVersionName
     */
    public String getDatastoreVersionName() {
        return datastoreVersionName;
    }

    public void setDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
    }

    public ConfigurationSummaryForCreate withDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    


    /**
     * 引擎名。
     * @return datastoreName
     */
    public DatastoreNameEnum getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
    }

    public ConfigurationSummaryForCreate withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ConfigurationSummaryForCreate withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationSummaryForCreate configurationSummaryForCreate = (ConfigurationSummaryForCreate) o;
        return Objects.equals(this.id, configurationSummaryForCreate.id) &&
            Objects.equals(this.name, configurationSummaryForCreate.name) &&
            Objects.equals(this.description, configurationSummaryForCreate.description) &&
            Objects.equals(this.datastoreVersionName, configurationSummaryForCreate.datastoreVersionName) &&
            Objects.equals(this.datastoreName, configurationSummaryForCreate.datastoreName) &&
            Objects.equals(this.created, configurationSummaryForCreate.created) &&
            Objects.equals(this.updated, configurationSummaryForCreate.updated);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, datastoreVersionName, datastoreName, created, updated);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationSummaryForCreate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastoreVersionName: ").append(toIndentedString(datastoreVersionName)).append("\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

