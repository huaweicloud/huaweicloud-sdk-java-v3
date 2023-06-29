package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThreatIntel
 */
public class ThreatIntel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_type")

    private String indicatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "information_source")

    private String informationSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private Integer severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified")

    private OffsetDateTime modified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_from")

    private String validFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_until")

    private String validUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ThreatIntelProperties properties;

    public ThreatIntel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 情报Id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ThreatIntel withIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
        return this;
    }

    /**
     * 威胁情报类型，Domain、Email_Address、Hash_MD5、Hash_SHA1、Hash_SHA256、 Hash_SHA512、IPv4_Address、IPv6_Address、URL。
     * @return indicatorType
     */
    public String getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
    }

    public ThreatIntel withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签，如'矿池','外联'等，\"Directory Scan|Directory Traversal\"。
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ThreatIntel withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，不同来源目前置信度分值定义不一样（分数）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public ThreatIntel withInformationSource(String informationSource) {
        this.informationSource = informationSource;
        return this;
    }

    /**
     * 威胁情报源，最大64个字符。
     * @return informationSource
     */
    public String getInformationSource() {
        return informationSource;
    }

    public void setInformationSource(String informationSource) {
        this.informationSource = informationSource;
    }

    public ThreatIntel withSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 严重程度，不同渠道定义值不一样（分数）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return severity
     */
    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public ThreatIntel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 威胁情报描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ThreatIntel withModified(OffsetDateTime modified) {
        this.modified = modified;
        return this;
    }

    /**
     * 威胁情报的更新时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return modified
     */
    public OffsetDateTime getModified() {
        return modified;
    }

    public void setModified(OffsetDateTime modified) {
        this.modified = modified;
    }

    public ThreatIntel withValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * 有效期开始（可读字符串）。
     * @return validFrom
     */
    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public ThreatIntel withValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * 有效期结束（可读字符串）。
     * @return validUntil
     */
    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public ThreatIntel withProperties(ThreatIntelProperties properties) {
        this.properties = properties;
        return this;
    }

    public ThreatIntel withProperties(Consumer<ThreatIntelProperties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ThreatIntelProperties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public ThreatIntelProperties getProperties() {
        return properties;
    }

    public void setProperties(ThreatIntelProperties properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThreatIntel that = (ThreatIntel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.indicatorType, that.indicatorType)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.informationSource, that.informationSource)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.description, that.description)
            && Objects.equals(this.modified, that.modified) && Objects.equals(this.validFrom, that.validFrom)
            && Objects.equals(this.validUntil, that.validUntil) && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            indicatorType,
            labels,
            confidence,
            informationSource,
            severity,
            description,
            modified,
            validFrom,
            validUntil,
            properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreatIntel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    informationSource: ").append(toIndentedString(informationSource)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
