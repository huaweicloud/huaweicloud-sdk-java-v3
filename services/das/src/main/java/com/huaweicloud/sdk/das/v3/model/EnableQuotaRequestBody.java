package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开通配额请求体
 */
public class EnableQuotaRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_num")

    private Integer openNum;

    public EnableQuotaRequestBody withOpenNum(Integer openNum) {
        this.openNum = openNum;
        return this;
    }

    /**
     * 开通配额的数量
     * @return openNum
     */
    public Integer getOpenNum() {
        return openNum;
    }

    public void setOpenNum(Integer openNum) {
        this.openNum = openNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableQuotaRequestBody that = (EnableQuotaRequestBody) obj;
        return Objects.equals(this.openNum, that.openNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableQuotaRequestBody {\n");
        sb.append("    openNum: ").append(toIndentedString(openNum)).append("\n");
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
