package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.GetJobInstanceDatastoreInfoDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 执行任务的实例信息。
 */
public class GetJobEntitiesInstanceInfoDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint")
    
    
    private String endpoint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    
    private GetJobInstanceDatastoreInfoDetail datastore;

    public GetJobEntitiesInstanceInfoDetail withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    


    /**
     * 实例的连接地址。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    

    public GetJobEntitiesInstanceInfoDetail withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 实例类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public GetJobEntitiesInstanceInfoDetail withDatastore(GetJobInstanceDatastoreInfoDetail datastore) {
        this.datastore = datastore;
        return this;
    }

    public GetJobEntitiesInstanceInfoDetail withDatastore(Consumer<GetJobInstanceDatastoreInfoDetail> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new GetJobInstanceDatastoreInfoDetail();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public GetJobInstanceDatastoreInfoDetail getDatastore() {
        return datastore;
    }

    public void setDatastore(GetJobInstanceDatastoreInfoDetail datastore) {
        this.datastore = datastore;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetJobEntitiesInstanceInfoDetail getJobEntitiesInstanceInfoDetail = (GetJobEntitiesInstanceInfoDetail) o;
        return Objects.equals(this.endpoint, getJobEntitiesInstanceInfoDetail.endpoint) &&
            Objects.equals(this.type, getJobEntitiesInstanceInfoDetail.type) &&
            Objects.equals(this.datastore, getJobEntitiesInstanceInfoDetail.datastore);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endpoint, type, datastore);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetJobEntitiesInstanceInfoDetail {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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

