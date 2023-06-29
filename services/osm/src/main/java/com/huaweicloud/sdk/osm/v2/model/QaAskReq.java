package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QaAskReq
 */
public class QaAskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "themes")

    private List<RelationTheme> themes = null;

    /**
     * - PORTAL:  - INCIDENT:  
     */
    public static final class SourceEnum {

        /**
         * Enum PORTAL for value: "PORTAL"
         */
        public static final SourceEnum PORTAL = new SourceEnum("PORTAL");

        /**
         * Enum INCIDENT for value: "INCIDENT"
         */
        public static final SourceEnum INCIDENT = new SourceEnum("INCIDENT");

        private static final Map<String, SourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceEnum> createStaticFields() {
            Map<String, SourceEnum> map = new HashMap<>();
            map.put("PORTAL", PORTAL);
            map.put("INCIDENT", INCIDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceEnum(value));
        }

        public static SourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceEnum) {
                return this.value.equals(((SourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceEnum source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_qa_pair_id")

    private String sourceQaPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alternative_answer_enable")

    private Boolean alternativeAnswerEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_id")

    private String productTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specify_node_id")

    private String specifyNodeId;

    public QaAskReq withQuestion(String question) {
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

    public QaAskReq withTop(Integer top) {
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

    public QaAskReq withThemes(List<RelationTheme> themes) {
        this.themes = themes;
        return this;
    }

    public QaAskReq addThemesItem(RelationTheme themesItem) {
        if (this.themes == null) {
            this.themes = new ArrayList<>();
        }
        this.themes.add(themesItem);
        return this;
    }

    public QaAskReq withThemes(Consumer<List<RelationTheme>> themesSetter) {
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

    public QaAskReq withSource(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * - PORTAL:  - INCIDENT:  
     * @return source
     */
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public QaAskReq withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public QaAskReq withSourceQaPairId(String sourceQaPairId) {
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

    public QaAskReq withAlternativeAnswerEnable(Boolean alternativeAnswerEnable) {
        this.alternativeAnswerEnable = alternativeAnswerEnable;
        return this;
    }

    /**
     * 是否需要备选答案
     * @return alternativeAnswerEnable
     */
    public Boolean getAlternativeAnswerEnable() {
        return alternativeAnswerEnable;
    }

    public void setAlternativeAnswerEnable(Boolean alternativeAnswerEnable) {
        this.alternativeAnswerEnable = alternativeAnswerEnable;
    }

    public QaAskReq withProductTypeId(String productTypeId) {
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

    public QaAskReq withSpecifyNodeId(String specifyNodeId) {
        this.specifyNodeId = specifyNodeId;
        return this;
    }

    /**
     * 指定的节点ID
     * @return specifyNodeId
     */
    public String getSpecifyNodeId() {
        return specifyNodeId;
    }

    public void setSpecifyNodeId(String specifyNodeId) {
        this.specifyNodeId = specifyNodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QaAskReq that = (QaAskReq) obj;
        return Objects.equals(this.question, that.question) && Objects.equals(this.top, that.top)
            && Objects.equals(this.themes, that.themes) && Objects.equals(this.source, that.source)
            && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.sourceQaPairId, that.sourceQaPairId)
            && Objects.equals(this.alternativeAnswerEnable, that.alternativeAnswerEnable)
            && Objects.equals(this.productTypeId, that.productTypeId)
            && Objects.equals(this.specifyNodeId, that.specifyNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question,
            top,
            themes,
            source,
            sessionId,
            sourceQaPairId,
            alternativeAnswerEnable,
            productTypeId,
            specifyNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaAskReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    sourceQaPairId: ").append(toIndentedString(sourceQaPairId)).append("\n");
        sb.append("    alternativeAnswerEnable: ").append(toIndentedString(alternativeAnswerEnable)).append("\n");
        sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
        sb.append("    specifyNodeId: ").append(toIndentedString(specifyNodeId)).append("\n");
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
