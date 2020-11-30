package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteStreamForbiddenRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specify_project")
    
    private String specifyProject;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream_name")
    
    private String streamName;

    public DeleteStreamForbiddenRequest withSpecifyProject(String specifyProject) {
        this.specifyProject = specifyProject;
        return this;
    }

    


    /**
     * Get specifyProject
     * @return specifyProject
     */
    public String getSpecifyProject() {
        return specifyProject;
    }

    public void setSpecifyProject(String specifyProject) {
        this.specifyProject = specifyProject;
    }

    public DeleteStreamForbiddenRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * Get domain
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DeleteStreamForbiddenRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * Get appName
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public DeleteStreamForbiddenRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    


    /**
     * Get streamName
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteStreamForbiddenRequest deleteStreamForbiddenRequest = (DeleteStreamForbiddenRequest) o;
        return Objects.equals(this.specifyProject, deleteStreamForbiddenRequest.specifyProject) &&
            Objects.equals(this.domain, deleteStreamForbiddenRequest.domain) &&
            Objects.equals(this.appName, deleteStreamForbiddenRequest.appName) &&
            Objects.equals(this.streamName, deleteStreamForbiddenRequest.streamName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(specifyProject, domain, appName, streamName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteStreamForbiddenRequest {\n");
        sb.append("    specifyProject: ").append(toIndentedString(specifyProject)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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

