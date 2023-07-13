package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 位置信息
 */
public class Location {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    /**
     * 所属运营商。
     */
    public static final class OperatorEnum {

        /**
         * Enum CHINAMOBILE for value: "chinamobile"
         */
        public static final OperatorEnum CHINAMOBILE = new OperatorEnum("chinamobile");

        /**
         * Enum CHINAUNICOM for value: "chinaunicom"
         */
        public static final OperatorEnum CHINAUNICOM = new OperatorEnum("chinaunicom");

        /**
         * Enum CHINATELECOM for value: "chinatelecom"
         */
        public static final OperatorEnum CHINATELECOM = new OperatorEnum("chinatelecom");

        private static final Map<String, OperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperatorEnum> createStaticFields() {
            Map<String, OperatorEnum> map = new HashMap<>();
            map.put("chinamobile", CHINAMOBILE);
            map.put("chinaunicom", CHINAUNICOM);
            map.put("chinatelecom", CHINATELECOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperatorEnum(String value) {
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
        public static OperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperatorEnum(value));
        }

        public static OperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperatorEnum) {
                return this.value.equals(((OperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private OperatorEnum operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_count")

    private Integer stackCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city_short_name")

    private String cityShortName;

    public Location withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Location withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 所在大区。
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Location withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 所属省份英文名称。 大小写通用，皆支持
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Location withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 所在城市英文名称。
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Location withOperator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 所属运营商。
     * @return operator
     */
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public Location withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 线路ID。多线路场景下，创建的弹性公网IP在该线路下。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public Location withStackCount(Integer stackCount) {
        this.stackCount = stackCount;
        return this;
    }

    /**
     * 站点需要发放的资源(组)总数。
     * @return stackCount
     */
    public Integer getStackCount() {
        return stackCount;
    }

    public void setStackCount(Integer stackCount) {
        this.stackCount = stackCount;
    }

    public Location withCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
        return this;
    }

    /**
     * 城市简称。
     * @return cityShortName
     */
    public String getCityShortName() {
        return cityShortName;
    }

    public void setCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location that = (Location) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.area, that.area)
            && Objects.equals(this.province, that.province) && Objects.equals(this.city, that.city)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.stackCount, that.stackCount)
            && Objects.equals(this.cityShortName, that.cityShortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, area, province, city, operator, poolId, stackCount, cityShortName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    stackCount: ").append(toIndentedString(stackCount)).append("\n");
        sb.append("    cityShortName: ").append(toIndentedString(cityShortName)).append("\n");
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
