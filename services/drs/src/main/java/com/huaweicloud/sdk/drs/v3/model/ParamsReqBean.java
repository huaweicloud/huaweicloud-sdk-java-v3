package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 参数信息 */
public class ParamsReqBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    public ParamsReqBean withKey(String key) {
        this.key = key;
        return this;
    }

    /** 数据库参数名
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ParamsReqBean withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /** 目标数据库参数值
     * 
     * @return targetValue */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParamsReqBean paramsReqBean = (ParamsReqBean) o;
        return Objects.equals(this.key, paramsReqBean.key)
            && Objects.equals(this.targetValue, paramsReqBean.targetValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, targetValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParamsReqBean {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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
