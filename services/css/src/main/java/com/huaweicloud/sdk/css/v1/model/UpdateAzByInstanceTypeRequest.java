package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAzByInstanceTypeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    /**
     * 待切换AZ的节点类型。支持: - all：所有节点类型。 - ess： 数据节点。 - ess-cold: 冷数据节点。 - ess-client: Client节点。 - ess-master: Master节点。
     */
    public static final class InstTypeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final InstTypeEnum ALL = new InstTypeEnum("all");

        /**
         * Enum ESS for value: "ess"
         */
        public static final InstTypeEnum ESS = new InstTypeEnum("ess");

        /**
         * Enum ESS_COLD for value: "ess-cold"
         */
        public static final InstTypeEnum ESS_COLD = new InstTypeEnum("ess-cold");

        /**
         * Enum ESS_CLIENT for value: "ess-client"
         */
        public static final InstTypeEnum ESS_CLIENT = new InstTypeEnum("ess-client");

        /**
         * Enum ESS_MASTER for value: "ess-master"
         */
        public static final InstTypeEnum ESS_MASTER = new InstTypeEnum("ess-master");

        private static final Map<String, InstTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstTypeEnum> createStaticFields() {
            Map<String, InstTypeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("ess", ESS);
            map.put("ess-cold", ESS_COLD);
            map.put("ess-client", ESS_CLIENT);
            map.put("ess-master", ESS_MASTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstTypeEnum(String value) {
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
        public static InstTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstTypeEnum(value));
        }

        public static InstTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstTypeEnum) {
                return this.value.equals(((InstTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_type")

    private InstTypeEnum instType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAzByInstanceTypeReq body;

    public UpdateAzByInstanceTypeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 待切换AZ的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateAzByInstanceTypeRequest withInstType(InstTypeEnum instType) {
        this.instType = instType;
        return this;
    }

    /**
     * 待切换AZ的节点类型。支持: - all：所有节点类型。 - ess： 数据节点。 - ess-cold: 冷数据节点。 - ess-client: Client节点。 - ess-master: Master节点。
     * @return instType
     */
    public InstTypeEnum getInstType() {
        return instType;
    }

    public void setInstType(InstTypeEnum instType) {
        this.instType = instType;
    }

    public UpdateAzByInstanceTypeRequest withBody(UpdateAzByInstanceTypeReq body) {
        this.body = body;
        return this;
    }

    public UpdateAzByInstanceTypeRequest withBody(Consumer<UpdateAzByInstanceTypeReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAzByInstanceTypeReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAzByInstanceTypeReq getBody() {
        return body;
    }

    public void setBody(UpdateAzByInstanceTypeReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAzByInstanceTypeRequest that = (UpdateAzByInstanceTypeRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.instType, that.instType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, instType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAzByInstanceTypeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    instType: ").append(toIndentedString(instType)).append("\n");
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
