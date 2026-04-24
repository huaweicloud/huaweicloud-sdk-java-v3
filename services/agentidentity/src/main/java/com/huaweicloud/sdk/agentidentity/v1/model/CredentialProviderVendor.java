package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Supported OAuth2 provider vendors.
 */
public class CredentialProviderVendor {

    /**
     * Enum MICROSOFTOAUTH2 for value: "MicrosoftOauth2"
     */
    public static final CredentialProviderVendor MICROSOFTOAUTH2 = new CredentialProviderVendor("MicrosoftOauth2");

    /**
     * Enum GOOGLEOAUTH2 for value: "GoogleOauth2"
     */
    public static final CredentialProviderVendor GOOGLEOAUTH2 = new CredentialProviderVendor("GoogleOauth2");

    /**
     * Enum GITHUBOAUTH2 for value: "GithubOauth2"
     */
    public static final CredentialProviderVendor GITHUBOAUTH2 = new CredentialProviderVendor("GithubOauth2");

    /**
     * Enum CUSTOMOAUTH2 for value: "CustomOauth2"
     */
    public static final CredentialProviderVendor CUSTOMOAUTH2 = new CredentialProviderVendor("CustomOauth2");

    private static final Map<String, CredentialProviderVendor> STATIC_FIELDS = createStaticFields();

    private static Map<String, CredentialProviderVendor> createStaticFields() {
        Map<String, CredentialProviderVendor> map = new HashMap<>();
        map.put("MicrosoftOauth2", MICROSOFTOAUTH2);
        map.put("GoogleOauth2", GOOGLEOAUTH2);
        map.put("GithubOauth2", GITHUBOAUTH2);
        map.put("CustomOauth2", CUSTOMOAUTH2);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CredentialProviderVendor(String value) {
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
    public static CredentialProviderVendor fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CredentialProviderVendor(value));
    }

    public static CredentialProviderVendor valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CredentialProviderVendor) {
            return this.value.equals(((CredentialProviderVendor) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
