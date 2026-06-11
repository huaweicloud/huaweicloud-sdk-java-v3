package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * pool order struct
 */
public class WorkflowPoolOrder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku")

    private SkuInfo sku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_count")

    private String skuCount;

    public WorkflowPoolOrder withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkflowPoolOrder withSku(SkuInfo sku) {
        this.sku = sku;
        return this;
    }

    public WorkflowPoolOrder withSku(Consumer<SkuInfo> skuSetter) {
        if (this.sku == null) {
            this.sku = new SkuInfo();
            skuSetter.accept(this.sku);
        }

        return this;
    }

    /**
     * Get sku
     * @return sku
     */
    public SkuInfo getSku() {
        return sku;
    }

    public void setSku(SkuInfo sku) {
        this.sku = sku;
    }

    public WorkflowPoolOrder withSkuCount(String skuCount) {
        this.skuCount = skuCount;
        return this;
    }

    /**
     * 订阅计数。
     * @return skuCount
     */
    public String getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(String skuCount) {
        this.skuCount = skuCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowPoolOrder that = (WorkflowPoolOrder) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sku, that.sku)
            && Objects.equals(this.skuCount, that.skuCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sku, skuCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowPoolOrder {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    skuCount: ").append(toIndentedString(skuCount)).append("\n");
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
