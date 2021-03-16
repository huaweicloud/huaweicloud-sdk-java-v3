package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.SendVerificationCodeV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SendVerificationMessageCodeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private SendVerificationCodeV2Req body;

    public SendVerificationMessageCodeRequest withBody(SendVerificationCodeV2Req body) {
        this.body = body;
        return this;
    }

    public SendVerificationMessageCodeRequest withBody(Consumer<SendVerificationCodeV2Req> bodySetter) {
        if(this.body == null ){
            this.body = new SendVerificationCodeV2Req();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SendVerificationCodeV2Req getBody() {
        return body;
    }

    public void setBody(SendVerificationCodeV2Req body) {
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
        SendVerificationMessageCodeRequest sendVerificationMessageCodeRequest = (SendVerificationMessageCodeRequest) o;
        return Objects.equals(this.body, sendVerificationMessageCodeRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendVerificationMessageCodeRequest {\n");
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

