package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.SourceRepoType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 当组件来源的kind是artifact时spec的内容结构。
 */
public class SourceOrArtifact  {

    /**
     * 存储方式，支持软件仓库swr和对象存储obs。
     */
    public static final class StorageEnum {

        
        /**
         * Enum SWR for value: "swr"
         */
        public static final StorageEnum SWR = new StorageEnum("swr");
        
        /**
         * Enum OBS for value: "obs"
         */
        public static final StorageEnum OBS = new StorageEnum("obs");
        

        private static final Map<String, StorageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageEnum> createStaticFields() {
            Map<String, StorageEnum> map = new HashMap<>();
            map.put("swr", SWR);
            map.put("obs", OBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StorageEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StorageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StorageEnum(value);
            }
            return result;
        }

        public static StorageEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof StorageEnum) {
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
    @JsonProperty(value="storage")
    
    private StorageEnum storage;
    /**
     * 类别，支持package。
     */
    public static final class TypeEnum {

        
        /**
         * Enum PACKAGE for value: "package"
         */
        public static final TypeEnum PACKAGE = new TypeEnum("package");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("package", PACKAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth")
    
    private String auth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_type")
    
    private SourceRepoType repoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_url")
    
    private String repoUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_ref")
    
    private String repoRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_auth")
    
    private String repoAuth;

    public SourceOrArtifact withStorage(StorageEnum storage) {
        this.storage = storage;
        return this;
    }

    


    /**
     * 存储方式，支持软件仓库swr和对象存储obs。
     * @return storage
     */
    public StorageEnum getStorage() {
        return storage;
    }

    public void setStorage(StorageEnum storage) {
        this.storage = storage;
    }

    

    public SourceOrArtifact withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类别，支持package。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public SourceOrArtifact withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 软件包源码地址，如https://{IP}:20202/xxx/xxx.jar。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public SourceOrArtifact withAuth(String auth) {
        this.auth = auth;
        return this;
    }

    


    /**
     * 认证方式，支持iam，none，默认是iam。
     * @return auth
     */
    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    

    public SourceOrArtifact withRepoType(SourceRepoType repoType) {
        this.repoType = repoType;
        return this;
    }

    


    /**
     * Get repoType
     * @return repoType
     */
    public SourceRepoType getRepoType() {
        return repoType;
    }

    public void setRepoType(SourceRepoType repoType) {
        this.repoType = repoType;
    }

    

    public SourceOrArtifact withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    


    /**
     * 代码仓url，如：https://github.com/example/demo.git
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    

    public SourceOrArtifact withRepoRef(String repoRef) {
        this.repoRef = repoRef;
        return this;
    }

    


    /**
     * 代码分支或者Tag，默认是master。
     * @return repoRef
     */
    public String getRepoRef() {
        return repoRef;
    }

    public void setRepoRef(String repoRef) {
        this.repoRef = repoRef;
    }

    

    public SourceOrArtifact withRepoAuth(String repoAuth) {
        this.repoAuth = repoAuth;
        return this;
    }

    


    /**
     * 授权名称，在授权列表获取。
     * @return repoAuth
     */
    public String getRepoAuth() {
        return repoAuth;
    }

    public void setRepoAuth(String repoAuth) {
        this.repoAuth = repoAuth;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceOrArtifact sourceOrArtifact = (SourceOrArtifact) o;
        return Objects.equals(this.storage, sourceOrArtifact.storage) &&
            Objects.equals(this.type, sourceOrArtifact.type) &&
            Objects.equals(this.url, sourceOrArtifact.url) &&
            Objects.equals(this.auth, sourceOrArtifact.auth) &&
            Objects.equals(this.repoType, sourceOrArtifact.repoType) &&
            Objects.equals(this.repoUrl, sourceOrArtifact.repoUrl) &&
            Objects.equals(this.repoRef, sourceOrArtifact.repoRef) &&
            Objects.equals(this.repoAuth, sourceOrArtifact.repoAuth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(storage, type, url, auth, repoType, repoUrl, repoRef, repoAuth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceOrArtifact {\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    repoRef: ").append(toIndentedString(repoRef)).append("\n");
        sb.append("    repoAuth: ").append(toIndentedString(repoAuth)).append("\n");
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

