package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryAssociatedQuestionReq
 */
public class QueryAssociatedQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    public QueryAssociatedQuestionReq withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * 用户输入问题
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QueryAssociatedQuestionReq withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * 返回匹配度最高的数据条数
     * minimum: 1
     * maximum: 10
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public QueryAssociatedQuestionReq withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public QueryAssociatedQuestionReq addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public QueryAssociatedQuestionReq withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 问答领域
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryAssociatedQuestionReq queryAssociatedQuestionReq = (QueryAssociatedQuestionReq) o;
        return Objects.equals(this.question, queryAssociatedQuestionReq.question)
            && Objects.equals(this.top, queryAssociatedQuestionReq.top)
            && Objects.equals(this.domains, queryAssociatedQuestionReq.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, top, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAssociatedQuestionReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
