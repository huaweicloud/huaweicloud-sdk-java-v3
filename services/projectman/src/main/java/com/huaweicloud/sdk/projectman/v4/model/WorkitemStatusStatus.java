package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 工作项的状态
 */
public class WorkitemStatusStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_status_id")

    @JacksonXmlProperty(localName = "parent_status_id")

    private String parentStatusId;

    public WorkitemStatusStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工作项的状态id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkitemStatusStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 状态名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkitemStatusStatus withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 工作项状态的类型， BACKLOG( \"初始化\"), READY(\"待启动\"), IN_PROGRESS(\"进行中\"), COMPLETE(\"已完成\"), DONE(\"已结束\"),
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WorkitemStatusStatus withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作项状态的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkitemStatusStatus withParentStatusId(String parentStatusId) {
        this.parentStatusId = parentStatusId;
        return this;
    }

    /**
     * 工作项状态的父状态id
     * @return parentStatusId
     */
    public String getParentStatusId() {
        return parentStatusId;
    }

    public void setParentStatusId(String parentStatusId) {
        this.parentStatusId = parentStatusId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkitemStatusStatus workitemStatusStatus = (WorkitemStatusStatus) o;
        return Objects.equals(this.id, workitemStatusStatus.id) && Objects.equals(this.name, workitemStatusStatus.name)
            && Objects.equals(this.type, workitemStatusStatus.type)
            && Objects.equals(this.description, workitemStatusStatus.description)
            && Objects.equals(this.parentStatusId, workitemStatusStatus.parentStatusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description, parentStatusId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkitemStatusStatus {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentStatusId: ").append(toIndentedString(parentStatusId)).append("\n");
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
