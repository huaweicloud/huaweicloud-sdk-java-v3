package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 运行时参数。
 */
public class RuntimeTypeView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_default_port")

    private Integer containerDefaultPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_desc")

    private String typeDesc;

    public RuntimeTypeView withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 类型名称。
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public RuntimeTypeView withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 显示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public RuntimeTypeView withContainerDefaultPort(Integer containerDefaultPort) {
        this.containerDefaultPort = containerDefaultPort;
        return this;
    }

    /**
     * 容器默认端口。
     * @return containerDefaultPort
     */
    public Integer getContainerDefaultPort() {
        return containerDefaultPort;
    }

    public void setContainerDefaultPort(Integer containerDefaultPort) {
        this.containerDefaultPort = containerDefaultPort;
    }

    public RuntimeTypeView withTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
        return this;
    }

    /**
     * 类型描述。
     * @return typeDesc
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeTypeView that = (RuntimeTypeView) obj;
        return Objects.equals(this.typeName, that.typeName) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.containerDefaultPort, that.containerDefaultPort)
            && Objects.equals(this.typeDesc, that.typeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeName, displayName, containerDefaultPort, typeDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeTypeView {\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    containerDefaultPort: ").append(toIndentedString(containerDefaultPort)).append("\n");
        sb.append("    typeDesc: ").append(toIndentedString(typeDesc)).append("\n");
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
