package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 复制对扩容请求数据结构
 */
public class ExtendReplicationRequestParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_size")

    @JacksonXmlProperty(localName = "new_size")

    private Integer newSize;

    public ExtendReplicationRequestParams withNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }

    /**
     * 复制对内的磁盘扩容后的最终容量。单位：GB 说明:该参数的取值为小数时，系统默认取小数点前的整数值。
     * @return newSize
     */
    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendReplicationRequestParams extendReplicationRequestParams = (ExtendReplicationRequestParams) o;
        return Objects.equals(this.newSize, extendReplicationRequestParams.newSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendReplicationRequestParams {\n");
        sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
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
