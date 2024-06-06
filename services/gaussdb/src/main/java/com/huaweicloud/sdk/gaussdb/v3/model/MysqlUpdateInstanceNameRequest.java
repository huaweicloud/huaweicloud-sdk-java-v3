package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MysqlUpdateInstanceNameRequest
 */
public class MysqlUpdateInstanceNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_modify_node_name")

    private String isModifyNodeName;

    public MysqlUpdateInstanceNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。  用于表示实例的名称，同一租户下，同类型的实例名可重名。取值范围：最小为4个字符，最大为64个字符且不超过64个字节（注意：一个中文字符占用3个字节），必须以字母或中文开头，区分大小写，可以包含字母、数字、中划线、下划线或中文，不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MysqlUpdateInstanceNameRequest withIsModifyNodeName(String isModifyNodeName) {
        this.isModifyNodeName = isModifyNodeName;
        return this;
    }

    /**
     * 是否同步修改节点名称，取值：true或false, 默认值为true。
     * @return isModifyNodeName
     */
    public String getIsModifyNodeName() {
        return isModifyNodeName;
    }

    public void setIsModifyNodeName(String isModifyNodeName) {
        this.isModifyNodeName = isModifyNodeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlUpdateInstanceNameRequest that = (MysqlUpdateInstanceNameRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.isModifyNodeName, that.isModifyNodeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isModifyNodeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlUpdateInstanceNameRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isModifyNodeName: ").append(toIndentedString(isModifyNodeName)).append("\n");
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
