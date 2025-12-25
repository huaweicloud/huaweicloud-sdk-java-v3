package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowSubscriptionResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    /**
     * **参数解释**: SKU信息 - FLOW_DATA_BANDWIDTH 数据流量带宽 - CSS_CAPACITY CSS 存储容量 - PAIMON_CAPACITY Paimon 存储容量 - OBS_CAPACITY OBS 存储容量 - JOB_CAPACITY 作业处理容量 - AD_HOC_COUNT 即席查询次数  **约束限制** 不涉及 **取值范围**: - FLOW_DATA_BANDWIDTH - CSS_CAPACITY - PAIMON_CAPACITY - OBS_CAPACITY - JOB_CAPACITY - AD_HOC_COUNT  **默认值** 不涉及        
     */
    public static final class SkuEnum {

        /**
         * Enum FLOW_DATA_BANDWIDTH for value: "FLOW_DATA_BANDWIDTH"
         */
        public static final SkuEnum FLOW_DATA_BANDWIDTH = new SkuEnum("FLOW_DATA_BANDWIDTH");

        /**
         * Enum CSS_CAPACITY for value: "CSS_CAPACITY"
         */
        public static final SkuEnum CSS_CAPACITY = new SkuEnum("CSS_CAPACITY");

        /**
         * Enum PAIMON_CAPACITY for value: "PAIMON_CAPACITY"
         */
        public static final SkuEnum PAIMON_CAPACITY = new SkuEnum("PAIMON_CAPACITY");

        /**
         * Enum OBS_CAPACITY for value: "OBS_CAPACITY"
         */
        public static final SkuEnum OBS_CAPACITY = new SkuEnum("OBS_CAPACITY");

        /**
         * Enum JOB_CAPACITY for value: "JOB_CAPACITY"
         */
        public static final SkuEnum JOB_CAPACITY = new SkuEnum("JOB_CAPACITY");

        /**
         * Enum AD_HOC_COUNT for value: "AD_HOC_COUNT"
         */
        public static final SkuEnum AD_HOC_COUNT = new SkuEnum("AD_HOC_COUNT");

        private static final Map<String, SkuEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SkuEnum> createStaticFields() {
            Map<String, SkuEnum> map = new HashMap<>();
            map.put("FLOW_DATA_BANDWIDTH", FLOW_DATA_BANDWIDTH);
            map.put("CSS_CAPACITY", CSS_CAPACITY);
            map.put("PAIMON_CAPACITY", PAIMON_CAPACITY);
            map.put("OBS_CAPACITY", OBS_CAPACITY);
            map.put("JOB_CAPACITY", JOB_CAPACITY);
            map.put("AD_HOC_COUNT", AD_HOC_COUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SkuEnum(String value) {
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
        public static SkuEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SkuEnum(value));
        }

        public static SkuEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SkuEnum) {
                return this.value.equals(((SkuEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku")

    private SkuEnum sku;

    public ShowSubscriptionResourcesRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowSubscriptionResourcesRequest withSku(SkuEnum sku) {
        this.sku = sku;
        return this;
    }

    /**
     * **参数解释**: SKU信息 - FLOW_DATA_BANDWIDTH 数据流量带宽 - CSS_CAPACITY CSS 存储容量 - PAIMON_CAPACITY Paimon 存储容量 - OBS_CAPACITY OBS 存储容量 - JOB_CAPACITY 作业处理容量 - AD_HOC_COUNT 即席查询次数  **约束限制** 不涉及 **取值范围**: - FLOW_DATA_BANDWIDTH - CSS_CAPACITY - PAIMON_CAPACITY - OBS_CAPACITY - JOB_CAPACITY - AD_HOC_COUNT  **默认值** 不涉及        
     * @return sku
     */
    public SkuEnum getSku() {
        return sku;
    }

    public void setSku(SkuEnum sku) {
        this.sku = sku;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubscriptionResourcesRequest that = (ShowSubscriptionResourcesRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.sku, that.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, sku);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubscriptionResourcesRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
