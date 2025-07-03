package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TicketEnumData
 */
public class CocTicketEnumDataV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_id")

    private String propId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private String bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    public CocTicketEnumDataV2 withPropId(String propId) {
        this.propId = propId;
        return this;
    }

    /**
     * 匹配属性字段
     * @return propId
     */
    public String getPropId() {
        return propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    public CocTicketEnumDataV2 withBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 字段值
     * @return bizId
     */
    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public CocTicketEnumDataV2 withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * 中文名称
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public CocTicketEnumDataV2 withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名称
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocTicketEnumDataV2 that = (CocTicketEnumDataV2) obj;
        return Objects.equals(this.propId, that.propId) && Objects.equals(this.bizId, that.bizId)
            && Objects.equals(this.nameZh, that.nameZh) && Objects.equals(this.nameEn, that.nameEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propId, bizId, nameZh, nameEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocTicketEnumDataV2 {\n");
        sb.append("    propId: ").append(toIndentedString(propId)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
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
