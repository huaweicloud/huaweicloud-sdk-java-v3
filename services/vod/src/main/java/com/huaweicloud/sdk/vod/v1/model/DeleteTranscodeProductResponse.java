package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteTranscodeProductResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    /**
     * SUCCESS：成功 FAIL：失败 PARTIAL_SUCCESS：部分成功 
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");

        /**
         * Enum PARTIAL_SUCCESS for value: "PARTIAL_SUCCESS"
         */
        public static final StatusEnum PARTIAL_SUCCESS = new StatusEnum("PARTIAL_SUCCESS");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAIL", FAIL);
            map.put("PARTIAL_SUCCESS", PARTIAL_SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_products")

    private List<ProductGroupInfo> deletedProducts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_products")

    private List<ProductGroupDelFailInfo> failedProducts = null;

    public DeleteTranscodeProductResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public DeleteTranscodeProductResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * SUCCESS：成功 FAIL：失败 PARTIAL_SUCCESS：部分成功 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DeleteTranscodeProductResponse withDeletedProducts(List<ProductGroupInfo> deletedProducts) {
        this.deletedProducts = deletedProducts;
        return this;
    }

    public DeleteTranscodeProductResponse addDeletedProductsItem(ProductGroupInfo deletedProductsItem) {
        if (this.deletedProducts == null) {
            this.deletedProducts = new ArrayList<>();
        }
        this.deletedProducts.add(deletedProductsItem);
        return this;
    }

    public DeleteTranscodeProductResponse withDeletedProducts(Consumer<List<ProductGroupInfo>> deletedProductsSetter) {
        if (this.deletedProducts == null) {
            this.deletedProducts = new ArrayList<>();
        }
        deletedProductsSetter.accept(this.deletedProducts);
        return this;
    }

    /**
     * 删除成功的产物
     * @return deletedProducts
     */
    public List<ProductGroupInfo> getDeletedProducts() {
        return deletedProducts;
    }

    public void setDeletedProducts(List<ProductGroupInfo> deletedProducts) {
        this.deletedProducts = deletedProducts;
    }

    public DeleteTranscodeProductResponse withFailedProducts(List<ProductGroupDelFailInfo> failedProducts) {
        this.failedProducts = failedProducts;
        return this;
    }

    public DeleteTranscodeProductResponse addFailedProductsItem(ProductGroupDelFailInfo failedProductsItem) {
        if (this.failedProducts == null) {
            this.failedProducts = new ArrayList<>();
        }
        this.failedProducts.add(failedProductsItem);
        return this;
    }

    public DeleteTranscodeProductResponse withFailedProducts(
        Consumer<List<ProductGroupDelFailInfo>> failedProductsSetter) {
        if (this.failedProducts == null) {
            this.failedProducts = new ArrayList<>();
        }
        failedProductsSetter.accept(this.failedProducts);
        return this;
    }

    /**
     * 删除失败的产物
     * @return failedProducts
     */
    public List<ProductGroupDelFailInfo> getFailedProducts() {
        return failedProducts;
    }

    public void setFailedProducts(List<ProductGroupDelFailInfo> failedProducts) {
        this.failedProducts = failedProducts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTranscodeProductResponse that = (DeleteTranscodeProductResponse) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.deletedProducts, that.deletedProducts)
            && Objects.equals(this.failedProducts, that.failedProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, status, deletedProducts, failedProducts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTranscodeProductResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    deletedProducts: ").append(toIndentedString(deletedProducts)).append("\n");
        sb.append("    failedProducts: ").append(toIndentedString(failedProducts)).append("\n");
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
