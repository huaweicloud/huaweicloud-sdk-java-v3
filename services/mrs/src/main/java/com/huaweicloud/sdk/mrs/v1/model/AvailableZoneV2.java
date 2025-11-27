package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可用区信息
 */
public class AvailableZoneV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_name")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_id")

    private String azId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_group_id")

    private String azGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_type")

    private String azType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_tags")

    private AvailableTag azTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_category")

    private Integer azCategory;

    /**
     * 当前可用区的销售策略，包括： - charge: 计费 - notCharge: 非计费
     */
    public static final class ChargePolicyEnum {

        /**
         * Enum CHARGE for value: "charge"
         */
        public static final ChargePolicyEnum CHARGE = new ChargePolicyEnum("charge");

        /**
         * Enum NOTCHARGE for value: "notCharge"
         */
        public static final ChargePolicyEnum NOTCHARGE = new ChargePolicyEnum("notCharge");

        private static final Map<String, ChargePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargePolicyEnum> createStaticFields() {
            Map<String, ChargePolicyEnum> map = new HashMap<>();
            map.put("charge", CHARGE);
            map.put("notCharge", NOTCHARGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargePolicyEnum(String value) {
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
        public static ChargePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargePolicyEnum(value));
        }

        public static ChargePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargePolicyEnum) {
                return this.value.equals(((ChargePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_policy")

    private ChargePolicyEnum chargePolicy;

    public AvailableZoneV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 可用区编码
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AvailableZoneV2 withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区编码
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public AvailableZoneV2 withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * 可用区名称
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public AvailableZoneV2 withAzId(String azId) {
        this.azId = azId;
        return this;
    }

    /**
     * 可用区id
     * @return azId
     */
    public String getAzId() {
        return azId;
    }

    public void setAzId(String azId) {
        this.azId = azId;
    }

    public AvailableZoneV2 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 可用区状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AvailableZoneV2 withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AvailableZoneV2 withAzGroupId(String azGroupId) {
        this.azGroupId = azGroupId;
        return this;
    }

    /**
     * 可用区分组id
     * @return azGroupId
     */
    public String getAzGroupId() {
        return azGroupId;
    }

    public void setAzGroupId(String azGroupId) {
        this.azGroupId = azGroupId;
    }

    public AvailableZoneV2 withAzType(String azType) {
        this.azType = azType;
        return this;
    }

    /**
     * 当前AZ的类型 Core 核心 Satellite 卫星 Dedicated 专属 Virtual 虚拟 Edge 边缘 EdgeCental 中心边缘 Hybrid 混合云
     * @return azType
     */
    public String getAzType() {
        return azType;
    }

    public void setAzType(String azType) {
        this.azType = azType;
    }

    public AvailableZoneV2 withAzTags(AvailableTag azTags) {
        this.azTags = azTags;
        return this;
    }

    public AvailableZoneV2 withAzTags(Consumer<AvailableTag> azTagsSetter) {
        if (this.azTags == null) {
            this.azTags = new AvailableTag();
            azTagsSetter.accept(this.azTags);
        }

        return this;
    }

    /**
     * Get azTags
     * @return azTags
     */
    public AvailableTag getAzTags() {
        return azTags;
    }

    public void setAzTags(AvailableTag azTags) {
        this.azTags = azTags;
    }

    public AvailableZoneV2 withAzCategory(Integer azCategory) {
        this.azCategory = azCategory;
        return this;
    }

    /**
     * 当前可用区的类型，包括： - 0: 大云主可用区 - 21: 本地可用区 - 41: 边缘可用区
     * @return azCategory
     */
    public Integer getAzCategory() {
        return azCategory;
    }

    public void setAzCategory(Integer azCategory) {
        this.azCategory = azCategory;
    }

    public AvailableZoneV2 withChargePolicy(ChargePolicyEnum chargePolicy) {
        this.chargePolicy = chargePolicy;
        return this;
    }

    /**
     * 当前可用区的销售策略，包括： - charge: 计费 - notCharge: 非计费
     * @return chargePolicy
     */
    public ChargePolicyEnum getChargePolicy() {
        return chargePolicy;
    }

    public void setChargePolicy(ChargePolicyEnum chargePolicy) {
        this.chargePolicy = chargePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailableZoneV2 that = (AvailableZoneV2) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.azName, that.azName) && Objects.equals(this.azId, that.azId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.azGroupId, that.azGroupId) && Objects.equals(this.azType, that.azType)
            && Objects.equals(this.azTags, that.azTags) && Objects.equals(this.azCategory, that.azCategory)
            && Objects.equals(this.chargePolicy, that.chargePolicy);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, azCode, azName, azId, status, regionId, azGroupId, azType, azTags, azCategory, chargePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableZoneV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    azId: ").append(toIndentedString(azId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    azGroupId: ").append(toIndentedString(azGroupId)).append("\n");
        sb.append("    azType: ").append(toIndentedString(azType)).append("\n");
        sb.append("    azTags: ").append(toIndentedString(azTags)).append("\n");
        sb.append("    azCategory: ").append(toIndentedString(azCategory)).append("\n");
        sb.append("    chargePolicy: ").append(toIndentedString(chargePolicy)).append("\n");
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
