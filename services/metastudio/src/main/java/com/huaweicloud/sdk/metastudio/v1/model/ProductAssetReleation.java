package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新资产组合
 */
public class ProductAssetReleation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_item")

    private ProductMediaInfo assetItem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_item")

    private ProductTextInfo textItem;

    /**
     * 添加或删除资产关联 - LINK ：将资产纳入管理 - UNLINK ：将资产移除管理
     */
    public static final class ActionEnum {

        /**
         * Enum LINK for value: "LINK"
         */
        public static final ActionEnum LINK = new ActionEnum("LINK");

        /**
         * Enum UNLINK for value: "UNLINK"
         */
        public static final ActionEnum UNLINK = new ActionEnum("UNLINK");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("LINK", LINK);
            map.put("UNLINK", UNLINK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    public ProductAssetReleation withAssetItem(ProductMediaInfo assetItem) {
        this.assetItem = assetItem;
        return this;
    }

    public ProductAssetReleation withAssetItem(Consumer<ProductMediaInfo> assetItemSetter) {
        if (this.assetItem == null) {
            this.assetItem = new ProductMediaInfo();
            assetItemSetter.accept(this.assetItem);
        }

        return this;
    }

    /**
     * Get assetItem
     * @return assetItem
     */
    public ProductMediaInfo getAssetItem() {
        return assetItem;
    }

    public void setAssetItem(ProductMediaInfo assetItem) {
        this.assetItem = assetItem;
    }

    public ProductAssetReleation withTextItem(ProductTextInfo textItem) {
        this.textItem = textItem;
        return this;
    }

    public ProductAssetReleation withTextItem(Consumer<ProductTextInfo> textItemSetter) {
        if (this.textItem == null) {
            this.textItem = new ProductTextInfo();
            textItemSetter.accept(this.textItem);
        }

        return this;
    }

    /**
     * Get textItem
     * @return textItem
     */
    public ProductTextInfo getTextItem() {
        return textItem;
    }

    public void setTextItem(ProductTextInfo textItem) {
        this.textItem = textItem;
    }

    public ProductAssetReleation withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 添加或删除资产关联 - LINK ：将资产纳入管理 - UNLINK ：将资产移除管理
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductAssetReleation that = (ProductAssetReleation) obj;
        return Objects.equals(this.assetItem, that.assetItem) && Objects.equals(this.textItem, that.textItem)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetItem, textItem, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductAssetReleation {\n");
        sb.append("    assetItem: ").append(toIndentedString(assetItem)).append("\n");
        sb.append("    textItem: ").append(toIndentedString(textItem)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
