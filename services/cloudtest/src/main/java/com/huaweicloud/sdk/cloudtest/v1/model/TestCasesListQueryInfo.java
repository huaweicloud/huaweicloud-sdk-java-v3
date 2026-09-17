package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用例列表查询Body参数
 */
public class TestCasesListQueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uris")

    private List<String> caseUris = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_ids")

    private List<String> ownerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_codes")

    private List<String> statusCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_ids")

    private List<String> rankIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_ids")

    private List<String> moduleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_type")

    private Integer stageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_uri")

    private String featureUri;

    public TestCasesListQueryInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本URI
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public TestCasesListQueryInfo withCaseUris(List<String> caseUris) {
        this.caseUris = caseUris;
        return this;
    }

    public TestCasesListQueryInfo addCaseUrisItem(String caseUrisItem) {
        if (this.caseUris == null) {
            this.caseUris = new ArrayList<>();
        }
        this.caseUris.add(caseUrisItem);
        return this;
    }

    public TestCasesListQueryInfo withCaseUris(Consumer<List<String>> caseUrisSetter) {
        if (this.caseUris == null) {
            this.caseUris = new ArrayList<>();
        }
        caseUrisSetter.accept(this.caseUris);
        return this;
    }

    /**
     * 用例URI集合
     * @return caseUris
     */
    public List<String> getCaseUris() {
        return caseUris;
    }

    public void setCaseUris(List<String> caseUris) {
        this.caseUris = caseUris;
    }

    public TestCasesListQueryInfo withOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }

    public TestCasesListQueryInfo addOwnerIdsItem(String ownerIdsItem) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        this.ownerIds.add(ownerIdsItem);
        return this;
    }

    public TestCasesListQueryInfo withOwnerIds(Consumer<List<String>> ownerIdsSetter) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        ownerIdsSetter.accept(this.ownerIds);
        return this;
    }

    /**
     * 处理者ID集合
     * @return ownerIds
     */
    public List<String> getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public TestCasesListQueryInfo withStatusCodes(List<String> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    public TestCasesListQueryInfo addStatusCodesItem(String statusCodesItem) {
        if (this.statusCodes == null) {
            this.statusCodes = new ArrayList<>();
        }
        this.statusCodes.add(statusCodesItem);
        return this;
    }

    public TestCasesListQueryInfo withStatusCodes(Consumer<List<String>> statusCodesSetter) {
        if (this.statusCodes == null) {
            this.statusCodes = new ArrayList<>();
        }
        statusCodesSetter.accept(this.statusCodes);
        return this;
    }

    /**
     * 状态Code集合
     * @return statusCodes
     */
    public List<String> getStatusCodes() {
        return statusCodes;
    }

    public void setStatusCodes(List<String> statusCodes) {
        this.statusCodes = statusCodes;
    }

    public TestCasesListQueryInfo withRankIds(List<String> rankIds) {
        this.rankIds = rankIds;
        return this;
    }

    public TestCasesListQueryInfo addRankIdsItem(String rankIdsItem) {
        if (this.rankIds == null) {
            this.rankIds = new ArrayList<>();
        }
        this.rankIds.add(rankIdsItem);
        return this;
    }

    public TestCasesListQueryInfo withRankIds(Consumer<List<String>> rankIdsSetter) {
        if (this.rankIds == null) {
            this.rankIds = new ArrayList<>();
        }
        rankIdsSetter.accept(this.rankIds);
        return this;
    }

    /**
     * 用例等级ID集合
     * @return rankIds
     */
    public List<String> getRankIds() {
        return rankIds;
    }

    public void setRankIds(List<String> rankIds) {
        this.rankIds = rankIds;
    }

    public TestCasesListQueryInfo withModuleIds(List<String> moduleIds) {
        this.moduleIds = moduleIds;
        return this;
    }

    public TestCasesListQueryInfo addModuleIdsItem(String moduleIdsItem) {
        if (this.moduleIds == null) {
            this.moduleIds = new ArrayList<>();
        }
        this.moduleIds.add(moduleIdsItem);
        return this;
    }

    public TestCasesListQueryInfo withModuleIds(Consumer<List<String>> moduleIdsSetter) {
        if (this.moduleIds == null) {
            this.moduleIds = new ArrayList<>();
        }
        moduleIdsSetter.accept(this.moduleIds);
        return this;
    }

    /**
     * 模块ID集合
     * @return moduleIds
     */
    public List<String> getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(List<String> moduleIds) {
        this.moduleIds = moduleIds;
    }

    public TestCasesListQueryInfo withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字查询，用例名或编号
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public TestCasesListQueryInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestCasesListQueryInfo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 用例编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TestCasesListQueryInfo withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public TestCasesListQueryInfo withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序方式
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public TestCasesListQueryInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * minimum: 0
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public TestCasesListQueryInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * minimum: 0
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public TestCasesListQueryInfo withServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型
     * @return serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public TestCasesListQueryInfo withStageType(Integer stageType) {
        this.stageType = stageType;
        return this;
    }

    /**
     * 阶段过程（2：测试设计，3：测试执行，4：质量报告）
     * @return stageType
     */
    public Integer getStageType() {
        return stageType;
    }

    public void setStageType(Integer stageType) {
        this.stageType = stageType;
    }

    public TestCasesListQueryInfo withFeatureUri(String featureUri) {
        this.featureUri = featureUri;
        return this;
    }

    /**
     * 目录URI
     * @return featureUri
     */
    public String getFeatureUri() {
        return featureUri;
    }

    public void setFeatureUri(String featureUri) {
        this.featureUri = featureUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCasesListQueryInfo that = (TestCasesListQueryInfo) obj;
        return Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.caseUris, that.caseUris)
            && Objects.equals(this.ownerIds, that.ownerIds) && Objects.equals(this.statusCodes, that.statusCodes)
            && Objects.equals(this.rankIds, that.rankIds) && Objects.equals(this.moduleIds, that.moduleIds)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.name, that.name)
            && Objects.equals(this.number, that.number) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortType, that.sortType) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.stageType, that.stageType) && Objects.equals(this.featureUri, that.featureUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionUri,
            caseUris,
            ownerIds,
            statusCodes,
            rankIds,
            moduleIds,
            keyword,
            name,
            number,
            sortField,
            sortType,
            pageNo,
            pageSize,
            serviceType,
            stageType,
            featureUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCasesListQueryInfo {\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    caseUris: ").append(toIndentedString(caseUris)).append("\n");
        sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
        sb.append("    statusCodes: ").append(toIndentedString(statusCodes)).append("\n");
        sb.append("    rankIds: ").append(toIndentedString(rankIds)).append("\n");
        sb.append("    moduleIds: ").append(toIndentedString(moduleIds)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    stageType: ").append(toIndentedString(stageType)).append("\n");
        sb.append("    featureUri: ").append(toIndentedString(featureUri)).append("\n");
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
