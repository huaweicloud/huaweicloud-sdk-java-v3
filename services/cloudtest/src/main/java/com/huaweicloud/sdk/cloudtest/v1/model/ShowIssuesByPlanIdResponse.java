package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowIssuesByPlanIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<ShowIssuesByPlanIdResponseBody> body = null;

    public ShowIssuesByPlanIdResponse withBody(List<ShowIssuesByPlanIdResponseBody> body) {
        this.body = body;
        return this;
    }

    public ShowIssuesByPlanIdResponse addBodyItem(ShowIssuesByPlanIdResponseBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ShowIssuesByPlanIdResponse withBody(Consumer<List<ShowIssuesByPlanIdResponseBody>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /** 查询某个测试计划关联的需求列表
     * 
     * @return body */
    public List<ShowIssuesByPlanIdResponseBody> getBody() {
        return body;
    }

    public void setBody(List<ShowIssuesByPlanIdResponseBody> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIssuesByPlanIdResponse showIssuesByPlanIdResponse = (ShowIssuesByPlanIdResponse) o;
        return Objects.equals(this.body, showIssuesByPlanIdResponse.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIssuesByPlanIdResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
