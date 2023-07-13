package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据连接
 */
public class Connection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private String connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_name")

    private String qualifiedName;

    public Connection withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 关联guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Connection withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * 显示内容
     * @return displayText
     */
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public Connection withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 类型名称
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Connection withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * 连接类型
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public Connection withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * 限定名称
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
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
        return Objects.equals(this.guid, that.guid) && Objects.equals(this.displayText, that.displayText)
            && Objects.equals(this.typeName, that.typeName) && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.qualifiedName, that.qualifiedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, displayText, typeName, connectionType, qualifiedName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Connection {\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
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
