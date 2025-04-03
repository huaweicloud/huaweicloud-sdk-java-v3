package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OperationItemDto
 */
public class OperationItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op")

    private String op;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Object value;

    public OperationItemDto withOp(String op) {
        this.op = op;
        return this;
    }

    /**
     * 要执行的修改操作类型。 add：添加属性，replace：替换属性，remove：删除属性
     * @return op
     */
    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public OperationItemDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 要修改的属性路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public OperationItemDto withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 要修改的属性值。执行删除操作时不填写
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationItemDto that = (OperationItemDto) obj;
        return Objects.equals(this.op, that.op) && Objects.equals(this.path, that.path)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(op, path, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationItemDto {\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
