package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryCouponQuotasReqExt
 */
public class QueryCouponQuotasReqExt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_ids")

    private List<String> quotaIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_status_list")

    private List<Integer> quotaStatusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_type")

    private Integer quotaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_begin")

    private String createTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_end")

    private String createTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time_begin")

    private String effectiveTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time_end")

    private String effectiveTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time_begin")

    private String expireTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time_end")

    private String expireTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public QueryCouponQuotasReqExt withQuotaIds(List<String> quotaIds) {
        this.quotaIds = quotaIds;
        return this;
    }

    public QueryCouponQuotasReqExt addQuotaIdsItem(String quotaIdsItem) {
        if (this.quotaIds == null) {
            this.quotaIds = new ArrayList<>();
        }
        this.quotaIds.add(quotaIdsItem);
        return this;
    }

    public QueryCouponQuotasReqExt withQuotaIds(Consumer<List<String>> quotaIdsSetter) {
        if (this.quotaIds == null) {
            this.quotaIds = new ArrayList<>();
        }
        quotaIdsSetter.accept(this.quotaIds);
        return this;
    }

    /**
     * 优惠券额度ID列表。 此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件。
     * @return quotaIds
     */
    public List<String> getQuotaIds() {
        return quotaIds;
    }

    public void setQuotaIds(List<String> quotaIds) {
        this.quotaIds = quotaIds;
    }

    public QueryCouponQuotasReqExt withQuotaStatusList(List<Integer> quotaStatusList) {
        this.quotaStatusList = quotaStatusList;
        return this;
    }

    public QueryCouponQuotasReqExt addQuotaStatusListItem(Integer quotaStatusListItem) {
        if (this.quotaStatusList == null) {
            this.quotaStatusList = new ArrayList<>();
        }
        this.quotaStatusList.add(quotaStatusListItem);
        return this;
    }

    public QueryCouponQuotasReqExt withQuotaStatusList(Consumer<List<Integer>> quotaStatusListSetter) {
        if (this.quotaStatusList == null) {
            this.quotaStatusList = new ArrayList<>();
        }
        quotaStatusListSetter.accept(this.quotaStatusList);
        return this;
    }

    /**
     * 优惠券额度状态列表。 0：正常3：失效（过期失效和人工设置失效）4：额度调整中（伙伴可以查看该额度，但不能使用该额度发放优惠券）5：冻结 此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件。
     * @return quotaStatusList
     */
    public List<Integer> getQuotaStatusList() {
        return quotaStatusList;
    }

    public void setQuotaStatusList(List<Integer> quotaStatusList) {
        this.quotaStatusList = quotaStatusList;
    }

    public QueryCouponQuotasReqExt withQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    /**
     * 优惠券额度的类型。 0：代金券额度1：现金券额度 此参数不携带或携带值为null时，默认值为“0：代金券额度”。
     * minimum: 0
     * maximum: 1
     * @return quotaType
     */
    public Integer getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
    }

    public QueryCouponQuotasReqExt withCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }

    /**
     * 创建时间（开始）。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。 输入这个条件，会查询出创建时间大于这个时间的记录。 此参数不携带或携带值为null时，不作为筛选条件。
     * @return createTimeBegin
     */
    public String getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public QueryCouponQuotasReqExt withCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    /**
     * 创建时间（结束）。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。 输入这个条件，会查询出创建时间小于这个时间的记录。 此参数不携带或携带值为null时，不作为筛选条件。
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public QueryCouponQuotasReqExt withEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
        return this;
    }

    /**
     * 生效时间（开始）。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。 输入这个条件，会查询出生效时间大于这个时间的记录。 此参数不携带或携带值为null时，不作为筛选条件。
     * @return effectiveTimeBegin
     */
    public String getEffectiveTimeBegin() {
        return effectiveTimeBegin;
    }

    public void setEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
    }

    public QueryCouponQuotasReqExt withEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
        return this;
    }

    /**
     * 生效时间（结束）。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。 输入这个条件，会查询出生效时间小于这个时间的记录。
     * @return effectiveTimeEnd
     */
    public String getEffectiveTimeEnd() {
        return effectiveTimeEnd;
    }

    public void setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }

    public QueryCouponQuotasReqExt withExpireTimeBegin(String expireTimeBegin) {
        this.expireTimeBegin = expireTimeBegin;
        return this;
    }

    /**
     * 失效时间（开始）。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。 输入这个条件，会查询出失效时间大于这个时间的记录。 此参数不携带或携带值为null时，不作为筛选条件。
     * @return expireTimeBegin
     */
    public String getExpireTimeBegin() {
        return expireTimeBegin;
    }

    public void setExpireTimeBegin(String expireTimeBegin) {
        this.expireTimeBegin = expireTimeBegin;
    }

    public QueryCouponQuotasReqExt withExpireTimeEnd(String expireTimeEnd) {
        this.expireTimeEnd = expireTimeEnd;
        return this;
    }

    /**
     * 失效时间（结束）。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。 输入这个条件，会查询出失效时间小于这个时间的记录。 此参数不携带或携带值为null时，不作为筛选条件。
     * @return expireTimeEnd
     */
    public String getExpireTimeEnd() {
        return expireTimeEnd;
    }

    public void setExpireTimeEnd(String expireTimeEnd) {
        this.expireTimeEnd = expireTimeEnd;
    }

    public QueryCouponQuotasReqExt withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。默认值为0。  说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。 例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QueryCouponQuotasReqExt withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询记录数。默认值为10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QueryCouponQuotasReqExt withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商（二级经销商）ID。 华为云总经销商（一级经销商）查询云经销商的优惠券额度时，需要携带该参数；否则只能查询自己的优惠券额度。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCouponQuotasReqExt queryCouponQuotasReqExt = (QueryCouponQuotasReqExt) o;
        return Objects.equals(this.quotaIds, queryCouponQuotasReqExt.quotaIds)
            && Objects.equals(this.quotaStatusList, queryCouponQuotasReqExt.quotaStatusList)
            && Objects.equals(this.quotaType, queryCouponQuotasReqExt.quotaType)
            && Objects.equals(this.createTimeBegin, queryCouponQuotasReqExt.createTimeBegin)
            && Objects.equals(this.createTimeEnd, queryCouponQuotasReqExt.createTimeEnd)
            && Objects.equals(this.effectiveTimeBegin, queryCouponQuotasReqExt.effectiveTimeBegin)
            && Objects.equals(this.effectiveTimeEnd, queryCouponQuotasReqExt.effectiveTimeEnd)
            && Objects.equals(this.expireTimeBegin, queryCouponQuotasReqExt.expireTimeBegin)
            && Objects.equals(this.expireTimeEnd, queryCouponQuotasReqExt.expireTimeEnd)
            && Objects.equals(this.offset, queryCouponQuotasReqExt.offset)
            && Objects.equals(this.limit, queryCouponQuotasReqExt.limit)
            && Objects.equals(this.indirectPartnerId, queryCouponQuotasReqExt.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaIds,
            quotaStatusList,
            quotaType,
            createTimeBegin,
            createTimeEnd,
            effectiveTimeBegin,
            effectiveTimeEnd,
            expireTimeBegin,
            expireTimeEnd,
            offset,
            limit,
            indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCouponQuotasReqExt {\n");
        sb.append("    quotaIds: ").append(toIndentedString(quotaIds)).append("\n");
        sb.append("    quotaStatusList: ").append(toIndentedString(quotaStatusList)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    createTimeBegin: ").append(toIndentedString(createTimeBegin)).append("\n");
        sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
        sb.append("    effectiveTimeBegin: ").append(toIndentedString(effectiveTimeBegin)).append("\n");
        sb.append("    effectiveTimeEnd: ").append(toIndentedString(effectiveTimeEnd)).append("\n");
        sb.append("    expireTimeBegin: ").append(toIndentedString(expireTimeBegin)).append("\n");
        sb.append("    expireTimeEnd: ").append(toIndentedString(expireTimeEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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
