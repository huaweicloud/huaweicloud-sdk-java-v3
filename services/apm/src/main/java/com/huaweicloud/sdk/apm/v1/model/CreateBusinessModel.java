package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateBusinessModel
 */
public class CreateBusinessModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descp")

    private String descp;

    /**
     * 新建类型
     */
    public static final class CmdbDatasourceTypeEnum {

        /**
         * Enum OTEL for value: "OTEL"
         */
        public static final CmdbDatasourceTypeEnum OTEL = new CmdbDatasourceTypeEnum("OTEL");

        /**
         * Enum SKYWALKING for value: "SKYWALKING"
         */
        public static final CmdbDatasourceTypeEnum SKYWALKING = new CmdbDatasourceTypeEnum("SKYWALKING");

        private static final Map<String, CmdbDatasourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CmdbDatasourceTypeEnum> createStaticFields() {
            Map<String, CmdbDatasourceTypeEnum> map = new HashMap<>();
            map.put("OTEL", OTEL);
            map.put("SKYWALKING", SKYWALKING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CmdbDatasourceTypeEnum(String value) {
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
        public static CmdbDatasourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CmdbDatasourceTypeEnum(value));
        }

        public static CmdbDatasourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CmdbDatasourceTypeEnum) {
                return this.value.equals(((CmdbDatasourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdb_datasource_type")

    private CmdbDatasourceTypeEnum cmdbDatasourceType;

    public CreateBusinessModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBusinessModel withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目ID
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public CreateBusinessModel withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * CMDB树显示的名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateBusinessModel withDescp(String descp) {
        this.descp = descp;
        return this;
    }

    /**
     * 描述
     * @return descp
     */
    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public CreateBusinessModel withCmdbDatasourceType(CmdbDatasourceTypeEnum cmdbDatasourceType) {
        this.cmdbDatasourceType = cmdbDatasourceType;
        return this;
    }

    /**
     * 新建类型
     * @return cmdbDatasourceType
     */
    public CmdbDatasourceTypeEnum getCmdbDatasourceType() {
        return cmdbDatasourceType;
    }

    public void setCmdbDatasourceType(CmdbDatasourceTypeEnum cmdbDatasourceType) {
        this.cmdbDatasourceType = cmdbDatasourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBusinessModel that = (CreateBusinessModel) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.epsId, that.epsId)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.descp, that.descp)
            && Objects.equals(this.cmdbDatasourceType, that.cmdbDatasourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, epsId, displayName, descp, cmdbDatasourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBusinessModel {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    descp: ").append(toIndentedString(descp)).append("\n");
        sb.append("    cmdbDatasourceType: ").append(toIndentedString(cmdbDatasourceType)).append("\n");
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
