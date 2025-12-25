package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 批量编辑目录pojo
 */
public class CatalogueBatchPojo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_display")

    private Boolean isDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_alias_zh")

    private String secondAliasZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_alias_en")

    private String secondAliasEn;

    public CatalogueBatchPojo withIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
        return this;
    }

    /**
     * 是否显示
     * @return isDisplay
     */
    public Boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    public CatalogueBatchPojo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 目录编码
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CatalogueBatchPojo withSecondAliasZh(String secondAliasZh) {
        this.secondAliasZh = secondAliasZh;
        return this;
    }

    /**
     * 二级目录中文别名
     * @return secondAliasZh
     */
    public String getSecondAliasZh() {
        return secondAliasZh;
    }

    public void setSecondAliasZh(String secondAliasZh) {
        this.secondAliasZh = secondAliasZh;
    }

    public CatalogueBatchPojo withSecondAliasEn(String secondAliasEn) {
        this.secondAliasEn = secondAliasEn;
        return this;
    }

    /**
     * 二级目录中文别名
     * @return secondAliasEn
     */
    public String getSecondAliasEn() {
        return secondAliasEn;
    }

    public void setSecondAliasEn(String secondAliasEn) {
        this.secondAliasEn = secondAliasEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatalogueBatchPojo that = (CatalogueBatchPojo) obj;
        return Objects.equals(this.isDisplay, that.isDisplay) && Objects.equals(this.id, that.id)
            && Objects.equals(this.secondAliasZh, that.secondAliasZh)
            && Objects.equals(this.secondAliasEn, that.secondAliasEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDisplay, id, secondAliasZh, secondAliasEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogueBatchPojo {\n");
        sb.append("    isDisplay: ").append(toIndentedString(isDisplay)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    secondAliasZh: ").append(toIndentedString(secondAliasZh)).append("\n");
        sb.append("    secondAliasEn: ").append(toIndentedString(secondAliasEn)).append("\n");
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
