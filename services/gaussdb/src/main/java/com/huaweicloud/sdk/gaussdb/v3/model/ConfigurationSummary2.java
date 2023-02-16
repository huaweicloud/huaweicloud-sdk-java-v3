package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.DatastoreResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 参数模板信息。
 */
public class ConfigurationSummary2  {



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
    @JsonProperty(value="datastore")
    
    
    private DatastoreResult datastore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    
    private String updated;

    public ConfigurationSummary2 withId(String id) {
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

    

    public ConfigurationSummary2 withName(String name) {
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

    

    public ConfigurationSummary2 withDescription(String description) {
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

    

    public ConfigurationSummary2 withDatastore(DatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public ConfigurationSummary2 withDatastore(Consumer<DatastoreResult> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new DatastoreResult();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public DatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreResult datastore) {
        this.datastore = datastore;
    }

    

    public ConfigurationSummary2 withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public ConfigurationSummary2 withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量。
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
        ConfigurationSummary2 configurationSummary2 = (ConfigurationSummary2) o;
        return Objects.equals(this.id, configurationSummary2.id) &&
            Objects.equals(this.name, configurationSummary2.name) &&
            Objects.equals(this.description, configurationSummary2.description) &&
            Objects.equals(this.datastore, configurationSummary2.datastore) &&
            Objects.equals(this.created, configurationSummary2.created) &&
            Objects.equals(this.updated, configurationSummary2.updated);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, datastore, created, updated);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationSummary2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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

