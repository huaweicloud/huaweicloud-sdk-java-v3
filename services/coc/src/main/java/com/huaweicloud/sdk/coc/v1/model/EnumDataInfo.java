package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 基础数据
 */
public class EnumDataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cloud_service_id")

    private String currentCloudServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_id")

    private String levelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtm_region")

    private String mtmRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtm_type")

    private String mtmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_change_event")

    private Boolean isChangeEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_service_interrupt")

    private Boolean isServiceInterrupt;

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
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name_zh")

    private String fullNameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name_en")

    private String fullNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh_path")

    private String nameZhPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en_path")

    private String nameEnPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_id")

    private String bizId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_id")

    private String propId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_type_id")

    private String enumTypeId;

    public EnumDataInfo withCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
        return this;
    }

    /**
     * 扩展字段
     * @return currentCloudServiceId
     */
    public String getCurrentCloudServiceId() {
        return currentCloudServiceId;
    }

    public void setCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
    }

    public EnumDataInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 扩展字段
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnumDataInfo withLevelId(String levelId) {
        this.levelId = levelId;
        return this;
    }

    /**
     * 扩展字段
     * @return levelId
     */
    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public EnumDataInfo withMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
        return this;
    }

    /**
     * 扩展字段
     * @return mtmRegion
     */
    public String getMtmRegion() {
        return mtmRegion;
    }

    public void setMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
    }

    public EnumDataInfo withMtmType(String mtmType) {
        this.mtmType = mtmType;
        return this;
    }

    /**
     * 扩展字段
     * @return mtmType
     */
    public String getMtmType() {
        return mtmType;
    }

    public void setMtmType(String mtmType) {
        this.mtmType = mtmType;
    }

    public EnumDataInfo withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 扩展字段
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public EnumDataInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 扩展字段
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EnumDataInfo withIsChangeEvent(Boolean isChangeEvent) {
        this.isChangeEvent = isChangeEvent;
        return this;
    }

    /**
     * 是否变更事件
     * @return isChangeEvent
     */
    public Boolean getIsChangeEvent() {
        return isChangeEvent;
    }

    public void setIsChangeEvent(Boolean isChangeEvent) {
        this.isChangeEvent = isChangeEvent;
    }

    public EnumDataInfo withIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
        return this;
    }

    /**
     * 是否变更事件
     * @return isServiceInterrupt
     */
    public Boolean getIsServiceInterrupt() {
        return isServiceInterrupt;
    }

    public void setIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
    }

    public EnumDataInfo withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否删除
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public EnumDataInfo withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配类型
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public EnumDataInfo withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 所属单号
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public EnumDataInfo withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * 中文名
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public EnumDataInfo withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public EnumDataInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 工号
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public EnumDataInfo withFullNameZh(String fullNameZh) {
        this.fullNameZh = fullNameZh;
        return this;
    }

    /**
     * 中文名
     * @return fullNameZh
     */
    public String getFullNameZh() {
        return fullNameZh;
    }

    public void setFullNameZh(String fullNameZh) {
        this.fullNameZh = fullNameZh;
    }

    public EnumDataInfo withFullNameEn(String fullNameEn) {
        this.fullNameEn = fullNameEn;
        return this;
    }

    /**
     * 英文名
     * @return fullNameEn
     */
    public String getFullNameEn() {
        return fullNameEn;
    }

    public void setFullNameEn(String fullNameEn) {
        this.fullNameEn = fullNameEn;
    }

    public EnumDataInfo withNameZhPath(String nameZhPath) {
        this.nameZhPath = nameZhPath;
        return this;
    }

    /**
     * 中文名路径
     * @return nameZhPath
     */
    public String getNameZhPath() {
        return nameZhPath;
    }

    public void setNameZhPath(String nameZhPath) {
        this.nameZhPath = nameZhPath;
    }

    public EnumDataInfo withNameEnPath(String nameEnPath) {
        this.nameEnPath = nameEnPath;
        return this;
    }

    /**
     * 中文名路径
     * @return nameEnPath
     */
    public String getNameEnPath() {
        return nameEnPath;
    }

    public void setNameEnPath(String nameEnPath) {
        this.nameEnPath = nameEnPath;
    }

    public EnumDataInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EnumDataInfo withBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    /**
     * 唯一id
     * @return bizId
     */
    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public EnumDataInfo withPropId(String propId) {
        this.propId = propId;
        return this;
    }

    /**
     * 字段id
     * @return propId
     */
    public String getPropId() {
        return propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    public EnumDataInfo withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 模型id
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public EnumDataInfo withEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
        return this;
    }

    /**
     * 枚举类型
     * @return enumTypeId
     */
    public String getEnumTypeId() {
        return enumTypeId;
    }

    public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnumDataInfo that = (EnumDataInfo) obj;
        return Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.levelId, that.levelId)
            && Objects.equals(this.mtmRegion, that.mtmRegion) && Objects.equals(this.mtmType, that.mtmType)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.isChangeEvent, that.isChangeEvent)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt)
            && Objects.equals(this.isDeleted, that.isDeleted) && Objects.equals(this.matchType, that.matchType)
            && Objects.equals(this.ticketId, that.ticketId) && Objects.equals(this.nameZh, that.nameZh)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.fullNameZh, that.fullNameZh) && Objects.equals(this.fullNameEn, that.fullNameEn)
            && Objects.equals(this.nameZhPath, that.nameZhPath) && Objects.equals(this.nameEnPath, that.nameEnPath)
            && Objects.equals(this.status, that.status) && Objects.equals(this.bizId, that.bizId)
            && Objects.equals(this.propId, that.propId) && Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.enumTypeId, that.enumTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCloudServiceId,
            description,
            levelId,
            mtmRegion,
            mtmType,
            sourceId,
            title,
            isChangeEvent,
            isServiceInterrupt,
            isDeleted,
            matchType,
            ticketId,
            nameZh,
            nameEn,
            userName,
            fullNameZh,
            fullNameEn,
            nameZhPath,
            nameEnPath,
            status,
            bizId,
            propId,
            modelId,
            enumTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnumDataInfo {\n");
        sb.append("    currentCloudServiceId: ").append(toIndentedString(currentCloudServiceId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    levelId: ").append(toIndentedString(levelId)).append("\n");
        sb.append("    mtmRegion: ").append(toIndentedString(mtmRegion)).append("\n");
        sb.append("    mtmType: ").append(toIndentedString(mtmType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    isChangeEvent: ").append(toIndentedString(isChangeEvent)).append("\n");
        sb.append("    isServiceInterrupt: ").append(toIndentedString(isServiceInterrupt)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    fullNameZh: ").append(toIndentedString(fullNameZh)).append("\n");
        sb.append("    fullNameEn: ").append(toIndentedString(fullNameEn)).append("\n");
        sb.append("    nameZhPath: ").append(toIndentedString(nameZhPath)).append("\n");
        sb.append("    nameEnPath: ").append(toIndentedString(nameEnPath)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bizId: ").append(toIndentedString(bizId)).append("\n");
        sb.append("    propId: ").append(toIndentedString(propId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    enumTypeId: ").append(toIndentedString(enumTypeId)).append("\n");
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
