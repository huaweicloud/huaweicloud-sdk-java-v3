package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 最高密级。 **约束限制**： 非涉密场景无该字段。 **取值范围**： 不涉及。 
 */
public class ListPipelinesPageHighestConfidentiality {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_1")

    private String reserve1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_en")

    private String valueEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    public ListPipelinesPageHighestConfidentiality withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 密级ID。 **取值范围**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListPipelinesPageHighestConfidentiality withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 密级等级逻辑ID。 **取值范围**： 不涉及。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListPipelinesPageHighestConfidentiality withReserve1(String reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    /**
     * **参数解释**： 预留字段。 **取值范围**： 不涉及。 
     * @return reserve1
     */
    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public ListPipelinesPageHighestConfidentiality withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 密级等级中文名。 **取值范围**： 不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ListPipelinesPageHighestConfidentiality withValueEn(String valueEn) {
        this.valueEn = valueEn;
        return this;
    }

    /**
     * **参数解释**： 密级等级英文名。 **取值范围**： 不涉及。 
     * @return valueEn
     */
    public String getValueEn() {
        return valueEn;
    }

    public void setValueEn(String valueEn) {
        this.valueEn = valueEn;
    }

    public ListPipelinesPageHighestConfidentiality withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释**： 密级等级序号，密级越高数字越大。 **取值范围**： 正整数。 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelinesPageHighestConfidentiality that = (ListPipelinesPageHighestConfidentiality) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code)
            && Objects.equals(this.reserve1, that.reserve1) && Objects.equals(this.value, that.value)
            && Objects.equals(this.valueEn, that.valueEn) && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, reserve1, value, valueEn, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelinesPageHighestConfidentiality {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    reserve1: ").append(toIndentedString(reserve1)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueEn: ").append(toIndentedString(valueEn)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
