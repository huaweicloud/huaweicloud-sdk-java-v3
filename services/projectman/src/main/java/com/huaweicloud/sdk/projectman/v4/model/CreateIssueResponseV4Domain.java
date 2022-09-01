package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * id 领域, 14 &#39;性能&#39;, 15 &#39;功能&#39;, 16 &#39;可靠性&#39;, 17 &#39;网络安全&#39;, 18 &#39;可维护性&#39;, 19 &#39;其他DFX&#39;, 20 &#39;可用性&#39;,
 */
public class CreateIssueResponseV4Domain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    public CreateIssueResponseV4Domain withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 领域id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CreateIssueResponseV4Domain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 领域
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
        CreateIssueResponseV4Domain createIssueResponseV4Domain = (CreateIssueResponseV4Domain) o;
        return Objects.equals(this.id, createIssueResponseV4Domain.id)
            && Objects.equals(this.name, createIssueResponseV4Domain.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIssueResponseV4Domain {\n");
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
