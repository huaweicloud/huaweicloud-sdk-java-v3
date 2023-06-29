package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateQaAskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang_result")

    private LangResult langResult;

    /**
     * - QA_BOT:  - TASK_BOT:  - CHAT_BOT:  - GRAPH_BOT:  - HW_CLOUD:  
     */
    public static final class ReplyTypeEnum {

        /**
         * Enum QA_BOT for value: "QA_BOT"
         */
        public static final ReplyTypeEnum QA_BOT = new ReplyTypeEnum("QA_BOT");

        /**
         * Enum TASK_BOT for value: "TASK_BOT"
         */
        public static final ReplyTypeEnum TASK_BOT = new ReplyTypeEnum("TASK_BOT");

        /**
         * Enum CHAT_BOT for value: "CHAT_BOT"
         */
        public static final ReplyTypeEnum CHAT_BOT = new ReplyTypeEnum("CHAT_BOT");

        /**
         * Enum GRAPH_BOT for value: "GRAPH_BOT"
         */
        public static final ReplyTypeEnum GRAPH_BOT = new ReplyTypeEnum("GRAPH_BOT");

        /**
         * Enum HW_CLOUD for value: "HW_CLOUD"
         */
        public static final ReplyTypeEnum HW_CLOUD = new ReplyTypeEnum("HW_CLOUD");

        private static final Map<String, ReplyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplyTypeEnum> createStaticFields() {
            Map<String, ReplyTypeEnum> map = new HashMap<>();
            map.put("QA_BOT", QA_BOT);
            map.put("TASK_BOT", TASK_BOT);
            map.put("CHAT_BOT", CHAT_BOT);
            map.put("GRAPH_BOT", GRAPH_BOT);
            map.put("HW_CLOUD", HW_CLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplyTypeEnum(String value) {
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
        public static ReplyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplyTypeEnum(value));
        }

        public static ReplyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplyTypeEnum) {
                return this.value.equals(((ReplyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_type")

    private ReplyTypeEnum replyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answers_detail")

    private AnswerDetail answersDetail;

    public CreateQaAskResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public CreateQaAskResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public CreateQaAskResponse withLangResult(LangResult langResult) {
        this.langResult = langResult;
        return this;
    }

    public CreateQaAskResponse withLangResult(Consumer<LangResult> langResultSetter) {
        if (this.langResult == null) {
            this.langResult = new LangResult();
            langResultSetter.accept(this.langResult);
        }

        return this;
    }

    /**
     * Get langResult
     * @return langResult
     */
    public LangResult getLangResult() {
        return langResult;
    }

    public void setLangResult(LangResult langResult) {
        this.langResult = langResult;
    }

    public CreateQaAskResponse withReplyType(ReplyTypeEnum replyType) {
        this.replyType = replyType;
        return this;
    }

    /**
     * - QA_BOT:  - TASK_BOT:  - CHAT_BOT:  - GRAPH_BOT:  - HW_CLOUD:  
     * @return replyType
     */
    public ReplyTypeEnum getReplyType() {
        return replyType;
    }

    public void setReplyType(ReplyTypeEnum replyType) {
        this.replyType = replyType;
    }

    public CreateQaAskResponse withSessionId(String sessionId) {
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

    public CreateQaAskResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateQaAskResponse withAnswersDetail(AnswerDetail answersDetail) {
        this.answersDetail = answersDetail;
        return this;
    }

    public CreateQaAskResponse withAnswersDetail(Consumer<AnswerDetail> answersDetailSetter) {
        if (this.answersDetail == null) {
            this.answersDetail = new AnswerDetail();
            answersDetailSetter.accept(this.answersDetail);
        }

        return this;
    }

    /**
     * Get answersDetail
     * @return answersDetail
     */
    public AnswerDetail getAnswersDetail() {
        return answersDetail;
    }

    public void setAnswersDetail(AnswerDetail answersDetail) {
        this.answersDetail = answersDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateQaAskResponse that = (CreateQaAskResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.langResult, that.langResult) && Objects.equals(this.replyType, that.replyType)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.answersDetail, that.answersDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, langResult, replyType, sessionId, requestId, answersDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQaAskResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    langResult: ").append(toIndentedString(langResult)).append("\n");
        sb.append("    replyType: ").append(toIndentedString(replyType)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    answersDetail: ").append(toIndentedString(answersDetail)).append("\n");
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
