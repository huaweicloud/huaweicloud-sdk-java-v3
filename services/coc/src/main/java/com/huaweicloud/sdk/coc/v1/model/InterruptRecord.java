package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 中断记录
 */
public class InterruptRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 来源 SLI SLI指标 WARROOM warroom ALERTS 告警 MALFUNCTIONS 故障 OTHERS 其他
     */
    public static final class SourcesEnum {

        /**
         * Enum SLI for value: "SLI"
         */
        public static final SourcesEnum SLI = new SourcesEnum("SLI");

        /**
         * Enum WARROOM for value: "WARROOM"
         */
        public static final SourcesEnum WARROOM = new SourcesEnum("WARROOM");

        /**
         * Enum ALERTS for value: "ALERTS"
         */
        public static final SourcesEnum ALERTS = new SourcesEnum("ALERTS");

        /**
         * Enum MALFUNCTIONS for value: "MALFUNCTIONS"
         */
        public static final SourcesEnum MALFUNCTIONS = new SourcesEnum("MALFUNCTIONS");

        /**
         * Enum OTHERS for value: "OTHERS"
         */
        public static final SourcesEnum OTHERS = new SourcesEnum("OTHERS");

        private static final Map<String, SourcesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourcesEnum> createStaticFields() {
            Map<String, SourcesEnum> map = new HashMap<>();
            map.put("SLI", SLI);
            map.put("WARROOM", WARROOM);
            map.put("ALERTS", ALERTS);
            map.put("MALFUNCTIONS", MALFUNCTIONS);
            map.put("OTHERS", OTHERS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourcesEnum(String value) {
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
        public static SourcesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourcesEnum(value));
        }

        public static SourcesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourcesEnum) {
                return this.value.equals(((SourcesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private SourcesEnum sources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources_id")

    private String sourcesId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources_name")

    private String sourcesName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_start_time")

    private Long unavailableStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_end_time")

    private Long unavailableEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptions")

    private String descriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_id")

    private String modifiedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public InterruptRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InterruptRecord withSources(SourcesEnum sources) {
        this.sources = sources;
        return this;
    }

    /**
     * 来源 SLI SLI指标 WARROOM warroom ALERTS 告警 MALFUNCTIONS 故障 OTHERS 其他
     * @return sources
     */
    public SourcesEnum getSources() {
        return sources;
    }

    public void setSources(SourcesEnum sources) {
        this.sources = sources;
    }

    public InterruptRecord withSourcesId(String sourcesId) {
        this.sourcesId = sourcesId;
        return this;
    }

    /**
     * 来源ID
     * @return sourcesId
     */
    public String getSourcesId() {
        return sourcesId;
    }

    public void setSourcesId(String sourcesId) {
        this.sourcesId = sourcesId;
    }

    public InterruptRecord withSourcesName(String sourcesName) {
        this.sourcesName = sourcesName;
        return this;
    }

    /**
     * 来源名称
     * @return sourcesName
     */
    public String getSourcesName() {
        return sourcesName;
    }

    public void setSourcesName(String sourcesName) {
        this.sourcesName = sourcesName;
    }

    public InterruptRecord withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InterruptRecord withUnavailableStartTime(Long unavailableStartTime) {
        this.unavailableStartTime = unavailableStartTime;
        return this;
    }

    /**
     * 不可用开始时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return unavailableStartTime
     */
    public Long getUnavailableStartTime() {
        return unavailableStartTime;
    }

    public void setUnavailableStartTime(Long unavailableStartTime) {
        this.unavailableStartTime = unavailableStartTime;
    }

    public InterruptRecord withUnavailableEndTime(Long unavailableEndTime) {
        this.unavailableEndTime = unavailableEndTime;
        return this;
    }

    /**
     * 不可用结束时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return unavailableEndTime
     */
    public Long getUnavailableEndTime() {
        return unavailableEndTime;
    }

    public void setUnavailableEndTime(Long unavailableEndTime) {
        this.unavailableEndTime = unavailableEndTime;
    }

    public InterruptRecord withDescriptions(String descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    /**
     * 描述
     * @return descriptions
     */
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public InterruptRecord withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建人Id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public InterruptRecord withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public InterruptRecord withModifiedId(String modifiedId) {
        this.modifiedId = modifiedId;
        return this;
    }

    /**
     * 修改人ID
     * @return modifiedId
     */
    public String getModifiedId() {
        return modifiedId;
    }

    public void setModifiedId(String modifiedId) {
        this.modifiedId = modifiedId;
    }

    public InterruptRecord withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 修改人
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public InterruptRecord withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public InterruptRecord withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterruptRecord that = (InterruptRecord) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.sourcesId, that.sourcesId) && Objects.equals(this.sourcesName, that.sourcesName)
            && Objects.equals(this.region, that.region)
            && Objects.equals(this.unavailableStartTime, that.unavailableStartTime)
            && Objects.equals(this.unavailableEndTime, that.unavailableEndTime)
            && Objects.equals(this.descriptions, that.descriptions) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.modifiedId, that.modifiedId)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sources,
            sourcesId,
            sourcesName,
            region,
            unavailableStartTime,
            unavailableEndTime,
            descriptions,
            creatorId,
            creator,
            modifiedId,
            modifiedBy,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterruptRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    sourcesId: ").append(toIndentedString(sourcesId)).append("\n");
        sb.append("    sourcesName: ").append(toIndentedString(sourcesName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    unavailableStartTime: ").append(toIndentedString(unavailableStartTime)).append("\n");
        sb.append("    unavailableEndTime: ").append(toIndentedString(unavailableEndTime)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    modifiedId: ").append(toIndentedString(modifiedId)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
