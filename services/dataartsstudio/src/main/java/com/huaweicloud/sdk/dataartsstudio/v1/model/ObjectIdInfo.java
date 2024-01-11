package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ObjectIdInfo
 */
public class ObjectIdInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_name")

    private String qualifiedName;

    public ObjectIdInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业算子名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectIdInfo withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 资产类型
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ObjectIdInfo withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * 作业资产唯一限定名称
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
        ObjectIdInfo that = (ObjectIdInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.typeName, that.typeName)
            && Objects.equals(this.qualifiedName, that.qualifiedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, typeName, qualifiedName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectIdInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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
