package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneUpdateProjectRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    @JacksonXmlProperty(localName = "project")

    private KeystoneUpdateProjectOption project;

    public KeystoneUpdateProjectRequestBody withProject(KeystoneUpdateProjectOption project) {
        this.project = project;
        return this;
    }

    public KeystoneUpdateProjectRequestBody withProject(Consumer<KeystoneUpdateProjectOption> projectSetter) {
        if (this.project == null) {
            this.project = new KeystoneUpdateProjectOption();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public KeystoneUpdateProjectOption getProject() {
        return project;
    }

    public void setProject(KeystoneUpdateProjectOption project) {
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
        KeystoneUpdateProjectRequestBody keystoneUpdateProjectRequestBody = (KeystoneUpdateProjectRequestBody) o;
        return Objects.equals(this.project, keystoneUpdateProjectRequestBody.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateProjectRequestBody {\n");
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
