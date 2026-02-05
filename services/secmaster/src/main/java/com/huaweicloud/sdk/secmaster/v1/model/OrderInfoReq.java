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
 * 云脑下单接口，包括包周期、按需场景，关联的下单场景
 */
public class OrderInfoReq {

    /**
     * 场景描述，执行包年包月(PREPAID)、按需(POSTPAID)开通，或者配置资源（CONFIG）用量，缺省值：PREPAID，大小写不敏感
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

        /**
         * Enum CONFIG for value: "CONFIG"
         */
        public static final SceneEnum CONFIG = new SceneEnum("CONFIG");

        private static final Map<String, SceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SceneEnum> createStaticFields() {
            Map<String, SceneEnum> map = new HashMap<>();
            map.put("PREPAID", PREPAID);
            map.put("POSTPAID", POSTPAID);
            map.put("CONFIG", CONFIG);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    /**
     * 操作类型，比如创建场景为：CREATE、订单用量预警配置为：ALERT_CONFIG，大小写不敏感
     */
    public static final class OperateTypeEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final OperateTypeEnum CREATE = new OperateTypeEnum("CREATE");

        /**
         * Enum ALERT_CONFIG for value: "ALERT_CONFIG"
         */
        public static final OperateTypeEnum ALERT_CONFIG = new OperateTypeEnum("ALERT_CONFIG");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("ALERT_CONFIG", ALERT_CONFIG);
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
    @JsonProperty(value = "tag_list")

    private List<SubscriptionTag> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_list")

    private List<Product> productList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private OrderConfig config;

    /**
     * 当scene=PREPAID时需要填写，订阅周期类型： 2：月； 3：年；
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final PeriodTypeEnum NUMBER_2 = new PeriodTypeEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final PeriodTypeEnum NUMBER_3 = new PeriodTypeEnum(3);

        private static final Map<Integer, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PeriodTypeEnum> createStaticFields() {
            Map<Integer, PeriodTypeEnum> map = new HashMap<>();
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PeriodTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private PeriodTypeEnum periodType;

    /**
     * 订阅周期数，当scene=PREPAID时需要填写该值 取值大于0；小于等于0会报错。 当period_type=2时，其可选范围为[1, 9]，当period_type=3，其可选范围为[1, 3]
     */
    public static final class PeriodNumEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PeriodNumEnum NUMBER_1 = new PeriodNumEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final PeriodNumEnum NUMBER_2 = new PeriodNumEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final PeriodNumEnum NUMBER_3 = new PeriodNumEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final PeriodNumEnum NUMBER_4 = new PeriodNumEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final PeriodNumEnum NUMBER_5 = new PeriodNumEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final PeriodNumEnum NUMBER_6 = new PeriodNumEnum(6);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final PeriodNumEnum NUMBER_7 = new PeriodNumEnum(7);

        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final PeriodNumEnum NUMBER_8 = new PeriodNumEnum(8);

        /**
         * Enum NUMBER_9 for value: 9
         */
        public static final PeriodNumEnum NUMBER_9 = new PeriodNumEnum(9);

        private static final Map<Integer, PeriodNumEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PeriodNumEnum> createStaticFields() {
            Map<Integer, PeriodNumEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(7, NUMBER_7);
            map.put(8, NUMBER_8);
            map.put(9, NUMBER_9);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PeriodNumEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodNumEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodNumEnum(value));
        }

        public static PeriodNumEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodNumEnum) {
                return this.value.equals(((PeriodNumEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private PeriodNumEnum periodNum;

    /**
     * 当scene=PREPAID时，当前字段必填，是否自动续订，为空时表示不自动续订； 1：自动续订 0：不自动续订（默认）
     */
    public static final class IsAutoRenewEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsAutoRenewEnum NUMBER_0 = new IsAutoRenewEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsAutoRenewEnum NUMBER_1 = new IsAutoRenewEnum(1);

        private static final Map<Integer, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsAutoRenewEnum> createStaticFields() {
            Map<Integer, IsAutoRenewEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsAutoRenewEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsAutoRenewEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoRenewEnum(value));
        }

        public static IsAutoRenewEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoRenewEnum) {
                return this.value.equals(((IsAutoRenewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private IsAutoRenewEnum isAutoRenew;

    public OrderInfoReq withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 场景描述，执行包年包月(PREPAID)、按需(POSTPAID)开通，或者配置资源（CONFIG）用量，缺省值：PREPAID，大小写不敏感
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    public OrderInfoReq withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 促销折扣信息 String，JSON格式
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public OrderInfoReq withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型，比如创建场景为：CREATE、订单用量预警配置为：ALERT_CONFIG，大小写不敏感
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    public OrderInfoReq withTagList(List<SubscriptionTag> tagList) {
        this.tagList = tagList;
        return this;
    }

    public OrderInfoReq addTagListItem(SubscriptionTag tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public OrderInfoReq withTagList(Consumer<List<SubscriptionTag>> tagListSetter) {
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

    public OrderInfoReq withProductList(List<Product> productList) {
        this.productList = productList;
        return this;
    }

    public OrderInfoReq addProductListItem(Product productListItem) {
        if (this.productList == null) {
            this.productList = new ArrayList<>();
        }
        this.productList.add(productListItem);
        return this;
    }

    public OrderInfoReq withProductList(Consumer<List<Product>> productListSetter) {
        if (this.productList == null) {
            this.productList = new ArrayList<>();
        }
        productListSetter.accept(this.productList);
        return this;
    }

    /**
     * 当scene=PREPAID 或者 POSTPAID时，当前字段必填 商品列表
     * @return productList
     */
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public OrderInfoReq withConfig(OrderConfig config) {
        this.config = config;
        return this;
    }

    public OrderInfoReq withConfig(Consumer<OrderConfig> configSetter) {
        if (this.config == null) {
            this.config = new OrderConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public OrderConfig getConfig() {
        return config;
    }

    public void setConfig(OrderConfig config) {
        this.config = config;
    }

    public OrderInfoReq withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 当scene=PREPAID时需要填写，订阅周期类型： 2：月； 3：年；
     * minimum: 2
     * maximum: 3
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public OrderInfoReq withPeriodNum(PeriodNumEnum periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订阅周期数，当scene=PREPAID时需要填写该值 取值大于0；小于等于0会报错。 当period_type=2时，其可选范围为[1, 9]，当period_type=3，其可选范围为[1, 3]
     * minimum: 1
     * maximum: 9
     * @return periodNum
     */
    public PeriodNumEnum getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(PeriodNumEnum periodNum) {
        this.periodNum = periodNum;
    }

    public OrderInfoReq withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 当scene=PREPAID时，当前字段必填，是否自动续订，为空时表示不自动续订； 1：自动续订 0：不自动续订（默认）
     * minimum: 0
     * maximum: 1
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderInfoReq that = (OrderInfoReq) obj;
        return Objects.equals(this.scene, that.scene) && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.productList, that.productList) && Objects.equals(this.config, that.config)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scene, promotionInfo, operateType, tagList, productList, config, periodType, periodNum, isAutoRenew);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderInfoReq {\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
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
