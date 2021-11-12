package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListEnterpriseProjectsForUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise-projects")

    private List<ListEnterpriseProjectsResDetail> enterpriseProjects = null;

    public ListEnterpriseProjectsForUserResponse withEnterpriseProjects(
        List<ListEnterpriseProjectsResDetail> enterpriseProjects) {
        this.enterpriseProjects = enterpriseProjects;
        return this;
    }

    public ListEnterpriseProjectsForUserResponse addEnterpriseProjectsItem(
        ListEnterpriseProjectsResDetail enterpriseProjectsItem) {
        if (this.enterpriseProjects == null) {
            this.enterpriseProjects = new ArrayList<>();
        }
        this.enterpriseProjects.add(enterpriseProjectsItem);
        return this;
    }

    public ListEnterpriseProjectsForUserResponse withEnterpriseProjects(
        Consumer<List<ListEnterpriseProjectsResDetail>> enterpriseProjectsSetter) {
        if (this.enterpriseProjects == null) {
            this.enterpriseProjects = new ArrayList<>();
        }
        enterpriseProjectsSetter.accept(this.enterpriseProjects);
        return this;
    }

    /** 企业项目信息。
     * 
     * @return enterpriseProjects */
    public List<ListEnterpriseProjectsResDetail> getEnterpriseProjects() {
        return enterpriseProjects;
    }

    public void setEnterpriseProjects(List<ListEnterpriseProjectsResDetail> enterpriseProjects) {
        this.enterpriseProjects = enterpriseProjects;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnterpriseProjectsForUserResponse listEnterpriseProjectsForUserResponse =
            (ListEnterpriseProjectsForUserResponse) o;
        return Objects.equals(this.enterpriseProjects, listEnterpriseProjectsForUserResponse.enterpriseProjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseProjectsForUserResponse {\n");
        sb.append("    enterpriseProjects: ").append(toIndentedString(enterpriseProjects)).append("\n");
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
