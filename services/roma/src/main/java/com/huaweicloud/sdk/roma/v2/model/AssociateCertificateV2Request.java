package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.DomainCertReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AssociateCertificateV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DomainCertReq body;

    public AssociateCertificateV2Request withInstanceId(String instanceId) {
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

    

    public AssociateCertificateV2Request withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public AssociateCertificateV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * Get groupId
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public AssociateCertificateV2Request withBody(DomainCertReq body) {
        this.body = body;
        return this;
    }

    public AssociateCertificateV2Request withBody(Consumer<DomainCertReq> bodySetter) {
        if(this.body == null ){
            this.body = new DomainCertReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DomainCertReq getBody() {
        return body;
    }

    public void setBody(DomainCertReq body) {
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
        AssociateCertificateV2Request associateCertificateV2Request = (AssociateCertificateV2Request) o;
        return Objects.equals(this.instanceId, associateCertificateV2Request.instanceId) &&
            Objects.equals(this.domainId, associateCertificateV2Request.domainId) &&
            Objects.equals(this.groupId, associateCertificateV2Request.groupId) &&
            Objects.equals(this.body, associateCertificateV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, domainId, groupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateCertificateV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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

