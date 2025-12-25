package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Connection
 */
public class Connection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_refer_count")

    private Long channelReferCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private FilterConnectionType connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_title")

    private String templateTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public Connection withChannelReferCount(Long channelReferCount) {
        this.channelReferCount = channelReferCount;
        return this;
    }

    /**
     * 数值
     * minimum: 1
     * maximum: 1024
     * @return channelReferCount
     */
    public Long getChannelReferCount() {
        return channelReferCount;
    }

    public void setChannelReferCount(Long channelReferCount) {
        this.channelReferCount = channelReferCount;
    }

    public Connection withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * UUID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public Connection withConnectionType(FilterConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get connectionType
     * @return connectionType
     */
    public FilterConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(FilterConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public Connection withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Connection withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * 描述信息
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Connection withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * UUID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public Connection withTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
        return this;
    }

    /**
     * 相关标题
     * @return templateTitle
     */
    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
    }

    public Connection withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 相关标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Connection that = (Connection) obj;
        return Objects.equals(this.channelReferCount, that.channelReferCount)
            && Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.info, that.info)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.templateTitle, that.templateTitle)
            && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(channelReferCount, connectionId, connectionType, description, info, moduleId, templateTitle, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Connection {\n");
        sb.append("    channelReferCount: ").append(toIndentedString(channelReferCount)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    templateTitle: ").append(toIndentedString(templateTitle)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
