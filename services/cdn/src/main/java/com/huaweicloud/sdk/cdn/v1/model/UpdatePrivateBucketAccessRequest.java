package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdatePrivateBucketAccessRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdatePrivateBucketAccessBody body;

    public UpdatePrivateBucketAccessRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 加速域名id。获取方法请参见查询加速域名。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public UpdatePrivateBucketAccessRequest withBody(UpdatePrivateBucketAccessBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrivateBucketAccessRequest withBody(Consumer<UpdatePrivateBucketAccessBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdatePrivateBucketAccessBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdatePrivateBucketAccessBody getBody() {
        return body;
    }

    public void setBody(UpdatePrivateBucketAccessBody body) {
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
        UpdatePrivateBucketAccessRequest updatePrivateBucketAccessRequest = (UpdatePrivateBucketAccessRequest) o;
        return Objects.equals(this.domainId, updatePrivateBucketAccessRequest.domainId) &&
            Objects.equals(this.body, updatePrivateBucketAccessRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateBucketAccessRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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

