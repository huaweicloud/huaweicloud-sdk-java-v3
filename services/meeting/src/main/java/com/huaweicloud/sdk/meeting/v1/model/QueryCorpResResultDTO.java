package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.QueryCorpVcResResultDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询企业资源的返回结果
 */
public class QueryCorpResResultDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="corpVcRes")
    
    private QueryCorpVcResResultDTO corpVcRes = null;

    public QueryCorpResResultDTO withCorpVcRes(QueryCorpVcResResultDTO corpVcRes) {
        this.corpVcRes = corpVcRes;
        return this;
    }

    public QueryCorpResResultDTO withCorpVcRes(Consumer<QueryCorpVcResResultDTO> corpVcResSetter) {
        if(this.corpVcRes == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCorpResResultDTO queryCorpResResultDTO = (QueryCorpResResultDTO) o;
        return Objects.equals(this.corpVcRes, queryCorpResResultDTO.corpVcRes);
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

