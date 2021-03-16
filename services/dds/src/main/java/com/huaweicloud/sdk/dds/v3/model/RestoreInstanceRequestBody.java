package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.Source;
import com.huaweicloud.sdk.dds.v3.model.Target;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RestoreInstanceRequestBody
 */
public class RestoreInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source")
    
    private Source source;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target")
    
    private Target target;

    public RestoreInstanceRequestBody withSource(Source source) {
        this.source = source;
        return this;
    }

    public RestoreInstanceRequestBody withSource(Consumer<Source> sourceSetter) {
        if(this.source == null ){
            this.source = new Source();
            sourceSetter.accept(this.source);
        }
        
        return this;
    }


    /**
     * Get source
     * @return source
     */
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    

    public RestoreInstanceRequestBody withTarget(Target target) {
        this.target = target;
        return this;
    }

    public RestoreInstanceRequestBody withTarget(Consumer<Target> targetSetter) {
        if(this.target == null ){
            this.target = new Target();
            targetSetter.accept(this.target);
        }
        
        return this;
    }


    /**
     * Get target
     * @return target
     */
    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreInstanceRequestBody restoreInstanceRequestBody = (RestoreInstanceRequestBody) o;
        return Objects.equals(this.source, restoreInstanceRequestBody.source) &&
            Objects.equals(this.target, restoreInstanceRequestBody.target);
    }
    @Override
    public int hashCode() {
        return Objects.hash(source, target);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInstanceRequestBody {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

