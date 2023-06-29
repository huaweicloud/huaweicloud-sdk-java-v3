package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateScoresRequestModel
 */
public class CreateScoresRequestModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "competition_id")

    private String competitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_id")

    private String stageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "works_id")

    private Integer worksId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "works_kind")

    private String worksKind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    /**
     * 作品状态success|failed。判题时，需要对上传作品进行检查，当作品不符合要求时，应该返回failed，并将提示信息通过 message显示出来
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public CreateScoresRequestModel withCompetitionId(String competitionId) {
        this.competitionId = competitionId;
        return this;
    }

    /**
     * 大赛ID，大赛平台提供
     * @return competitionId
     */
    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public CreateScoresRequestModel withStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
     * 大赛阶段ID，大赛平台提供
     * @return stageId
     */
    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public CreateScoresRequestModel withWorksId(Integer worksId) {
        this.worksId = worksId;
        return this;
    }

    /**
     * 第三方服务作品ID
     * minimum: 1
     * maximum: 2147483647
     * @return worksId
     */
    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public CreateScoresRequestModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作品名称，名称最大字符数为75，并且不能有含有特殊符号
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateScoresRequestModel withWorksKind(String worksKind) {
        this.worksKind = worksKind;
        return this;
    }

    /**
     * 作品类型,例如docx、png、zip等
     * @return worksKind
     */
    public String getWorksKind() {
        return worksKind;
    }

    public void setWorksKind(String worksKind) {
        this.worksKind = worksKind;
    }

    public CreateScoresRequestModel withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 作品分数，作品状态为failed时传-1，计算长度时包括小数点，小数点后面最多保留四位
     * minimum: -1
     * maximum: 99999999999
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public CreateScoresRequestModel withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 作品状态success|failed。判题时，需要对上传作品进行检查，当作品不符合要求时，应该返回failed，并将提示信息通过 message显示出来
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateScoresRequestModel withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 作品创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateScoresRequestModel withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 作品备注信息
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CreateScoresRequestModel withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 作品描述信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateScoresRequestModel withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateScoresRequestModel withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateScoresRequestModel that = (CreateScoresRequestModel) obj;
        return Objects.equals(this.competitionId, that.competitionId) && Objects.equals(this.stageId, that.stageId)
            && Objects.equals(this.worksId, that.worksId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.worksKind, that.worksKind) && Objects.equals(this.score, that.score)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.note, that.note) && Objects.equals(this.message, that.message)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competitionId,
            stageId,
            worksId,
            name,
            worksKind,
            score,
            status,
            createdTime,
            note,
            message,
            domainId,
            userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScoresRequestModel {\n");
        sb.append("    competitionId: ").append(toIndentedString(competitionId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    worksId: ").append(toIndentedString(worksId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    worksKind: ").append(toIndentedString(worksKind)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
