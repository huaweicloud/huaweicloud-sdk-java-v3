package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联Wiki详情
 */
public class AttachWikiDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    @JacksonXmlProperty(localName = "issue_id")

    private Integer issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wiki_title")

    @JacksonXmlProperty(localName = "wiki_title")

    private String wikiTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wiki_author")

    @JacksonXmlProperty(localName = "wiki_author")

    private SimpleUser wikiAuthor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    @JacksonXmlProperty(localName = "project")

    private SimpleProject project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    @JacksonXmlProperty(localName = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wiki_id")

    @JacksonXmlProperty(localName = "wiki_id")

    private String wikiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    public AttachWikiDetail withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项ID
     * @return issueId
     */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public AttachWikiDetail withWikiTitle(String wikiTitle) {
        this.wikiTitle = wikiTitle;
        return this;
    }

    /**
     * Wiki标题
     * @return wikiTitle
     */
    public String getWikiTitle() {
        return wikiTitle;
    }

    public void setWikiTitle(String wikiTitle) {
        this.wikiTitle = wikiTitle;
    }

    public AttachWikiDetail withWikiAuthor(SimpleUser wikiAuthor) {
        this.wikiAuthor = wikiAuthor;
        return this;
    }

    public AttachWikiDetail withWikiAuthor(Consumer<SimpleUser> wikiAuthorSetter) {
        if (this.wikiAuthor == null) {
            this.wikiAuthor = new SimpleUser();
            wikiAuthorSetter.accept(this.wikiAuthor);
        }

        return this;
    }

    /**
     * Get wikiAuthor
     * @return wikiAuthor
     */
    public SimpleUser getWikiAuthor() {
        return wikiAuthor;
    }

    public void setWikiAuthor(SimpleUser wikiAuthor) {
        this.wikiAuthor = wikiAuthor;
    }

    public AttachWikiDetail withProject(SimpleProject project) {
        this.project = project;
        return this;
    }

    public AttachWikiDetail withProject(Consumer<SimpleProject> projectSetter) {
        if (this.project == null) {
            this.project = new SimpleProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public SimpleProject getProject() {
        return project;
    }

    public void setProject(SimpleProject project) {
        this.project = project;
    }

    public AttachWikiDetail withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public AttachWikiDetail withWikiId(String wikiId) {
        this.wikiId = wikiId;
        return this;
    }

    /**
     * wiki ID
     * @return wikiId
     */
    public String getWikiId() {
        return wikiId;
    }

    public void setWikiId(String wikiId) {
        this.wikiId = wikiId;
    }

    public AttachWikiDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region值
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttachWikiDetail attachWikiDetail = (AttachWikiDetail) o;
        return Objects.equals(this.issueId, attachWikiDetail.issueId)
            && Objects.equals(this.wikiTitle, attachWikiDetail.wikiTitle)
            && Objects.equals(this.wikiAuthor, attachWikiDetail.wikiAuthor)
            && Objects.equals(this.project, attachWikiDetail.project)
            && Objects.equals(this.createdDate, attachWikiDetail.createdDate)
            && Objects.equals(this.wikiId, attachWikiDetail.wikiId)
            && Objects.equals(this.region, attachWikiDetail.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueId, wikiTitle, wikiAuthor, project, createdDate, wikiId, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachWikiDetail {\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    wikiTitle: ").append(toIndentedString(wikiTitle)).append("\n");
        sb.append("    wikiAuthor: ").append(toIndentedString(wikiAuthor)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    wikiId: ").append(toIndentedString(wikiId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
