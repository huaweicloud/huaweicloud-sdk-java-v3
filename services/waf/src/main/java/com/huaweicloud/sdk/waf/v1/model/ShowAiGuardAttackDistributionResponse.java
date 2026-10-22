package com.huaweicloud.sdk.waf.v1.model;

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
public class ShowAiGuardAttackDistributionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Long num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<AttackDistributionItem> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowAiGuardAttackDistributionResponse withNum(Long num) {
        this.num = num;
        return this;
    }

    /**
     * 总命中数，数量等于下一级items的total的数量
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

    public ShowAiGuardAttackDistributionResponse withItems(List<AttackDistributionItem> items) {
        this.items = items;
        return this;
    }

    public ShowAiGuardAttackDistributionResponse addItemsItem(AttackDistributionItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ShowAiGuardAttackDistributionResponse withItems(Consumer<List<AttackDistributionItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 攻击类型分布列表
     * @return items
     */
    public List<AttackDistributionItem> getItems() {
        return items;
    }

    public void setItems(List<AttackDistributionItem> items) {
        this.items = items;
    }

    public ShowAiGuardAttackDistributionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAiGuardAttackDistributionResponse that = (ShowAiGuardAttackDistributionResponse) obj;
        return Objects.equals(this.num, that.num) && Objects.equals(this.items, that.items)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, items, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAiGuardAttackDistributionResponse {\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
