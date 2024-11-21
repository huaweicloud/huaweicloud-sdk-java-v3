package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UnscopedTokenInfoCatalog
 */
public class UnscopedTokenInfoCatalog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<UnscopedTokenInfoCatalogEndpoints> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private Object description;

    public UnscopedTokenInfoCatalog withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UnscopedTokenInfoCatalog withName(String name) {
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

    public UnscopedTokenInfoCatalog withType(String type) {
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

    public UnscopedTokenInfoCatalog withEndpoints(List<UnscopedTokenInfoCatalogEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public UnscopedTokenInfoCatalog addEndpointsItem(UnscopedTokenInfoCatalogEndpoints endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public UnscopedTokenInfoCatalog withEndpoints(Consumer<List<UnscopedTokenInfoCatalogEndpoints>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * Get endpoints
     * @return endpoints
     */
    public List<UnscopedTokenInfoCatalogEndpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<UnscopedTokenInfoCatalogEndpoints> endpoints) {
        this.endpoints = endpoints;
    }

    public UnscopedTokenInfoCatalog withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnscopedTokenInfoCatalog that = (UnscopedTokenInfoCatalog) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, endpoints, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnscopedTokenInfoCatalog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
