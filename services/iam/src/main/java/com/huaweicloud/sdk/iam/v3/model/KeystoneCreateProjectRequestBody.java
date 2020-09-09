package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneCreateProjectOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建项目的请求体。
 */
public class KeystoneCreateProjectRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private KeystoneCreateProjectOption project = null;

    public KeystoneCreateProjectRequestBody withProject(KeystoneCreateProjectOption project) {
        this.project = project;
        return this;
    }

    public KeystoneCreateProjectRequestBody withProject(Consumer<KeystoneCreateProjectOption> projectSetter) {
        if(this.project == null ){
            this.project = new KeystoneCreateProjectOption();
            projectSetter.accept(this.project);
        }
        
        return this;
    }


    /**
     * Get project
     * @return project
     */
    public KeystoneCreateProjectOption getProject() {
        return project;
    }

    public void setProject(KeystoneCreateProjectOption project) {
        this.project = project;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateProjectRequestBody keystoneCreateProjectRequestBody = (KeystoneCreateProjectRequestBody) o;
        return Objects.equals(this.project, keystoneCreateProjectRequestBody.project);
    }
    @Override
    public int hashCode() {
        return Objects.hash(project);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateProjectRequestBody {\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

