package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 按需订阅请求体
 */
public class PostPaidParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<TagInfo> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_list")

    private List<ProductPostPaid> productList = null;

    /**
     * 操作类型：create新购, addition增加配额
     */
    public static final class OperateTypeEnum {

        /**
         * Enum CREATE for value: "create"
         */
        public static final OperateTypeEnum CREATE = new OperateTypeEnum("create");

        /**
         * Enum ADDITION for value: "addition"
         */
        public static final OperateTypeEnum ADDITION = new OperateTypeEnum("addition");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("create", CREATE);
            map.put("addition", ADDITION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateTypeEnum(value));
        }

        public static OperateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private OperateTypeEnum operateType;

    public PostPaidParam withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID，如cn-north-4
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public PostPaidParam withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public PostPaidParam withTagList(List<TagInfo> tagList) {
        this.tagList = tagList;
        return this;
    }

    public PostPaidParam addTagListItem(TagInfo tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public PostPaidParam withTagList(Consumer<List<TagInfo>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * 计费标签
     * @return tagList
     */
    public List<TagInfo> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagInfo> tagList) {
        this.tagList = tagList;
    }

    public PostPaidParam withProductList(List<ProductPostPaid> productList) {
        this.productList = productList;
        return this;
    }

    public PostPaidParam addProductListItem(ProductPostPaid productListItem) {
        if (this.productList == null) {
            this.productList = new ArrayList<>();
        }
        this.productList.add(productListItem);
        return this;
    }

    public PostPaidParam withProductList(Consumer<List<ProductPostPaid>> productListSetter) {
        if (this.productList == null) {
            this.productList = new ArrayList<>();
        }
        productListSetter.accept(this.productList);
        return this;
    }

    /**
     * 商品列表
     * @return productList
     */
    public List<ProductPostPaid> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductPostPaid> productList) {
        this.productList = productList;
    }

    public PostPaidParam withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型：create新购, addition增加配额
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostPaidParam that = (PostPaidParam) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.tagList, that.tagList) && Objects.equals(this.productList, that.productList)
            && Objects.equals(this.operateType, that.operateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, domainId, tagList, productList, operateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidParam {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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
