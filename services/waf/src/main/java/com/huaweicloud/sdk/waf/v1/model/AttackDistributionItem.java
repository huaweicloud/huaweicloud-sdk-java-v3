package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 攻击类型分布项
 */
public class AttackDistributionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Long num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<AttackSubItem> items = null;

    public AttackDistributionItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 统计指标类型： - compliance_total_matched：内容合规检测命中次数 - injection_total_matched：提示词注入攻击检测命中次数 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AttackDistributionItem withNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * 该类型总命中次数
     * minimum: 0
     * maximum: 9999999999
     * @return num
     */
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public AttackDistributionItem withItems(List<AttackSubItem> items) {
        this.items = items;
        return this;
    }

    public AttackDistributionItem addItemsItem(AttackSubItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public AttackDistributionItem withItems(Consumer<List<AttackSubItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 子类型分布列表
     * @return items
     */
    public List<AttackSubItem> getItems() {
        return items;
    }

    public void setItems(List<AttackSubItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackDistributionItem that = (AttackDistributionItem) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.num, that.num)
            && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, num, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackDistributionItem {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
