package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateInstanceRemarkRequestBody */
public class UpdateInstanceRemarkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public UpdateInstanceRemarkRequestBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 实例备注内容。 长度不能超过64位，不支持回车和>!<\"&'=特殊字符。
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceRemarkRequestBody updateInstanceRemarkRequestBody = (UpdateInstanceRemarkRequestBody) o;
        return Objects.equals(this.remark, updateInstanceRemarkRequestBody.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRemarkRequestBody {\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
