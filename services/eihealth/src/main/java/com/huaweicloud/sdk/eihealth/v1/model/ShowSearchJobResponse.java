package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSearchJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private DrugJobDto basicInfo;

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
    @JsonProperty(value = "models")

    private List<BasicDrugModel> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_method")

    private SearchType searchMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_failed_reason")

    private List<FailedReasonRecord> partFailedReason = null;

    public ShowSearchJobResponse withBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowSearchJobResponse withBasicInfo(Consumer<DrugJobDto> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new DrugJobDto();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public DrugJobDto getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(DrugJobDto basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ShowSearchJobResponse withSmiles(String smiles) {
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

    public ShowSearchJobResponse withScaffold(String scaffold) {
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

    public ShowSearchJobResponse withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 生成分子数量
     * minimum: 0
     * maximum: 1000
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public ShowSearchJobResponse withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public ShowSearchJobResponse addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ShowSearchJobResponse withDatabases(Consumer<List<String>> databasesSetter) {
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

    public ShowSearchJobResponse withCustomDatabases(List<String> customDatabases) {
        this.customDatabases = customDatabases;
        return this;
    }

    public ShowSearchJobResponse addCustomDatabasesItem(String customDatabasesItem) {
        if (this.customDatabases == null) {
            this.customDatabases = new ArrayList<>();
        }
        this.customDatabases.add(customDatabasesItem);
        return this;
    }

    public ShowSearchJobResponse withCustomDatabases(Consumer<List<String>> customDatabasesSetter) {
        if (this.customDatabases == null) {
            this.customDatabases = new ArrayList<>();
        }
        customDatabasesSetter.accept(this.customDatabases);
        return this;
    }

    /**
     * 可供搜索分子的自定义数据库名称列表
     * @return customDatabases
     */
    public List<String> getCustomDatabases() {
        return customDatabases;
    }

    public void setCustomDatabases(List<String> customDatabases) {
        this.customDatabases = customDatabases;
    }

    public ShowSearchJobResponse withModels(List<BasicDrugModel> models) {
        this.models = models;
        return this;
    }

    public ShowSearchJobResponse addModelsItem(BasicDrugModel modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ShowSearchJobResponse withModels(Consumer<List<BasicDrugModel>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 模型信息
     * @return models
     */
    public List<BasicDrugModel> getModels() {
        return models;
    }

    public void setModels(List<BasicDrugModel> models) {
        this.models = models;
    }

    public ShowSearchJobResponse withSearchMethod(SearchType searchMethod) {
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

    public ShowSearchJobResponse withPartFailedReason(List<FailedReasonRecord> partFailedReason) {
        this.partFailedReason = partFailedReason;
        return this;
    }

    public ShowSearchJobResponse addPartFailedReasonItem(FailedReasonRecord partFailedReasonItem) {
        if (this.partFailedReason == null) {
            this.partFailedReason = new ArrayList<>();
        }
        this.partFailedReason.add(partFailedReasonItem);
        return this;
    }

    public ShowSearchJobResponse withPartFailedReason(Consumer<List<FailedReasonRecord>> partFailedReasonSetter) {
        if (this.partFailedReason == null) {
            this.partFailedReason = new ArrayList<>();
        }
        partFailedReasonSetter.accept(this.partFailedReason);
        return this;
    }

    /**
     * 部分失败原因和数量
     * @return partFailedReason
     */
    public List<FailedReasonRecord> getPartFailedReason() {
        return partFailedReason;
    }

    public void setPartFailedReason(List<FailedReasonRecord> partFailedReason) {
        this.partFailedReason = partFailedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSearchJobResponse that = (ShowSearchJobResponse) obj;
        return Objects.equals(this.basicInfo, that.basicInfo) && Objects.equals(this.smiles, that.smiles)
            && Objects.equals(this.scaffold, that.scaffold) && Objects.equals(this.topN, that.topN)
            && Objects.equals(this.databases, that.databases)
            && Objects.equals(this.customDatabases, that.customDatabases) && Objects.equals(this.models, that.models)
            && Objects.equals(this.searchMethod, that.searchMethod)
            && Objects.equals(this.partFailedReason, that.partFailedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo,
            smiles,
            scaffold,
            topN,
            databases,
            customDatabases,
            models,
            searchMethod,
            partFailedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSearchJobResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    scaffold: ").append(toIndentedString(scaffold)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    customDatabases: ").append(toIndentedString(customDatabases)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    searchMethod: ").append(toIndentedString(searchMethod)).append("\n");
        sb.append("    partFailedReason: ").append(toIndentedString(partFailedReason)).append("\n");
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
