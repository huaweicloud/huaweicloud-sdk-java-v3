package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * GlobalConnectionBandwidthSpecCode
 */
public class GlobalConnectionBandwidthSpecCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area")

    private String localArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area")

    private String remoteArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    /**
     * 支持的线路等级： - Pt: 铂金 - Au: 金 - Ag: 银
     */
    public static final class LevelEnum {

        /**
         * Enum PT for value: "Pt"
         */
        public static final LevelEnum PT = new LevelEnum("Pt");

        /**
         * Enum AU for value: "Au"
         */
        public static final LevelEnum AU = new LevelEnum("Au");

        /**
         * Enum AG for value: "Ag"
         */
        public static final LevelEnum AG = new LevelEnum("Ag");

        private static final Map<String, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LevelEnum> createStaticFields() {
            Map<String, LevelEnum> map = new HashMap<>();
            map.put("Pt", PT);
            map.put("Au", AU);
            map.put("Ag", AG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LevelEnum(String value) {
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
        public static LevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelEnum(value));
        }

        public static LevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku")

    private String sku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public GlobalConnectionBandwidthSpecCode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GlobalConnectionBandwidthSpecCode withLocalArea(String localArea) {
        this.localArea = localArea;
        return this;
    }

    /**
     * 功能说明：本端接入点，配合remote_area信息描述带宽实例应用的范围。 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点），站点编码通过接口获取，带宽类型为Region可不传，其他类型必传 
     * @return localArea
     */
    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public GlobalConnectionBandwidthSpecCode withRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
        return this;
    }

    /**
     * 功能说明：远端接入点，配合local_area信息描述带宽实例应用的范围。 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点），站点编码通过接口获取，带宽类型为Region可不传，其他类型必传 
     * @return remoteArea
     */
    public String getRemoteArea() {
        return remoteArea;
    }

    public void setRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
    }

    public GlobalConnectionBandwidthSpecCode withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public GlobalConnectionBandwidthSpecCode withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GlobalConnectionBandwidthSpecCode withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * 功能说明：线路规格中文名。
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public GlobalConnectionBandwidthSpecCode withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 功能说明：线路规格英文名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public GlobalConnectionBandwidthSpecCode withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * 支持的线路等级： - Pt: 铂金 - Au: 金 - Ag: 银
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public GlobalConnectionBandwidthSpecCode withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * 功能描述：GCB特定线路规格产品编码。
     * @return sku
     */
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public GlobalConnectionBandwidthSpecCode withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 功能描述：带宽起售值，单位Mbps。
     * minimum: 2
     * maximum: 999999
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalConnectionBandwidthSpecCode that = (GlobalConnectionBandwidthSpecCode) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.localArea, that.localArea)
            && Objects.equals(this.remoteArea, that.remoteArea) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.nameZh, that.nameZh)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.level, that.level)
            && Objects.equals(this.sku, that.sku) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localArea, remoteArea, createdAt, updatedAt, nameZh, nameEn, level, sku, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalConnectionBandwidthSpecCode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localArea: ").append(toIndentedString(localArea)).append("\n");
        sb.append("    remoteArea: ").append(toIndentedString(remoteArea)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
