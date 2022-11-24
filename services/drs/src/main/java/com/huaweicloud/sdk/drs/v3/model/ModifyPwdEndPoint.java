package com.huaweicloud.sdk.drs.v3.model;

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
 * 批量修改数据库密码请求列表
 */
public class ModifyPwdEndPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    private String dbPassword;

    /**
     * 类型，so：源库；ta：目标库。
     */
    public static final class EndPointTypeEnum {

        /**
         * Enum SO for value: "so"
         */
        public static final EndPointTypeEnum SO = new EndPointTypeEnum("so");

        /**
         * Enum TA for value: "ta"
         */
        public static final EndPointTypeEnum TA = new EndPointTypeEnum("ta");

        private static final Map<String, EndPointTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EndPointTypeEnum> createStaticFields() {
            Map<String, EndPointTypeEnum> map = new HashMap<>();
            map.put("so", SO);
            map.put("ta", TA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EndPointTypeEnum(String value) {
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
        public static EndPointTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EndPointTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EndPointTypeEnum(value);
            }
            return result;
        }

        public static EndPointTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EndPointTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EndPointTypeEnum) {
                return this.value.equals(((EndPointTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_point_type")

    private EndPointTypeEnum endPointType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kerberos")

    private KerberosVO kerberos;

    public ModifyPwdEndPoint withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * 数据库密码
     * @return dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public ModifyPwdEndPoint withEndPointType(EndPointTypeEnum endPointType) {
        this.endPointType = endPointType;
        return this;
    }

    /**
     * 类型，so：源库；ta：目标库。
     * @return endPointType
     */
    public EndPointTypeEnum getEndPointType() {
        return endPointType;
    }

    public void setEndPointType(EndPointTypeEnum endPointType) {
        this.endPointType = endPointType;
    }

    public ModifyPwdEndPoint withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ModifyPwdEndPoint withKerberos(KerberosVO kerberos) {
        this.kerberos = kerberos;
        return this;
    }

    public ModifyPwdEndPoint withKerberos(Consumer<KerberosVO> kerberosSetter) {
        if (this.kerberos == null) {
            this.kerberos = new KerberosVO();
            kerberosSetter.accept(this.kerberos);
        }

        return this;
    }

    /**
     * Get kerberos
     * @return kerberos
     */
    public KerberosVO getKerberos() {
        return kerberos;
    }

    public void setKerberos(KerberosVO kerberos) {
        this.kerberos = kerberos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyPwdEndPoint modifyPwdEndPoint = (ModifyPwdEndPoint) o;
        return Objects.equals(this.dbPassword, modifyPwdEndPoint.dbPassword)
            && Objects.equals(this.endPointType, modifyPwdEndPoint.endPointType)
            && Objects.equals(this.jobId, modifyPwdEndPoint.jobId)
            && Objects.equals(this.kerberos, modifyPwdEndPoint.kerberos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbPassword, endPointType, jobId, kerberos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPwdEndPoint {\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    endPointType: ").append(toIndentedString(endPointType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    kerberos: ").append(toIndentedString(kerberos)).append("\n");
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
