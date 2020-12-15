package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.PersistentVolumeClaim;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateCloudPersistentVolumeClaimsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Cluster-ID")
    
    private String xClusterID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private PersistentVolumeClaim body = null;

    public CreateCloudPersistentVolumeClaimsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * Get namespace
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CreateCloudPersistentVolumeClaimsRequest withXClusterID(String xClusterID) {
        this.xClusterID = xClusterID;
        return this;
    }

    


    /**
     * Get xClusterID
     * @return xClusterID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Cluster-ID")
    public String getXClusterID() {
        return xClusterID;
    }

    public void setXClusterID(String xClusterID) {
        this.xClusterID = xClusterID;
    }

    public CreateCloudPersistentVolumeClaimsRequest withBody(PersistentVolumeClaim body) {
        this.body = body;
        return this;
    }

    public CreateCloudPersistentVolumeClaimsRequest withBody(Consumer<PersistentVolumeClaim> bodySetter) {
        if(this.body == null ){
            this.body = new PersistentVolumeClaim();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PersistentVolumeClaim getBody() {
        return body;
    }

    public void setBody(PersistentVolumeClaim body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCloudPersistentVolumeClaimsRequest createCloudPersistentVolumeClaimsRequest = (CreateCloudPersistentVolumeClaimsRequest) o;
        return Objects.equals(this.namespace, createCloudPersistentVolumeClaimsRequest.namespace) &&
            Objects.equals(this.xClusterID, createCloudPersistentVolumeClaimsRequest.xClusterID) &&
            Objects.equals(this.body, createCloudPersistentVolumeClaimsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, xClusterID, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPersistentVolumeClaimsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    xClusterID: ").append(toIndentedString(xClusterID)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

