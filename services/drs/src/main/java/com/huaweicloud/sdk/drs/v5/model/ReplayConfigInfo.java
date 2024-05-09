package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 仿真参数信息。
 */
public class ReplayConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_instance_id")

    private String dbInstanceId;

    /**
     * 云类型： - AWSCloud：亚马逊云。 - TencentCloud：腾讯云。 - AliCloud：阿里云。
     */
    public static final class CloudTypeEnum {

        /**
         * Enum AWSCLOUD for value: "AWSCloud"
         */
        public static final CloudTypeEnum AWSCLOUD = new CloudTypeEnum("AWSCloud");

        /**
         * Enum TENCENTCLOUD for value: "TencentCloud"
         */
        public static final CloudTypeEnum TENCENTCLOUD = new CloudTypeEnum("TencentCloud");

        /**
         * Enum ALICLOUD for value: "AliCloud"
         */
        public static final CloudTypeEnum ALICLOUD = new CloudTypeEnum("AliCloud");

        private static final Map<String, CloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloudTypeEnum> createStaticFields() {
            Map<String, CloudTypeEnum> map = new HashMap<>();
            map.put("AWSCloud", AWSCLOUD);
            map.put("TencentCloud", TENCENTCLOUD);
            map.put("AliCloud", ALICLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloudTypeEnum(String value) {
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
        public static CloudTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CloudTypeEnum(value));
        }

        public static CloudTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CloudTypeEnum) {
                return this.value.equals(((CloudTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private CloudTypeEnum cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    /**
     * 源数据库来源。取值： - aws_aurora_mysql：Amazon Aurora MySQL。 - tencent_tdsql_c：腾讯云TDSQL-C MySQL。 - ali_rds_mysql：阿里云RDS MySQL。
     */
    public static final class DbSourceEnum {

        /**
         * Enum AWS_AURORA_MYSQL for value: "aws_aurora_mysql"
         */
        public static final DbSourceEnum AWS_AURORA_MYSQL = new DbSourceEnum("aws_aurora_mysql");

        /**
         * Enum TENCENT_TDSQL_C for value: "tencent_tdsql_c"
         */
        public static final DbSourceEnum TENCENT_TDSQL_C = new DbSourceEnum("tencent_tdsql_c");

        /**
         * Enum ALI_RDS_MYSQL for value: "ali_rds_mysql"
         */
        public static final DbSourceEnum ALI_RDS_MYSQL = new DbSourceEnum("ali_rds_mysql");

        private static final Map<String, DbSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbSourceEnum> createStaticFields() {
            Map<String, DbSourceEnum> map = new HashMap<>();
            map.put("aws_aurora_mysql", AWS_AURORA_MYSQL);
            map.put("tencent_tdsql_c", TENCENT_TDSQL_C);
            map.put("ali_rds_mysql", ALI_RDS_MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DbSourceEnum(String value) {
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
        public static DbSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DbSourceEnum(value));
        }

        public static DbSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DbSourceEnum) {
                return this.value.equals(((DbSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_source")

    private DbSourceEnum dbSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_source")

    private String trafficSource;

    public ReplayConfigInfo withDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }

    /**
     * 源实例ID。
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return dbInstanceId;
    }

    public void setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
    }

    public ReplayConfigInfo withCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 云类型： - AWSCloud：亚马逊云。 - TencentCloud：腾讯云。 - AliCloud：阿里云。
     * @return cloudType
     */
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public ReplayConfigInfo withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 其他云AK信息。
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public ReplayConfigInfo withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 其他云SK信息。
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public ReplayConfigInfo withDbSource(DbSourceEnum dbSource) {
        this.dbSource = dbSource;
        return this;
    }

    /**
     * 源数据库来源。取值： - aws_aurora_mysql：Amazon Aurora MySQL。 - tencent_tdsql_c：腾讯云TDSQL-C MySQL。 - ali_rds_mysql：阿里云RDS MySQL。
     * @return dbSource
     */
    public DbSourceEnum getDbSource() {
        return dbSource;
    }

    public void setDbSource(DbSourceEnum dbSource) {
        this.dbSource = dbSource;
    }

    public ReplayConfigInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 其他云Region名称。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ReplayConfigInfo withTrafficSource(String trafficSource) {
        this.trafficSource = trafficSource;
        return this;
    }

    /**
     * 流量文件来源。 - sdk：通过三方云API接口方式下载审计日志。
     * @return trafficSource
     */
    public String getTrafficSource() {
        return trafficSource;
    }

    public void setTrafficSource(String trafficSource) {
        this.trafficSource = trafficSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplayConfigInfo that = (ReplayConfigInfo) obj;
        return Objects.equals(this.dbInstanceId, that.dbInstanceId) && Objects.equals(this.cloudType, that.cloudType)
            && Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.dbSource, that.dbSource) && Objects.equals(this.region, that.region)
            && Objects.equals(this.trafficSource, that.trafficSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbInstanceId, cloudType, ak, sk, dbSource, region, trafficSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayConfigInfo {\n");
        sb.append("    dbInstanceId: ").append(toIndentedString(dbInstanceId)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    dbSource: ").append(toIndentedString(dbSource)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    trafficSource: ").append(toIndentedString(trafficSource)).append("\n");
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
