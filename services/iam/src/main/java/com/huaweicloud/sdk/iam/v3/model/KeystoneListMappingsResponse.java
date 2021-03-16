package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.huaweicloud.sdk.iam.v3.model.MappingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneListMappingsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mappings")
    
    private List<MappingResult> mappings = null;
    
    public KeystoneListMappingsResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListMappingsResponse withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    

    public KeystoneListMappingsResponse withMappings(List<MappingResult> mappings) {
        this.mappings = mappings;
        return this;
    }

    
    public KeystoneListMappingsResponse addMappingsItem(MappingResult mappingsItem) {
        this.mappings.add(mappingsItem);
        return this;
    }

    public KeystoneListMappingsResponse withMappings(Consumer<List<MappingResult>> mappingsSetter) {
        if(this.mappings == null ){
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    /**
     * 映射信息列表。
     * @return mappings
     */
    public List<MappingResult> getMappings() {
        return mappings;
    }

    public void setMappings(List<MappingResult> mappings) {
        this.mappings = mappings;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListMappingsResponse keystoneListMappingsResponse = (KeystoneListMappingsResponse) o;
        return Objects.equals(this.links, keystoneListMappingsResponse.links) &&
            Objects.equals(this.mappings, keystoneListMappingsResponse.mappings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, mappings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListMappingsResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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

