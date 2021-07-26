package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreatePremiumHostResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domainid")
    
    private String domainid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projectid")
    
    private String projectid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;

    public CreatePremiumHostResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 域名id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CreatePremiumHostResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    


    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    

    public CreatePremiumHostResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    


    /**
     * 策略id
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    

    public CreatePremiumHostResponse withDomainid(String domainid) {
        this.domainid = domainid;
        return this;
    }

    


    /**
     * 租户id
     * @return domainid
     */
    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    

    public CreatePremiumHostResponse withProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }

    


    /**
     * 项目projectid
     * @return projectid
     */
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    

    public CreatePremiumHostResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * http协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePremiumHostResponse createPremiumHostResponse = (CreatePremiumHostResponse) o;
        return Objects.equals(this.id, createPremiumHostResponse.id) &&
            Objects.equals(this.policyid, createPremiumHostResponse.policyid) &&
            Objects.equals(this.hostname, createPremiumHostResponse.hostname) &&
            Objects.equals(this.domainid, createPremiumHostResponse.domainid) &&
            Objects.equals(this.projectid, createPremiumHostResponse.projectid) &&
            Objects.equals(this.protocol, createPremiumHostResponse.protocol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, hostname, domainid, projectid, protocol);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePremiumHostResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    domainid: ").append(toIndentedString(domainid)).append("\n");
        sb.append("    projectid: ").append(toIndentedString(projectid)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

