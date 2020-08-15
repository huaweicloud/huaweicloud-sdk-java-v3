package com.huaweicloud.sdk.cloudide.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.SourceStorage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProjectTemplates
 */
public class ProjectTemplates  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logo")
    
    private String logo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_type")
    
    private String projectType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source")
    
    private SourceStorage source = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private Long templateId;

    public ProjectTemplates withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectTemplates withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 显示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ProjectTemplates withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    


    /**
     * 图标
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ProjectTemplates withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 模板名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectTemplates withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ProjectTemplates withProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    


    /**
     * 项目类型
     * @return projectType
     */
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public ProjectTemplates withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ProjectTemplates withSource(SourceStorage source) {
        this.source = source;
        return this;
    }

    public ProjectTemplates withSource(Consumer<SourceStorage> sourceSetter) {
        if(this.source == null ){
            this.source = new SourceStorage();
            sourceSetter.accept(this.source);
        }
        
        return this;
    }


    /**
     * Get source
     * @return source
     */
    public SourceStorage getSource() {
        return source;
    }

    public void setSource(SourceStorage source) {
        this.source = source;
    }

    public ProjectTemplates withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public ProjectTemplates addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ProjectTemplates withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * tags
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ProjectTemplates withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 模板id
     * minimum: 1
     * maximum: 9223372036854775807
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectTemplates projectTemplates = (ProjectTemplates) o;
        return Objects.equals(this.description, projectTemplates.description) &&
            Objects.equals(this.displayName, projectTemplates.displayName) &&
            Objects.equals(this.logo, projectTemplates.logo) &&
            Objects.equals(this.name, projectTemplates.name) &&
            Objects.equals(this.path, projectTemplates.path) &&
            Objects.equals(this.projectType, projectTemplates.projectType) &&
            Objects.equals(this.region, projectTemplates.region) &&
            Objects.equals(this.source, projectTemplates.source) &&
            Objects.equals(this.tags, projectTemplates.tags) &&
            Objects.equals(this.templateId, projectTemplates.templateId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, displayName, logo, name, path, projectType, region, source, tags, templateId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectTemplates {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

