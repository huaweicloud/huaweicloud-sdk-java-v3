package com.huaweicloud.sdk.devstar.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.PropertiesInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTemplateDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repostory_id")
    
    private String repostoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_url")
    
    private String codeUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssh_url")
    
    private String sshUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_uuid")
    
    private String projectUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private List<PropertiesInfo> properties = null;
    
    public ShowTemplateDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 模板的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowTemplateDetailResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 模板的名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public ShowTemplateDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 模板的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowTemplateDetailResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * 模板关联的region host id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    

    public ShowTemplateDetailResponse withRepostoryId(String repostoryId) {
        this.repostoryId = repostoryId;
        return this;
    }

    


    /**
     * 模板关联的repo id
     * @return repostoryId
     */
    public String getRepostoryId() {
        return repostoryId;
    }

    public void setRepostoryId(String repostoryId) {
        this.repostoryId = repostoryId;
    }

    

    public ShowTemplateDetailResponse withCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }

    


    /**
     * 模板https下载路径
     * @return codeUrl
     */
    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    

    public ShowTemplateDetailResponse withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    


    /**
     * 模板ssh下载路径
     * @return sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    

    public ShowTemplateDetailResponse withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    


    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    

    public ShowTemplateDetailResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 模板状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ShowTemplateDetailResponse withProperties(List<PropertiesInfo> properties) {
        this.properties = properties;
        return this;
    }

    
    public ShowTemplateDetailResponse addPropertiesItem(PropertiesInfo propertiesItem) {
        this.properties.add(propertiesItem);
        return this;
    }

    public ShowTemplateDetailResponse withProperties(Consumer<List<PropertiesInfo>> propertiesSetter) {
        if(this.properties == null ){
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public List<PropertiesInfo> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertiesInfo> properties) {
        this.properties = properties;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTemplateDetailResponse showTemplateDetailResponse = (ShowTemplateDetailResponse) o;
        return Objects.equals(this.id, showTemplateDetailResponse.id) &&
            Objects.equals(this.title, showTemplateDetailResponse.title) &&
            Objects.equals(this.description, showTemplateDetailResponse.description) &&
            Objects.equals(this.regionId, showTemplateDetailResponse.regionId) &&
            Objects.equals(this.repostoryId, showTemplateDetailResponse.repostoryId) &&
            Objects.equals(this.codeUrl, showTemplateDetailResponse.codeUrl) &&
            Objects.equals(this.sshUrl, showTemplateDetailResponse.sshUrl) &&
            Objects.equals(this.projectUuid, showTemplateDetailResponse.projectUuid) &&
            Objects.equals(this.status, showTemplateDetailResponse.status) &&
            Objects.equals(this.properties, showTemplateDetailResponse.properties);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, regionId, repostoryId, codeUrl, sshUrl, projectUuid, status, properties);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplateDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    repostoryId: ").append(toIndentedString(repostoryId)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    sshUrl: ").append(toIndentedString(sshUrl)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

