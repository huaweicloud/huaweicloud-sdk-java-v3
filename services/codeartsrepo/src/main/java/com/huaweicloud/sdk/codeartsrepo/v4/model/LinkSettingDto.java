package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释：** 可集成系统Link服务设置信息。
 */
public class LinkSettingDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Boolean active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * **参数解释：** Link服务的对接鉴权类型，ak_sk代表使用ak和sk来鉴权。
     */
    public static final class AppAuthTypeEnum {

        /**
         * Enum AK_SK for value: "ak_sk"
         */
        public static final AppAuthTypeEnum AK_SK = new AppAuthTypeEnum("ak_sk");

        private static final Map<String, AppAuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppAuthTypeEnum> createStaticFields() {
            Map<String, AppAuthTypeEnum> map = new HashMap<>();
            map.put("ak_sk", AK_SK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppAuthTypeEnum(String value) {
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
        public static AppAuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppAuthTypeEnum(value));
        }

        public static AppAuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppAuthTypeEnum) {
                return this.value.equals(((AppAuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_auth_type")

    private AppAuthTypeEnum appAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_ak")

    private String appAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_sk")

    private String appSk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private String categories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_statuses")

    private String excludeStatuses;

    public LinkSettingDto withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * **参数解释：** 是否开启集成Link服务 **取值范围：** true：开启集成Link服务，false：未开启集成Link服务。
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LinkSettingDto withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** Link服务的对接地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LinkSettingDto withAppAuthType(AppAuthTypeEnum appAuthType) {
        this.appAuthType = appAuthType;
        return this;
    }

    /**
     * **参数解释：** Link服务的对接鉴权类型，ak_sk代表使用ak和sk来鉴权。
     * @return appAuthType
     */
    public AppAuthTypeEnum getAppAuthType() {
        return appAuthType;
    }

    public void setAppAuthType(AppAuthTypeEnum appAuthType) {
        this.appAuthType = appAuthType;
    }

    public LinkSettingDto withAppAk(String appAk) {
        this.appAk = appAk;
        return this;
    }

    /**
     * **参数解释：** Link服务的对接鉴权ak。
     * @return appAk
     */
    public String getAppAk() {
        return appAk;
    }

    public void setAppAk(String appAk) {
        this.appAk = appAk;
    }

    public LinkSettingDto withAppSk(String appSk) {
        this.appSk = appSk;
        return this;
    }

    /**
     * **参数解释：** Link服务的对接鉴权sk，作为返回值时若已配置则返回掩码，掩码格式为************。
     * @return appSk
     */
    public String getAppSk() {
        return appSk;
    }

    public void setAppSk(String appSk) {
        this.appSk = appSk;
    }

    public LinkSettingDto withCategories(String categories) {
        this.categories = categories;
        return this;
    }

    /**
     * **参数解释：** 可关联类型列表，逗号分隔。
     * @return categories
     */
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public LinkSettingDto withExcludeStatuses(String excludeStatuses) {
        this.excludeStatuses = excludeStatuses;
        return this;
    }

    /**
     * **参数解释：** 排除状态列表，逗号分隔。
     * @return excludeStatuses
     */
    public String getExcludeStatuses() {
        return excludeStatuses;
    }

    public void setExcludeStatuses(String excludeStatuses) {
        this.excludeStatuses = excludeStatuses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkSettingDto that = (LinkSettingDto) obj;
        return Objects.equals(this.active, that.active) && Objects.equals(this.url, that.url)
            && Objects.equals(this.appAuthType, that.appAuthType) && Objects.equals(this.appAk, that.appAk)
            && Objects.equals(this.appSk, that.appSk) && Objects.equals(this.categories, that.categories)
            && Objects.equals(this.excludeStatuses, that.excludeStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, url, appAuthType, appAk, appSk, categories, excludeStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkSettingDto {\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    appAuthType: ").append(toIndentedString(appAuthType)).append("\n");
        sb.append("    appAk: ").append(toIndentedString(appAk)).append("\n");
        sb.append("    appSk: ").append(toIndentedString(appSk)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    excludeStatuses: ").append(toIndentedString(excludeStatuses)).append("\n");
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
