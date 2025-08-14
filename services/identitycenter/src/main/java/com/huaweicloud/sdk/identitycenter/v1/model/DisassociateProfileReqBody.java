package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 解除与用户或组绑定的所有账号授权关联的请求体
 */
public class DisassociateProfileReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 解除绑定的实体类型，可为用户或者用户组
     */
    public static final class AccessorTypeEnum {

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final AccessorTypeEnum GROUP = new AccessorTypeEnum("GROUP");

        /**
         * Enum USER for value: "USER"
         */
        public static final AccessorTypeEnum USER = new AccessorTypeEnum("USER");

        private static final Map<String, AccessorTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessorTypeEnum> createStaticFields() {
            Map<String, AccessorTypeEnum> map = new HashMap<>();
            map.put("GROUP", GROUP);
            map.put("USER", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessorTypeEnum(String value) {
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
        public static AccessorTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessorTypeEnum(value));
        }

        public static AccessorTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessorTypeEnum) {
                return this.value.equals(((AccessorTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessor_type")

    private AccessorTypeEnum accessorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    public DisassociateProfileReqBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户或用户组的唯一标识ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DisassociateProfileReqBody withAccessorType(AccessorTypeEnum accessorType) {
        this.accessorType = accessorType;
        return this;
    }

    /**
     * 解除绑定的实体类型，可为用户或者用户组
     * @return accessorType
     */
    public AccessorTypeEnum getAccessorType() {
        return accessorType;
    }

    public void setAccessorType(AccessorTypeEnum accessorType) {
        this.accessorType = accessorType;
    }

    public DisassociateProfileReqBody withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * 关联到IAM身份中心实例的身份源的全局唯一标识符（ID）。
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateProfileReqBody that = (DisassociateProfileReqBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.accessorType, that.accessorType)
            && Objects.equals(this.identityStoreId, that.identityStoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accessorType, identityStoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateProfileReqBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accessorType: ").append(toIndentedString(accessorType)).append("\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
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
