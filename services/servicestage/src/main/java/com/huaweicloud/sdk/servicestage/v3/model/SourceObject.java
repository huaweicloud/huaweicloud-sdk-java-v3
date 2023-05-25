package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SourceObject
 */
public class SourceObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private SourceKind kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * Gets or Sets storage
     */
    public static final class StorageEnum {

        /**
         * Enum OBS for value: "obs"
         */
        public static final StorageEnum OBS = new StorageEnum("obs");

        /**
         * Enum SWR for value: "swr"
         */
        public static final StorageEnum SWR = new StorageEnum("swr");

        /**
         * Enum DEVCLOUD for value: "devcloud"
         */
        public static final StorageEnum DEVCLOUD = new StorageEnum("devcloud");

        private static final Map<String, StorageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageEnum> createStaticFields() {
            Map<String, StorageEnum> map = new HashMap<>();
            map.put("obs", OBS);
            map.put("swr", SWR);
            map.put("devcloud", DEVCLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageEnum(String value) {
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
        public static StorageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StorageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StorageEnum(value);
            }
            return result;
        }

        public static StorageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StorageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageEnum) {
                return this.value.equals(((StorageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private StorageEnum storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private String auth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_auth")

    private String repoAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_namespace")

    private String repoNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_ref")

    private String repoRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_type")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_url")

    private String repoUrl;

    public SourceObject withKind(SourceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get kind
     * @return kind
     */
    public SourceKind getKind() {
        return kind;
    }

    public void setKind(SourceKind kind) {
        this.kind = kind;
    }

    public SourceObject withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SourceObject withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 软件包版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SourceObject withStorage(StorageEnum storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get storage
     * @return storage
     */
    public StorageEnum getStorage() {
        return storage;
    }

    public void setStorage(StorageEnum storage) {
        this.storage = storage;
    }

    public SourceObject withAuth(String auth) {
        this.auth = auth;
        return this;
    }

    /**
     * Get auth
     * @return auth
     */
    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public SourceObject withRepoAuth(String repoAuth) {
        this.repoAuth = repoAuth;
        return this;
    }

    /**
     * Get repoAuth
     * @return repoAuth
     */
    public String getRepoAuth() {
        return repoAuth;
    }

    public void setRepoAuth(String repoAuth) {
        this.repoAuth = repoAuth;
    }

    public SourceObject withRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }

    /**
     * Get repoNamespace
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return repoNamespace;
    }

    public void setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
    }

    public SourceObject withRepoRef(String repoRef) {
        this.repoRef = repoRef;
        return this;
    }

    /**
     * Get repoRef
     * @return repoRef
     */
    public String getRepoRef() {
        return repoRef;
    }

    public void setRepoRef(String repoRef) {
        this.repoRef = repoRef;
    }

    public SourceObject withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * Get repoType
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public SourceObject withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * Get webUrl
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public SourceObject withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * Get repoUrl
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceObject sourceObject = (SourceObject) o;
        return Objects.equals(this.kind, sourceObject.kind) && Objects.equals(this.url, sourceObject.url)
            && Objects.equals(this.version, sourceObject.version) && Objects.equals(this.storage, sourceObject.storage)
            && Objects.equals(this.auth, sourceObject.auth) && Objects.equals(this.repoAuth, sourceObject.repoAuth)
            && Objects.equals(this.repoNamespace, sourceObject.repoNamespace)
            && Objects.equals(this.repoRef, sourceObject.repoRef)
            && Objects.equals(this.repoType, sourceObject.repoType) && Objects.equals(this.webUrl, sourceObject.webUrl)
            && Objects.equals(this.repoUrl, sourceObject.repoUrl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(kind, url, version, storage, auth, repoAuth, repoNamespace, repoRef, repoType, webUrl, repoUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceObject {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    repoAuth: ").append(toIndentedString(repoAuth)).append("\n");
        sb.append("    repoNamespace: ").append(toIndentedString(repoNamespace)).append("\n");
        sb.append("    repoRef: ").append(toIndentedString(repoRef)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
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
