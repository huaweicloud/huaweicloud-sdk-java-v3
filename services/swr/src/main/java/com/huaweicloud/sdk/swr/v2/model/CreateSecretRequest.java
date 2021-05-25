package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateSecretRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projectname")
    
    private String projectname;

    public CreateSecretRequest withProjectname(String projectname) {
        this.projectname = projectname;
        return this;
    }

    


    /**
     * 项目名称，缺省值默认为区域名称，例如：cn-north-1。 
     * @return projectname
     */
    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecretRequest createSecretRequest = (CreateSecretRequest) o;
        return Objects.equals(this.projectname, createSecretRequest.projectname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectname);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretRequest {\n");
        sb.append("    projectname: ").append(toIndentedString(projectname)).append("\n");
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

