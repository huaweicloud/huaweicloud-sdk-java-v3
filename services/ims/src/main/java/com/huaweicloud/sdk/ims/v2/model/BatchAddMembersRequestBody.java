package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量添加镜像成员body
 */
public class BatchAddMembersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images")

    private List<String> images = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projects")

    private List<String> projects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizations")

    private List<String> organizations = null;

    public BatchAddMembersRequestBody withImages(List<String> images) {
        this.images = images;
        return this;
    }

    public BatchAddMembersRequestBody addImagesItem(String imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public BatchAddMembersRequestBody withImages(Consumer<List<String>> imagesSetter) {
        if (this.images == null) {
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
        if (this.projects == null) {
            this.projects = new ArrayList<>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    public BatchAddMembersRequestBody withProjects(Consumer<List<String>> projectsSetter) {
        if (this.projects == null) {
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

    public BatchAddMembersRequestBody withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public BatchAddMembersRequestBody addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public BatchAddMembersRequestBody withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 账号ID列表
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public BatchAddMembersRequestBody withOrganizations(List<String> organizations) {
        this.organizations = organizations;
        return this;
    }

    public BatchAddMembersRequestBody addOrganizationsItem(String organizationsItem) {
        if (this.organizations == null) {
            this.organizations = new ArrayList<>();
        }
        this.organizations.add(organizationsItem);
        return this;
    }

    public BatchAddMembersRequestBody withOrganizations(Consumer<List<String>> organizationsSetter) {
        if (this.organizations == null) {
            this.organizations = new ArrayList<>();
        }
        organizationsSetter.accept(this.organizations);
        return this;
    }

    /**
     * 组织URN列表
     * @return organizations
     */
    public List<String> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<String> organizations) {
        this.organizations = organizations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddMembersRequestBody that = (BatchAddMembersRequestBody) obj;
        return Objects.equals(this.images, that.images) && Objects.equals(this.projects, that.projects)
            && Objects.equals(this.domains, that.domains) && Objects.equals(this.organizations, that.organizations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(images, projects, domains, organizations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddMembersRequestBody {\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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
