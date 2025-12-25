package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPlatformManagedResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_region")

    private String dwRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_managed_domain_id")

    private String platformManagedDomainId;

    /**
     * 发布状态.
     */
    public static final class PublishStatusEnum {

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final PublishStatusEnum DISABLE = new PublishStatusEnum("DISABLE");

        /**
         * Enum PROD for value: "PROD"
         */
        public static final PublishStatusEnum PROD = new PublishStatusEnum("PROD");

        /**
         * Enum GRAY for value: "GRAY"
         */
        public static final PublishStatusEnum GRAY = new PublishStatusEnum("GRAY");

        private static final Map<String, PublishStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublishStatusEnum> createStaticFields() {
            Map<String, PublishStatusEnum> map = new HashMap<>();
            map.put("DISABLE", DISABLE);
            map.put("PROD", PROD);
            map.put("GRAY", GRAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublishStatusEnum(String value) {
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
        public static PublishStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PublishStatusEnum(value));
        }

        public static PublishStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PublishStatusEnum) {
                return this.value.equals(((PublishStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_status")

    private PublishStatusEnum publishStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_managed_domain_id")

    private String tenantManagedDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist")

    private Boolean whitelist;

    public ShowPlatformManagedResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间.
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowPlatformManagedResponse withDwRegion(String dwRegion) {
        this.dwRegion = dwRegion;
        return this;
    }

    /**
     * 区域.
     * @return dwRegion
     */
    public String getDwRegion() {
        return dwRegion;
    }

    public void setDwRegion(String dwRegion) {
        this.dwRegion = dwRegion;
    }

    public ShowPlatformManagedResponse withPlatformManagedDomainId(String platformManagedDomainId) {
        this.platformManagedDomainId = platformManagedDomainId;
        return this;
    }

    /**
     * 平台租户ID.
     * @return platformManagedDomainId
     */
    public String getPlatformManagedDomainId() {
        return platformManagedDomainId;
    }

    public void setPlatformManagedDomainId(String platformManagedDomainId) {
        this.platformManagedDomainId = platformManagedDomainId;
    }

    public ShowPlatformManagedResponse withPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * 发布状态.
     * @return publishStatus
     */
    public PublishStatusEnum getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
    }

    public ShowPlatformManagedResponse withTenantManagedDomainId(String tenantManagedDomainId) {
        this.tenantManagedDomainId = tenantManagedDomainId;
        return this;
    }

    /**
     * 业务租户ID.
     * @return tenantManagedDomainId
     */
    public String getTenantManagedDomainId() {
        return tenantManagedDomainId;
    }

    public void setTenantManagedDomainId(String tenantManagedDomainId) {
        this.tenantManagedDomainId = tenantManagedDomainId;
    }

    public ShowPlatformManagedResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间.
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowPlatformManagedResponse withWhitelist(Boolean whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    /**
     * 是否在白名单中.
     * @return whitelist
     */
    public Boolean getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(Boolean whitelist) {
        this.whitelist = whitelist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPlatformManagedResponse that = (ShowPlatformManagedResponse) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.dwRegion, that.dwRegion)
            && Objects.equals(this.platformManagedDomainId, that.platformManagedDomainId)
            && Objects.equals(this.publishStatus, that.publishStatus)
            && Objects.equals(this.tenantManagedDomainId, that.tenantManagedDomainId)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.whitelist, that.whitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            dwRegion,
            platformManagedDomainId,
            publishStatus,
            tenantManagedDomainId,
            updateTime,
            whitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlatformManagedResponse {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dwRegion: ").append(toIndentedString(dwRegion)).append("\n");
        sb.append("    platformManagedDomainId: ").append(toIndentedString(platformManagedDomainId)).append("\n");
        sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
        sb.append("    tenantManagedDomainId: ").append(toIndentedString(tenantManagedDomainId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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
