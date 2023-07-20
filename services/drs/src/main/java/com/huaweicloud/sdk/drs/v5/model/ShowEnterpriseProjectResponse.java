package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowEnterpriseProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_list")

    private List<EnterpriseProject> enterpriseProjectList = null;

    public ShowEnterpriseProjectResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowEnterpriseProjectResponse withEnterpriseProjectList(List<EnterpriseProject> enterpriseProjectList) {
        this.enterpriseProjectList = enterpriseProjectList;
        return this;
    }

    public ShowEnterpriseProjectResponse addEnterpriseProjectListItem(EnterpriseProject enterpriseProjectListItem) {
        if (this.enterpriseProjectList == null) {
            this.enterpriseProjectList = new ArrayList<>();
        }
        this.enterpriseProjectList.add(enterpriseProjectListItem);
        return this;
    }

    public ShowEnterpriseProjectResponse withEnterpriseProjectList(
        Consumer<List<EnterpriseProject>> enterpriseProjectListSetter) {
        if (this.enterpriseProjectList == null) {
            this.enterpriseProjectList = new ArrayList<>();
        }
        enterpriseProjectListSetter.accept(this.enterpriseProjectList);
        return this;
    }

    /**
     * 企业项目列表。
     * @return enterpriseProjectList
     */
    public List<EnterpriseProject> getEnterpriseProjectList() {
        return enterpriseProjectList;
    }

    public void setEnterpriseProjectList(List<EnterpriseProject> enterpriseProjectList) {
        this.enterpriseProjectList = enterpriseProjectList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEnterpriseProjectResponse that = (ShowEnterpriseProjectResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.enterpriseProjectList, that.enterpriseProjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, enterpriseProjectList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnterpriseProjectResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    enterpriseProjectList: ").append(toIndentedString(enterpriseProjectList)).append("\n");
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
