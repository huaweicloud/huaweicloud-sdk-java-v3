package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 标签响应体。 **取值范围**： 不涉及。 
 */
public class PipelineTagResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    public PipelineTagResp withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * **参数解释**： 标签ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public PipelineTagResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 标签名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineTagResp withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数解释**： 标签颜色。 **取值范围**： 不涉及。 
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PipelineTagResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PipelineTagResp withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**： 项目名称。 **取值范围**： 不涉及。 
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineTagResp that = (PipelineTagResp) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.color, that.color) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, name, color, projectId, projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineTagResp {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
