package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 引用数据请求体
 */
public class QuoteDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quote_project_id")

    private String quoteProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_paths")

    private List<String> subPaths = null;

    public QuoteDataReq withQuoteProjectId(String quoteProjectId) {
        this.quoteProjectId = quoteProjectId;
        return this;
    }

    /**
     * 引入项目ID
     * @return quoteProjectId
     */
    public String getQuoteProjectId() {
        return quoteProjectId;
    }

    public void setQuoteProjectId(String quoteProjectId) {
        this.quoteProjectId = quoteProjectId;
    }

    public QuoteDataReq withSubPaths(List<String> subPaths) {
        this.subPaths = subPaths;
        return this;
    }

    public QuoteDataReq addSubPathsItem(String subPathsItem) {
        if (this.subPaths == null) {
            this.subPaths = new ArrayList<>();
        }
        this.subPaths.add(subPathsItem);
        return this;
    }

    public QuoteDataReq withSubPaths(Consumer<List<String>> subPathsSetter) {
        if (this.subPaths == null) {
            this.subPaths = new ArrayList<>();
        }
        subPathsSetter.accept(this.subPaths);
        return this;
    }

    /**
     * 引入路径集
     * @return subPaths
     */
    public List<String> getSubPaths() {
        return subPaths;
    }

    public void setSubPaths(List<String> subPaths) {
        this.subPaths = subPaths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuoteDataReq that = (QuoteDataReq) obj;
        return Objects.equals(this.quoteProjectId, that.quoteProjectId) && Objects.equals(this.subPaths, that.subPaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quoteProjectId, subPaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuoteDataReq {\n");
        sb.append("    quoteProjectId: ").append(toIndentedString(quoteProjectId)).append("\n");
        sb.append("    subPaths: ").append(toIndentedString(subPaths)).append("\n");
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
