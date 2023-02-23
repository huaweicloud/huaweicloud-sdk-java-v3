package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateMetadataReqGesMetadataLabels
 */
public class CreateMetadataReqGesMetadataLabels  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private List<Map<String, String>> properties = null;
    
    public CreateMetadataReqGesMetadataLabels withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * label名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateMetadataReqGesMetadataLabels withProperties(List<Map<String, String>> properties) {
        this.properties = properties;
        return this;
    }

    
    public CreateMetadataReqGesMetadataLabels addPropertiesItem(Map<String, String> propertiesItem) {
        if(this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public CreateMetadataReqGesMetadataLabels withProperties(Consumer<List<Map<String, String>>> propertiesSetter) {
        if(this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * label属性map
     * @return properties
     */
    public List<Map<String, String>> getProperties() {
        return properties;
    }

    public void setProperties(List<Map<String, String>> properties) {
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
        CreateMetadataReqGesMetadataLabels createMetadataReqGesMetadataLabels = (CreateMetadataReqGesMetadataLabels) o;
        return Objects.equals(this.name, createMetadataReqGesMetadataLabels.name) &&
            Objects.equals(this.properties, createMetadataReqGesMetadataLabels.properties);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, properties);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMetadataReqGesMetadataLabels {\n");
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

