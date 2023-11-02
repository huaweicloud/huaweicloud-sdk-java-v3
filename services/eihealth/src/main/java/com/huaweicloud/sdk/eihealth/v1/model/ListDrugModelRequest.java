package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListDrugModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_key")

    private String searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_list")

    private List<String> creatorList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_list")

    private List<String> typeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<String> statusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private Long createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private Long createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_start_time")

    private Long finishStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_end_time")

    private Long finishEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListDrugModelRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 模糊搜索值
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public ListDrugModelRequest withCreatorList(List<String> creatorList) {
        this.creatorList = creatorList;
        return this;
    }

    public ListDrugModelRequest addCreatorListItem(String creatorListItem) {
        if (this.creatorList == null) {
            this.creatorList = new ArrayList<>();
        }
        this.creatorList.add(creatorListItem);
        return this;
    }

    public ListDrugModelRequest withCreatorList(Consumer<List<String>> creatorListSetter) {
        if (this.creatorList == null) {
            this.creatorList = new ArrayList<>();
        }
        creatorListSetter.accept(this.creatorList);
        return this;
    }

    /**
     * 创建者列表
     * @return creatorList
     */
    public List<String> getCreatorList() {
        return creatorList;
    }

    public void setCreatorList(List<String> creatorList) {
        this.creatorList = creatorList;
    }

    public ListDrugModelRequest withTypeList(List<String> typeList) {
        this.typeList = typeList;
        return this;
    }

    public ListDrugModelRequest addTypeListItem(String typeListItem) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        this.typeList.add(typeListItem);
        return this;
    }

    public ListDrugModelRequest withTypeList(Consumer<List<String>> typeListSetter) {
        if (this.typeList == null) {
            this.typeList = new ArrayList<>();
        }
        typeListSetter.accept(this.typeList);
        return this;
    }

    /**
     * 模型类型列表
     * @return typeList
     */
    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public ListDrugModelRequest withStatusList(List<String> statusList) {
        this.statusList = statusList;
        return this;
    }

    public ListDrugModelRequest addStatusListItem(String statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public ListDrugModelRequest withStatusList(Consumer<List<String>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 模型状态列表
     * @return statusList
     */
    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public ListDrugModelRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序规则 目前默认时间降序，支持根据create_time|finish_time
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListDrugModelRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则 目前默认时间降序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListDrugModelRequest withCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }

    /**
     * 最小创建时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return createStartTime
     */
    public Long getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
    }

    public ListDrugModelRequest withCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }

    /**
     * 最大创建时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return createEndTime
     */
    public Long getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
    }

    public ListDrugModelRequest withFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
        return this;
    }

    /**
     * 最小结束时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishStartTime
     */
    public Long getFinishStartTime() {
        return finishStartTime;
    }

    public void setFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
    }

    public ListDrugModelRequest withFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
        return this;
    }

    /**
     * 最大结束时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishEndTime
     */
    public Long getFinishEndTime() {
        return finishEndTime;
    }

    public void setFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
    }

    public ListDrugModelRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制量，单次查询总量，必须由数字组成，默认为100，取值范围[1,1000]
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDrugModelRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，查询起始偏移，必须由数字组成，默认为0，取值范围[0,100000000]
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDrugModelRequest that = (ListDrugModelRequest) obj;
        return Objects.equals(this.searchKey, that.searchKey) && Objects.equals(this.creatorList, that.creatorList)
            && Objects.equals(this.typeList, that.typeList) && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.createStartTime, that.createStartTime)
            && Objects.equals(this.createEndTime, that.createEndTime)
            && Objects.equals(this.finishStartTime, that.finishStartTime)
            && Objects.equals(this.finishEndTime, that.finishEndTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchKey,
            creatorList,
            typeList,
            statusList,
            sortKey,
            sortDir,
            createStartTime,
            createEndTime,
            finishStartTime,
            finishEndTime,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDrugModelRequest {\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    creatorList: ").append(toIndentedString(creatorList)).append("\n");
        sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
        sb.append("    finishStartTime: ").append(toIndentedString(finishStartTime)).append("\n");
        sb.append("    finishEndTime: ").append(toIndentedString(finishEndTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
