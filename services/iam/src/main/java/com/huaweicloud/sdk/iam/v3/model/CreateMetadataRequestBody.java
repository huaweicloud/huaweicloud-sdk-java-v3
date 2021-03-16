package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CreateMetadataRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xaccount_type")
    
    private String xaccountType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private String metadata;

    public CreateMetadataRequestBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 用户所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public CreateMetadataRequestBody withXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
        return this;
    }

    


    /**
     * 该字段为标识租户来源字段，默认为空。
     * @return xaccountType
     */
    public String getXaccountType() {
        return xaccountType;
    }

    public void setXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
    }

    

    public CreateMetadataRequestBody withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    


    /**
     * 该字段为用户IdP服务器的Metadata文件的内容。
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMetadataRequestBody createMetadataRequestBody = (CreateMetadataRequestBody) o;
        return Objects.equals(this.domainId, createMetadataRequestBody.domainId) &&
            Objects.equals(this.xaccountType, createMetadataRequestBody.xaccountType) &&
            Objects.equals(this.metadata, createMetadataRequestBody.metadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, xaccountType, metadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMetadataRequestBody {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

