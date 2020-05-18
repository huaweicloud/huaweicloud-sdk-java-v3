package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 批量添加镜像成员body
 */
public class BatchAddMembersRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="images")
    
    private List<String> images = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="projects")
    
    private List<String> projects = new ArrayList<>();
    
    public BatchAddMembersRequestBody withImages(List<String> images) {
        this.images = images;
        return this;
    }

    
    public BatchAddMembersRequestBody addImagesItem(String imagesItem) {
        this.images.add(imagesItem);
        return this;
    }

    public BatchAddMembersRequestBody withImages(Consumer<List<String>> imagesSetter) {
        if(this.images == null ){
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * 镜像ID列表
     * @return images
     */
    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public BatchAddMembersRequestBody withProjects(List<String> projects) {
        this.projects = projects;
        return this;
    }

    
    public BatchAddMembersRequestBody addProjectsItem(String projectsItem) {
        this.projects.add(projectsItem);
        return this;
    }

    public BatchAddMembersRequestBody withProjects(Consumer<List<String>> projectsSetter) {
        if(this.projects == null ){
            this.projects = new ArrayList<>();
        }
        projectsSetter.accept(this.projects);
        return this;
    }

    /**
     * 项目ID列表
     * @return projects
     */
    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddMembersRequestBody batchAddMembersRequestBody = (BatchAddMembersRequestBody) o;
        return Objects.equals(this.images, batchAddMembersRequestBody.images) &&
            Objects.equals(this.projects, batchAddMembersRequestBody.projects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(images, projects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddMembersRequestBody {\n");
            sb.append("    images: ").append(toIndentedString(images)).append("\n");
            sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

