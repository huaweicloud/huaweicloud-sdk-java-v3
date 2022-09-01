package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateOAuthRequest {

    /**
     * 仓库类型。 支持OAuth授权的仓库类型有：github、gitlab、gitee、bitbucket。
     */
    public static final class RepoTypeEnum {

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

        /**
         * Enum BITBUCKET for value: "bitbucket"
         */
        public static final RepoTypeEnum BITBUCKET = new RepoTypeEnum("bitbucket");

        private static final Map<String, RepoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RepoTypeEnum> createStaticFields() {
            Map<String, RepoTypeEnum> map = new HashMap<>();
            map.put("github", GITHUB);
            map.put("gitlab", GITLAB);
            map.put("gitee", GITEE);
            map.put("bitbucket", BITBUCKET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RepoTypeEnum(String value) {
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
        public static RepoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RepoTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RepoTypeEnum(value);
            }
            return result;
        }

        public static RepoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RepoTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RepoTypeEnum) {
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
    @JsonProperty(value = "repo_type")

    @JacksonXmlProperty(localName = "repo_type")

    private RepoTypeEnum repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    @JacksonXmlProperty(localName = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private OAuth body;

    public CreateOAuthRequest withRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * 仓库类型。 支持OAuth授权的仓库类型有：github、gitlab、gitee、bitbucket。
     * @return repoType
     */
    public RepoTypeEnum getRepoType() {
        return repoType;
    }

    public void setRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
    }

    public CreateOAuthRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 站点标签。 比如国际站的，?tag=intl。 默认为空。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CreateOAuthRequest withBody(OAuth body) {
        this.body = body;
        return this;
    }

    public CreateOAuthRequest withBody(Consumer<OAuth> bodySetter) {
        if (this.body == null) {
            this.body = new OAuth();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OAuth getBody() {
        return body;
    }

    public void setBody(OAuth body) {
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
        CreateOAuthRequest createOAuthRequest = (CreateOAuthRequest) o;
        return Objects.equals(this.repoType, createOAuthRequest.repoType)
            && Objects.equals(this.tag, createOAuthRequest.tag) && Objects.equals(this.body, createOAuthRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoType, tag, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOAuthRequest {\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
