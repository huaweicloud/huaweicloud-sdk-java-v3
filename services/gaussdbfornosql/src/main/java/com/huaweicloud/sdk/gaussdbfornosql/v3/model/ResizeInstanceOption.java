package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ResizeInstanceOption */
public class ResizeInstanceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_spec_code")

    private String targetSpecCode;

    public ResizeInstanceOption withTargetSpecCode(String targetSpecCode) {
        this.targetSpecCode = targetSpecCode;
        return this;
    }

    /** 变更至新规格的资源规格编码。获取方法请参见查询所有实例规格信息中响应参数“flavors.spec_code”的值。
     * 
     * @return targetSpecCode */
    public String getTargetSpecCode() {
        return targetSpecCode;
    }

    public void setTargetSpecCode(String targetSpecCode) {
        this.targetSpecCode = targetSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceOption resizeInstanceOption = (ResizeInstanceOption) o;
        return Objects.equals(this.targetSpecCode, resizeInstanceOption.targetSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceOption {\n");
        sb.append("    targetSpecCode: ").append(toIndentedString(targetSpecCode)).append("\n");
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
