package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBusinessDiscountInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commerce_id")

    private String commerceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commerce_code")

    private String commerceCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_quoting_items")

    private List<ProductQuotingItem> productQuotingItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_quoting_items")

    private List<CategoryQuotingItem> categoryQuotingItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_quoting_item_steps")

    private List<CategoryQuotingItemStep> categoryQuotingItemSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accumulation_cycle_type")

    private String accumulationCycleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sites")

    private List<SiteInfo> sites = null;

    public ListBusinessDiscountInfoResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总条数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListBusinessDiscountInfoResponse withCommerceId(String commerceId) {
        this.commerceId = commerceId;
        return this;
    }

    /**
     * 商务ID
     * @return commerceId
     */
    public String getCommerceId() {
        return commerceId;
    }

    public void setCommerceId(String commerceId) {
        this.commerceId = commerceId;
    }

    public ListBusinessDiscountInfoResponse withCommerceCode(String commerceCode) {
        this.commerceCode = commerceCode;
        return this;
    }

    /**
     * 商务编号
     * @return commerceCode
     */
    public String getCommerceCode() {
        return commerceCode;
    }

    public void setCommerceCode(String commerceCode) {
        this.commerceCode = commerceCode;
    }

    public ListBusinessDiscountInfoResponse withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 商务生效时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public ListBusinessDiscountInfoResponse withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 商务失效时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ListBusinessDiscountInfoResponse withProductQuotingItems(List<ProductQuotingItem> productQuotingItems) {
        this.productQuotingItems = productQuotingItems;
        return this;
    }

    public ListBusinessDiscountInfoResponse addProductQuotingItemsItem(ProductQuotingItem productQuotingItemsItem) {
        if (this.productQuotingItems == null) {
            this.productQuotingItems = new ArrayList<>();
        }
        this.productQuotingItems.add(productQuotingItemsItem);
        return this;
    }

    public ListBusinessDiscountInfoResponse withProductQuotingItems(
        Consumer<List<ProductQuotingItem>> productQuotingItemsSetter) {
        if (this.productQuotingItems == null) {
            this.productQuotingItems = new ArrayList<>();
        }
        productQuotingItemsSetter.accept(this.productQuotingItems);
        return this;
    }

    /**
     * 产品报价项列表（quoting_item_type=PRODUCT_ITEM时有值返回，否则返回空列表）
     * @return productQuotingItems
     */
    public List<ProductQuotingItem> getProductQuotingItems() {
        return productQuotingItems;
    }

    public void setProductQuotingItems(List<ProductQuotingItem> productQuotingItems) {
        this.productQuotingItems = productQuotingItems;
    }

    public ListBusinessDiscountInfoResponse withCategoryQuotingItems(List<CategoryQuotingItem> categoryQuotingItems) {
        this.categoryQuotingItems = categoryQuotingItems;
        return this;
    }

    public ListBusinessDiscountInfoResponse addCategoryQuotingItemsItem(CategoryQuotingItem categoryQuotingItemsItem) {
        if (this.categoryQuotingItems == null) {
            this.categoryQuotingItems = new ArrayList<>();
        }
        this.categoryQuotingItems.add(categoryQuotingItemsItem);
        return this;
    }

    public ListBusinessDiscountInfoResponse withCategoryQuotingItems(
        Consumer<List<CategoryQuotingItem>> categoryQuotingItemsSetter) {
        if (this.categoryQuotingItems == null) {
            this.categoryQuotingItems = new ArrayList<>();
        }
        categoryQuotingItemsSetter.accept(this.categoryQuotingItems);
        return this;
    }

    /**
     * 分类报价项列表（quoting_item_type=CATEGORY_ITEM时有值返回，否则返回空列表）
     * @return categoryQuotingItems
     */
    public List<CategoryQuotingItem> getCategoryQuotingItems() {
        return categoryQuotingItems;
    }

    public void setCategoryQuotingItems(List<CategoryQuotingItem> categoryQuotingItems) {
        this.categoryQuotingItems = categoryQuotingItems;
    }

    public ListBusinessDiscountInfoResponse withCategoryQuotingItemSteps(
        List<CategoryQuotingItemStep> categoryQuotingItemSteps) {
        this.categoryQuotingItemSteps = categoryQuotingItemSteps;
        return this;
    }

    public ListBusinessDiscountInfoResponse addCategoryQuotingItemStepsItem(
        CategoryQuotingItemStep categoryQuotingItemStepsItem) {
        if (this.categoryQuotingItemSteps == null) {
            this.categoryQuotingItemSteps = new ArrayList<>();
        }
        this.categoryQuotingItemSteps.add(categoryQuotingItemStepsItem);
        return this;
    }

    public ListBusinessDiscountInfoResponse withCategoryQuotingItemSteps(
        Consumer<List<CategoryQuotingItemStep>> categoryQuotingItemStepsSetter) {
        if (this.categoryQuotingItemSteps == null) {
            this.categoryQuotingItemSteps = new ArrayList<>();
        }
        categoryQuotingItemStepsSetter.accept(this.categoryQuotingItemSteps);
        return this;
    }

    /**
     * 分类报价项阶梯列表（quoting_item_type=CATEGORY_ITEM时有值返回，否则返回空列表）
     * @return categoryQuotingItemSteps
     */
    public List<CategoryQuotingItemStep> getCategoryQuotingItemSteps() {
        return categoryQuotingItemSteps;
    }

    public void setCategoryQuotingItemSteps(List<CategoryQuotingItemStep> categoryQuotingItemSteps) {
        this.categoryQuotingItemSteps = categoryQuotingItemSteps;
    }

    public ListBusinessDiscountInfoResponse withAccumulationCycleType(String accumulationCycleType) {
        this.accumulationCycleType = accumulationCycleType;
        return this;
    }

    /**
     * 阶梯累计周期类型，category_quoting_item_steps有值返回时返回
     * @return accumulationCycleType
     */
    public String getAccumulationCycleType() {
        return accumulationCycleType;
    }

    public void setAccumulationCycleType(String accumulationCycleType) {
        this.accumulationCycleType = accumulationCycleType;
    }

    public ListBusinessDiscountInfoResponse withSites(List<SiteInfo> sites) {
        this.sites = sites;
        return this;
    }

    public ListBusinessDiscountInfoResponse addSitesItem(SiteInfo sitesItem) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        this.sites.add(sitesItem);
        return this;
    }

    public ListBusinessDiscountInfoResponse withSites(Consumer<List<SiteInfo>> sitesSetter) {
        if (this.sites == null) {
            this.sites = new ArrayList<>();
        }
        sitesSetter.accept(this.sites);
        return this;
    }

    /**
     * 运营站点列表
     * @return sites
     */
    public List<SiteInfo> getSites() {
        return sites;
    }

    public void setSites(List<SiteInfo> sites) {
        this.sites = sites;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBusinessDiscountInfoResponse that = (ListBusinessDiscountInfoResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.commerceId, that.commerceId)
            && Objects.equals(this.commerceCode, that.commerceCode)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.productQuotingItems, that.productQuotingItems)
            && Objects.equals(this.categoryQuotingItems, that.categoryQuotingItems)
            && Objects.equals(this.categoryQuotingItemSteps, that.categoryQuotingItemSteps)
            && Objects.equals(this.accumulationCycleType, that.accumulationCycleType)
            && Objects.equals(this.sites, that.sites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount,
            commerceId,
            commerceCode,
            effectiveTime,
            expireTime,
            productQuotingItems,
            categoryQuotingItems,
            categoryQuotingItemSteps,
            accumulationCycleType,
            sites);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBusinessDiscountInfoResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    commerceId: ").append(toIndentedString(commerceId)).append("\n");
        sb.append("    commerceCode: ").append(toIndentedString(commerceCode)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    productQuotingItems: ").append(toIndentedString(productQuotingItems)).append("\n");
        sb.append("    categoryQuotingItems: ").append(toIndentedString(categoryQuotingItems)).append("\n");
        sb.append("    categoryQuotingItemSteps: ").append(toIndentedString(categoryQuotingItemSteps)).append("\n");
        sb.append("    accumulationCycleType: ").append(toIndentedString(accumulationCycleType)).append("\n");
        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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
