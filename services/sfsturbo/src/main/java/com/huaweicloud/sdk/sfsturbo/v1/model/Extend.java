package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * extend对象
 */
public class Extend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_size")

    @JacksonXmlProperty(localName = "new_size")

    private Integer newSize;

    public Extend withNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }

    /**
     * 扩容后文件系统的新容量，以GB为单位。扩容步长大于等于100GB。  普通文件系统容量，取值范围500~32768。  带宽型文件系统，容量范围是10240~327680
     * minimum: 500
     * maximum: 327680
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
        Extend extend = (Extend) o;
        return Objects.equals(this.newSize, extend.newSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Extend {\n");
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
