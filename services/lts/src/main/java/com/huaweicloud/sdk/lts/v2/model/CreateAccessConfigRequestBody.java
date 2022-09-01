package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建日志接入请求体
 */
public class CreateAccessConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_name")

    @JacksonXmlProperty(localName = "access_config_name")

    private String accessConfigName;

    /**
     * 日志接入类型。AGENT：主机接入类型
     */
    public static final class AccessConfigTypeEnum {

        /**
         * Enum AGENT for value: "AGENT"
         */
        public static final AccessConfigTypeEnum AGENT = new AccessConfigTypeEnum("AGENT");

        private static final Map<String, AccessConfigTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessConfigTypeEnum> createStaticFields() {
            Map<String, AccessConfigTypeEnum> map = new HashMap<>();
            map.put("AGENT", AGENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessConfigTypeEnum(String value) {
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
        public static AccessConfigTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AccessConfigTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessConfigTypeEnum(value);
            }
            return result;
        }

        public static AccessConfigTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AccessConfigTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessConfigTypeEnum) {
                return this.value.equals(((AccessConfigTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_type")

    @JacksonXmlProperty(localName = "access_config_type")

    private AccessConfigTypeEnum accessConfigType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_detail")

    @JacksonXmlProperty(localName = "access_config_detail")

    private AccessConfigDeatilCreate accessConfigDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_info")

    @JacksonXmlProperty(localName = "log_info")

    private AccessConfigBaseLogInfoCreate logInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_info")

    @JacksonXmlProperty(localName = "host_group_info")

    private AccessConfigHostGroupIdListCreate hostGroupInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_tag")

    @JacksonXmlProperty(localName = "access_config_tag")

    private List<AccessConfigTag> accessConfigTag = null;

    public CreateAccessConfigRequestBody withAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
        return this;
    }

    /**
     * 日志接入名称
     * @return accessConfigName
     */
    public String getAccessConfigName() {
        return accessConfigName;
    }

    public void setAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
    }

    public CreateAccessConfigRequestBody withAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
        return this;
    }

    /**
     * 日志接入类型。AGENT：主机接入类型
     * @return accessConfigType
     */
    public AccessConfigTypeEnum getAccessConfigType() {
        return accessConfigType;
    }

    public void setAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
    }

    public CreateAccessConfigRequestBody withAccessConfigDetail(AccessConfigDeatilCreate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
        return this;
    }

    public CreateAccessConfigRequestBody withAccessConfigDetail(
        Consumer<AccessConfigDeatilCreate> accessConfigDetailSetter) {
        if (this.accessConfigDetail == null) {
            this.accessConfigDetail = new AccessConfigDeatilCreate();
            accessConfigDetailSetter.accept(this.accessConfigDetail);
        }

        return this;
    }

    /**
     * Get accessConfigDetail
     * @return accessConfigDetail
     */
    public AccessConfigDeatilCreate getAccessConfigDetail() {
        return accessConfigDetail;
    }

    public void setAccessConfigDetail(AccessConfigDeatilCreate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
    }

    public CreateAccessConfigRequestBody withLogInfo(AccessConfigBaseLogInfoCreate logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    public CreateAccessConfigRequestBody withLogInfo(Consumer<AccessConfigBaseLogInfoCreate> logInfoSetter) {
        if (this.logInfo == null) {
            this.logInfo = new AccessConfigBaseLogInfoCreate();
            logInfoSetter.accept(this.logInfo);
        }

        return this;
    }

    /**
     * Get logInfo
     * @return logInfo
     */
    public AccessConfigBaseLogInfoCreate getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(AccessConfigBaseLogInfoCreate logInfo) {
        this.logInfo = logInfo;
    }

    public CreateAccessConfigRequestBody withHostGroupInfo(AccessConfigHostGroupIdListCreate hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
        return this;
    }

    public CreateAccessConfigRequestBody withHostGroupInfo(
        Consumer<AccessConfigHostGroupIdListCreate> hostGroupInfoSetter) {
        if (this.hostGroupInfo == null) {
            this.hostGroupInfo = new AccessConfigHostGroupIdListCreate();
            hostGroupInfoSetter.accept(this.hostGroupInfo);
        }

        return this;
    }

    /**
     * Get hostGroupInfo
     * @return hostGroupInfo
     */
    public AccessConfigHostGroupIdListCreate getHostGroupInfo() {
        return hostGroupInfo;
    }

    public void setHostGroupInfo(AccessConfigHostGroupIdListCreate hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
    }

    public CreateAccessConfigRequestBody withAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
        return this;
    }

    public CreateAccessConfigRequestBody addAccessConfigTagItem(AccessConfigTag accessConfigTagItem) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        this.accessConfigTag.add(accessConfigTagItem);
        return this;
    }

    public CreateAccessConfigRequestBody withAccessConfigTag(Consumer<List<AccessConfigTag>> accessConfigTagSetter) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        accessConfigTagSetter.accept(this.accessConfigTag);
        return this;
    }

    /**
     * Get accessConfigTag
     * @return accessConfigTag
     */
    public List<AccessConfigTag> getAccessConfigTag() {
        return accessConfigTag;
    }

    public void setAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAccessConfigRequestBody createAccessConfigRequestBody = (CreateAccessConfigRequestBody) o;
        return Objects.equals(this.accessConfigName, createAccessConfigRequestBody.accessConfigName)
            && Objects.equals(this.accessConfigType, createAccessConfigRequestBody.accessConfigType)
            && Objects.equals(this.accessConfigDetail, createAccessConfigRequestBody.accessConfigDetail)
            && Objects.equals(this.logInfo, createAccessConfigRequestBody.logInfo)
            && Objects.equals(this.hostGroupInfo, createAccessConfigRequestBody.hostGroupInfo)
            && Objects.equals(this.accessConfigTag, createAccessConfigRequestBody.accessConfigTag);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(accessConfigName, accessConfigType, accessConfigDetail, logInfo, hostGroupInfo, accessConfigTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessConfigRequestBody {\n");
        sb.append("    accessConfigName: ").append(toIndentedString(accessConfigName)).append("\n");
        sb.append("    accessConfigType: ").append(toIndentedString(accessConfigType)).append("\n");
        sb.append("    accessConfigDetail: ").append(toIndentedString(accessConfigDetail)).append("\n");
        sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
        sb.append("    hostGroupInfo: ").append(toIndentedString(hostGroupInfo)).append("\n");
        sb.append("    accessConfigTag: ").append(toIndentedString(accessConfigTag)).append("\n");
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
