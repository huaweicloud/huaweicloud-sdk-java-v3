package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.BatchInviteMembersToChannelRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchInviteMembersToChannelRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchInviteMembersToChannelRequestBody body = null;

    public BatchInviteMembersToChannelRequest withBody(BatchInviteMembersToChannelRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchInviteMembersToChannelRequest withBody(Consumer<BatchInviteMembersToChannelRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchInviteMembersToChannelRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchInviteMembersToChannelRequestBody getBody() {
        return body;
    }

    public void setBody(BatchInviteMembersToChannelRequestBody body) {
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
        BatchInviteMembersToChannelRequest batchInviteMembersToChannelRequest = (BatchInviteMembersToChannelRequest) o;
        return Objects.equals(this.body, batchInviteMembersToChannelRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchInviteMembersToChannelRequest {\n");
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

