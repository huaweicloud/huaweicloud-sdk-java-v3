package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * id 值， 1 &#39;0&#39;， 2 &#39;1/2&#39;， 3 &#39;1&#39; ， 4 &#39;2&#39; ， 5 &#39;3&#39; ， 6 &#39;5&#39; ， 7 &#39;8&#39; ， 8 &#39;13&#39; ， 9 &#39;21&#39; ， 10 &#39;40&#39; ， 11 &#39;80&#39; ， 12 &#39;100&#39; ， 13 &#39;∞&#39; ， 14 &#39;?&#39; ，
 */
public class IssueItemSfV4StoryPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    public IssueItemSfV4StoryPoint withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 故事点id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueItemSfV4StoryPoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 故事点
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueItemSfV4StoryPoint issueItemSfV4StoryPoint = (IssueItemSfV4StoryPoint) o;
        return Objects.equals(this.id, issueItemSfV4StoryPoint.id)
            && Objects.equals(this.name, issueItemSfV4StoryPoint.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueItemSfV4StoryPoint {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
