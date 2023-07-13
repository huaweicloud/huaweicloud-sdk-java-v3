package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询企业资源的返回结果。
 */
public class QueryCorpResResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpVcRes")

    private QueryCorpVcResResultDTO corpVcRes;

    public QueryCorpResResultDTO withCorpVcRes(QueryCorpVcResResultDTO corpVcRes) {
        this.corpVcRes = corpVcRes;
        return this;
    }

    public QueryCorpResResultDTO withCorpVcRes(Consumer<QueryCorpVcResResultDTO> corpVcResSetter) {
        if (this.corpVcRes == null) {
            this.corpVcRes = new QueryCorpVcResResultDTO();
            corpVcResSetter.accept(this.corpVcRes);
        }

        return this;
    }

    /**
     * Get corpVcRes
     * @return corpVcRes
     */
    public QueryCorpVcResResultDTO getCorpVcRes() {
        return corpVcRes;
    }

    public void setCorpVcRes(QueryCorpVcResResultDTO corpVcRes) {
        this.corpVcRes = corpVcRes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryCorpResResultDTO that = (QueryCorpResResultDTO) obj;
        return Objects.equals(this.corpVcRes, that.corpVcRes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corpVcRes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCorpResResultDTO {\n");
        sb.append("    corpVcRes: ").append(toIndentedString(corpVcRes)).append("\n");
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
