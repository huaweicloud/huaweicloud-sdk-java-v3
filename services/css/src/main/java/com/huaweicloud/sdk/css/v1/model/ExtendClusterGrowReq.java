package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 集群扩容请求详细描述。
 */
public class ExtendClusterGrowReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifySize")

    @JacksonXmlProperty(localName = "modifySize")

    private Integer modifySize;

    public ExtendClusterGrowReq withModifySize(Integer modifySize) {
        this.modifySize = modifySize;
        return this;
    }

    /**
     * 扩容实例个数。  集群已有实例个数和扩容实例个数总和不能超过32。
     * @return modifySize
     */
    public Integer getModifySize() {
        return modifySize;
    }

    public void setModifySize(Integer modifySize) {
        this.modifySize = modifySize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendClusterGrowReq extendClusterGrowReq = (ExtendClusterGrowReq) o;
        return Objects.equals(this.modifySize, extendClusterGrowReq.modifySize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modifySize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendClusterGrowReq {\n");
        sb.append("    modifySize: ").append(toIndentedString(modifySize)).append("\n");
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
