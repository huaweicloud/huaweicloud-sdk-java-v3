package com.huaweicloud.sdk.devstar.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.RepositoryInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateJobInfo
 */
public class TemplateJobInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_name")
    
    private String applicationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private String templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_type")
    
    private Integer repoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Object properties = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_info")
    
    private RepositoryInfo repoInfo = null;

    public TemplateJobInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    


    /**
     * 应用名称
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public TemplateJobInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 任务依赖的模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TemplateJobInfo withRepoType(Integer repoType) {
        this.repoType = repoType;
        return this;
    }

    


    /**
     * 应用代码生成后的地址类型，目前支持0：codehub地址
     * minimum: 0
     * maximum: 0
     * @return repoType
     */
    public Integer getRepoType() {
        return repoType;
    }

    public void setRepoType(Integer repoType) {
        this.repoType = repoType;
    }

    public TemplateJobInfo withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    


    /**
     * 应用的动态参数json
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public TemplateJobInfo withRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
        return this;
    }

    public TemplateJobInfo withRepoInfo(Consumer<RepositoryInfo> repoInfoSetter) {
        if(this.repoInfo == null ){
            this.repoInfo = new RepositoryInfo();
            repoInfoSetter.accept(this.repoInfo);
        }
        
        return this;
    }


    /**
     * Get repoInfo
     * @return repoInfo
     */
    public RepositoryInfo getRepoInfo() {
        return repoInfo;
    }

    public void setRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateJobInfo templateJobInfo = (TemplateJobInfo) o;
        return Objects.equals(this.applicationName, templateJobInfo.applicationName) &&
            Objects.equals(this.templateId, templateJobInfo.templateId) &&
            Objects.equals(this.repoType, templateJobInfo.repoType) &&
            Objects.equals(this.properties, templateJobInfo.properties) &&
            Objects.equals(this.repoInfo, templateJobInfo.repoInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationName, templateId, repoType, properties, repoInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateJobInfo {\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    repoInfo: ").append(toIndentedString(repoInfo)).append("\n");
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

