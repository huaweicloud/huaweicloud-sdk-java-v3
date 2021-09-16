package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private AppState state;

    /** RTC覆盖范围。 取值如下： - DOMESTIC：国内范围。 - OVERSEA：海外范围。 - GLOBAL：全球范围。 */
    public static final class ScopeEnum {

        /** Enum DOMESTIC for value: "DOMESTIC" */
        public static final ScopeEnum DOMESTIC = new ScopeEnum("DOMESTIC");

        /** Enum OVERSEA for value: "OVERSEA" */
        public static final ScopeEnum OVERSEA = new ScopeEnum("OVERSEA");

        /** Enum GLOBAL for value: "GLOBAL" */
        public static final ScopeEnum GLOBAL = new ScopeEnum("GLOBAL");

        private static final Map<String, ScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScopeEnum> createStaticFields() {
            Map<String, ScopeEnum> map = new HashMap<>();
            map.put("DOMESTIC", DOMESTIC);
            map.put("OVERSEA", OVERSEA);
            map.put("GLOBAL", GLOBAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ScopeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScopeEnum(value);
            }
            return result;
        }

        public static ScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ScopeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScopeEnum) {
                return this.value.equals(((ScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private ScopeEnum scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private AppAuth authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callbacks")

    private AppCallbacks callbacks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_record_mode")

    private AppAutoRecordMode autoRecordMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")

    private String xRequestId;

    public ShowAppResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** app名称
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowAppResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用id
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowAppResponse withState(AppState state) {
        this.state = state;
        return this;
    }

    public ShowAppResponse withState(Consumer<AppState> stateSetter) {
        if (this.state == null) {
            this.state = new AppState();
            stateSetter.accept(this.state);
        }

        return this;
    }

    /** Get state
     * 
     * @return state */
    public AppState getState() {
        return state;
    }

    public void setState(AppState state) {
        this.state = state;
    }

    public ShowAppResponse withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /** RTC覆盖范围。 取值如下： - DOMESTIC：国内范围。 - OVERSEA：海外范围。 - GLOBAL：全球范围。
     * 
     * @return scope */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public ShowAppResponse withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /** 账号名
     * 
     * @return tenantName */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public ShowAppResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 域名，App对应域名
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ShowAppResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowAppResponse withAuthentication(AppAuth authentication) {
        this.authentication = authentication;
        return this;
    }

    public ShowAppResponse withAuthentication(Consumer<AppAuth> authenticationSetter) {
        if (this.authentication == null) {
            this.authentication = new AppAuth();
            authenticationSetter.accept(this.authentication);
        }

        return this;
    }

    /** Get authentication
     * 
     * @return authentication */
    public AppAuth getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AppAuth authentication) {
        this.authentication = authentication;
    }

    public ShowAppResponse withCallbacks(AppCallbacks callbacks) {
        this.callbacks = callbacks;
        return this;
    }

    public ShowAppResponse withCallbacks(Consumer<AppCallbacks> callbacksSetter) {
        if (this.callbacks == null) {
            this.callbacks = new AppCallbacks();
            callbacksSetter.accept(this.callbacks);
        }

        return this;
    }

    /** Get callbacks
     * 
     * @return callbacks */
    public AppCallbacks getCallbacks() {
        return callbacks;
    }

    public void setCallbacks(AppCallbacks callbacks) {
        this.callbacks = callbacks;
    }

    public ShowAppResponse withAutoRecordMode(AppAutoRecordMode autoRecordMode) {
        this.autoRecordMode = autoRecordMode;
        return this;
    }

    public ShowAppResponse withAutoRecordMode(Consumer<AppAutoRecordMode> autoRecordModeSetter) {
        if (this.autoRecordMode == null) {
            this.autoRecordMode = new AppAutoRecordMode();
            autoRecordModeSetter.accept(this.autoRecordMode);
        }

        return this;
    }

    /** Get autoRecordMode
     * 
     * @return autoRecordMode */
    public AppAutoRecordMode getAutoRecordMode() {
        return autoRecordMode;
    }

    public void setAutoRecordMode(AppAutoRecordMode autoRecordMode) {
        this.autoRecordMode = autoRecordMode;
    }

    public ShowAppResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** Get xRequestId
     * 
     * @return xRequestId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAppResponse showAppResponse = (ShowAppResponse) o;
        return Objects.equals(this.appName, showAppResponse.appName)
            && Objects.equals(this.appId, showAppResponse.appId) && Objects.equals(this.state, showAppResponse.state)
            && Objects.equals(this.scope, showAppResponse.scope)
            && Objects.equals(this.tenantName, showAppResponse.tenantName)
            && Objects.equals(this.domain, showAppResponse.domain)
            && Objects.equals(this.createTime, showAppResponse.createTime)
            && Objects.equals(this.authentication, showAppResponse.authentication)
            && Objects.equals(this.callbacks, showAppResponse.callbacks)
            && Objects.equals(this.autoRecordMode, showAppResponse.autoRecordMode)
            && Objects.equals(this.xRequestId, showAppResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            appId,
            state,
            scope,
            tenantName,
            domain,
            createTime,
            authentication,
            callbacks,
            autoRecordMode,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppResponse {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
        sb.append("    autoRecordMode: ").append(toIndentedString(autoRecordMode)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
