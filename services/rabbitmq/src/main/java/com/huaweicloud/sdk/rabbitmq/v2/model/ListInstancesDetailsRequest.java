package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesDetailsRequest {

    /**
     * **参数解释**： 引擎类型：rabbitmq。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     */
    public static final class EngineEnum {

        /**
         * Enum RABBITMQ for value: "rabbitmq"
         */
        public static final EngineEnum RABBITMQ = new EngineEnum("rabbitmq");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("rabbitmq", RABBITMQ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineEnum(value));
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * **参数解释**： 实例状态，[详细状态说明请参考[实例状态说明](rabbitmq-api-180514012.xml)](tag:hws,hws_eu,hws_hk,cmcc,ctc,sbc,hk_sbc,g42,hk_g42,tm,hk_tm,ax)[详细状态说明请参考[实例状态说明](kafka-api-180514012.xml)](tag:hcs)。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum RESTARTING for value: "RESTARTING"
         */
        public static final StatusEnum RESTARTING = new StatusEnum("RESTARTING");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum CREATEFAILED for value: "CREATEFAILED"
         */
        public static final StatusEnum CREATEFAILED = new StatusEnum("CREATEFAILED");

        /**
         * Enum FREEZING for value: "FREEZING"
         */
        public static final StatusEnum FREEZING = new StatusEnum("FREEZING");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");

        /**
         * Enum EXTENDING for value: "EXTENDING"
         */
        public static final StatusEnum EXTENDING = new StatusEnum("EXTENDING");

        /**
         * Enum SHRINKING for value: "SHRINKING"
         */
        public static final StatusEnum SHRINKING = new StatusEnum("SHRINKING");

        /**
         * Enum EXTENDEDFAILED for value: "EXTENDEDFAILED"
         */
        public static final StatusEnum EXTENDEDFAILED = new StatusEnum("EXTENDEDFAILED");

        /**
         * Enum CONFIGURING for value: "CONFIGURING"
         */
        public static final StatusEnum CONFIGURING = new StatusEnum("CONFIGURING");

        /**
         * Enum ROLLBACK for value: "ROLLBACK"
         */
        public static final StatusEnum ROLLBACK = new StatusEnum("ROLLBACK");

        /**
         * Enum ROLLBACKFAILED for value: "ROLLBACKFAILED"
         */
        public static final StatusEnum ROLLBACKFAILED = new StatusEnum("ROLLBACKFAILED");

        /**
         * Enum VOLUMETYPECHANGING for value: "VOLUMETYPECHANGING"
         */
        public static final StatusEnum VOLUMETYPECHANGING = new StatusEnum("VOLUMETYPECHANGING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("RUNNING", RUNNING);
            map.put("RESTARTING", RESTARTING);
            map.put("DELETING", DELETING);
            map.put("ERROR", ERROR);
            map.put("CREATEFAILED", CREATEFAILED);
            map.put("FREEZING", FREEZING);
            map.put("FROZEN", FROZEN);
            map.put("EXTENDING", EXTENDING);
            map.put("SHRINKING", SHRINKING);
            map.put("EXTENDEDFAILED", EXTENDEDFAILED);
            map.put("CONFIGURING", CONFIGURING);
            map.put("ROLLBACK", ROLLBACK);
            map.put("ROLLBACKFAILED", ROLLBACKFAILED);
            map.put("VOLUMETYPECHANGING", VOLUMETYPECHANGING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * **参数解释**： 是否返回创建失败的实例数。 **约束限制**： 不涉及。 **取值范围**： - true：返回创建失败的实例数。 - false：不返回创建失败的实例数。  **默认取值**： 不涉及。
     */
    public static final class IncludeFailureEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IncludeFailureEnum TRUE = new IncludeFailureEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IncludeFailureEnum FALSE = new IncludeFailureEnum("false");

        private static final Map<String, IncludeFailureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IncludeFailureEnum> createStaticFields() {
            Map<String, IncludeFailureEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IncludeFailureEnum(String value) {
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
        public static IncludeFailureEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IncludeFailureEnum(value));
        }

        public static IncludeFailureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IncludeFailureEnum) {
                return this.value.equals(((IncludeFailureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_failure")

    private IncludeFailureEnum includeFailure;

    /**
     * **参数解释**： 是否按照实例名称进行精确匹配查询。 **约束限制**： 不涉及。 **取值范围**： - true：按照实例名称进行精确匹配查询。 - false：按照模糊匹配实例名称查询。  **默认取值**： false
     */
    public static final class ExactMatchNameEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final ExactMatchNameEnum TRUE = new ExactMatchNameEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final ExactMatchNameEnum FALSE = new ExactMatchNameEnum("false");

        private static final Map<String, ExactMatchNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExactMatchNameEnum> createStaticFields() {
            Map<String, ExactMatchNameEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExactMatchNameEnum(String value) {
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
        public static ExactMatchNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExactMatchNameEnum(value));
        }

        public static ExactMatchNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExactMatchNameEnum) {
                return this.value.equals(((ExactMatchNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exact_match_name")

    private ExactMatchNameEnum exactMatchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListInstancesDetailsRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * **参数解释**： 引擎类型：rabbitmq。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public ListInstancesDetailsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 实例名称。获取方式：调用“查询所有实例列表”接口，从响应体中获取实例名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesDetailsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。获取方法如下：调用“查询所有实例列表”接口，从响应体中获取实例ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstancesDetailsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 实例状态，[详细状态说明请参考[实例状态说明](rabbitmq-api-180514012.xml)](tag:hws,hws_eu,hws_hk,cmcc,ctc,sbc,hk_sbc,g42,hk_g42,tm,hk_tm,ax)[详细状态说明请参考[实例状态说明](kafka-api-180514012.xml)](tag:hcs)。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListInstancesDetailsRequest withIncludeFailure(IncludeFailureEnum includeFailure) {
        this.includeFailure = includeFailure;
        return this;
    }

    /**
     * **参数解释**： 是否返回创建失败的实例数。 **约束限制**： 不涉及。 **取值范围**： - true：返回创建失败的实例数。 - false：不返回创建失败的实例数。  **默认取值**： 不涉及。
     * @return includeFailure
     */
    public IncludeFailureEnum getIncludeFailure() {
        return includeFailure;
    }

    public void setIncludeFailure(IncludeFailureEnum includeFailure) {
        this.includeFailure = includeFailure;
    }

    public ListInstancesDetailsRequest withExactMatchName(ExactMatchNameEnum exactMatchName) {
        this.exactMatchName = exactMatchName;
        return this;
    }

    /**
     * **参数解释**： 是否按照实例名称进行精确匹配查询。 **约束限制**： 不涉及。 **取值范围**： - true：按照实例名称进行精确匹配查询。 - false：按照模糊匹配实例名称查询。  **默认取值**： false
     * @return exactMatchName
     */
    public ExactMatchNameEnum getExactMatchName() {
        return exactMatchName;
    }

    public void setExactMatchName(ExactMatchNameEnum exactMatchName) {
        this.exactMatchName = exactMatchName;
    }

    public ListInstancesDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListInstancesDetailsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 偏移量，表示从此偏移量开始查询。 **约束限制**： 不涉及。 **取值范围**： 大于等于0 **默认取值**： 不涉及。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListInstancesDetailsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 当次查询返回的最大实例个数。 **约束限制**： 不涉及。 **取值范围**： 1~50 **默认取值**： 10
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesDetailsRequest that = (ListInstancesDetailsRequest) obj;
        return Objects.equals(this.engine, that.engine) && Objects.equals(this.name, that.name)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.includeFailure, that.includeFailure)
            && Objects.equals(this.exactMatchName, that.exactMatchName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(engine, name, instanceId, status, includeFailure, exactMatchName, enterpriseProjectId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesDetailsRequest {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    includeFailure: ").append(toIndentedString(includeFailure)).append("\n");
        sb.append("    exactMatchName: ").append(toIndentedString(exactMatchName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
