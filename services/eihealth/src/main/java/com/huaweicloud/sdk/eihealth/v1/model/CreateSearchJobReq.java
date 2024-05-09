package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSearchJobReq
 */
public class CreateSearchJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private CreateDrugJobBasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaffold")

    private String scaffold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_databases")

    private List<String> customDatabases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_ids")

    private List<String> modelIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_method")

    private SearchType searchMethod;

    public CreateSearchJobReq withBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public CreateSearchJobReq withBasicInfo(Consumer<CreateDrugJobBasicInfo> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new CreateDrugJobBasicInfo();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public CreateDrugJobBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(CreateDrugJobBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public CreateSearchJobReq withSmiles(String smiles) {
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

    public CreateSearchJobReq withScaffold(String scaffold) {
        this.scaffold = scaffold;
        return this;
    }

    /**
     * 分子骨架表达式
     * @return scaffold
     */
    public String getScaffold() {
        return scaffold;
    }

    public void setScaffold(String scaffold) {
        this.scaffold = scaffold;
    }

    public CreateSearchJobReq withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 最相似的top_n个
     * minimum: 1
     * maximum: 1000
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public CreateSearchJobReq withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public CreateSearchJobReq addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateSearchJobReq withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 可供搜索分子的公共数据库名称列表
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public CreateSearchJobReq withCustomDatabases(List<String> customDatabases) {
        this.customDatabases = customDatabases;
        return this;
    }

    public CreateSearchJobReq addCustomDatabasesItem(String customDatabasesItem) {
        if (this.customDatabases == null) {
            this.customDatabases = new ArrayList<>();
        }
        this.customDatabases.add(customDatabasesItem);
        return this;
    }

    public CreateSearchJobReq withCustomDatabases(Consumer<List<String>> customDatabasesSetter) {
        if (this.customDatabases == null) {
            this.customDatabases = new ArrayList<>();
        }
        customDatabasesSetter.accept(this.customDatabases);
        return this;
    }

    /**
     * 可供搜索分子的自定义数据库id列表
     * @return customDatabases
     */
    public List<String> getCustomDatabases() {
        return customDatabases;
    }

    public void setCustomDatabases(List<String> customDatabases) {
        this.customDatabases = customDatabases;
    }

    public CreateSearchJobReq withModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
        return this;
    }

    public CreateSearchJobReq addModelIdsItem(String modelIdsItem) {
        if (this.modelIds == null) {
            this.modelIds = new ArrayList<>();
        }
        this.modelIds.add(modelIdsItem);
        return this;
    }

    public CreateSearchJobReq withModelIds(Consumer<List<String>> modelIdsSetter) {
        if (this.modelIds == null) {
            this.modelIds = new ArrayList<>();
        }
        modelIdsSetter.accept(this.modelIds);
        return this;
    }

    /**
     * 模型id列表
     * @return modelIds
     */
    public List<String> getModelIds() {
        return modelIds;
    }

    public void setModelIds(List<String> modelIds) {
        this.modelIds = modelIds;
    }

    public CreateSearchJobReq withSearchMethod(SearchType searchMethod) {
        this.searchMethod = searchMethod;
        return this;
    }

    /**
     * Get searchMethod
     * @return searchMethod
     */
    public SearchType getSearchMethod() {
        return searchMethod;
    }

    public void setSearchMethod(SearchType searchMethod) {
        this.searchMethod = searchMethod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSearchJobReq that = (CreateSearchJobReq) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.smiles, that.smiles)
            && Objects.equals(this.scaffold, that.scaffold) && Objects.equals(this.topN, that.topN)
            && Objects.equals(this.databases, that.databases)
            && Objects.equals(this.customDatabases, that.customDatabases)
            && Objects.equals(this.modelIds, that.modelIds) && Objects.equals(this.searchMethod, that.searchMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, smiles, scaffold, topN, databases, customDatabases, modelIds, searchMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSearchJobReq {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    scaffold: ").append(toIndentedString(scaffold)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    customDatabases: ").append(toIndentedString(customDatabases)).append("\n");
        sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
        sb.append("    searchMethod: ").append(toIndentedString(searchMethod)).append("\n");
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
