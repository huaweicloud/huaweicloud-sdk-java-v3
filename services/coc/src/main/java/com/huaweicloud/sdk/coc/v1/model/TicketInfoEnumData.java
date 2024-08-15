package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单据枚举
 */
public class TicketInfoEnumData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filed_key")

    private String filedKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_key")

    private String enumKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    public TicketInfoEnumData withFiledKey(String filedKey) {
        this.filedKey = filedKey;
        return this;
    }

    /**
     * 字段KEY 标识哪个字段
     * @return filedKey
     */
    public String getFiledKey() {
        return filedKey;
    }

    public void setFiledKey(String filedKey) {
        this.filedKey = filedKey;
    }

    public TicketInfoEnumData withEnumKey(String enumKey) {
        this.enumKey = enumKey;
        return this;
    }

    /**
     * 枚举KEY
     * @return enumKey
     */
    public String getEnumKey() {
        return enumKey;
    }

    public void setEnumKey(String enumKey) {
        this.enumKey = enumKey;
    }

    public TicketInfoEnumData withNameZh(String nameZh) {
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

    public TicketInfoEnumData withNameEn(String nameEn) {
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
        TicketInfoEnumData that = (TicketInfoEnumData) obj;
        return Objects.equals(this.filedKey, that.filedKey) && Objects.equals(this.enumKey, that.enumKey)
            && Objects.equals(this.nameZh, that.nameZh) && Objects.equals(this.nameEn, that.nameEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filedKey, enumKey, nameZh, nameEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicketInfoEnumData {\n");
        sb.append("    filedKey: ").append(toIndentedString(filedKey)).append("\n");
        sb.append("    enumKey: ").append(toIndentedString(enumKey)).append("\n");
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
