package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddressItems
 */
public class AddressItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<IdObject> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "covered_ip")

    private List<CoveredIPVO> coveredIp = null;

    public AddressItems withItems(List<IdObject> items) {
        this.items = items;
        return this;
    }

    public AddressItems addItemsItem(IdObject itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public AddressItems withItems(Consumer<List<IdObject>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 地址组成员id列表
     * @return items
     */
    public List<IdObject> getItems() {
        return items;
    }

    public void setItems(List<IdObject> items) {
        this.items = items;
    }

    public AddressItems withCoveredIp(List<CoveredIPVO> coveredIp) {
        this.coveredIp = coveredIp;
        return this;
    }

    public AddressItems addCoveredIpItem(CoveredIPVO coveredIpItem) {
        if (this.coveredIp == null) {
            this.coveredIp = new ArrayList<>();
        }
        this.coveredIp.add(coveredIpItem);
        return this;
    }

    public AddressItems withCoveredIp(Consumer<List<CoveredIPVO>> coveredIpSetter) {
        if (this.coveredIp == null) {
            this.coveredIp = new ArrayList<>();
        }
        coveredIpSetter.accept(this.coveredIp);
        return this;
    }

    /**
     * 覆盖ip列表
     * @return coveredIp
     */
    public List<CoveredIPVO> getCoveredIp() {
        return coveredIp;
    }

    public void setCoveredIp(List<CoveredIPVO> coveredIp) {
        this.coveredIp = coveredIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddressItems that = (AddressItems) obj;
        return Objects.equals(this.items, that.items) && Objects.equals(this.coveredIp, that.coveredIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, coveredIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressItems {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    coveredIp: ").append(toIndentedString(coveredIp)).append("\n");
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
