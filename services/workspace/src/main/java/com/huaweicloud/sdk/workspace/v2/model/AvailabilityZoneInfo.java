package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AvailabilityZoneInfo
 */
public class AvailabilityZoneInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n")

    private Map<String, String> i18n = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sold_out")

    private SoldOutInfo soldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_ids")

    private List<String> productIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_availability_zone")

    private Boolean defaultAvailabilityZone;

    public AvailabilityZoneInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区编码。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public AvailabilityZoneInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 可用分区名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AvailabilityZoneInfo withI18n(Map<String, String> i18n) {
        this.i18n = i18n;
        return this;
    }

    public AvailabilityZoneInfo putI18nItem(String key, String i18nItem) {
        if (this.i18n == null) {
            this.i18n = new HashMap<>();
        }
        this.i18n.put(key, i18nItem);
        return this;
    }

    public AvailabilityZoneInfo withI18n(Consumer<Map<String, String>> i18nSetter) {
        if (this.i18n == null) {
            this.i18n = new HashMap<>();
        }
        i18nSetter.accept(this.i18n);
        return this;
    }

    /**
     * 可用分区国际化信息。
     * @return i18n
     */
    public Map<String, String> getI18n() {
        return i18n;
    }

    public void setI18n(Map<String, String> i18n) {
        this.i18n = i18n;
    }

    public AvailabilityZoneInfo withSoldOut(SoldOutInfo soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    public AvailabilityZoneInfo withSoldOut(Consumer<SoldOutInfo> soldOutSetter) {
        if (this.soldOut == null) {
            this.soldOut = new SoldOutInfo();
            soldOutSetter.accept(this.soldOut);
        }

        return this;
    }

    /**
     * Get soldOut
     * @return soldOut
     */
    public SoldOutInfo getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(SoldOutInfo soldOut) {
        this.soldOut = soldOut;
    }

    public AvailabilityZoneInfo withProductIds(List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    public AvailabilityZoneInfo addProductIdsItem(String productIdsItem) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.add(productIdsItem);
        return this;
    }

    public AvailabilityZoneInfo withProductIds(Consumer<List<String>> productIdsSetter) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        productIdsSetter.accept(this.productIds);
        return this;
    }

    /**
     * 指定当前分区下自定义支持的产品ID列表，如果为空则支持所有套餐。
     * @return productIds
     */
    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public AvailabilityZoneInfo withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 是否可见。
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public AvailabilityZoneInfo withDefaultAvailabilityZone(Boolean defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        return this;
    }

    /**
     * 是否默认可用分区。
     * @return defaultAvailabilityZone
     */
    public Boolean getDefaultAvailabilityZone() {
        return defaultAvailabilityZone;
    }

    public void setDefaultAvailabilityZone(Boolean defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailabilityZoneInfo that = (AvailabilityZoneInfo) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.i18n, that.i18n)
            && Objects.equals(this.soldOut, that.soldOut) && Objects.equals(this.productIds, that.productIds)
            && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.defaultAvailabilityZone, that.defaultAvailabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, displayName, i18n, soldOut, productIds, visible, defaultAvailabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZoneInfo {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    i18n: ").append(toIndentedString(i18n)).append("\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    defaultAvailabilityZone: ").append(toIndentedString(defaultAvailabilityZone)).append("\n");
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
