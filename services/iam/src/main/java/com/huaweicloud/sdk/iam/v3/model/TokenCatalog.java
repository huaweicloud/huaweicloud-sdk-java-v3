package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.TokenCatalogEndpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class TokenCatalog  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoints")
    
    private List<TokenCatalogEndpoint> endpoints = new ArrayList<>();
    
    public TokenCatalog withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 该接口所属服务。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TokenCatalog withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 服务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TokenCatalog withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 服务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TokenCatalog withEndpoints(List<TokenCatalogEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    
    public TokenCatalog addEndpointsItem(TokenCatalogEndpoint endpointsItem) {
        this.endpoints.add(endpointsItem);
        return this;
    }

    public TokenCatalog withEndpoints(Consumer<List<TokenCatalogEndpoint>> endpointsSetter) {
        if(this.endpoints == null ){
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 终端节点。
     * @return endpoints
     */
    public List<TokenCatalogEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<TokenCatalogEndpoint> endpoints) {
        this.endpoints = endpoints;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenCatalog tokenCatalog = (TokenCatalog) o;
        return Objects.equals(this.type, tokenCatalog.type) &&
            Objects.equals(this.id, tokenCatalog.id) &&
            Objects.equals(this.name, tokenCatalog.name) &&
            Objects.equals(this.endpoints, tokenCatalog.endpoints);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, id, name, endpoints);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenCatalog {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

