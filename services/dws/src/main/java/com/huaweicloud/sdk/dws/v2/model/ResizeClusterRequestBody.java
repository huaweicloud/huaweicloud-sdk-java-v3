package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.ScaleOut;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class ResizeClusterRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scale_out")
    
    private ScaleOut scaleOut;

    public ResizeClusterRequestBody withScaleOut(ScaleOut scaleOut) {
        this.scaleOut = scaleOut;
        return this;
    }

    public ResizeClusterRequestBody withScaleOut(Consumer<ScaleOut> scaleOutSetter) {
        if(this.scaleOut == null ){
            this.scaleOut = new ScaleOut();
            scaleOutSetter.accept(this.scaleOut);
        }
        
        return this;
    }


    /**
     * Get scaleOut
     * @return scaleOut
     */
    public ScaleOut getScaleOut() {
        return scaleOut;
    }

    public void setScaleOut(ScaleOut scaleOut) {
        this.scaleOut = scaleOut;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeClusterRequestBody resizeClusterRequestBody = (ResizeClusterRequestBody) o;
        return Objects.equals(this.scaleOut, resizeClusterRequestBody.scaleOut);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scaleOut);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeClusterRequestBody {\n");
        sb.append("    scaleOut: ").append(toIndentedString(scaleOut)).append("\n");
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

