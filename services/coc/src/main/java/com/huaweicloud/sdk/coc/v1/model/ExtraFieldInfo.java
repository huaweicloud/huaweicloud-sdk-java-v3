package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtraFieldInfo
 */
public class ExtraFieldInfo {

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

    public ExtraFieldInfo withCurrentCloudServiceId(String currentCloudServiceId) {
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

    public ExtraFieldInfo withDescription(String description) {
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

    public ExtraFieldInfo withLevelId(String levelId) {
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

    public ExtraFieldInfo withMtmRegion(String mtmRegion) {
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

    public ExtraFieldInfo withMtmType(String mtmType) {
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

    public ExtraFieldInfo withSourceId(String sourceId) {
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

    public ExtraFieldInfo withTitle(String title) {
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

    public ExtraFieldInfo withIsChangeEvent(Boolean isChangeEvent) {
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

    public ExtraFieldInfo withIsServiceInterrupt(Boolean isServiceInterrupt) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtraFieldInfo that = (ExtraFieldInfo) obj;
        return Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.levelId, that.levelId)
            && Objects.equals(this.mtmRegion, that.mtmRegion) && Objects.equals(this.mtmType, that.mtmType)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.isChangeEvent, that.isChangeEvent)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt);
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
            isServiceInterrupt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraFieldInfo {\n");
        sb.append("    currentCloudServiceId: ").append(toIndentedString(currentCloudServiceId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    levelId: ").append(toIndentedString(levelId)).append("\n");
        sb.append("    mtmRegion: ").append(toIndentedString(mtmRegion)).append("\n");
        sb.append("    mtmType: ").append(toIndentedString(mtmType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    isChangeEvent: ").append(toIndentedString(isChangeEvent)).append("\n");
        sb.append("    isServiceInterrupt: ").append(toIndentedString(isServiceInterrupt)).append("\n");
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
