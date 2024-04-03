package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 骨干带宽对象
 */
public class BackboneBandwidthResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_status")

    private String adminStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "short_id")

    private String shortId;

    /**
     * 描述网络等级，从高到低分为铂金、金、银、铜
     */
    public static final class SlaLevelEnum {

        /**
         * Enum PT for value: "Pt"
         */
        public static final SlaLevelEnum PT = new SlaLevelEnum("Pt");

        /**
         * Enum AU for value: "Au"
         */
        public static final SlaLevelEnum AU = new SlaLevelEnum("Au");

        /**
         * Enum AG for value: "Ag"
         */
        public static final SlaLevelEnum AG = new SlaLevelEnum("Ag");

        /**
         * Enum CU for value: "Cu"
         */
        public static final SlaLevelEnum CU = new SlaLevelEnum("Cu");

        private static final Map<String, SlaLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SlaLevelEnum> createStaticFields() {
            Map<String, SlaLevelEnum> map = new HashMap<>();
            map.put("Pt", PT);
            map.put("Au", AU);
            map.put("Ag", AG);
            map.put("Cu", CU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SlaLevelEnum(String value) {
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
        public static SlaLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SlaLevelEnum(value));
        }

        public static SlaLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SlaLevelEnum) {
                return this.value.equals(((SlaLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_level")

    private SlaLevelEnum slaLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dscp")

    private Integer dscp;

    public BackboneBandwidthResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 骨干带宽的uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackboneBandwidthResp withAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
        return this;
    }

    /**
     * 骨干带宽的状态
     * @return adminStatus
     */
    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public BackboneBandwidthResp withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 骨干带宽的大小
     * minimum: 0
     * maximum: 2000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BackboneBandwidthResp withShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    /**
     * 骨干带宽的short_id
     * @return shortId
     */
    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public BackboneBandwidthResp withSlaLevel(SlaLevelEnum slaLevel) {
        this.slaLevel = slaLevel;
        return this;
    }

    /**
     * 描述网络等级，从高到低分为铂金、金、银、铜
     * @return slaLevel
     */
    public SlaLevelEnum getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(SlaLevelEnum slaLevel) {
        this.slaLevel = slaLevel;
    }

    public BackboneBandwidthResp withDscp(Integer dscp) {
        this.dscp = dscp;
        return this;
    }

    /**
     * 线路质量金银铜对应的DSCP值
     * minimum: 0
     * maximum: 63
     * @return dscp
     */
    public Integer getDscp() {
        return dscp;
    }

    public void setDscp(Integer dscp) {
        this.dscp = dscp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackboneBandwidthResp that = (BackboneBandwidthResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.adminStatus, that.adminStatus)
            && Objects.equals(this.size, that.size) && Objects.equals(this.shortId, that.shortId)
            && Objects.equals(this.slaLevel, that.slaLevel) && Objects.equals(this.dscp, that.dscp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adminStatus, size, shortId, slaLevel, dscp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackboneBandwidthResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    adminStatus: ").append(toIndentedString(adminStatus)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
        sb.append("    slaLevel: ").append(toIndentedString(slaLevel)).append("\n");
        sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
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
