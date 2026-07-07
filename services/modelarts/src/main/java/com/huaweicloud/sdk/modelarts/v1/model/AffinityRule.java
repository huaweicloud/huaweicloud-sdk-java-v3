package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：实例的亲和度设置，跟selector字段二选一填写，不可同时存在 **约束限制**：仅支持CPU或GPU专属池场景下根据专属池节点规格使用。
 */
public class AffinityRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public AffinityRule withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**：亲和度描述具体信息。 该标签可以使用系统默认的标签，也可以使用自定义标签。系统默认的节点标签详情请参见[[管理节点标签](https://support.huaweicloud.com/usermanual-cce/cce_10_0004.html#cce_10_0004__section74111324152813)](tag:hc)[[管理节点标签](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0004.html#cce_10_0004__section74111324152813)](tag:hk)。 **约束限制**：标签是键值对。有效的标签键有两个段：可选的前缀和名称，用斜杠（/）分隔。 **取值范围**：名称段是必需的，必须小于等于 63 个字符，以字母数字字符（[a-z0-9A-Z]）开头和结尾， 带有破折号（-），下划线（_），点（ .）和之间的字母数字;前缀是可选的。如果指定，前缀必须是 DNS 子域：由点（.）分隔的一系列 DNS 标签，总共不超过 253 个字符， 后跟斜杠（/）.请参见[标签和选择算符](https://kubernetes.io/zh-cn/docs/concepts/overview/working-with-objects/labels/) **默认取值**：不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AffinityRule withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**：操作符 **约束限制**：不涉及 **取值范围**：可以设置六种匹配关系（In、NotIn、Exists、DoesNotExist、Gt、Lt）。  In：亲和/反亲和对象的标签在标签值列表（values字段）中。 NotIn：亲和/反亲和对象的标签不在标签值列表（values字段）中。 Exists：亲和/反亲和对象存在指定标签名。 DoesNotExist：亲和/反亲和对象不存在指定标签名。 Gt：调度节点的标签值大于列表值 （字符串比较）。 Lt：调度节点的标签值小于列表值 （字符串比较）。 **默认取值**：不涉及。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public AffinityRule withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public AffinityRule addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public AffinityRule withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 参数解释：设置节点亲和性时，填写节点标签对应的标签值 约束限制：必须为 63 个字符或更少（可以为空），除非标签值为空，必须以字母数字字符（[a-z0-9A-Z]）开头和结尾，包含破折号（-）、下划线（_）、点（.）和字母或数字 请参见[标签和选择算符](https://kubernetes.io/zh-cn/docs/concepts/overview/working-with-objects/labels/)
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public AffinityRule withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 设置弱亲和节点的权重值，该值的取值应为0-100之间，强亲和该值为NULL，弱亲和该值可选
     * minimum: 0
     * maximum: 100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AffinityRule that = (AffinityRule) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.values, that.values) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, operator, values, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AffinityRule {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
