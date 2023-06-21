package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 表自定义项
 */
public class SelfDefinedFieldVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_name_ch")

    private String fdNameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_name_en")

    private String fdNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_null")

    private Boolean notNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_value")

    private String fdValue;

    public SelfDefinedFieldVO withFdNameCh(String fdNameCh) {
        this.fdNameCh = fdNameCh;
        return this;
    }

    /**
     * 自定义项中文名
     * @return fdNameCh
     */
    public String getFdNameCh() {
        return fdNameCh;
    }

    public void setFdNameCh(String fdNameCh) {
        this.fdNameCh = fdNameCh;
    }

    public SelfDefinedFieldVO withFdNameEn(String fdNameEn) {
        this.fdNameEn = fdNameEn;
        return this;
    }

    /**
     * 自定义项英文名
     * @return fdNameEn
     */
    public String getFdNameEn() {
        return fdNameEn;
    }

    public void setFdNameEn(String fdNameEn) {
        this.fdNameEn = fdNameEn;
    }

    public SelfDefinedFieldVO withNotNull(Boolean notNull) {
        this.notNull = notNull;
        return this;
    }

    /**
     * 是否必填
     * @return notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public SelfDefinedFieldVO withFdValue(String fdValue) {
        this.fdValue = fdValue;
        return this;
    }

    /**
     * 属性值
     * @return fdValue
     */
    public String getFdValue() {
        return fdValue;
    }

    public void setFdValue(String fdValue) {
        this.fdValue = fdValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SelfDefinedFieldVO selfDefinedFieldVO = (SelfDefinedFieldVO) o;
        return Objects.equals(this.fdNameCh, selfDefinedFieldVO.fdNameCh)
            && Objects.equals(this.fdNameEn, selfDefinedFieldVO.fdNameEn)
            && Objects.equals(this.notNull, selfDefinedFieldVO.notNull)
            && Objects.equals(this.fdValue, selfDefinedFieldVO.fdValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fdNameCh, fdNameEn, notNull, fdValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SelfDefinedFieldVO {\n");
        sb.append("    fdNameCh: ").append(toIndentedString(fdNameCh)).append("\n");
        sb.append("    fdNameEn: ").append(toIndentedString(fdNameEn)).append("\n");
        sb.append("    notNull: ").append(toIndentedString(notNull)).append("\n");
        sb.append("    fdValue: ").append(toIndentedString(fdValue)).append("\n");
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
