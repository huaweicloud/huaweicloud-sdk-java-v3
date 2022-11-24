package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommonParamV2
 */
public class CommonParamV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_key")

    private String paramKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show")

    private Integer isShow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_required")

    private Integer isRequired;

    public CommonParamV2 withParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }

    /**
     * 参数标识
     * @return paramKey
     */
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public CommonParamV2 withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 参数名称
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public CommonParamV2 withIsShow(Integer isShow) {
        this.isShow = isShow;
        return this;
    }

    /**
     * 是否展示
     * minimum: 0
     * maximum: 1
     * @return isShow
     */
    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public CommonParamV2 withIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * 是否必填
     * minimum: 0
     * maximum: 1
     * @return isRequired
     */
    public Integer getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonParamV2 commonParamV2 = (CommonParamV2) o;
        return Objects.equals(this.paramKey, commonParamV2.paramKey)
            && Objects.equals(this.paramName, commonParamV2.paramName)
            && Objects.equals(this.isShow, commonParamV2.isShow)
            && Objects.equals(this.isRequired, commonParamV2.isRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramKey, paramName, isShow, isRequired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonParamV2 {\n");
        sb.append("    paramKey: ").append(toIndentedString(paramKey)).append("\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    isShow: ").append(toIndentedString(isShow)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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
