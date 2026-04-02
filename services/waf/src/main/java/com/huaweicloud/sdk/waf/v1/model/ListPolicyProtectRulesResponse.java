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
public class ListPolicyProtectRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<Object> items = null;

    public ListPolicyProtectRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 策略总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListPolicyProtectRulesResponse withItems(List<Object> items) {
        this.items = items;
        return this;
    }

    public ListPolicyProtectRulesResponse addItemsItem(Object itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListPolicyProtectRulesResponse withItems(Consumer<List<Object>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释：** 单个策略下特定类型防护规则列表 **约束限制：** 具体类型取决于参数rule_type **取值范围：** 具体返回值参考接口： - cc CC防护  ListCcPolicyRules - custom 精准防护 ListCustomPolicyRules - whiteblackip 黑白名单 ListWhiteblackipPolicyRules - geoip 地理位置防护 ListGeoIpPolicyRules - ip-reputation 威胁情报 ListIpReputationPolicyRules - antitamper 防篡改 ListAntiTamperPolicyRules - antileakage 防敏感信息泄露 ListAntileakagePolicyRules - ignore 全局白名单(原误报屏蔽) ListIgnorePolicyRules - privacy 隐私屏蔽 ListPrivacyPolicyRules **默认取值：** 不涉及
     * @return items
     */
    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
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
        ListPolicyProtectRulesResponse that = (ListPolicyProtectRulesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyProtectRulesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
