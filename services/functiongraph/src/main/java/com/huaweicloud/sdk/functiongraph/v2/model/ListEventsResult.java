package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 获取测试事件响应返回体。
 */
public class ListEventsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    @JacksonXmlProperty(localName = "last_modified")

    private BigDecimal lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    public ListEventsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 测试事件ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListEventsResult withLastModified(BigDecimal lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 上次修改的时间。
     * @return lastModified
     */
    public BigDecimal getLastModified() {
        return lastModified;
    }

    public void setLastModified(BigDecimal lastModified) {
        this.lastModified = lastModified;
    }

    public ListEventsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试事件名称。
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
        ListEventsResult listEventsResult = (ListEventsResult) o;
        return Objects.equals(this.id, listEventsResult.id)
            && Objects.equals(this.lastModified, listEventsResult.lastModified)
            && Objects.equals(this.name, listEventsResult.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastModified, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
