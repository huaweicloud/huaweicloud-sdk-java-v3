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
public class GlanceListImageMemberSchemasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Links> links = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Object properties = null;

    public GlanceListImageMemberSchemasResponse withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    
    public GlanceListImageMemberSchemasResponse addLinksItem(Links linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public GlanceListImageMemberSchemasResponse withLinks(Consumer<List<Links>> linksSetter) {
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

    public GlanceListImageMemberSchemasResponse withName(String name) {
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

    public GlanceListImageMemberSchemasResponse withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    


    /**
     * 镜像属性说明，主要是对基础属性的说明，包含每个属性的取值类型，用途。
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceListImageMemberSchemasResponse glanceListImageMemberSchemasResponse = (GlanceListImageMemberSchemasResponse) o;
        return Objects.equals(this.links, glanceListImageMemberSchemasResponse.links) &&
            Objects.equals(this.name, glanceListImageMemberSchemasResponse.name) &&
            Objects.equals(this.properties, glanceListImageMemberSchemasResponse.properties);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, name, properties);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceListImageMemberSchemasResponse {\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

