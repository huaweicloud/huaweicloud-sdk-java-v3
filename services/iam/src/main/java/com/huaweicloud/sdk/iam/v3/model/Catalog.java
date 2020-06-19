package com.huaweicloud.sdk.iam.v3.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.CatalogEndpoints;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Catalog  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoints")
    
    private List<CatalogEndpoints> endpoints = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public Catalog withEndpoints(List<CatalogEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    
    public Catalog addEndpointsItem(CatalogEndpoints endpointsItem) {
        this.endpoints.add(endpointsItem);
        return this;
    }

    public Catalog withEndpoints(Consumer<List<CatalogEndpoints>> endpointsSetter) {
        if(this.endpoints == null ){
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 终端节点信息。
     * @return endpoints
     */
    public List<CatalogEndpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<CatalogEndpoints> endpoints) {
        this.endpoints = endpoints;
    }

    public Catalog withId(String id) {
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

    public Catalog withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 服务名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalog withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 服务类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Catalog catalog = (Catalog) o;
        return Objects.equals(this.endpoints, catalog.endpoints) &&
            Objects.equals(this.id, catalog.id) &&
            Objects.equals(this.name, catalog.name) &&
            Objects.equals(this.type, catalog.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endpoints, id, name, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Catalog {\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

