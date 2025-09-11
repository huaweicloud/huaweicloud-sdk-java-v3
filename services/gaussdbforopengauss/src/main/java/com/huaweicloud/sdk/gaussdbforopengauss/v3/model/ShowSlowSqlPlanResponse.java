package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSlowSqlPlanResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gs_explain")

    private String gsExplain;

    public ShowSlowSqlPlanResponse withGsExplain(String gsExplain) {
        this.gsExplain = gsExplain;
        return this;
    }

    /**
     * **参数解释**: 执行计划信息。 **取值范围**: 不涉及。
     * @return gsExplain
     */
    public String getGsExplain() {
        return gsExplain;
    }

    public void setGsExplain(String gsExplain) {
        this.gsExplain = gsExplain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowSqlPlanResponse that = (ShowSlowSqlPlanResponse) obj;
        return Objects.equals(this.gsExplain, that.gsExplain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gsExplain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowSqlPlanResponse {\n");
        sb.append("    gsExplain: ").append(toIndentedString(gsExplain)).append("\n");
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
