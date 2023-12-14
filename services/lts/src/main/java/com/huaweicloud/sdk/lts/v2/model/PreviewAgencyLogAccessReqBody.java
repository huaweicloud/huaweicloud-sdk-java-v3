package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PreviewAgencyLogAccessReqBody
 */
public class PreviewAgencyLogAccessReqBody {

    /**
     * 日志访问类型
     */
    public static final class AgencyAccessTypeEnum {

        /**
         * Enum AGENCYACCESS for value: "AGENCYACCESS"
         */
        public static final AgencyAccessTypeEnum AGENCYACCESS = new AgencyAccessTypeEnum("AGENCYACCESS");

        private static final Map<String, AgencyAccessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgencyAccessTypeEnum> createStaticFields() {
            Map<String, AgencyAccessTypeEnum> map = new HashMap<>();
            map.put("AGENCYACCESS", AGENCYACCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgencyAccessTypeEnum(String value) {
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
        public static AgencyAccessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgencyAccessTypeEnum(value));
        }

        public static AgencyAccessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgencyAccessTypeEnum) {
                return this.value.equals(((AgencyAccessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_access_type")

    private AgencyAccessTypeEnum agencyAccessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_log_access")

    private String agencyLogAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_agencyStream_name")

    private String logAgencyStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_agencyStream_id")

    private String logAgencyStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_agencyGroup_name")

    private String logAgencyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_agencyGroup_id")

    private String logAgencyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_beAgencystream_name")

    private String logBeAgencystreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_beAgencystream_id")

    private String logBeAgencystreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_beAgencygroup_name")

    private String logBeAgencygroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_beAgencygroup_id")

    private String logBeAgencygroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_agency_project_id")

    private String beAgencyProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_project_id")

    private String agencyProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_domain_name")

    private String agencyDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public PreviewAgencyLogAccessReqBody withAgencyAccessType(AgencyAccessTypeEnum agencyAccessType) {
        this.agencyAccessType = agencyAccessType;
        return this;
    }

    /**
     * 日志访问类型
     * @return agencyAccessType
     */
    public AgencyAccessTypeEnum getAgencyAccessType() {
        return agencyAccessType;
    }

    public void setAgencyAccessType(AgencyAccessTypeEnum agencyAccessType) {
        this.agencyAccessType = agencyAccessType;
    }

    public PreviewAgencyLogAccessReqBody withAgencyLogAccess(String agencyLogAccess) {
        this.agencyLogAccess = agencyLogAccess;
        return this;
    }

    /**
     * 跨账号日志接入配置名称
     * @return agencyLogAccess
     */
    public String getAgencyLogAccess() {
        return agencyLogAccess;
    }

    public void setAgencyLogAccess(String agencyLogAccess) {
        this.agencyLogAccess = agencyLogAccess;
    }

    public PreviewAgencyLogAccessReqBody withLogAgencyStreamName(String logAgencyStreamName) {
        this.logAgencyStreamName = logAgencyStreamName;
        return this;
    }

    /**
     * 委托日志流名称
     * @return logAgencyStreamName
     */
    public String getLogAgencyStreamName() {
        return logAgencyStreamName;
    }

    public void setLogAgencyStreamName(String logAgencyStreamName) {
        this.logAgencyStreamName = logAgencyStreamName;
    }

    public PreviewAgencyLogAccessReqBody withLogAgencyStreamId(String logAgencyStreamId) {
        this.logAgencyStreamId = logAgencyStreamId;
        return this;
    }

    /**
     * 委托日志流id
     * @return logAgencyStreamId
     */
    public String getLogAgencyStreamId() {
        return logAgencyStreamId;
    }

    public void setLogAgencyStreamId(String logAgencyStreamId) {
        this.logAgencyStreamId = logAgencyStreamId;
    }

    public PreviewAgencyLogAccessReqBody withLogAgencyGroupName(String logAgencyGroupName) {
        this.logAgencyGroupName = logAgencyGroupName;
        return this;
    }

    /**
     * 委托日志组名称
     * @return logAgencyGroupName
     */
    public String getLogAgencyGroupName() {
        return logAgencyGroupName;
    }

    public void setLogAgencyGroupName(String logAgencyGroupName) {
        this.logAgencyGroupName = logAgencyGroupName;
    }

    public PreviewAgencyLogAccessReqBody withLogAgencyGroupId(String logAgencyGroupId) {
        this.logAgencyGroupId = logAgencyGroupId;
        return this;
    }

    /**
     * 委托日志组id
     * @return logAgencyGroupId
     */
    public String getLogAgencyGroupId() {
        return logAgencyGroupId;
    }

    public void setLogAgencyGroupId(String logAgencyGroupId) {
        this.logAgencyGroupId = logAgencyGroupId;
    }

    public PreviewAgencyLogAccessReqBody withLogBeAgencystreamName(String logBeAgencystreamName) {
        this.logBeAgencystreamName = logBeAgencystreamName;
        return this;
    }

    /**
     * 被委托日志流名称
     * @return logBeAgencystreamName
     */
    public String getLogBeAgencystreamName() {
        return logBeAgencystreamName;
    }

    public void setLogBeAgencystreamName(String logBeAgencystreamName) {
        this.logBeAgencystreamName = logBeAgencystreamName;
    }

    public PreviewAgencyLogAccessReqBody withLogBeAgencystreamId(String logBeAgencystreamId) {
        this.logBeAgencystreamId = logBeAgencystreamId;
        return this;
    }

    /**
     * 被委托日志流id
     * @return logBeAgencystreamId
     */
    public String getLogBeAgencystreamId() {
        return logBeAgencystreamId;
    }

    public void setLogBeAgencystreamId(String logBeAgencystreamId) {
        this.logBeAgencystreamId = logBeAgencystreamId;
    }

    public PreviewAgencyLogAccessReqBody withLogBeAgencygroupName(String logBeAgencygroupName) {
        this.logBeAgencygroupName = logBeAgencygroupName;
        return this;
    }

    /**
     * 被委托日志组名称
     * @return logBeAgencygroupName
     */
    public String getLogBeAgencygroupName() {
        return logBeAgencygroupName;
    }

    public void setLogBeAgencygroupName(String logBeAgencygroupName) {
        this.logBeAgencygroupName = logBeAgencygroupName;
    }

    public PreviewAgencyLogAccessReqBody withLogBeAgencygroupId(String logBeAgencygroupId) {
        this.logBeAgencygroupId = logBeAgencygroupId;
        return this;
    }

    /**
     * 被委托日志组id
     * @return logBeAgencygroupId
     */
    public String getLogBeAgencygroupId() {
        return logBeAgencygroupId;
    }

    public void setLogBeAgencygroupId(String logBeAgencygroupId) {
        this.logBeAgencygroupId = logBeAgencygroupId;
    }

    public PreviewAgencyLogAccessReqBody withBeAgencyProjectId(String beAgencyProjectId) {
        this.beAgencyProjectId = beAgencyProjectId;
        return this;
    }

    /**
     * 被委托项目id
     * @return beAgencyProjectId
     */
    public String getBeAgencyProjectId() {
        return beAgencyProjectId;
    }

    public void setBeAgencyProjectId(String beAgencyProjectId) {
        this.beAgencyProjectId = beAgencyProjectId;
    }

    public PreviewAgencyLogAccessReqBody withAgencyProjectId(String agencyProjectId) {
        this.agencyProjectId = agencyProjectId;
        return this;
    }

    /**
     * 委托项目id
     * @return agencyProjectId
     */
    public String getAgencyProjectId() {
        return agencyProjectId;
    }

    public void setAgencyProjectId(String agencyProjectId) {
        this.agencyProjectId = agencyProjectId;
    }

    public PreviewAgencyLogAccessReqBody withAgencyDomainName(String agencyDomainName) {
        this.agencyDomainName = agencyDomainName;
        return this;
    }

    /**
     * 委托账号名称
     * @return agencyDomainName
     */
    public String getAgencyDomainName() {
        return agencyDomainName;
    }

    public void setAgencyDomainName(String agencyDomainName) {
        this.agencyDomainName = agencyDomainName;
    }

    public PreviewAgencyLogAccessReqBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreviewAgencyLogAccessReqBody that = (PreviewAgencyLogAccessReqBody) obj;
        return Objects.equals(this.agencyAccessType, that.agencyAccessType)
            && Objects.equals(this.agencyLogAccess, that.agencyLogAccess)
            && Objects.equals(this.logAgencyStreamName, that.logAgencyStreamName)
            && Objects.equals(this.logAgencyStreamId, that.logAgencyStreamId)
            && Objects.equals(this.logAgencyGroupName, that.logAgencyGroupName)
            && Objects.equals(this.logAgencyGroupId, that.logAgencyGroupId)
            && Objects.equals(this.logBeAgencystreamName, that.logBeAgencystreamName)
            && Objects.equals(this.logBeAgencystreamId, that.logBeAgencystreamId)
            && Objects.equals(this.logBeAgencygroupName, that.logBeAgencygroupName)
            && Objects.equals(this.logBeAgencygroupId, that.logBeAgencygroupId)
            && Objects.equals(this.beAgencyProjectId, that.beAgencyProjectId)
            && Objects.equals(this.agencyProjectId, that.agencyProjectId)
            && Objects.equals(this.agencyDomainName, that.agencyDomainName)
            && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyAccessType,
            agencyLogAccess,
            logAgencyStreamName,
            logAgencyStreamId,
            logAgencyGroupName,
            logAgencyGroupId,
            logBeAgencystreamName,
            logBeAgencystreamId,
            logBeAgencygroupName,
            logBeAgencygroupId,
            beAgencyProjectId,
            agencyProjectId,
            agencyDomainName,
            agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewAgencyLogAccessReqBody {\n");
        sb.append("    agencyAccessType: ").append(toIndentedString(agencyAccessType)).append("\n");
        sb.append("    agencyLogAccess: ").append(toIndentedString(agencyLogAccess)).append("\n");
        sb.append("    logAgencyStreamName: ").append(toIndentedString(logAgencyStreamName)).append("\n");
        sb.append("    logAgencyStreamId: ").append(toIndentedString(logAgencyStreamId)).append("\n");
        sb.append("    logAgencyGroupName: ").append(toIndentedString(logAgencyGroupName)).append("\n");
        sb.append("    logAgencyGroupId: ").append(toIndentedString(logAgencyGroupId)).append("\n");
        sb.append("    logBeAgencystreamName: ").append(toIndentedString(logBeAgencystreamName)).append("\n");
        sb.append("    logBeAgencystreamId: ").append(toIndentedString(logBeAgencystreamId)).append("\n");
        sb.append("    logBeAgencygroupName: ").append(toIndentedString(logBeAgencygroupName)).append("\n");
        sb.append("    logBeAgencygroupId: ").append(toIndentedString(logBeAgencygroupId)).append("\n");
        sb.append("    beAgencyProjectId: ").append(toIndentedString(beAgencyProjectId)).append("\n");
        sb.append("    agencyProjectId: ").append(toIndentedString(agencyProjectId)).append("\n");
        sb.append("    agencyDomainName: ").append(toIndentedString(agencyDomainName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
