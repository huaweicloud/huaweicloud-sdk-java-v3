package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListApplicationViewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    private String nameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_list")

    private List<String> codeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_collection")

    private Boolean isCollection;

    public ListApplicationViewRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * **参数解释：** 名称模糊匹配，支持模糊查询。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListApplicationViewRequest withCodeList(List<String> codeList) {
        this.codeList = codeList;
        return this;
    }

    public ListApplicationViewRequest addCodeListItem(String codeListItem) {
        if (this.codeList == null) {
            this.codeList = new ArrayList<>();
        }
        this.codeList.add(codeListItem);
        return this;
    }

    public ListApplicationViewRequest withCodeList(Consumer<List<String>> codeListSetter) {
        if (this.codeList == null) {
            this.codeList = new ArrayList<>();
        }
        codeListSetter.accept(this.codeList);
        return this;
    }

    /**
     * **参数解释：** 应用、组件、分组code组成。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return codeList
     */
    public List<String> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public ListApplicationViewRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释：** 分页参数，上一页请求最后一个id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListApplicationViewRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 分页查询每页显示的条目数量。 **约束限制：** 不涉及。 **取值范围：** 自定义，在1-500范围。 **默认取值：** 不涉及。
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListApplicationViewRequest withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * **参数解释：** 分页页码。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ListApplicationViewRequest withIsCollection(Boolean isCollection) {
        this.isCollection = isCollection;
        return this;
    }

    /**
     * **参数解释：** 是否收藏。 **约束限制：** 不涉及。 **取值范围：** - true：在我的收藏去查询应用、组件、分组，默认为true。 - false：在全部应用中查询应用、组件、分组，可以不传。 **默认取值：** 默认未收藏。
     * @return isCollection
     */
    public Boolean getIsCollection() {
        return isCollection;
    }

    public void setIsCollection(Boolean isCollection) {
        this.isCollection = isCollection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplicationViewRequest that = (ListApplicationViewRequest) obj;
        return Objects.equals(this.nameLike, that.nameLike) && Objects.equals(this.codeList, that.codeList)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.isCollection, that.isCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameLike, codeList, marker, limit, pageNo, isCollection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationViewRequest {\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    codeList: ").append(toIndentedString(codeList)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    isCollection: ").append(toIndentedString(isCollection)).append("\n");
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
