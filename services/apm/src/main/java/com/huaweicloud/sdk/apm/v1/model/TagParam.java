package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TagParam
 */
public class TagParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private Long tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descp")

    private String descp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id_list")

    private List<Long> envIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id_list")

    private List<Long> tagIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_enable")

    private Boolean pageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_env_id_list")

    private List<Long> addEnvIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_tag_id_list")

    private List<Long> addTagIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_tag_id_list")

    private List<Long> removeTagIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_env_id_list")

    private List<Long> removeEnvIdList = null;

    public TagParam withTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * 环境标签id。
     * @return tagId
     */
    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public TagParam withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 环境标签名称。
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public TagParam withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id。
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public TagParam withDescp(String descp) {
        this.descp = descp;
        return this;
    }

    /**
     * 描述信息。
     * @return descp
     */
    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public TagParam withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public TagParam withEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
        return this;
    }

    public TagParam addEnvIdListItem(Long envIdListItem) {
        if (this.envIdList == null) {
            this.envIdList = new ArrayList<>();
        }
        this.envIdList.add(envIdListItem);
        return this;
    }

    public TagParam withEnvIdList(Consumer<List<Long>> envIdListSetter) {
        if (this.envIdList == null) {
            this.envIdList = new ArrayList<>();
        }
        envIdListSetter.accept(this.envIdList);
        return this;
    }

    /**
     * 环境id列表。
     * @return envIdList
     */
    public List<Long> getEnvIdList() {
        return envIdList;
    }

    public void setEnvIdList(List<Long> envIdList) {
        this.envIdList = envIdList;
    }

    public TagParam withTagIdList(List<Long> tagIdList) {
        this.tagIdList = tagIdList;
        return this;
    }

    public TagParam addTagIdListItem(Long tagIdListItem) {
        if (this.tagIdList == null) {
            this.tagIdList = new ArrayList<>();
        }
        this.tagIdList.add(tagIdListItem);
        return this;
    }

    public TagParam withTagIdList(Consumer<List<Long>> tagIdListSetter) {
        if (this.tagIdList == null) {
            this.tagIdList = new ArrayList<>();
        }
        tagIdListSetter.accept(this.tagIdList);
        return this;
    }

    /**
     * 环境标签id列表。
     * @return tagIdList
     */
    public List<Long> getTagIdList() {
        return tagIdList;
    }

    public void setTagIdList(List<Long> tagIdList) {
        this.tagIdList = tagIdList;
    }

    public TagParam withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public TagParam withPageEnable(Boolean pageEnable) {
        this.pageEnable = pageEnable;
        return this;
    }

    /**
     * 是否分页。
     * @return pageEnable
     */
    public Boolean getPageEnable() {
        return pageEnable;
    }

    public void setPageEnable(Boolean pageEnable) {
        this.pageEnable = pageEnable;
    }

    public TagParam withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 每页容量。
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public TagParam withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 当前页码。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public TagParam withAddEnvIdList(List<Long> addEnvIdList) {
        this.addEnvIdList = addEnvIdList;
        return this;
    }

    public TagParam addAddEnvIdListItem(Long addEnvIdListItem) {
        if (this.addEnvIdList == null) {
            this.addEnvIdList = new ArrayList<>();
        }
        this.addEnvIdList.add(addEnvIdListItem);
        return this;
    }

    public TagParam withAddEnvIdList(Consumer<List<Long>> addEnvIdListSetter) {
        if (this.addEnvIdList == null) {
            this.addEnvIdList = new ArrayList<>();
        }
        addEnvIdListSetter.accept(this.addEnvIdList);
        return this;
    }

    /**
     * 新增环境id列表。
     * @return addEnvIdList
     */
    public List<Long> getAddEnvIdList() {
        return addEnvIdList;
    }

    public void setAddEnvIdList(List<Long> addEnvIdList) {
        this.addEnvIdList = addEnvIdList;
    }

    public TagParam withAddTagIdList(List<Long> addTagIdList) {
        this.addTagIdList = addTagIdList;
        return this;
    }

    public TagParam addAddTagIdListItem(Long addTagIdListItem) {
        if (this.addTagIdList == null) {
            this.addTagIdList = new ArrayList<>();
        }
        this.addTagIdList.add(addTagIdListItem);
        return this;
    }

    public TagParam withAddTagIdList(Consumer<List<Long>> addTagIdListSetter) {
        if (this.addTagIdList == null) {
            this.addTagIdList = new ArrayList<>();
        }
        addTagIdListSetter.accept(this.addTagIdList);
        return this;
    }

    /**
     * 新增环境标签id列表。
     * @return addTagIdList
     */
    public List<Long> getAddTagIdList() {
        return addTagIdList;
    }

    public void setAddTagIdList(List<Long> addTagIdList) {
        this.addTagIdList = addTagIdList;
    }

    public TagParam withRemoveTagIdList(List<Long> removeTagIdList) {
        this.removeTagIdList = removeTagIdList;
        return this;
    }

    public TagParam addRemoveTagIdListItem(Long removeTagIdListItem) {
        if (this.removeTagIdList == null) {
            this.removeTagIdList = new ArrayList<>();
        }
        this.removeTagIdList.add(removeTagIdListItem);
        return this;
    }

    public TagParam withRemoveTagIdList(Consumer<List<Long>> removeTagIdListSetter) {
        if (this.removeTagIdList == null) {
            this.removeTagIdList = new ArrayList<>();
        }
        removeTagIdListSetter.accept(this.removeTagIdList);
        return this;
    }

    /**
     * 移除环境标签id列表。
     * @return removeTagIdList
     */
    public List<Long> getRemoveTagIdList() {
        return removeTagIdList;
    }

    public void setRemoveTagIdList(List<Long> removeTagIdList) {
        this.removeTagIdList = removeTagIdList;
    }

    public TagParam withRemoveEnvIdList(List<Long> removeEnvIdList) {
        this.removeEnvIdList = removeEnvIdList;
        return this;
    }

    public TagParam addRemoveEnvIdListItem(Long removeEnvIdListItem) {
        if (this.removeEnvIdList == null) {
            this.removeEnvIdList = new ArrayList<>();
        }
        this.removeEnvIdList.add(removeEnvIdListItem);
        return this;
    }

    public TagParam withRemoveEnvIdList(Consumer<List<Long>> removeEnvIdListSetter) {
        if (this.removeEnvIdList == null) {
            this.removeEnvIdList = new ArrayList<>();
        }
        removeEnvIdListSetter.accept(this.removeEnvIdList);
        return this;
    }

    /**
     * 移除的环境id列表。
     * @return removeEnvIdList
     */
    public List<Long> getRemoveEnvIdList() {
        return removeEnvIdList;
    }

    public void setRemoveEnvIdList(List<Long> removeEnvIdList) {
        this.removeEnvIdList = removeEnvIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagParam tagParam = (TagParam) o;
        return Objects.equals(this.tagId, tagParam.tagId) && Objects.equals(this.tagName, tagParam.tagName)
            && Objects.equals(this.envId, tagParam.envId) && Objects.equals(this.descp, tagParam.descp)
            && Objects.equals(this.businessId, tagParam.businessId)
            && Objects.equals(this.envIdList, tagParam.envIdList) && Objects.equals(this.tagIdList, tagParam.tagIdList)
            && Objects.equals(this.keyword, tagParam.keyword) && Objects.equals(this.pageEnable, tagParam.pageEnable)
            && Objects.equals(this.pageNumber, tagParam.pageNumber) && Objects.equals(this.pageSize, tagParam.pageSize)
            && Objects.equals(this.addEnvIdList, tagParam.addEnvIdList)
            && Objects.equals(this.addTagIdList, tagParam.addTagIdList)
            && Objects.equals(this.removeTagIdList, tagParam.removeTagIdList)
            && Objects.equals(this.removeEnvIdList, tagParam.removeEnvIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId,
            tagName,
            envId,
            descp,
            businessId,
            envIdList,
            tagIdList,
            keyword,
            pageEnable,
            pageNumber,
            pageSize,
            addEnvIdList,
            addTagIdList,
            removeTagIdList,
            removeEnvIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagParam {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    descp: ").append(toIndentedString(descp)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    envIdList: ").append(toIndentedString(envIdList)).append("\n");
        sb.append("    tagIdList: ").append(toIndentedString(tagIdList)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    pageEnable: ").append(toIndentedString(pageEnable)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    addEnvIdList: ").append(toIndentedString(addEnvIdList)).append("\n");
        sb.append("    addTagIdList: ").append(toIndentedString(addTagIdList)).append("\n");
        sb.append("    removeTagIdList: ").append(toIndentedString(removeTagIdList)).append("\n");
        sb.append("    removeEnvIdList: ").append(toIndentedString(removeEnvIdList)).append("\n");
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
