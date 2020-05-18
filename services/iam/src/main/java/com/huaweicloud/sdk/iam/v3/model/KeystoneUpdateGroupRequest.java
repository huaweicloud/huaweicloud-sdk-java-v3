package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateGroupRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class KeystoneUpdateGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private KeystoneUpdateGroupRequestBody body = null;

    public KeystoneUpdateGroupRequest withGroupId(String groupId) {
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

    public KeystoneUpdateGroupRequest withBody(KeystoneUpdateGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneUpdateGroupRequest withBody(Consumer<KeystoneUpdateGroupRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new KeystoneUpdateGroupRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public KeystoneUpdateGroupRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneUpdateGroupRequestBody body) {
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
        KeystoneUpdateGroupRequest keystoneUpdateGroupRequest = (KeystoneUpdateGroupRequest) o;
        return Objects.equals(this.groupId, keystoneUpdateGroupRequest.groupId) &&
            Objects.equals(this.body, keystoneUpdateGroupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateGroupRequest {\n");
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

