package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子搜索任务的返回结果
 */
public class SearchResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_names")

    private List<String> propNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private PlainMoleculeItem query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<SearchResultItem> result = null;

    public SearchResult withSmiles(String smiles) {
        this.smiles = smiles;
        return this;
    }

    /**
     * 分子SMILES表达式
     * @return smiles
     */
    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public SearchResult withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public SearchResult addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public SearchResult withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 搜索使用到的数据库集合
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public SearchResult withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 期望返回的条目数
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public SearchResult withPropNames(List<String> propNames) {
        this.propNames = propNames;
        return this;
    }

    public SearchResult addPropNamesItem(String propNamesItem) {
        if (this.propNames == null) {
            this.propNames = new ArrayList<>();
        }
        this.propNames.add(propNamesItem);
        return this;
    }

    public SearchResult withPropNames(Consumer<List<String>> propNamesSetter) {
        if (this.propNames == null) {
            this.propNames = new ArrayList<>();
        }
        propNamesSetter.accept(this.propNames);
        return this;
    }

    /**
     * 分子ADMET属性名列表
     * @return propNames
     */
    public List<String> getPropNames() {
        return propNames;
    }

    public void setPropNames(List<String> propNames) {
        this.propNames = propNames;
    }

    public SearchResult withQuery(PlainMoleculeItem query) {
        this.query = query;
        return this;
    }

    public SearchResult withQuery(Consumer<PlainMoleculeItem> querySetter) {
        if (this.query == null) {
            this.query = new PlainMoleculeItem();
            querySetter.accept(this.query);
        }

        return this;
    }

    /**
     * Get query
     * @return query
     */
    public PlainMoleculeItem getQuery() {
        return query;
    }

    public void setQuery(PlainMoleculeItem query) {
        this.query = query;
    }

    public SearchResult withResult(List<SearchResultItem> result) {
        this.result = result;
        return this;
    }

    public SearchResult addResultItem(SearchResultItem resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public SearchResult withResult(Consumer<List<SearchResultItem>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 查询结果列表
     * @return result
     */
    public List<SearchResultItem> getResult() {
        return result;
    }

    public void setResult(List<SearchResultItem> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResult searchResult = (SearchResult) o;
        return Objects.equals(this.smiles, searchResult.smiles)
            && Objects.equals(this.databases, searchResult.databases) && Objects.equals(this.topN, searchResult.topN)
            && Objects.equals(this.propNames, searchResult.propNames) && Objects.equals(this.query, searchResult.query)
            && Objects.equals(this.result, searchResult.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smiles, databases, topN, propNames, query, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResult {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    propNames: ").append(toIndentedString(propNames)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
