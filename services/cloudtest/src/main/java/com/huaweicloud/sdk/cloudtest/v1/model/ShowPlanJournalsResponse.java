package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowPlanJournalsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<ShowPlanJournalsResponseBody> body = null;

    public ShowPlanJournalsResponse withBody(List<ShowPlanJournalsResponseBody> body) {
        this.body = body;
        return this;
    }

    public ShowPlanJournalsResponse addBodyItem(ShowPlanJournalsResponseBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ShowPlanJournalsResponse withBody(Consumer<List<ShowPlanJournalsResponseBody>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /** 项目下查询测试计划列表返回结构
     * 
     * @return body */
    public List<ShowPlanJournalsResponseBody> getBody() {
        return body;
    }

    public void setBody(List<ShowPlanJournalsResponseBody> body) {
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
        ShowPlanJournalsResponse showPlanJournalsResponse = (ShowPlanJournalsResponse) o;
        return Objects.equals(this.body, showPlanJournalsResponse.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlanJournalsResponse {\n");
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
