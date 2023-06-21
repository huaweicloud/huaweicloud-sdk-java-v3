package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分类详情
 */
public class AtlasClassificationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_guid")

    private String entityGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propagate")

    private Boolean propagate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity_periods")

    private List<TimeBoundary> validityPeriods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    public AtlasClassificationInfo withEntityGuid(String entityGuid) {
        this.entityGuid = entityGuid;
        return this;
    }

    /**
     * guid
     * @return entityGuid
     */
    public String getEntityGuid() {
        return entityGuid;
    }

    public void setEntityGuid(String entityGuid) {
        this.entityGuid = entityGuid;
    }

    public AtlasClassificationInfo withPropagate(Boolean propagate) {
        this.propagate = propagate;
        return this;
    }

    /**
     * 是否传播
     * @return propagate
     */
    public Boolean getPropagate() {
        return propagate;
    }

    public void setPropagate(Boolean propagate) {
        this.propagate = propagate;
    }

    public AtlasClassificationInfo withValidityPeriods(List<TimeBoundary> validityPeriods) {
        this.validityPeriods = validityPeriods;
        return this;
    }

    public AtlasClassificationInfo addValidityPeriodsItem(TimeBoundary validityPeriodsItem) {
        if (this.validityPeriods == null) {
            this.validityPeriods = new ArrayList<>();
        }
        this.validityPeriods.add(validityPeriodsItem);
        return this;
    }

    public AtlasClassificationInfo withValidityPeriods(Consumer<List<TimeBoundary>> validityPeriodsSetter) {
        if (this.validityPeriods == null) {
            this.validityPeriods = new ArrayList<>();
        }
        validityPeriodsSetter.accept(this.validityPeriods);
        return this;
    }

    /**
     * 时间信息
     * @return validityPeriods
     */
    public List<TimeBoundary> getValidityPeriods() {
        return validityPeriods;
    }

    public void setValidityPeriods(List<TimeBoundary> validityPeriods) {
        this.validityPeriods = validityPeriods;
    }

    public AtlasClassificationInfo withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 类型名称
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public AtlasClassificationInfo withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 实体map Map<String, Object>
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtlasClassificationInfo atlasClassificationInfo = (AtlasClassificationInfo) o;
        return Objects.equals(this.entityGuid, atlasClassificationInfo.entityGuid)
            && Objects.equals(this.propagate, atlasClassificationInfo.propagate)
            && Objects.equals(this.validityPeriods, atlasClassificationInfo.validityPeriods)
            && Objects.equals(this.typeName, atlasClassificationInfo.typeName)
            && Objects.equals(this.attributes, atlasClassificationInfo.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityGuid, propagate, validityPeriods, typeName, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AtlasClassificationInfo {\n");
        sb.append("    entityGuid: ").append(toIndentedString(entityGuid)).append("\n");
        sb.append("    propagate: ").append(toIndentedString(propagate)).append("\n");
        sb.append("    validityPeriods: ").append(toIndentedString(validityPeriods)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
