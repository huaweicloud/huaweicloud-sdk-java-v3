package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 规格变更前置检查任务检查请求体
 */
public class StartInstanceResizeCheckJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_capacity")

    private Integer newCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    public StartInstanceResizeCheckJobRequestBody withNewCapacity(Integer newCapacity) {
        this.newCapacity = newCapacity;
        return this;
    }

    /**
     * 新规格的容量，单位GB
     * @return newCapacity
     */
    public Integer getNewCapacity() {
        return newCapacity;
    }

    public void setNewCapacity(Integer newCapacity) {
        this.newCapacity = newCapacity;
    }

    public StartInstanceResizeCheckJobRequestBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 新的规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartInstanceResizeCheckJobRequestBody that = (StartInstanceResizeCheckJobRequestBody) obj;
        return Objects.equals(this.newCapacity, that.newCapacity) && Objects.equals(this.specCode, that.specCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newCapacity, specCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartInstanceResizeCheckJobRequestBody {\n");
        sb.append("    newCapacity: ").append(toIndentedString(newCapacity)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
