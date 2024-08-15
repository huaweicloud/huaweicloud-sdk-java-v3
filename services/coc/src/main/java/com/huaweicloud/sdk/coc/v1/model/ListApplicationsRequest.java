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
public class ListApplicationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_list")

    private List<String> idList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    private String nameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListApplicationsRequest withIdList(List<String> idList) {
        this.idList = idList;
        return this;
    }

    public ListApplicationsRequest addIdListItem(String idListItem) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        this.idList.add(idListItem);
        return this;
    }

    public ListApplicationsRequest withIdList(Consumer<List<String>> idListSetter) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        idListSetter.accept(this.idList);
        return this;
    }

    /**
     * id列表
     * @return idList
     */
    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public ListApplicationsRequest withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * parent id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ListApplicationsRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * 应用名称模糊匹配
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListApplicationsRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 应用code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListApplicationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，上一页请求最后一个id
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListApplicationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplicationsRequest that = (ListApplicationsRequest) obj;
        return Objects.equals(this.idList, that.idList) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.nameLike, that.nameLike) && Objects.equals(this.code, that.code)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idList, parentId, nameLike, code, marker, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationsRequest {\n");
        sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
