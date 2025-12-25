package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DatasetInfo
 */
public class DatasetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc")

    private String csvc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_region")

    private Long isRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private DatasetInfoReference reference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private Long sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private Object target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Long type;

    public DatasetInfo withCsvc(String csvc) {
        this.csvc = csvc;
        return this;
    }

    /**
     * 所属云服务,例如主机安全就填写hss
     * @return csvc
     */
    public String getCsvc() {
        return csvc;
    }

    public void setCsvc(String csvc) {
        this.csvc = csvc;
    }

    public DatasetInfo withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 启用状态：0未启用；1启用
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public DatasetInfo withIsRegion(Long isRegion) {
        this.isRegion = isRegion;
        return this;
    }

    /**
     * 位置信息：1 region；0 global
     * minimum: 0
     * maximum: 10
     * @return isRegion
     */
    public Long getIsRegion() {
        return isRegion;
    }

    public void setIsRegion(Long isRegion) {
        this.isRegion = isRegion;
    }

    public DatasetInfo withReference(DatasetInfoReference reference) {
        this.reference = reference;
        return this;
    }

    public DatasetInfo withReference(Consumer<DatasetInfoReference> referenceSetter) {
        if (this.reference == null) {
            this.reference = new DatasetInfoReference();
            referenceSetter.accept(this.reference);
        }

        return this;
    }

    /**
     * Get reference
     * @return reference
     */
    public DatasetInfoReference getReference() {
        return reference;
    }

    public void setReference(DatasetInfoReference reference) {
        this.reference = reference;
    }

    public DatasetInfo withSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 数据源ID
     * minimum: 0
     * maximum: 9223372036854775807
     * @return sourceId
     */
    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public DatasetInfo withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 数据源名称
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public DatasetInfo withTarget(Object target) {
        this.target = target;
        return this;
    }

    /**
     * 目标管道信息
     * @return target
     */
    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public DatasetInfo withType(Long type) {
        this.type = type;
        return this;
    }

    /**
     * 订阅类型：1租户订阅；2租户行管订阅；3平台行管(当前都为1)
     * minimum: 0
     * maximum: 10
     * @return type
     */
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatasetInfo that = (DatasetInfo) obj;
        return Objects.equals(this.csvc, that.csvc) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.isRegion, that.isRegion) && Objects.equals(this.reference, that.reference)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceName, that.sourceName)
            && Objects.equals(this.target, that.target) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csvc, enable, isRegion, reference, sourceId, sourceName, target, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasetInfo {\n");
        sb.append("    csvc: ").append(toIndentedString(csvc)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    isRegion: ").append(toIndentedString(isRegion)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
