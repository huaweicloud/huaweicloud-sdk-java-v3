package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.UrlDomainCreate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AssociateDomainV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UrlDomainCreate body;

    public AssociateDomainV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public AssociateDomainV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 分组的编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public AssociateDomainV2Request withBody(UrlDomainCreate body) {
        this.body = body;
        return this;
    }

    public AssociateDomainV2Request withBody(Consumer<UrlDomainCreate> bodySetter) {
        if(this.body == null ){
            this.body = new UrlDomainCreate();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UrlDomainCreate getBody() {
        return body;
    }

    public void setBody(UrlDomainCreate body) {
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
        AssociateDomainV2Request associateDomainV2Request = (AssociateDomainV2Request) o;
        return Objects.equals(this.instanceId, associateDomainV2Request.instanceId) &&
            Objects.equals(this.groupId, associateDomainV2Request.groupId) &&
            Objects.equals(this.body, associateDomainV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateDomainV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

