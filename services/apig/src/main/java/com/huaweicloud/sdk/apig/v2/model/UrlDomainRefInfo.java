package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 域名详情及关联的证书、分组信息
 */
public class UrlDomainRefInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domain")

    private String urlDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final StatusEnum NUMBER_3 = new StatusEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final StatusEnum NUMBER_4 = new StatusEnum(4);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ssl_version")

    private String minSslVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_id")

    private String sslId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_name")

    private String sslName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_group_id")

    private String apiGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_group_name")

    private String apiGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public UrlDomainRefInfo withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    /**
     * 自定义域名
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    public UrlDomainRefInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义域名的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UrlDomainRefInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UrlDomainRefInfo withMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    /**
     * 支持的最小SSL版本
     * @return minSslVersion
     */
    public String getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
    }

    public UrlDomainRefInfo withSslId(String sslId) {
        this.sslId = sslId;
        return this;
    }

    /**
     * 证书ID
     * @return sslId
     */
    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    public UrlDomainRefInfo withSslName(String sslName) {
        this.sslName = sslName;
        return this;
    }

    /**
     * 证书名称
     * @return sslName
     */
    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    public UrlDomainRefInfo withApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }

    /**
     * 所属API分组ID
     * @return apiGroupId
     */
    public String getApiGroupId() {
        return apiGroupId;
    }

    public void setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
    }

    public UrlDomainRefInfo withApiGroupName(String apiGroupName) {
        this.apiGroupName = apiGroupName;
        return this;
    }

    /**
     * 所属API分组名称
     * @return apiGroupName
     */
    public String getApiGroupName() {
        return apiGroupName;
    }

    public void setApiGroupName(String apiGroupName) {
        this.apiGroupName = apiGroupName;
    }

    public UrlDomainRefInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 所属实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlDomainRefInfo urlDomainRefInfo = (UrlDomainRefInfo) o;
        return Objects.equals(this.urlDomain, urlDomainRefInfo.urlDomain)
            && Objects.equals(this.id, urlDomainRefInfo.id) && Objects.equals(this.status, urlDomainRefInfo.status)
            && Objects.equals(this.minSslVersion, urlDomainRefInfo.minSslVersion)
            && Objects.equals(this.sslId, urlDomainRefInfo.sslId)
            && Objects.equals(this.sslName, urlDomainRefInfo.sslName)
            && Objects.equals(this.apiGroupId, urlDomainRefInfo.apiGroupId)
            && Objects.equals(this.apiGroupName, urlDomainRefInfo.apiGroupName)
            && Objects.equals(this.instanceId, urlDomainRefInfo.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlDomain, id, status, minSslVersion, sslId, sslName, apiGroupId, apiGroupName, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDomainRefInfo {\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
        sb.append("    apiGroupId: ").append(toIndentedString(apiGroupId)).append("\n");
        sb.append("    apiGroupName: ").append(toIndentedString(apiGroupName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
