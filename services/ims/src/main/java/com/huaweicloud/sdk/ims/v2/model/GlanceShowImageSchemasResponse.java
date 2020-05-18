package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.AdditionalProperties;
import com.huaweicloud.sdk.ims.v2.model.Links;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class GlanceShowImageSchemasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="additionalProperties")
    
    private AdditionalProperties additionalProperties = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Object properties = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Links> links = null;
    
    public GlanceShowImageSchemasResponse withAdditionalProperties(AdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    public GlanceShowImageSchemasResponse withAdditionalProperties(Consumer<AdditionalProperties> additionalPropertiesSetter) {
        if(this.additionalProperties == null ){
            this.additionalProperties = new AdditionalProperties();
        }
        additionalPropertiesSetter.accept(this.additionalProperties);
        return this;
    }


    /**
     * Get additionalProperties
     * @return additionalProperties
     */
    public AdditionalProperties getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(AdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public GlanceShowImageSchemasResponse withName(String name) {
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

    public GlanceShowImageSchemasResponse withProperties(Object properties) {
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

    public GlanceShowImageSchemasResponse withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    
    public GlanceShowImageSchemasResponse addLinksItem(Links linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public GlanceShowImageSchemasResponse withLinks(Consumer<List<Links>> linksSetter) {
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
        GlanceShowImageSchemasResponse glanceShowImageSchemasResponse = (GlanceShowImageSchemasResponse) o;
        return Objects.equals(this.additionalProperties, glanceShowImageSchemasResponse.additionalProperties) &&
            Objects.equals(this.name, glanceShowImageSchemasResponse.name) &&
            Objects.equals(this.properties, glanceShowImageSchemasResponse.properties) &&
            Objects.equals(this.links, glanceShowImageSchemasResponse.links);
    }
    @Override
    public int hashCode() {
        return Objects.hash(additionalProperties, name, properties, links);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceShowImageSchemasResponse {\n");
            sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

