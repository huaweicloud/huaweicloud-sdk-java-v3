package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.UserAuth;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateNamespaceAuthRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<UserAuth> body = null;
    
    public UpdateNamespaceAuthRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * Get namespace
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public UpdateNamespaceAuthRequest withBody(List<UserAuth> body) {
        this.body = body;
        return this;
    }

    
    public UpdateNamespaceAuthRequest addBodyItem(UserAuth bodyItem) {
        this.body.add(bodyItem);
        return this;
    }

    public UpdateNamespaceAuthRequest withBody(Consumer<List<UserAuth>> bodySetter) {
        if(this.body == null ){
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<UserAuth> getBody() {
        return body;
    }

    public void setBody(List<UserAuth> body) {
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
        UpdateNamespaceAuthRequest updateNamespaceAuthRequest = (UpdateNamespaceAuthRequest) o;
        return Objects.equals(this.namespace, updateNamespaceAuthRequest.namespace) &&
            Objects.equals(this.body, updateNamespaceAuthRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNamespaceAuthRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

