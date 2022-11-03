package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 独享引擎改名请求数据
 */
public class RenameInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instancename")

    private String instancename;

    public RenameInstanceRequestBody withInstancename(String instancename) {
        this.instancename = instancename;
        return this;
    }

    /**
     * 独享引擎新名称
     * @return instancename
     */
    public String getInstancename() {
        return instancename;
    }

    public void setInstancename(String instancename) {
        this.instancename = instancename;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenameInstanceRequestBody renameInstanceRequestBody = (RenameInstanceRequestBody) o;
        return Objects.equals(this.instancename, renameInstanceRequestBody.instancename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instancename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenameInstanceRequestBody {\n");
        sb.append("    instancename: ").append(toIndentedString(instancename)).append("\n");
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
