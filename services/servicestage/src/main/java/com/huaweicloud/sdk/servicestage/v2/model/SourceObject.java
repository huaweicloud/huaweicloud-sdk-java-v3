package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.SourceKind;
import com.huaweicloud.sdk.servicestage.v2.model.SourceOrArtifact;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 组件来源。
 */
public class SourceObject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private SourceKind kind = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private SourceOrArtifact spec = null;

    public SourceObject withKind(SourceKind kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * Get kind
     * @return kind
     */
    public SourceKind getKind() {
        return kind;
    }

    public void setKind(SourceKind kind) {
        this.kind = kind;
    }

    public SourceObject withSpec(SourceOrArtifact spec) {
        this.spec = spec;
        return this;
    }

    public SourceObject withSpec(Consumer<SourceOrArtifact> specSetter) {
        if(this.spec == null ){
            this.spec = new SourceOrArtifact();
            specSetter.accept(this.spec);
        }
        
        return this;
    }


    /**
     * Get spec
     * @return spec
     */
    public SourceOrArtifact getSpec() {
        return spec;
    }

    public void setSpec(SourceOrArtifact spec) {
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
        SourceObject sourceObject = (SourceObject) o;
        return Objects.equals(this.kind, sourceObject.kind) &&
            Objects.equals(this.spec, sourceObject.spec);
    }
    @Override
    public int hashCode() {
        return Objects.hash(kind, spec);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceObject {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

