package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.UpdateWhitelistRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateWhitelistRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whitelist_id")
    
    private String whitelistId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateWhitelistRequestBody body;

    public UpdateWhitelistRequest withWhitelistId(String whitelistId) {
        this.whitelistId = whitelistId;
        return this;
    }

    


    /**
     * 待更新的白名单id
     * @return whitelistId
     */
    public String getWhitelistId() {
        return whitelistId;
    }

    public void setWhitelistId(String whitelistId) {
        this.whitelistId = whitelistId;
    }

    

    public UpdateWhitelistRequest withBody(UpdateWhitelistRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateWhitelistRequest withBody(Consumer<UpdateWhitelistRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateWhitelistRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateWhitelistRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateWhitelistRequestBody body) {
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
        UpdateWhitelistRequest updateWhitelistRequest = (UpdateWhitelistRequest) o;
        return Objects.equals(this.whitelistId, updateWhitelistRequest.whitelistId) &&
            Objects.equals(this.body, updateWhitelistRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(whitelistId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWhitelistRequest {\n");
        sb.append("    whitelistId: ").append(toIndentedString(whitelistId)).append("\n");
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

