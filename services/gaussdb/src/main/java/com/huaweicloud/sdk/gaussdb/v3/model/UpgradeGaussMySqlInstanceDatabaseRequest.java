package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeDatabaseRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpgradeGaussMySqlInstanceDatabaseRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private UpgradeDatabaseRequest body;

    public UpgradeGaussMySqlInstanceDatabaseRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public UpgradeGaussMySqlInstanceDatabaseRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 租户在某一project下的实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public UpgradeGaussMySqlInstanceDatabaseRequest withBody(UpgradeDatabaseRequest body) {
        this.body = body;
        return this;
    }

    public UpgradeGaussMySqlInstanceDatabaseRequest withBody(Consumer<UpgradeDatabaseRequest> bodySetter) {
        if(this.body == null ){
            this.body = new UpgradeDatabaseRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpgradeDatabaseRequest getBody() {
        return body;
    }

    public void setBody(UpgradeDatabaseRequest body) {
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
        UpgradeGaussMySqlInstanceDatabaseRequest upgradeGaussMySqlInstanceDatabaseRequest = (UpgradeGaussMySqlInstanceDatabaseRequest) o;
        return Objects.equals(this.xLanguage, upgradeGaussMySqlInstanceDatabaseRequest.xLanguage) &&
            Objects.equals(this.instanceId, upgradeGaussMySqlInstanceDatabaseRequest.instanceId) &&
            Objects.equals(this.body, upgradeGaussMySqlInstanceDatabaseRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeGaussMySqlInstanceDatabaseRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

