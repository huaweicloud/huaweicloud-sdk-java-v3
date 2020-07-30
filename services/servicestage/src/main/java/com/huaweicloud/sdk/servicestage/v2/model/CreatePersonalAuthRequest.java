package com.huaweicloud.sdk.servicestage.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.AccessToken;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreatePersonalAuthRequest  {

    /**
     * Gets or Sets repoType
     */
    public static class RepoTypeEnum {

        
        /**
         * Enum GITHUB for value: "github"
         */
        public static final RepoTypeEnum GITHUB = new RepoTypeEnum("github");
        
        /**
         * Enum GITLAB for value: "gitlab"
         */
        public static final RepoTypeEnum GITLAB = new RepoTypeEnum("gitlab");
        
        /**
         * Enum GITEE for value: "gitee"
         */
        public static final RepoTypeEnum GITEE = new RepoTypeEnum("gitee");
        

        public static final Map<String, RepoTypeEnum> staticFields = new HashMap<String, RepoTypeEnum>() {
            { 
                put("github", GITHUB);
                put("gitlab", GITLAB);
                put("gitee", GITEE);
            }
        };

        private String value;

        RepoTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RepoTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RepoTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new RepoTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static RepoTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RepoTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RepoTypeEnum) {
                return this.value.equals(((RepoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_type")
    
    private RepoTypeEnum repoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AccessToken body = null;

    public CreatePersonalAuthRequest withRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
        return this;
    }

    


    /**
     * Get repoType
     * @return repoType
     */
    public RepoTypeEnum getRepoType() {
        return repoType;
    }

    public void setRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
    }

    public CreatePersonalAuthRequest withBody(AccessToken body) {
        this.body = body;
        return this;
    }

    public CreatePersonalAuthRequest withBody(Consumer<AccessToken> bodySetter) {
        if(this.body == null ){
            this.body = new AccessToken();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AccessToken getBody() {
        return body;
    }

    public void setBody(AccessToken body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePersonalAuthRequest createPersonalAuthRequest = (CreatePersonalAuthRequest) o;
        return Objects.equals(this.repoType, createPersonalAuthRequest.repoType) &&
            Objects.equals(this.body, createPersonalAuthRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repoType, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePersonalAuthRequest {\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

