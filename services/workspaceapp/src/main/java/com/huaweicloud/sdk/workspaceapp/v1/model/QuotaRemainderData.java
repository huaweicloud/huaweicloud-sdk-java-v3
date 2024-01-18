package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额剩余数量信息
 */
public class QuotaRemainderData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private QuotaResourceTypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remainder")

    private Integer remainder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need")

    private Integer need;

    public QuotaRemainderData withType(QuotaResourceTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public QuotaResourceTypeEnum getType() {
        return type;
    }

    public void setType(QuotaResourceTypeEnum type) {
        this.type = type;
    }

    public QuotaRemainderData withRemainder(Integer remainder) {
        this.remainder = remainder;
        return this;
    }

    /**
     * 剩余配额。
     * minimum: 0
     * maximum: 2147483647
     * @return remainder
     */
    public Integer getRemainder() {
        return remainder;
    }

    public void setRemainder(Integer remainder) {
        this.remainder = remainder;
    }

    public QuotaRemainderData withNeed(Integer need) {
        this.need = need;
        return this;
    }

    /**
     * 所需配额。
     * minimum: 0
     * maximum: 2147483647
     * @return need
     */
    public Integer getNeed() {
        return need;
    }

    public void setNeed(Integer need) {
        this.need = need;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaRemainderData that = (QuotaRemainderData) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.remainder, that.remainder)
            && Objects.equals(this.need, that.need);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, remainder, need);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaRemainderData {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    remainder: ").append(toIndentedString(remainder)).append("\n");
        sb.append("    need: ").append(toIndentedString(need)).append("\n");
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
