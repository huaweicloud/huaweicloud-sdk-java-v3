package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * filter_polices字段，必填，一个筛选策略最多可具有 5 个属性策略。  name-属性名称：满足正则 ^(?!smn_)(?!.*?_$)(?!^_)(?!.*?__)[a-z0-9_]{1,32}$ （英文字母([a-z])、数字([0-9])、下划线(_)，下划线不得开始、结尾或连续出现），长度限制{1,32}，key不能是smn_开头 字符串匹配策略： string_equals：精准匹配字符串；类型：字符串数组，数组长度[1,10]，字符串长度限制[1,32]，不能重复，不能空值“ ”
 */
public class BatchSubscriptionsFilterPolicesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "polices")

    private List<BatchSubscriptionsFilterPolicesRequestBodyPolices> polices = null;

    public BatchSubscriptionsFilterPolicesRequestBody withPolices(
        List<BatchSubscriptionsFilterPolicesRequestBodyPolices> polices) {
        this.polices = polices;
        return this;
    }

    public BatchSubscriptionsFilterPolicesRequestBody addPolicesItem(
        BatchSubscriptionsFilterPolicesRequestBodyPolices policesItem) {
        if (this.polices == null) {
            this.polices = new ArrayList<>();
        }
        this.polices.add(policesItem);
        return this;
    }

    public BatchSubscriptionsFilterPolicesRequestBody withPolices(
        Consumer<List<BatchSubscriptionsFilterPolicesRequestBodyPolices>> policesSetter) {
        if (this.polices == null) {
            this.polices = new ArrayList<>();
        }
        policesSetter.accept(this.polices);
        return this;
    }

    /**
     * 批量处理订阅者策略列表。
     * @return polices
     */
    public List<BatchSubscriptionsFilterPolicesRequestBodyPolices> getPolices() {
        return polices;
    }

    public void setPolices(List<BatchSubscriptionsFilterPolicesRequestBodyPolices> polices) {
        this.polices = polices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSubscriptionsFilterPolicesRequestBody that = (BatchSubscriptionsFilterPolicesRequestBody) obj;
        return Objects.equals(this.polices, that.polices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSubscriptionsFilterPolicesRequestBody {\n");
        sb.append("    polices: ").append(toIndentedString(polices)).append("\n");
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
