package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新合并请求打分请求体
 */
public class MergeRequestVoteBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    /**
     * **参数解释：** 操作类型(同一分数再次调用会删除打分, 传vote则不会删除)。
     */
    public static final class ActionEnum {

        /**
         * Enum VOTE for value: "vote"
         */
        public static final ActionEnum VOTE = new ActionEnum("vote");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("vote", VOTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    public MergeRequestVoteBodyDto withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 分数。
     * minimum: -2
     * maximum: 2
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public MergeRequestVoteBodyDto withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 操作类型(同一分数再次调用会删除打分, 传vote则不会删除)。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestVoteBodyDto that = (MergeRequestVoteBodyDto) obj;
        return Objects.equals(this.score, that.score) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestVoteBodyDto {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
