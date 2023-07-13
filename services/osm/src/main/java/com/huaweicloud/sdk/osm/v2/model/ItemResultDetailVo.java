package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ItemResultDetailVo
 */
public class ItemResultDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private String response;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_id")

    private String checkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name_en")

    private String checkNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_url")

    private String suggestionUrl;

    public ItemResultDetailVo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * minimum: 0
     * maximum: 65535
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ItemResultDetailVo withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 检查项风险等级
     * minimum: 0
     * maximum: 65535
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ItemResultDetailVo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 检查项修复建议
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public ItemResultDetailVo withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * 检查项response
     * @return response
     */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public ItemResultDetailVo withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * 检查项ID
     * @return checkId
     */
    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public ItemResultDetailVo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * 检查项名称
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ItemResultDetailVo withCheckNameEn(String checkNameEn) {
        this.checkNameEn = checkNameEn;
        return this;
    }

    /**
     * 检查项英文名称
     * @return checkNameEn
     */
    public String getCheckNameEn() {
        return checkNameEn;
    }

    public void setCheckNameEn(String checkNameEn) {
        this.checkNameEn = checkNameEn;
    }

    public ItemResultDetailVo withSuggestionUrl(String suggestionUrl) {
        this.suggestionUrl = suggestionUrl;
        return this;
    }

    /**
     * 检查项修复建议URL
     * @return suggestionUrl
     */
    public String getSuggestionUrl() {
        return suggestionUrl;
    }

    public void setSuggestionUrl(String suggestionUrl) {
        this.suggestionUrl = suggestionUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemResultDetailVo that = (ItemResultDetailVo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.level, that.level)
            && Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.response, that.response)
            && Objects.equals(this.checkId, that.checkId) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkNameEn, that.checkNameEn)
            && Objects.equals(this.suggestionUrl, that.suggestionUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, level, suggestion, response, checkId, checkName, checkNameEn, suggestionUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemResultDetailVo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkNameEn: ").append(toIndentedString(checkNameEn)).append("\n");
        sb.append("    suggestionUrl: ").append(toIndentedString(suggestionUrl)).append("\n");
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
