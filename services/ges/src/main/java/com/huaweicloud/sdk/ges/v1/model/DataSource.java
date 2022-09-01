package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.Parameters;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class DataSource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    @JacksonXmlProperty(localName = "parameters")
    
    private Parameters parameters;

    public DataSource withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     *   数据源类型。取值为OBS，且当前只支持OBS。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public DataSource withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public DataSource withParameters(Consumer<Parameters> parametersSetter) {
        if(this.parameters == null ){
            this.parameters = new Parameters();
            parametersSetter.accept(this.parameters);
        }
        
        return this;
    }


    /**
     * Get parameters
     * @return parameters
     */
    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
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
        DataSource dataSource = (DataSource) o;
        return Objects.equals(this.type, dataSource.type) &&
            Objects.equals(this.parameters, dataSource.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

