package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 枚举类型信息
 */
public class WarRoomEnumeration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public WarRoomEnumeration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 枚举值id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WarRoomEnumeration withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * 枚举值中文名
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public WarRoomEnumeration withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 枚举值英文名
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public WarRoomEnumeration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 枚举类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WarRoomEnumeration that = (WarRoomEnumeration) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.nameZh, that.nameZh)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameZh, nameEn, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarRoomEnumeration {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
