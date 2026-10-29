package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 任务门禁配置列表。
 */
public class ReviewDataInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compareType")

    private String compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isCheck")

    private Integer isCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Integer value;

    public ReviewDataInfoResponse withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * **参数解释：** 运算逻辑。 **取值范围：** 取值为\"≤\"。
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public ReviewDataInfoResponse withIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
        return this;
    }

    /**
     * **参数解释：** 门禁开关。 **取值范围：** - 0：关闭门禁。 - 1：打开门禁。
     * @return isCheck
     */
    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public ReviewDataInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 门禁项。 **取值范围：** 致命问题数。 严重问题数。 一般问题数。 提示问题数。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReviewDataInfoResponse withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 门禁阈值。 **取值范围：** ≥0
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewDataInfoResponse that = (ReviewDataInfoResponse) obj;
        return Objects.equals(this.compareType, that.compareType) && Objects.equals(this.isCheck, that.isCheck)
            && Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareType, isCheck, name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewDataInfoResponse {\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    isCheck: ").append(toIndentedString(isCheck)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
