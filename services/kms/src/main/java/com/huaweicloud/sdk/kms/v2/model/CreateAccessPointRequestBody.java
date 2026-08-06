package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建接入点请求体
 */
public class CreateAccessPointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyspace_id")

    private String keyspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_point_name")

    private String accessPointName;

    /**
     * **参数解释：** 接入点的类型 **约束限制：** 不涉及 **取值范围：** - 1：ECS - 2：CCE - 3：Custom **默认取值：** 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final TypeEnum NUMBER_3 = new TypeEnum(3);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
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
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(Integer value) {
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
    @JsonProperty(value = "identity")

    private String identity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateAccessPointRequestBody withKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
        return this;
    }

    /**
     * **参数解释：** 接入点归属的可信密钥空间ID **约束限制：** UUID格式，满足正则表达式^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$ **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return keyspaceId
     */
    public String getKeyspaceId() {
        return keyspaceId;
    }

    public void setKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
    }

    public CreateAccessPointRequestBody withAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }

    /**
     * **参数解释：** 接入点的名称 **约束限制：** 满足正则表达式^[a-zA-Z0-9:/_-]{1,255}$ **取值范围：** 1-255 **默认取值：** 不涉及
     * @return accessPointName
     */
    public String getAccessPointName() {
        return accessPointName;
    }

    public void setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
    }

    public CreateAccessPointRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 接入点的类型 **约束限制：** 不涉及 **取值范围：** - 1：ECS - 2：CCE - 3：Custom **默认取值：** 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateAccessPointRequestBody withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * **参数解释：** 接入点的唯一标志 **约束限制：** ECS接入点填入ecs_id CCE接入点填入CCE集群公钥信息 Custom接入点无需填写，创建Custom接入点后，会生成一对密钥对，可以下载私钥，使用私钥签名，服务端验证签名 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public CreateAccessPointRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释：** 创建CCE接入点时必填，CCE集群ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateAccessPointRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 接入点描述信息 **约束限制：** 不涉及 **取值范围：** 1-255 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccessPointRequestBody that = (CreateAccessPointRequestBody) obj;
        return Objects.equals(this.keyspaceId, that.keyspaceId)
            && Objects.equals(this.accessPointName, that.accessPointName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.identity, that.identity) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyspaceId, accessPointName, type, identity, clusterId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessPointRequestBody {\n");
        sb.append("    keyspaceId: ").append(toIndentedString(keyspaceId)).append("\n");
        sb.append("    accessPointName: ").append(toIndentedString(accessPointName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
