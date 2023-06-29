package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Validity
 */
public class Validity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Integer value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_from")

    private Integer startFrom;

    public Validity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 有效期类型，为必填值：   - **YEAR** : 年（12个月）   - **MONTH** : 月（统一按31天）   - **DAY** : 日   - **HOUR** : 小时
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Validity withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 证书有效期值，与type对应的类型值，换算成年需满足以下规则：   - 根CA，有效期小于等于30年；   - 从属CA与私有证书，有效期小于等于20年。
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Validity withStartFrom(Integer startFrom) {
        this.startFrom = startFrom;
        return this;
    }

    /**
     * 起始时间，为可选值:   - 格式为时间戳（毫秒级），如1645146939688代表2022-02-18 09:15:39；   - 不早于当前时间5分钟，即start_from > (current_time - 5min)。
     * @return startFrom
     */
    public Integer getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(Integer startFrom) {
        this.startFrom = startFrom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Validity that = (Validity) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.startFrom, that.startFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, startFrom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Validity {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    startFrom: ").append(toIndentedString(startFrom)).append("\n");
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
