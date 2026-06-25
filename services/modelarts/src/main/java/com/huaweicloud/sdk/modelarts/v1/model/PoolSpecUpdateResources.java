package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PoolSpecUpdateResources
 */
public class PoolSpecUpdateResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private List<PoolNodeAz> azs = null;

    public PoolSpecUpdateResources withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 资源规格。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public PoolSpecUpdateResources withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 相应规格的资源数量。
     * minimum: 1
     * maximum: 2000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PoolSpecUpdateResources withAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
        return this;
    }

    public PoolSpecUpdateResources addAzsItem(PoolNodeAz azsItem) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(azsItem);
        return this;
    }

    public PoolSpecUpdateResources withAzs(Consumer<List<PoolNodeAz>> azsSetter) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * 更新的AZ列表。
     * @return azs
     */
    public List<PoolNodeAz> getAzs() {
        return azs;
    }

    public void setAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolSpecUpdateResources that = (PoolSpecUpdateResources) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.count, that.count)
            && Objects.equals(this.azs, that.azs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, count, azs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecUpdateResources {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
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
