package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryRequestSelectedVo
 */
public class QueryRequestSelectedVo {

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
    @JsonProperty(value = "selectedField")

    private List<SelectedField> selectedField = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sorts")

    private List<SortInfoVo> sorts = null;

    public QueryRequestSelectedVo withCharacterSet(CharacterSetEnum characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    public QueryRequestSelectedVo withCharacterSet(Consumer<CharacterSetEnum> characterSetSetter) {
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

    public QueryRequestSelectedVo withConditions(List<QueryCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public QueryRequestSelectedVo addConditionsItem(QueryCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public QueryRequestSelectedVo withConditions(Consumer<List<QueryCondition>> conditionsSetter) {
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

    public QueryRequestSelectedVo withDecrypt(Boolean decrypt) {
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

    public QueryRequestSelectedVo withEntityType(String entityType) {
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

    public QueryRequestSelectedVo withFilter(QueryCondition filter) {
        this.filter = filter;
        return this;
    }

    public QueryRequestSelectedVo withFilter(Consumer<QueryCondition> filterSetter) {
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

    public QueryRequestSelectedVo withIsNeedTotal(Boolean isNeedTotal) {
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

    public QueryRequestSelectedVo withIsPresentAll(Boolean isPresentAll) {
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

    public QueryRequestSelectedVo withNeedPresentDetail(List<String> needPresentDetail) {
        this.needPresentDetail = needPresentDetail;
        return this;
    }

    public QueryRequestSelectedVo addNeedPresentDetailItem(String needPresentDetailItem) {
        if (this.needPresentDetail == null) {
            this.needPresentDetail = new ArrayList<>();
        }
        this.needPresentDetail.add(needPresentDetailItem);
        return this;
    }

    public QueryRequestSelectedVo withNeedPresentDetail(Consumer<List<String>> needPresentDetailSetter) {
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

    public QueryRequestSelectedVo withOrderBy(String orderBy) {
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

    public QueryRequestSelectedVo withOrderByTableAlias(String orderByTableAlias) {
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

    public QueryRequestSelectedVo withPublicData(String publicData) {
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

    public QueryRequestSelectedVo withSelectedField(List<SelectedField> selectedField) {
        this.selectedField = selectedField;
        return this;
    }

    public QueryRequestSelectedVo addSelectedFieldItem(SelectedField selectedFieldItem) {
        if (this.selectedField == null) {
            this.selectedField = new ArrayList<>();
        }
        this.selectedField.add(selectedFieldItem);
        return this;
    }

    public QueryRequestSelectedVo withSelectedField(Consumer<List<SelectedField>> selectedFieldSetter) {
        if (this.selectedField == null) {
            this.selectedField = new ArrayList<>();
        }
        selectedFieldSetter.accept(this.selectedField);
        return this;
    }

    /**
     * 指定需返回的属性。
     * @return selectedField
     */
    public List<SelectedField> getSelectedField() {
        return selectedField;
    }

    public void setSelectedField(List<SelectedField> selectedField) {
        this.selectedField = selectedField;
    }

    public QueryRequestSelectedVo withSort(String sort) {
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

    public QueryRequestSelectedVo withSorts(List<SortInfoVo> sorts) {
        this.sorts = sorts;
        return this;
    }

    public QueryRequestSelectedVo addSortsItem(SortInfoVo sortsItem) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        this.sorts.add(sortsItem);
        return this;
    }

    public QueryRequestSelectedVo withSorts(Consumer<List<SortInfoVo>> sortsSetter) {
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
        QueryRequestSelectedVo that = (QueryRequestSelectedVo) obj;
        return Objects.equals(this.characterSet, that.characterSet) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.decrypt, that.decrypt) && Objects.equals(this.entityType, that.entityType)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.isNeedTotal, that.isNeedTotal)
            && Objects.equals(this.isPresentAll, that.isPresentAll)
            && Objects.equals(this.needPresentDetail, that.needPresentDetail)
            && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.orderByTableAlias, that.orderByTableAlias)
            && Objects.equals(this.publicData, that.publicData)
            && Objects.equals(this.selectedField, that.selectedField) && Objects.equals(this.sort, that.sort)
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
            needPresentDetail,
            orderBy,
            orderByTableAlias,
            publicData,
            selectedField,
            sort,
            sorts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRequestSelectedVo {\n");
        sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    decrypt: ").append(toIndentedString(decrypt)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    isNeedTotal: ").append(toIndentedString(isNeedTotal)).append("\n");
        sb.append("    isPresentAll: ").append(toIndentedString(isPresentAll)).append("\n");
        sb.append("    needPresentDetail: ").append(toIndentedString(needPresentDetail)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    orderByTableAlias: ").append(toIndentedString(orderByTableAlias)).append("\n");
        sb.append("    publicData: ").append(toIndentedString(publicData)).append("\n");
        sb.append("    selectedField: ").append(toIndentedString(selectedField)).append("\n");
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
