package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/** Response Object */
public class UpdateEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private BigDecimal lastModified;

    public UpdateEventResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 测试事件ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateEventResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 测试事件名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateEventResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /** 测试事件content。
     * 
     * @return content */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UpdateEventResponse withLastModified(BigDecimal lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /** 上次修改测试事件的时间。
     * 
     * @return lastModified */
    public BigDecimal getLastModified() {
        return lastModified;
    }

    public void setLastModified(BigDecimal lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEventResponse updateEventResponse = (UpdateEventResponse) o;
        return Objects.equals(this.id, updateEventResponse.id) && Objects.equals(this.name, updateEventResponse.name)
            && Objects.equals(this.content, updateEventResponse.content)
            && Objects.equals(this.lastModified, updateEventResponse.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, content, lastModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEventResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
