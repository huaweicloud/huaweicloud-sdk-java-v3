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
 * AskQuestionReq
 */
public class AskQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_qa_pair_id")

    private String sourceQaPairId;

    /**
     * 操作类型:0-手动输入，1-单击热点问题，2-单击猜你想问，3-单击推荐问题，4-单击问题提示
     */
    public static final class OperateTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final OperateTypeEnum NUMBER_0 = new OperateTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final OperateTypeEnum NUMBER_1 = new OperateTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final OperateTypeEnum NUMBER_2 = new OperateTypeEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final OperateTypeEnum NUMBER_3 = new OperateTypeEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final OperateTypeEnum NUMBER_4 = new OperateTypeEnum(4);

        private static final Map<Integer, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, OperateTypeEnum> createStaticFields() {
            Map<Integer, OperateTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        OperateTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperateTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateTypeEnum(value));
        }

        public static OperateTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private OperateTypeEnum operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_enable")

    private String thresholdEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_id")

    private String productTypeId;

    public AskQuestionReq withQuestion(String question) {
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

    public AskQuestionReq withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public AskQuestionReq addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public AskQuestionReq withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 主题列表
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public AskQuestionReq withTop(Integer top) {
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

    public AskQuestionReq withSessionId(String sessionId) {
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

    public AskQuestionReq withSourceQaPairId(String sourceQaPairId) {
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

    public AskQuestionReq withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型:0-手动输入，1-单击热点问题，2-单击猜你想问，3-单击推荐问题，4-单击问题提示
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    public AskQuestionReq withThresholdEnable(String thresholdEnable) {
        this.thresholdEnable = thresholdEnable;
        return this;
    }

    /**
     * 是否启用内部阈值开关
     * @return thresholdEnable
     */
    public String getThresholdEnable() {
        return thresholdEnable;
    }

    public void setThresholdEnable(String thresholdEnable) {
        this.thresholdEnable = thresholdEnable;
    }

    public AskQuestionReq withProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
        return this;
    }

    /**
     * 产品类型id
     * @return productTypeId
     */
    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AskQuestionReq that = (AskQuestionReq) obj;
        return Objects.equals(this.question, that.question) && Objects.equals(this.domains, that.domains)
            && Objects.equals(this.top, that.top) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.sourceQaPairId, that.sourceQaPairId)
            && Objects.equals(this.operateType, that.operateType)
            && Objects.equals(this.thresholdEnable, that.thresholdEnable)
            && Objects.equals(this.productTypeId, that.productTypeId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(question, domains, top, sessionId, sourceQaPairId, operateType, thresholdEnable, productTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AskQuestionReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    sourceQaPairId: ").append(toIndentedString(sourceQaPairId)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    thresholdEnable: ").append(toIndentedString(thresholdEnable)).append("\n");
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
