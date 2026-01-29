package com.huaweicloud.sdk.secmaster.v1.model;

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
 * 云脑订单更新接口，包括包周期、按需场景，关联的变更场景
 */
public class UpdateOrderInfoReq {

    /**
     * 操作场景，包周期场景：PREPAID 或者 按需场景：POSTPAID
     */
    public static final class SceneEnum {

        /**
         * Enum PREPAID for value: "PREPAID"
         */
        public static final SceneEnum PREPAID = new SceneEnum("PREPAID");

        /**
         * Enum POSTPAID for value: "POSTPAID"
         */
        public static final SceneEnum POSTPAID = new SceneEnum("POSTPAID");

        private static final Map<String, SceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SceneEnum> createStaticFields() {
            Map<String, SceneEnum> map = new HashMap<>();
            map.put("PREPAID", PREPAID);
            map.put("POSTPAID", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SceneEnum(String value) {
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
        public static SceneEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SceneEnum(value));
        }

        public static SceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SceneEnum) {
                return this.value.equals(((SceneEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private SceneEnum scene;

    /**
     * 按需或者包周期场景下，要进行的操作类型 比如增减配额，规格升降配，按需转包周期 规格升级：UPGRADE，配额增加：ADDITION，配额减少：DECREASE，按需转包周期：POSTPAID_2_PREPAID 注：目前不支持规格降级，比如不支持从专业版降级为标准版或基础版
     */
    public static final class OperateTypeEnum {

        /**
         * Enum UPGRADE for value: "UPGRADE"
         */
        public static final OperateTypeEnum UPGRADE = new OperateTypeEnum("UPGRADE");

        /**
         * Enum ADDITION for value: "ADDITION"
         */
        public static final OperateTypeEnum ADDITION = new OperateTypeEnum("ADDITION");

        /**
         * Enum DECREASE for value: "DECREASE"
         */
        public static final OperateTypeEnum DECREASE = new OperateTypeEnum("DECREASE");

        /**
         * Enum POSTPAID_2_PREPAID for value: "POSTPAID_2_PREPAID"
         */
        public static final OperateTypeEnum POSTPAID_2_PREPAID = new OperateTypeEnum("POSTPAID_2_PREPAID");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("UPGRADE", UPGRADE);
            map.put("ADDITION", ADDITION);
            map.put("DECREASE", DECREASE);
            map.put("POSTPAID_2_PREPAID", POSTPAID_2_PREPAID);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<SubscriptionTag> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_list")

    private List<UpdateProduct> productList = null;

    public UpdateOrderInfoReq withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 操作场景，包周期场景：PREPAID 或者 按需场景：POSTPAID
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    public UpdateOrderInfoReq withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 按需或者包周期场景下，要进行的操作类型 比如增减配额，规格升降配，按需转包周期 规格升级：UPGRADE，配额增加：ADDITION，配额减少：DECREASE，按需转包周期：POSTPAID_2_PREPAID 注：目前不支持规格降级，比如不支持从专业版降级为标准版或基础版
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    public UpdateOrderInfoReq withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 促销折扣信息
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public UpdateOrderInfoReq withTagList(List<SubscriptionTag> tagList) {
        this.tagList = tagList;
        return this;
    }

    public UpdateOrderInfoReq addTagListItem(SubscriptionTag tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public UpdateOrderInfoReq withTagList(Consumer<List<SubscriptionTag>> tagListSetter) {
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
    public List<SubscriptionTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<SubscriptionTag> tagList) {
        this.tagList = tagList;
    }

    public UpdateOrderInfoReq withProductList(List<UpdateProduct> productList) {
        this.productList = productList;
        return this;
    }

    public UpdateOrderInfoReq addProductListItem(UpdateProduct productListItem) {
        if (this.productList == null) {
            this.productList = new ArrayList<>();
        }
        this.productList.add(productListItem);
        return this;
    }

    public UpdateOrderInfoReq withProductList(Consumer<List<UpdateProduct>> productListSetter) {
        if (this.productList == null) {
            this.productList = new ArrayList<>();
        }
        productListSetter.accept(this.productList);
        return this;
    }

    /**
     * 要进行变更的商品列表
     * @return productList
     */
    public List<UpdateProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<UpdateProduct> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOrderInfoReq that = (UpdateOrderInfoReq) obj;
        return Objects.equals(this.scene, that.scene) && Objects.equals(this.operateType, that.operateType)
            && Objects.equals(this.promotionInfo, that.promotionInfo) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.productList, that.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, operateType, promotionInfo, tagList, productList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderInfoReq {\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
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
