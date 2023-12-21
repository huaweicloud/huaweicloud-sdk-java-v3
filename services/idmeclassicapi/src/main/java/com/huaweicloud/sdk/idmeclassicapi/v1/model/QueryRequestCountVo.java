package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryRequestCountVo
 */
public class QueryRequestCountVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "characterSet")

    private CharacterSetEnum characterSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<QueryCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decrypt")

    private Boolean decrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entityType")

    private String entityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private QueryCondition filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isNeedTotal")

    private Boolean isNeedTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isPresentAll")

    private Boolean isPresentAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxCount")

    private Integer maxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needPresentDetail")

    private List<String> needPresentDetail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderBy")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderByTableAlias")

    private String orderByTableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicData")

    private String publicData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sorts")

    private List<SortInfoVo> sorts = null;

    public QueryRequestCountVo withCharacterSet(CharacterSetEnum characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    public QueryRequestCountVo withCharacterSet(Consumer<CharacterSetEnum> characterSetSetter) {
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

    public QueryRequestCountVo withConditions(List<QueryCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public QueryRequestCountVo addConditionsItem(QueryCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public QueryRequestCountVo withConditions(Consumer<List<QueryCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 查询条件。
     * @return conditions
     */
    public List<QueryCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<QueryCondition> conditions) {
        this.conditions = conditions;
    }

    public QueryRequestCountVo withDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
        return this;
    }

    /**
     * 是否加密。 - true：加密。 - false：不加密。
     * @return decrypt
     */
    public Boolean getDecrypt() {
        return decrypt;
    }

    public void setDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
    }

    public QueryRequestCountVo withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 实体类型。
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public QueryRequestCountVo withFilter(QueryCondition filter) {
        this.filter = filter;
        return this;
    }

    public QueryRequestCountVo withFilter(Consumer<QueryCondition> filterSetter) {
        if (this.filter == null) {
            this.filter = new QueryCondition();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public QueryCondition getFilter() {
        return filter;
    }

    public void setFilter(QueryCondition filter) {
        this.filter = filter;
    }

    public QueryRequestCountVo withIsNeedTotal(Boolean isNeedTotal) {
        this.isNeedTotal = isNeedTotal;
        return this;
    }

    /**
     * 是否需要查询总记录数。 - true：需要。 - false：不需要。
     * @return isNeedTotal
     */
    public Boolean getIsNeedTotal() {
        return isNeedTotal;
    }

    public void setIsNeedTotal(Boolean isNeedTotal) {
        this.isNeedTotal = isNeedTotal;
    }

    public QueryRequestCountVo withIsPresentAll(Boolean isPresentAll) {
        this.isPresentAll = isPresentAll;
        return this;
    }

    /**
     * 是否需要展示所有参考对象信息。 - true：需要。 - false：不需要。
     * @return isPresentAll
     */
    public Boolean getIsPresentAll() {
        return isPresentAll;
    }

    public void setIsPresentAll(Boolean isPresentAll) {
        this.isPresentAll = isPresentAll;
    }

    public QueryRequestCountVo withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * 指定数量上限，如果超过统计总数超过上限则返回上限。
     * @return maxCount
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public QueryRequestCountVo withNeedPresentDetail(List<String> needPresentDetail) {
        this.needPresentDetail = needPresentDetail;
        return this;
    }

    public QueryRequestCountVo addNeedPresentDetailItem(String needPresentDetailItem) {
        if (this.needPresentDetail == null) {
            this.needPresentDetail = new ArrayList<>();
        }
        this.needPresentDetail.add(needPresentDetailItem);
        return this;
    }

    public QueryRequestCountVo withNeedPresentDetail(Consumer<List<String>> needPresentDetailSetter) {
        if (this.needPresentDetail == null) {
            this.needPresentDetail = new ArrayList<>();
        }
        needPresentDetailSetter.accept(this.needPresentDetail);
        return this;
    }

    /**
     * 需要展示详细信息的参考对象。
     * @return needPresentDetail
     */
    public List<String> getNeedPresentDetail() {
        return needPresentDetail;
    }

    public void setNeedPresentDetail(List<String> needPresentDetail) {
        this.needPresentDetail = needPresentDetail;
    }

    public QueryRequestCountVo withOrderBy(String orderBy) {
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

    public QueryRequestCountVo withOrderByTableAlias(String orderByTableAlias) {
        this.orderByTableAlias = orderByTableAlias;
        return this;
    }

    /**
     * 排序字段的表别名。
     * @return orderByTableAlias
     */
    public String getOrderByTableAlias() {
        return orderByTableAlias;
    }

    public void setOrderByTableAlias(String orderByTableAlias) {
        this.orderByTableAlias = orderByTableAlias;
    }

    public QueryRequestCountVo withPublicData(String publicData) {
        this.publicData = publicData;
        return this;
    }

    /**
     * 多租查询参数。 - EXCLUDE_PUBLIC_DATA：不包括公共数据。 - INCLUDE_PUBLIC_DATA：包括公共数据。 - ONLY_NEED_PUBLIC_DATA：只有公共数据。
     * @return publicData
     */
    public String getPublicData() {
        return publicData;
    }

    public void setPublicData(String publicData) {
        this.publicData = publicData;
    }

    public QueryRequestCountVo withSort(String sort) {
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

    public QueryRequestCountVo withSorts(List<SortInfoVo> sorts) {
        this.sorts = sorts;
        return this;
    }

    public QueryRequestCountVo addSortsItem(SortInfoVo sortsItem) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        this.sorts.add(sortsItem);
        return this;
    }

    public QueryRequestCountVo withSorts(Consumer<List<SortInfoVo>> sortsSetter) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        sortsSetter.accept(this.sorts);
        return this;
    }

    /**
     * 排序。
     * @return sorts
     */
    public List<SortInfoVo> getSorts() {
        return sorts;
    }

    public void setSorts(List<SortInfoVo> sorts) {
        this.sorts = sorts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryRequestCountVo that = (QueryRequestCountVo) obj;
        return Objects.equals(this.characterSet, that.characterSet) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.decrypt, that.decrypt) && Objects.equals(this.entityType, that.entityType)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.isNeedTotal, that.isNeedTotal)
            && Objects.equals(this.isPresentAll, that.isPresentAll) && Objects.equals(this.maxCount, that.maxCount)
            && Objects.equals(this.needPresentDetail, that.needPresentDetail)
            && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.orderByTableAlias, that.orderByTableAlias)
            && Objects.equals(this.publicData, that.publicData) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.sorts, that.sorts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterSet,
            conditions,
            decrypt,
            entityType,
            filter,
            isNeedTotal,
            isPresentAll,
            maxCount,
            needPresentDetail,
            orderBy,
            orderByTableAlias,
            publicData,
            sort,
            sorts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRequestCountVo {\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    decrypt: ").append(toIndentedString(decrypt)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    isNeedTotal: ").append(toIndentedString(isNeedTotal)).append("\n");
        sb.append("    isPresentAll: ").append(toIndentedString(isPresentAll)).append("\n");
        sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
        sb.append("    needPresentDetail: ").append(toIndentedString(needPresentDetail)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    orderByTableAlias: ").append(toIndentedString(orderByTableAlias)).append("\n");
        sb.append("    publicData: ").append(toIndentedString(publicData)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
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
