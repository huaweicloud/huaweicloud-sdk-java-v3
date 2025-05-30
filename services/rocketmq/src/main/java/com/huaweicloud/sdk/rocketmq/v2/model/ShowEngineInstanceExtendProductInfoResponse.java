package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEngineInstanceExtendProductInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_offset")

    private Integer nextOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_offset")

    private Integer previousOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<String> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    private List<RocketMQExtendProductInfoEntity> products = null;

    public ShowEngineInstanceExtendProductInfoResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShowEngineInstanceExtendProductInfoResponse withNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    /**
     * 下个分页的offset。
     * @return nextOffset
     */
    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public ShowEngineInstanceExtendProductInfoResponse withPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
        return this;
    }

    /**
     * 上个分页的offset。
     * @return previousOffset
     */
    public Integer getPreviousOffset() {
        return previousOffset;
    }

    public void setPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
    }

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

    public ShowEngineInstanceExtendProductInfoResponse withProducts(List<RocketMQExtendProductInfoEntity> products) {
        this.products = products;
        return this;
    }

    public ShowEngineInstanceExtendProductInfoResponse addProductsItem(RocketMQExtendProductInfoEntity productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public ShowEngineInstanceExtendProductInfoResponse withProducts(
        Consumer<List<RocketMQExtendProductInfoEntity>> productsSetter) {
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
    public List<RocketMQExtendProductInfoEntity> getProducts() {
        return products;
    }

    public void setProducts(List<RocketMQExtendProductInfoEntity> products) {
        this.products = products;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEngineInstanceExtendProductInfoResponse that = (ShowEngineInstanceExtendProductInfoResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.nextOffset, that.nextOffset)
            && Objects.equals(this.previousOffset, that.previousOffset) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.versions, that.versions) && Objects.equals(this.products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, nextOffset, previousOffset, engine, versions, products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEngineInstanceExtendProductInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
        sb.append("    previousOffset: ").append(toIndentedString(previousOffset)).append("\n");
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
