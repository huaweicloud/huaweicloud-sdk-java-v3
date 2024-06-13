package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享配置
 */
public class AssetSharedConfig {

    /**
     * 共享类型。 * PRIVATE: 私有，仅本租户可访问。 * PUBLIC: 公开，所有租户可访问。当前仅提供系统资产可公开访问。 * SHARED：共享，指定租户可访问。拥有者指定租户可访问。
     */
    public static final class SharedTypeEnum {

        /**
         * Enum PRIVATE for value: "PRIVATE"
         */
        public static final SharedTypeEnum PRIVATE = new SharedTypeEnum("PRIVATE");

        /**
         * Enum PUBLIC for value: "PUBLIC"
         */
        public static final SharedTypeEnum PUBLIC = new SharedTypeEnum("PUBLIC");

        /**
         * Enum SHARED for value: "SHARED"
         */
        public static final SharedTypeEnum SHARED = new SharedTypeEnum("SHARED");

        private static final Map<String, SharedTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharedTypeEnum> createStaticFields() {
            Map<String, SharedTypeEnum> map = new HashMap<>();
            map.put("PRIVATE", PRIVATE);
            map.put("PUBLIC", PUBLIC);
            map.put("SHARED", SHARED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SharedTypeEnum(String value) {
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
        public static SharedTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SharedTypeEnum(value));
        }

        public static SharedTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SharedTypeEnum) {
                return this.value.equals(((SharedTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_type")

    private SharedTypeEnum sharedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_project_ids")

    private List<String> allowedProjectIds = null;

    public AssetSharedConfig withSharedType(SharedTypeEnum sharedType) {
        this.sharedType = sharedType;
        return this;
    }

    /**
     * 共享类型。 * PRIVATE: 私有，仅本租户可访问。 * PUBLIC: 公开，所有租户可访问。当前仅提供系统资产可公开访问。 * SHARED：共享，指定租户可访问。拥有者指定租户可访问。
     * @return sharedType
     */
    public SharedTypeEnum getSharedType() {
        return sharedType;
    }

    public void setSharedType(SharedTypeEnum sharedType) {
        this.sharedType = sharedType;
    }

    public AssetSharedConfig withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 共享过期时间。默认过期时间为30天，即共享当天+30的23:59:59。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public AssetSharedConfig withAllowedProjectIds(List<String> allowedProjectIds) {
        this.allowedProjectIds = allowedProjectIds;
        return this;
    }

    public AssetSharedConfig addAllowedProjectIdsItem(String allowedProjectIdsItem) {
        if (this.allowedProjectIds == null) {
            this.allowedProjectIds = new ArrayList<>();
        }
        this.allowedProjectIds.add(allowedProjectIdsItem);
        return this;
    }

    public AssetSharedConfig withAllowedProjectIds(Consumer<List<String>> allowedProjectIdsSetter) {
        if (this.allowedProjectIds == null) {
            this.allowedProjectIds = new ArrayList<>();
        }
        allowedProjectIdsSetter.accept(this.allowedProjectIds);
        return this;
    }

    /**
     * 允许访问本资产的租户列表。
     * @return allowedProjectIds
     */
    public List<String> getAllowedProjectIds() {
        return allowedProjectIds;
    }

    public void setAllowedProjectIds(List<String> allowedProjectIds) {
        this.allowedProjectIds = allowedProjectIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetSharedConfig that = (AssetSharedConfig) obj;
        return Objects.equals(this.sharedType, that.sharedType) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.allowedProjectIds, that.allowedProjectIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedType, expireTime, allowedProjectIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetSharedConfig {\n");
        sb.append("    sharedType: ").append(toIndentedString(sharedType)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    allowedProjectIds: ").append(toIndentedString(allowedProjectIds)).append("\n");
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
