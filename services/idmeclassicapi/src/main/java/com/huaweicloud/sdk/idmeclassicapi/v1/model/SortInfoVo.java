package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SortInfoVo
 */
public class SortInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "characterSet")

    private CharacterSetEnum characterSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderBy")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortInfo")

    private String sortInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortInfoOrderBy")

    private String sortInfoOrderBy;

    public SortInfoVo withCharacterSet(CharacterSetEnum characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    public SortInfoVo withCharacterSet(Consumer<CharacterSetEnum> characterSetSetter) {
        if (this.characterSet == null) {
            this.characterSet = new CharacterSetEnum();
            characterSetSetter.accept(this.characterSet);
        }

        return this;
    }

    /**
     * Get characterSet
     * @return characterSet
     */
    public CharacterSetEnum getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(CharacterSetEnum characterSet) {
        this.characterSet = characterSet;
    }

    public SortInfoVo withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 按某个字段进行排序。
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public SortInfoVo withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序方向。 - ASC：表示升序。 - DESC：表示降序。
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public SortInfoVo withSortInfo(String sortInfo) {
        this.sortInfo = sortInfo;
        return this;
    }

    /**
     * 排序信息。
     * @return sortInfo
     */
    public String getSortInfo() {
        return sortInfo;
    }

    public void setSortInfo(String sortInfo) {
        this.sortInfo = sortInfo;
    }

    public SortInfoVo withSortInfoOrderBy(String sortInfoOrderBy) {
        this.sortInfoOrderBy = sortInfoOrderBy;
        return this;
    }

    /**
     * 排序信息字段。
     * @return sortInfoOrderBy
     */
    public String getSortInfoOrderBy() {
        return sortInfoOrderBy;
    }

    public void setSortInfoOrderBy(String sortInfoOrderBy) {
        this.sortInfoOrderBy = sortInfoOrderBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SortInfoVo that = (SortInfoVo) obj;
        return Objects.equals(this.characterSet, that.characterSet) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.sortInfo, that.sortInfo)
            && Objects.equals(this.sortInfoOrderBy, that.sortInfoOrderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterSet, orderBy, sort, sortInfo, sortInfoOrderBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SortInfoVo {\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    sortInfo: ").append(toIndentedString(sortInfo)).append("\n");
        sb.append("    sortInfoOrderBy: ").append(toIndentedString(sortInfoOrderBy)).append("\n");
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
