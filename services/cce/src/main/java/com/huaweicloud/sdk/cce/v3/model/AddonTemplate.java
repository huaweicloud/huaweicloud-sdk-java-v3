package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Metadata;
import com.huaweicloud.sdk.cce.v3.model.Templatespec;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 插件模板详情-response结构体
 */
public class AddonTemplate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Metadata metadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private Templatespec spec;

    public AddonTemplate withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    


    /**
     * API版本，固定值“v3”，该值不可修改。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    

    public AddonTemplate withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API类型，固定值“Addon”，该值不可修改。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    

    public AddonTemplate withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public AddonTemplate withMetadata(Consumer<Metadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    

    public AddonTemplate withSpec(Templatespec spec) {
        this.spec = spec;
        return this;
    }

    public AddonTemplate withSpec(Consumer<Templatespec> specSetter) {
        if(this.spec == null ){
            this.spec = new Templatespec();
            specSetter.accept(this.spec);
        }
        
        return this;
    }


    /**
     * Get spec
     * @return spec
     */
    public Templatespec getSpec() {
        return spec;
    }

    public void setSpec(Templatespec spec) {
        this.spec = spec;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddonTemplate addonTemplate = (AddonTemplate) o;
        return Objects.equals(this.apiVersion, addonTemplate.apiVersion) &&
            Objects.equals(this.kind, addonTemplate.kind) &&
            Objects.equals(this.metadata, addonTemplate.metadata) &&
            Objects.equals(this.spec, addonTemplate.spec);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonTemplate {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

