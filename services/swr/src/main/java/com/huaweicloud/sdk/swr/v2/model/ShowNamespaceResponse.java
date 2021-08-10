package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Response Object */
public class ShowNamespaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    /** 用户权限。7表示管理权限，3表示编辑权限，1表示读取权限。 */
    public static final class AuthEnum {

        /** Enum NUMBER_7 for value: 7 */
        public static final AuthEnum NUMBER_7 = new AuthEnum(7);

        /** Enum NUMBER_3 for value: 3 */
        public static final AuthEnum NUMBER_3 = new AuthEnum(3);

        /** Enum NUMBER_1 for value: 1 */
        public static final AuthEnum NUMBER_1 = new AuthEnum(1);

        private static final Map<Integer, AuthEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AuthEnum> createStaticFields() {
            Map<Integer, AuthEnum> map = new HashMap<>();
            map.put(7, NUMBER_7);
            map.put(3, NUMBER_3);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AuthEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            AuthEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthEnum(value);
            }
            return result;
        }

        public static AuthEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AuthEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthEnum) {
                return this.value.equals(((AuthEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private AuthEnum auth;

    public ShowNamespaceResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /** id
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowNamespaceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 组织名称。小写字母开头，后面跟小写字母、数字、小数点、下划线或中划线（其中下划线最多允许连续两个，小数点、下划线、中划线不能直接相连），小写字母或数字结尾，1-64个字符。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNamespaceResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /** IAM用户名
     * 
     * @return creatorName */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowNamespaceResponse withAuth(AuthEnum auth) {
        this.auth = auth;
        return this;
    }

    /** 用户权限。7表示管理权限，3表示编辑权限，1表示读取权限。
     * 
     * @return auth */
    public AuthEnum getAuth() {
        return auth;
    }

    public void setAuth(AuthEnum auth) {
        this.auth = auth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNamespaceResponse showNamespaceResponse = (ShowNamespaceResponse) o;
        return Objects.equals(this.id, showNamespaceResponse.id)
            && Objects.equals(this.name, showNamespaceResponse.name)
            && Objects.equals(this.creatorName, showNamespaceResponse.creatorName)
            && Objects.equals(this.auth, showNamespaceResponse.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, creatorName, auth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNamespaceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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
