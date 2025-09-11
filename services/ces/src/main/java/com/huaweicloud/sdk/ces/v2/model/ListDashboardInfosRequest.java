package com.huaweicloud.sdk.ces.v2.model;

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
public class ListDashboardInfosRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_favorite")

    private Boolean isFavorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_name")

    private String dashboardName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_id")

    private String dashboardId;

    /**
     * **参数解释**： 监控看板类型。 **约束限制**： 不涉及。 **取值范围**： - monitor_dashboard:表示监控大盘 - other:表示自定义看板 **默认取值**： 不涉及。 
     */
    public static final class DashboardTypeEnum {

        /**
         * Enum MONITOR_DASHBOARD for value: "monitor_dashboard"
         */
        public static final DashboardTypeEnum MONITOR_DASHBOARD = new DashboardTypeEnum("monitor_dashboard");

        /**
         * Enum OTHER for value: "other"
         */
        public static final DashboardTypeEnum OTHER = new DashboardTypeEnum("other");

        private static final Map<String, DashboardTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DashboardTypeEnum> createStaticFields() {
            Map<String, DashboardTypeEnum> map = new HashMap<>();
            map.put("monitor_dashboard", MONITOR_DASHBOARD);
            map.put("other", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DashboardTypeEnum(String value) {
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
        public static DashboardTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DashboardTypeEnum(value));
        }

        public static DashboardTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DashboardTypeEnum) {
                return this.value.equals(((DashboardTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_type")

    private DashboardTypeEnum dashboardType;

    public ListDashboardInfosRequest withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。 **约束限制**： 不涉及。 **取值范围**： 只能包含小写字母、数字、“-”、“_”，可以自定义企业项目ID，长度为36个字符。也可以为0（代表默认企业项目ID），all_granted_eps（代表所有企业项目ID）。           **默认取值**： 不涉及。 
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public ListDashboardInfosRequest withIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    /**
     * **参数解释**： 指定企业项目下监控看板是否收藏。 **约束限制**： 填此参数时，enterprise_id必填。 **取值范围**： - true:收藏 - false:未收藏          **默认取值**： 不涉及。 
     * @return isFavorite
     */
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public ListDashboardInfosRequest withDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }

    /**
     * **参数解释**： 监控看板名称。 **约束限制**： 不涉及。 **取值范围**： 长度为[1,128]个字符，只允许中文、英文、数字0-9、_和-          **默认取值**： 不涉及。 
     * @return dashboardName
     */
    public String getDashboardName() {
        return dashboardName;
    }

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    public ListDashboardInfosRequest withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * **参数解释**： 监控看板id。 **约束限制**： 不涉及。 **取值范围**： 以db开头，包含22个字母和数字，长度为24个字符 **默认取值**： 不涉及。 
     * @return dashboardId
     */
    public String getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    public ListDashboardInfosRequest withDashboardType(DashboardTypeEnum dashboardType) {
        this.dashboardType = dashboardType;
        return this;
    }

    /**
     * **参数解释**： 监控看板类型。 **约束限制**： 不涉及。 **取值范围**： - monitor_dashboard:表示监控大盘 - other:表示自定义看板 **默认取值**： 不涉及。 
     * @return dashboardType
     */
    public DashboardTypeEnum getDashboardType() {
        return dashboardType;
    }

    public void setDashboardType(DashboardTypeEnum dashboardType) {
        this.dashboardType = dashboardType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDashboardInfosRequest that = (ListDashboardInfosRequest) obj;
        return Objects.equals(this.enterpriseId, that.enterpriseId) && Objects.equals(this.isFavorite, that.isFavorite)
            && Objects.equals(this.dashboardName, that.dashboardName)
            && Objects.equals(this.dashboardId, that.dashboardId)
            && Objects.equals(this.dashboardType, that.dashboardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseId, isFavorite, dashboardName, dashboardId, dashboardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDashboardInfosRequest {\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
        sb.append("    dashboardName: ").append(toIndentedString(dashboardName)).append("\n");
        sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
        sb.append("    dashboardType: ").append(toIndentedString(dashboardType)).append("\n");
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
