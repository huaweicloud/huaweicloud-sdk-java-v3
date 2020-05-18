package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.Links;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class GlanceListImageSchemasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Object properties = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Links> links = null;
    
    public GlanceListImageSchemasResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 视图名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlanceListImageSchemasResponse withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    


    /**
     * 镜像属性说明，主要是对基础属性的说明，包含每个属性的取值类型、用途等。
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public GlanceListImageSchemasResponse withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    
    public GlanceListImageSchemasResponse addLinksItem(Links linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public GlanceListImageSchemasResponse withLinks(Consumer<List<Links>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 视图链接。
     * @return links
     */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceListImageSchemasResponse glanceListImageSchemasResponse = (GlanceListImageSchemasResponse) o;
        return Objects.equals(this.name, glanceListImageSchemasResponse.name) &&
            Objects.equals(this.properties, glanceListImageSchemasResponse.properties) &&
            Objects.equals(this.links, glanceListImageSchemasResponse.links);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, properties, links);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceListImageSchemasResponse {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

