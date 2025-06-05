package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当前用户的项目信息列表
 */
public class ShowRelatedProjectResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_info_list")

    private List<ShowRelatedProjectResultProjectInfoList> projectInfoList = null;

    public ShowRelatedProjectResult withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShowRelatedProjectResult withProjectInfoList(List<ShowRelatedProjectResultProjectInfoList> projectInfoList) {
        this.projectInfoList = projectInfoList;
        return this;
    }

    public ShowRelatedProjectResult addProjectInfoListItem(
        ShowRelatedProjectResultProjectInfoList projectInfoListItem) {
        if (this.projectInfoList == null) {
            this.projectInfoList = new ArrayList<>();
        }
        this.projectInfoList.add(projectInfoListItem);
        return this;
    }

    public ShowRelatedProjectResult withProjectInfoList(
        Consumer<List<ShowRelatedProjectResultProjectInfoList>> projectInfoListSetter) {
        if (this.projectInfoList == null) {
            this.projectInfoList = new ArrayList<>();
        }
        projectInfoListSetter.accept(this.projectInfoList);
        return this;
    }

    /**
     * 项目信息列表
     * @return projectInfoList
     */
    public List<ShowRelatedProjectResultProjectInfoList> getProjectInfoList() {
        return projectInfoList;
    }

    public void setProjectInfoList(List<ShowRelatedProjectResultProjectInfoList> projectInfoList) {
        this.projectInfoList = projectInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRelatedProjectResult that = (ShowRelatedProjectResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.projectInfoList, that.projectInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, projectInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRelatedProjectResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    projectInfoList: ").append(toIndentedString(projectInfoList)).append("\n");
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
