package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.BlackWhiteListBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateBlackWhiteListRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BlackWhiteListBody body;

    public UpdateBlackWhiteListRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 需要设置IP黑白名单的域名id。获取方法请参见查询加速域名。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public UpdateBlackWhiteListRequest withBody(BlackWhiteListBody body) {
        this.body = body;
        return this;
    }

    public UpdateBlackWhiteListRequest withBody(Consumer<BlackWhiteListBody> bodySetter) {
        if(this.body == null ){
            this.body = new BlackWhiteListBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BlackWhiteListBody getBody() {
        return body;
    }

    public void setBody(BlackWhiteListBody body) {
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
        UpdateBlackWhiteListRequest updateBlackWhiteListRequest = (UpdateBlackWhiteListRequest) o;
        return Objects.equals(this.domainId, updateBlackWhiteListRequest.domainId) &&
            Objects.equals(this.body, updateBlackWhiteListRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlackWhiteListRequest {\n");
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

