package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckProjectNameV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist")

    @JacksonXmlProperty(localName = "exist")

    private Boolean exist;

    public CheckProjectNameV4Response withExist(Boolean exist) {
        this.exist = exist;
        return this;
    }

    /**
     * 是否存在相同的项目名称 true 存在， false 不存在
     * @return exist
     */
    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckProjectNameV4Response checkProjectNameV4Response = (CheckProjectNameV4Response) o;
        return Objects.equals(this.exist, checkProjectNameV4Response.exist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckProjectNameV4Response {\n");
        sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
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
