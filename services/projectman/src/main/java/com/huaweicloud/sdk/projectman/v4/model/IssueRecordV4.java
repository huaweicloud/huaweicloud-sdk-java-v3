package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 历史记录
 */
public class IssueRecordV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    @JacksonXmlProperty(localName = "user")

    private IssueRecordV4User user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    @JacksonXmlProperty(localName = "details")

    private List<IssueRecordV4Details> details = null;

    public IssueRecordV4 withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 操作记录id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueRecordV4 withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 操作记录创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public IssueRecordV4 withUser(IssueRecordV4User user) {
        this.user = user;
        return this;
    }

    public IssueRecordV4 withUser(Consumer<IssueRecordV4User> userSetter) {
        if (this.user == null) {
            this.user = new IssueRecordV4User();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public IssueRecordV4User getUser() {
        return user;
    }

    public void setUser(IssueRecordV4User user) {
        this.user = user;
    }

    public IssueRecordV4 withDetails(List<IssueRecordV4Details> details) {
        this.details = details;
        return this;
    }

    public IssueRecordV4 addDetailsItem(IssueRecordV4Details detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public IssueRecordV4 withDetails(Consumer<List<IssueRecordV4Details>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 操作的记录
     * @return details
     */
    public List<IssueRecordV4Details> getDetails() {
        return details;
    }

    public void setDetails(List<IssueRecordV4Details> details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueRecordV4 issueRecordV4 = (IssueRecordV4) o;
        return Objects.equals(this.id, issueRecordV4.id) && Objects.equals(this.createdTime, issueRecordV4.createdTime)
            && Objects.equals(this.user, issueRecordV4.user) && Objects.equals(this.details, issueRecordV4.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdTime, user, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueRecordV4 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
