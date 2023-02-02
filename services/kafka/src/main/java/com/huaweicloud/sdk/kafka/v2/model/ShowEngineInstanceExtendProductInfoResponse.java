package com.huaweicloud.sdk.kafka.v2.model;

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
public class ShowEngineInstanceExtendProductInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<String> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    private List<ExtendProductInfoEntity> products = null;

    public ShowEngineInstanceExtendProductInfoResponse withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 消息引擎类型。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ShowEngineInstanceExtendProductInfoResponse withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

    public ShowEngineInstanceExtendProductInfoResponse addVersionsItem(String versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ShowEngineInstanceExtendProductInfoResponse withVersions(Consumer<List<String>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 消息引擎支持的版本。
     * @return versions
     */
    public List<String> getVersions() {
        return versions;
    }

    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    public ShowEngineInstanceExtendProductInfoResponse withProducts(List<ExtendProductInfoEntity> products) {
        this.products = products;
        return this;
    }

    public ShowEngineInstanceExtendProductInfoResponse addProductsItem(ExtendProductInfoEntity productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public ShowEngineInstanceExtendProductInfoResponse withProducts(
        Consumer<List<ExtendProductInfoEntity>> productsSetter) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /**
     * 规格变更的产品信息。
     * @return products
     */
    public List<ExtendProductInfoEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ExtendProductInfoEntity> products) {
        this.products = products;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEngineInstanceExtendProductInfoResponse showEngineInstanceExtendProductInfoResponse =
            (ShowEngineInstanceExtendProductInfoResponse) o;
        return Objects.equals(this.engine, showEngineInstanceExtendProductInfoResponse.engine)
            && Objects.equals(this.versions, showEngineInstanceExtendProductInfoResponse.versions)
            && Objects.equals(this.products, showEngineInstanceExtendProductInfoResponse.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, versions, products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEngineInstanceExtendProductInfoResponse {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
