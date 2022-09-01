package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DuplicateApiInfo
 */
public class DuplicateApiInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    @JacksonXmlProperty(localName = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    @JacksonXmlProperty(localName = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    @JacksonXmlProperty(localName = "remark")

    private String remark;

    /**
     * api类型： - self-owned：自有API - authorized：授权API
     */
    public static final class ApiTypeEnum {

        /**
         * Enum SELF_OWNED for value: "self-owned"
         */
        public static final ApiTypeEnum SELF_OWNED = new ApiTypeEnum("self-owned");

        /**
         * Enum AUTHORIZED for value: "authorized"
         */
        public static final ApiTypeEnum AUTHORIZED = new ApiTypeEnum("authorized");

        private static final Map<String, ApiTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiTypeEnum> createStaticFields() {
            Map<String, ApiTypeEnum> map = new HashMap<>();
            map.put("self-owned", SELF_OWNED);
            map.put("authorized", AUTHORIZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiTypeEnum(String value) {
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
        public static ApiTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiTypeEnum(value);
            }
            return result;
        }

        public static ApiTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiTypeEnum) {
                return this.value.equals(((ApiTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    @JacksonXmlProperty(localName = "api_type")

    private ApiTypeEnum apiType;

    public DuplicateApiInfo withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API ID
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public DuplicateApiInfo withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * API名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public DuplicateApiInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DuplicateApiInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DuplicateApiInfo withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * API描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DuplicateApiInfo withApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * api类型： - self-owned：自有API - authorized：授权API
     * @return apiType
     */
    public ApiTypeEnum getApiType() {
        return apiType;
    }

    public void setApiType(ApiTypeEnum apiType) {
        this.apiType = apiType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DuplicateApiInfo duplicateApiInfo = (DuplicateApiInfo) o;
        return Objects.equals(this.apiId, duplicateApiInfo.apiId)
            && Objects.equals(this.apiName, duplicateApiInfo.apiName)
            && Objects.equals(this.groupName, duplicateApiInfo.groupName)
            && Objects.equals(this.groupId, duplicateApiInfo.groupId)
            && Objects.equals(this.remark, duplicateApiInfo.remark)
            && Objects.equals(this.apiType, duplicateApiInfo.apiType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, apiName, groupName, groupId, remark, apiType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DuplicateApiInfo {\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
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
