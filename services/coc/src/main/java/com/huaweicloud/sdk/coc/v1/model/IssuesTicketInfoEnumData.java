package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单据枚举。
 */
public class IssuesTicketInfoEnumData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_ticket_id")

    private String realTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private String bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_id")

    private String propId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    public IssuesTicketInfoEnumData withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否已删除。
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public IssuesTicketInfoEnumData withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配的枚举类型。
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public IssuesTicketInfoEnumData withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 当前工单ID。
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public IssuesTicketInfoEnumData withRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
        return this;
    }

    /**
     * 工单单号。
     * @return realTicketId
     */
    public String getRealTicketId() {
        return realTicketId;
    }

    public void setRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
    }

    public IssuesTicketInfoEnumData withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * 中文名称。
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public IssuesTicketInfoEnumData withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名称。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public IssuesTicketInfoEnumData withBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 枚举值对应的唯一id，当match_type为reference__base_config.User时，biz_id的值为操作用户唯一Id。
     * @return bizId
     */
    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public IssuesTicketInfoEnumData withPropId(String propId) {
        this.propId = propId;
        return this;
    }

    /**
     * 当前枚举值对应的类型。
     * @return propId
     */
    public String getPropId() {
        return propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    public IssuesTicketInfoEnumData withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 后台不同应用对应的模型id。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssuesTicketInfoEnumData that = (IssuesTicketInfoEnumData) obj;
        return Objects.equals(this.isDeleted, that.isDeleted) && Objects.equals(this.matchType, that.matchType)
            && Objects.equals(this.ticketId, that.ticketId) && Objects.equals(this.realTicketId, that.realTicketId)
            && Objects.equals(this.nameZh, that.nameZh) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.bizId, that.bizId) && Objects.equals(this.propId, that.propId)
            && Objects.equals(this.modelId, that.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDeleted, matchType, ticketId, realTicketId, nameZh, nameEn, bizId, propId, modelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesTicketInfoEnumData {\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    realTicketId: ").append(toIndentedString(realTicketId)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    propId: ").append(toIndentedString(propId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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
