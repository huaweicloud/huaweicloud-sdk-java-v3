package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AuthorizationResponse
 */
public class AuthorizationResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    /**
     * **参数解释**：授权类型。推荐使用委托方式。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - agency：委托 - credential：访问密钥（AK/SK）  **默认取值**：不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum AGENCY for value: "agency"
         */
        public static final TypeEnum AGENCY = new TypeEnum("agency");

        /**
         * Enum CREDENTIAL for value: "credential"
         */
        public static final TypeEnum CREDENTIAL = new TypeEnum("credential");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("agency", AGENCY);
            map.put("credential", CREDENTIAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public AuthorizationResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**：用户ID，获取方法请参见[获取用户ID和名称](modelarts_03_0006.xml)。当user_id为all时，表示对所有IAM子用户进行授权，如果已有部分用户已授权，则更新授权。仅当授权类型为委托时，需要该字段。 **约束限制**：不涉及。 **取值范围**：字符串长度在3到32个字符之间，支持大小写字母、数字、中划线。 **默认取值**：不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AuthorizationResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：授权类型。推荐使用委托方式。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - agency：委托 - credential：访问密钥（AK/SK）  **默认取值**：不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AuthorizationResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**：授权内容。 **约束限制**： - 当授权类型是委托，该字段为委托名称。 - 当授权类型是访问密钥，该字段为访问密钥ID（AK）。  **取值范围**：长度限制64个字符。 **默认取值**：不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AuthorizationResponse withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * **参数解释**：秘密访问密钥（SK）。 **约束限制**：仅当授权类型为访问密钥时，需要该字段。 **取值范围**：字符串长度为40，支持大小写字母、数字。 **默认取值**：不涉及。
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public AuthorizationResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**：用户名。 **约束限制**：当user_id为all-users时，显示为所有用户。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AuthorizationResponse withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * **参数解释**：用户类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - iam：授权对象类型是IAM子用户，必传字段user_id。 - federate：授权对象类型是联邦用户，必传字段user_name，user_id不传。 - federation-group：授权对象类型是联邦用户组，必传字段user_id，值为联邦用户组的id。 - grant：授权对象类型是委托用户，必传字段user_id，值为委托用户的委托id。 - all-users：授权对象类型是所有用户，必传字段user_id值是all。  **默认取值**：IAM。
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public AuthorizationResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：创建时间戳。 **取值范围**：不涉及。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizationResponse that = (AuthorizationResponse) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.content, that.content) && Objects.equals(this.secretKey, that.secretKey)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userType, that.userType)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, type, content, secretKey, userName, userType, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationResponse {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
