package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SessionAskQuestionReq
 */
public class SessionAskQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "themes")

    private List<RelationTheme> themes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_qa_pair_id")

    private String sourceQaPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_enable")

    private Boolean chatEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_id")

    private String productTypeId;

    public SessionAskQuestionReq withQuestion(String question) {
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

    public SessionAskQuestionReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 问答领域
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public SessionAskQuestionReq withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * 最大返回数据条数
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

    public SessionAskQuestionReq withThemes(List<RelationTheme> themes) {
        this.themes = themes;
        return this;
    }

    public SessionAskQuestionReq addThemesItem(RelationTheme themesItem) {
        if (this.themes == null) {
            this.themes = new ArrayList<>();
        }
        this.themes.add(themesItem);
        return this;
    }

    public SessionAskQuestionReq withThemes(Consumer<List<RelationTheme>> themesSetter) {
        if (this.themes == null) {
            this.themes = new ArrayList<>();
        }
        themesSetter.accept(this.themes);
        return this;
    }

    /**
     * 主题列表
     * @return themes
     */
    public List<RelationTheme> getThemes() {
        return themes;
    }

    public void setThemes(List<RelationTheme> themes) {
        this.themes = themes;
    }

    public SessionAskQuestionReq withSourceQaPairId(String sourceQaPairId) {
        this.sourceQaPairId = sourceQaPairId;
        return this;
    }

    /**
     * 语料ID
     * @return sourceQaPairId
     */
    public String getSourceQaPairId() {
        return sourceQaPairId;
    }

    public void setSourceQaPairId(String sourceQaPairId) {
        this.sourceQaPairId = sourceQaPairId;
    }

    public SessionAskQuestionReq withChatEnable(Boolean chatEnable) {
        this.chatEnable = chatEnable;
        return this;
    }

    /**
     * 是否需要兜底
     * @return chatEnable
     */
    public Boolean getChatEnable() {
        return chatEnable;
    }

    public void setChatEnable(Boolean chatEnable) {
        this.chatEnable = chatEnable;
    }

    public SessionAskQuestionReq withProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
        return this;
    }

    /**
     * 产品类型Id
     * @return productTypeId
     */
    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionAskQuestionReq sessionAskQuestionReq = (SessionAskQuestionReq) o;
        return Objects.equals(this.question, sessionAskQuestionReq.question)
            && Objects.equals(this.domain, sessionAskQuestionReq.domain)
            && Objects.equals(this.top, sessionAskQuestionReq.top)
            && Objects.equals(this.themes, sessionAskQuestionReq.themes)
            && Objects.equals(this.sourceQaPairId, sessionAskQuestionReq.sourceQaPairId)
            && Objects.equals(this.chatEnable, sessionAskQuestionReq.chatEnable)
            && Objects.equals(this.productTypeId, sessionAskQuestionReq.productTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, domain, top, themes, sourceQaPairId, chatEnable, productTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionAskQuestionReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
        sb.append("    sourceQaPairId: ").append(toIndentedString(sourceQaPairId)).append("\n");
        sb.append("    chatEnable: ").append(toIndentedString(chatEnable)).append("\n");
        sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
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
