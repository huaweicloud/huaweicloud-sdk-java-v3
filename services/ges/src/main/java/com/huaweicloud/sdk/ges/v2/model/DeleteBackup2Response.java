package com.huaweicloud.sdk.ges.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeleteBackup2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private Map<String, String> body = null;
    
    public DeleteBackup2Response withBody(Map<String, String> body) {
        this.body = body;
        return this;
    }

    

    public DeleteBackup2Response putBodyItem(String key, String bodyItem) {
        if(this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    public DeleteBackup2Response withBody(Consumer<Map<String, String>> bodySetter) {
        if(this.body == null) {
            this.body = new HashMap<>();
        }
        bodySetter.accept(this.body);
        return this;
    }
    /**
     * Get body
     * @return body
     */
    public Map<String, String> getBody() {
        return body;
    }

    public void setBody(Map<String, String> body) {
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
        DeleteBackup2Response deleteBackup2Response = (DeleteBackup2Response) o;
        return Objects.equals(this.body, deleteBackup2Response.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBackup2Response {\n");
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

