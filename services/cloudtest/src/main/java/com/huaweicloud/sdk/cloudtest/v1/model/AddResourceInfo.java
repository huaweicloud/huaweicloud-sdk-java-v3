package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddResourceInfo
 */
public class AddResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_uri")

    private String iteratorUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_issues")

    private String isAllIssues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_import")

    private Boolean allImport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_uri")

    private String featureUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_resourceinfo_list")

    private List<SimpleResourceInfo> simpleResourceinfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invert_simple_resourceinfo_list")

    private List<SimpleResourceInfo> invertSimpleResourceinfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_to_iterator")

    private Boolean addToIterator;

    public AddResourceInfo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public AddResourceInfo withIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
        return this;
    }

    /**
     * 迭代uri
     * @return iteratorUri
     */
    public String getIteratorUri() {
        return iteratorUri;
    }

    public void setIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
    }

    public AddResourceInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型, 对应serviceType
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public AddResourceInfo withIsAllIssues(String isAllIssues) {
        this.isAllIssues = isAllIssues;
        return this;
    }

    /**
     * 是否选择issues
     * @return isAllIssues
     */
    public String getIsAllIssues() {
        return isAllIssues;
    }

    public void setIsAllIssues(String isAllIssues) {
        this.isAllIssues = isAllIssues;
    }

    public AddResourceInfo withAllImport(Boolean allImport) {
        this.allImport = allImport;
        return this;
    }

    /**
     * 是否选择所有用例
     * @return allImport
     */
    public Boolean getAllImport() {
        return allImport;
    }

    public void setAllImport(Boolean allImport) {
        this.allImport = allImport;
    }

    public AddResourceInfo withFeatureUri(String featureUri) {
        this.featureUri = featureUri;
        return this;
    }

    /**
     * 按照目录引入用例
     * @return featureUri
     */
    public String getFeatureUri() {
        return featureUri;
    }

    public void setFeatureUri(String featureUri) {
        this.featureUri = featureUri;
    }

    public AddResourceInfo withSimpleResourceinfoList(List<SimpleResourceInfo> simpleResourceinfoList) {
        this.simpleResourceinfoList = simpleResourceinfoList;
        return this;
    }

    public AddResourceInfo addSimpleResourceinfoListItem(SimpleResourceInfo simpleResourceinfoListItem) {
        if (this.simpleResourceinfoList == null) {
            this.simpleResourceinfoList = new ArrayList<>();
        }
        this.simpleResourceinfoList.add(simpleResourceinfoListItem);
        return this;
    }

    public AddResourceInfo withSimpleResourceinfoList(Consumer<List<SimpleResourceInfo>> simpleResourceinfoListSetter) {
        if (this.simpleResourceinfoList == null) {
            this.simpleResourceinfoList = new ArrayList<>();
        }
        simpleResourceinfoListSetter.accept(this.simpleResourceinfoList);
        return this;
    }

    /**
     * 选择的资源列表, 对应sourceCaseUris
     * @return simpleResourceinfoList
     */
    public List<SimpleResourceInfo> getSimpleResourceinfoList() {
        return simpleResourceinfoList;
    }

    public void setSimpleResourceinfoList(List<SimpleResourceInfo> simpleResourceinfoList) {
        this.simpleResourceinfoList = simpleResourceinfoList;
    }

    public AddResourceInfo withInvertSimpleResourceinfoList(List<SimpleResourceInfo> invertSimpleResourceinfoList) {
        this.invertSimpleResourceinfoList = invertSimpleResourceinfoList;
        return this;
    }

    public AddResourceInfo addInvertSimpleResourceinfoListItem(SimpleResourceInfo invertSimpleResourceinfoListItem) {
        if (this.invertSimpleResourceinfoList == null) {
            this.invertSimpleResourceinfoList = new ArrayList<>();
        }
        this.invertSimpleResourceinfoList.add(invertSimpleResourceinfoListItem);
        return this;
    }

    public AddResourceInfo withInvertSimpleResourceinfoList(
        Consumer<List<SimpleResourceInfo>> invertSimpleResourceinfoListSetter) {
        if (this.invertSimpleResourceinfoList == null) {
            this.invertSimpleResourceinfoList = new ArrayList<>();
        }
        invertSimpleResourceinfoListSetter.accept(this.invertSimpleResourceinfoList);
        return this;
    }

    /**
     * 反选的资源列表
     * @return invertSimpleResourceinfoList
     */
    public List<SimpleResourceInfo> getInvertSimpleResourceinfoList() {
        return invertSimpleResourceinfoList;
    }

    public void setInvertSimpleResourceinfoList(List<SimpleResourceInfo> invertSimpleResourceinfoList) {
        this.invertSimpleResourceinfoList = invertSimpleResourceinfoList;
    }

    public AddResourceInfo withAddToIterator(Boolean addToIterator) {
        this.addToIterator = addToIterator;
        return this;
    }

    /**
     * 是否将需求添加到测试计划（不传或者true添加需求到测试计划，false就不添加）
     * @return addToIterator
     */
    public Boolean getAddToIterator() {
        return addToIterator;
    }

    public void setAddToIterator(Boolean addToIterator) {
        this.addToIterator = addToIterator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddResourceInfo that = (AddResourceInfo) obj;
        return Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.iteratorUri, that.iteratorUri)
            && Objects.equals(this.type, that.type) && Objects.equals(this.isAllIssues, that.isAllIssues)
            && Objects.equals(this.allImport, that.allImport) && Objects.equals(this.featureUri, that.featureUri)
            && Objects.equals(this.simpleResourceinfoList, that.simpleResourceinfoList)
            && Objects.equals(this.invertSimpleResourceinfoList, that.invertSimpleResourceinfoList)
            && Objects.equals(this.addToIterator, that.addToIterator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid,
            iteratorUri,
            type,
            isAllIssues,
            allImport,
            featureUri,
            simpleResourceinfoList,
            invertSimpleResourceinfoList,
            addToIterator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddResourceInfo {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    iteratorUri: ").append(toIndentedString(iteratorUri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isAllIssues: ").append(toIndentedString(isAllIssues)).append("\n");
        sb.append("    allImport: ").append(toIndentedString(allImport)).append("\n");
        sb.append("    featureUri: ").append(toIndentedString(featureUri)).append("\n");
        sb.append("    simpleResourceinfoList: ").append(toIndentedString(simpleResourceinfoList)).append("\n");
        sb.append("    invertSimpleResourceinfoList: ")
            .append(toIndentedString(invertSimpleResourceinfoList))
            .append("\n");
        sb.append("    addToIterator: ").append(toIndentedString(addToIterator)).append("\n");
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
