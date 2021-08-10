package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListEnterpriseProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_projects")

    private List<EpDetail> enterpriseProjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListEnterpriseProjectResponse withEnterpriseProjects(List<EpDetail> enterpriseProjects) {
        this.enterpriseProjects = enterpriseProjects;
        return this;
    }

    public ListEnterpriseProjectResponse addEnterpriseProjectsItem(EpDetail enterpriseProjectsItem) {
        if (this.enterpriseProjects == null) {
            this.enterpriseProjects = new ArrayList<>();
        }
        this.enterpriseProjects.add(enterpriseProjectsItem);
        return this;
    }

    public ListEnterpriseProjectResponse withEnterpriseProjects(Consumer<List<EpDetail>> enterpriseProjectsSetter) {
        if (this.enterpriseProjects == null) {
            this.enterpriseProjects = new ArrayList<>();
        }
        enterpriseProjectsSetter.accept(this.enterpriseProjects);
        return this;
    }

    /** 企业项目列表
     * 
     * @return enterpriseProjects */
    public List<EpDetail> getEnterpriseProjects() {
        return enterpriseProjects;
    }

    public void setEnterpriseProjects(List<EpDetail> enterpriseProjects) {
        this.enterpriseProjects = enterpriseProjects;
    }

    public ListEnterpriseProjectResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 企业项目总数
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnterpriseProjectResponse listEnterpriseProjectResponse = (ListEnterpriseProjectResponse) o;
        return Objects.equals(this.enterpriseProjects, listEnterpriseProjectResponse.enterpriseProjects)
            && Objects.equals(this.totalCount, listEnterpriseProjectResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjects, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseProjectResponse {\n");
        sb.append("    enterpriseProjects: ").append(toIndentedString(enterpriseProjects)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
