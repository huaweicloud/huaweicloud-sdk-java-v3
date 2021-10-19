package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 保护实例元数据数据结构 */
public class MetadataParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__frozen")

    private String systemFrozen;

    public MetadataParams withSystemFrozen(String systemFrozen) {
        this.systemFrozen = systemFrozen;
        return this;
    }

    /** 保护实例元数据中资源冻结的字段。 true：表示资源被冻结。 空：表示资源没有被冻结。
     * 
     * @return systemFrozen */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__frozen")
    public String getSystemFrozen() {
        return systemFrozen;
    }

    public void setSystemFrozen(String systemFrozen) {
        this.systemFrozen = systemFrozen;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataParams metadataParams = (MetadataParams) o;
        return Objects.equals(this.systemFrozen, metadataParams.systemFrozen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemFrozen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataParams {\n");
        sb.append("    systemFrozen: ").append(toIndentedString(systemFrozen)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
