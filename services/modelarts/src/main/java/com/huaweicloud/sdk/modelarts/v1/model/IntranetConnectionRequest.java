package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IntranetConnectionRequest
 */
public class IntranetConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    /**
     * **参数解释：** 内网访问接入粒度，不填默认为SERVICE **约束限制：** 不涉及。 **取值范围：** - SERVICE：服务粒度。 - GLOBAL：global粒度。 **默认取值：** 默认为SERVICE。
     */
    public static final class TypeEnum {

        /**
         * Enum SERVICE for value: "SERVICE"
         */
        public static final TypeEnum SERVICE = new TypeEnum("SERVICE");

        /**
         * Enum GLOBAL for value: "GLOBAL"
         */
        public static final TypeEnum GLOBAL = new TypeEnum("GLOBAL");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SERVICE", SERVICE);
            map.put("GLOBAL", GLOBAL);
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
    @JsonProperty(value = "dispatcher_group_id")

    private String dispatcherGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_urls")

    private List<String> customUrls = null;

    public IntranetConnectionRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * **参数解释：** 服务ID，在[创建服务](CreateInferService.xml)时即可在返回体中获取，也可通过[查询服务列表](ListInferServices.xml)获取当前用户拥有的服务，其中service_id字段即为服务ID。 **约束限制：** type为SERVICE时，必填。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public IntranetConnectionRequest withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * **参数解释：** 内网访问场景。 **约束限制：** 不涉及。 **取值范围：** - VPC：用户VPC网络接入场景 - POOL：用户资源池网络接入场景 **默认取值：** 不涉及。
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public IntranetConnectionRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** VPC ID，VPC场景需要填写。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public IntranetConnectionRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释：** 子网 ID，VPC场景需要填写。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public IntranetConnectionRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 资源池id POOL场景需要填写。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public IntranetConnectionRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 内网访问接入粒度，不填默认为SERVICE **约束限制：** 不涉及。 **取值范围：** - SERVICE：服务粒度。 - GLOBAL：global粒度。 **默认取值：** 默认为SERVICE。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public IntranetConnectionRequest withDispatcherGroupId(String dispatcherGroupId) {
        this.dispatcherGroupId = dispatcherGroupId;
        return this;
    }

    /**
     * **参数解释：** 服务绑定的dispatcher组ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return dispatcherGroupId
     */
    public String getDispatcherGroupId() {
        return dispatcherGroupId;
    }

    public void setDispatcherGroupId(String dispatcherGroupId) {
        this.dispatcherGroupId = dispatcherGroupId;
    }

    public IntranetConnectionRequest withCustomUrls(List<String> customUrls) {
        this.customUrls = customUrls;
        return this;
    }

    public IntranetConnectionRequest addCustomUrlsItem(String customUrlsItem) {
        if (this.customUrls == null) {
            this.customUrls = new ArrayList<>();
        }
        this.customUrls.add(customUrlsItem);
        return this;
    }

    public IntranetConnectionRequest withCustomUrls(Consumer<List<String>> customUrlsSetter) {
        if (this.customUrls == null) {
            this.customUrls = new ArrayList<>();
        }
        customUrlsSetter.accept(this.customUrls);
        return this;
    }

    /**
     * **参数解释：** 自定义URL，格式为：{协议}://{域名}{路径} **约束限制：** url个数不超过10个，单个url长度不超过1024。 **取值范围：** - 协议范围：http，https，wss，ws。 - 域名范围：支持域名或IP:端口。域名长度不超过63，包含字母、数字、中划线（-)且不能以中划线（-)开头或结尾，顶级域名不能包含数字；端口范围为1-65535。 - 路径范围：斜杠（/）开头，仅包含字母、数字、点号（.）、中划线（-)、下划线（_）、斜杠（/）的路径。 **默认取值：** 不涉及。
     * @return customUrls
     */
    public List<String> getCustomUrls() {
        return customUrls;
    }

    public void setCustomUrls(List<String> customUrls) {
        this.customUrls = customUrls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntranetConnectionRequest that = (IntranetConnectionRequest) obj;
        return Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.scene, that.scene)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.dispatcherGroupId, that.dispatcherGroupId)
            && Objects.equals(this.customUrls, that.customUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, scene, vpcId, subnetId, poolId, type, dispatcherGroupId, customUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntranetConnectionRequest {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dispatcherGroupId: ").append(toIndentedString(dispatcherGroupId)).append("\n");
        sb.append("    customUrls: ").append(toIndentedString(customUrls)).append("\n");
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
