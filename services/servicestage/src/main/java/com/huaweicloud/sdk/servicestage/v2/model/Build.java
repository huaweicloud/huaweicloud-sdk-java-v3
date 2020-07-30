package com.huaweicloud.sdk.servicestage.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.BuildInfoParameters;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 构建工程。
 */
public class Build  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private BuildInfoParameters parameters = null;

    public Build withParameters(BuildInfoParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public Build withParameters(Consumer<BuildInfoParameters> parametersSetter) {
        if(this.parameters == null ){
            this.parameters = new BuildInfoParameters();
            parametersSetter.accept(this.parameters);
        }
        
        return this;
    }


    /**
     * Get parameters
     * @return parameters
     */
    public BuildInfoParameters getParameters() {
        return parameters;
    }

    public void setParameters(BuildInfoParameters parameters) {
        this.parameters = parameters;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Build build = (Build) o;
        return Objects.equals(this.parameters, build.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Build {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

