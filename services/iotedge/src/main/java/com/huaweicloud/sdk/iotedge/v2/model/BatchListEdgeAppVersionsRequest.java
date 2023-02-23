package com.huaweicloud.sdk.iotedge.v2.model;





import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchListEdgeAppVersionsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    

    private Integer limit;
    /**
     * ai加速卡类型
     */
    public static final class AiCardTypeEnum {

        
        /**
         * Enum GPU for value: "GPU"
         */
        public static final AiCardTypeEnum GPU = new AiCardTypeEnum("GPU");
        
        /**
         * Enum NPU for value: "NPU"
         */
        public static final AiCardTypeEnum NPU = new AiCardTypeEnum("NPU");
        
        /**
         * Enum UNEQUIPPED for value: "unEquipped"
         */
        public static final AiCardTypeEnum UNEQUIPPED = new AiCardTypeEnum("unEquipped");
        

        private static final Map<String, AiCardTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AiCardTypeEnum> createStaticFields() {
            Map<String, AiCardTypeEnum> map = new HashMap<>();
            map.put("GPU", GPU);
            map.put("NPU", NPU);
            map.put("unEquipped", UNEQUIPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AiCardTypeEnum(String value) {
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
        public static AiCardTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AiCardTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AiCardTypeEnum(value);
            }
            return result;
        }

        public static AiCardTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AiCardTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AiCardTypeEnum) {
                return this.value.equals(((AiCardTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ai_card_type")
    

    private AiCardTypeEnum aiCardType;
    /**
     * 支持架构
     */
    public static final class ArchEnum {

        
        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final ArchEnum X86_64 = new ArchEnum("x86_64");
        
        /**
         * Enum ARM32 for value: "arm32"
         */
        public static final ArchEnum ARM32 = new ArchEnum("arm32");
        
        /**
         * Enum ARM64 for value: "arm64"
         */
        public static final ArchEnum ARM64 = new ArchEnum("arm64");
        

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("arm32", ARM32);
            map.put("arm64", ARM64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ArchEnum(value);
            }
            return result;
        }

        public static ArchEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    

    private ArchEnum arch;
    /**
     * 应用版本状态
     */
    public static final class StateEnum {

        
        /**
         * Enum DRAFT for value: "DRAFT"
         */
        public static final StateEnum DRAFT = new StateEnum("DRAFT");
        
        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StateEnum PUBLISHED = new StateEnum("PUBLISHED");
        
        /**
         * Enum OFF_SHELF for value: "OFF_SHELF"
         */
        public static final StateEnum OFF_SHELF = new StateEnum("OFF_SHELF");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("DRAFT", DRAFT);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFF_SHELF", OFF_SHELF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    

    private StateEnum state;

    public BatchListEdgeAppVersionsRequest withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用版本,应用内版本唯一。
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public BatchListEdgeAppVersionsRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用版本搜索关键字
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public BatchListEdgeAppVersionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public BatchListEdgeAppVersionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页记录数，默认值为10，取值区间为1-1000
     * minimum: 0
     * maximum: 1000000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public BatchListEdgeAppVersionsRequest withAiCardType(AiCardTypeEnum aiCardType) {
        this.aiCardType = aiCardType;
        return this;
    }

    


    /**
     * ai加速卡类型
     * @return aiCardType
     */
    public AiCardTypeEnum getAiCardType() {
        return aiCardType;
    }

    public void setAiCardType(AiCardTypeEnum aiCardType) {
        this.aiCardType = aiCardType;
    }

    

    public BatchListEdgeAppVersionsRequest withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * 支持架构
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    

    public BatchListEdgeAppVersionsRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 应用版本状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListEdgeAppVersionsRequest batchListEdgeAppVersionsRequest = (BatchListEdgeAppVersionsRequest) o;
        return Objects.equals(this.edgeAppId, batchListEdgeAppVersionsRequest.edgeAppId) &&
            Objects.equals(this.version, batchListEdgeAppVersionsRequest.version) &&
            Objects.equals(this.offset, batchListEdgeAppVersionsRequest.offset) &&
            Objects.equals(this.limit, batchListEdgeAppVersionsRequest.limit) &&
            Objects.equals(this.aiCardType, batchListEdgeAppVersionsRequest.aiCardType) &&
            Objects.equals(this.arch, batchListEdgeAppVersionsRequest.arch) &&
            Objects.equals(this.state, batchListEdgeAppVersionsRequest.state);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, version, offset, limit, aiCardType, arch, state);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListEdgeAppVersionsRequest {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    aiCardType: ").append(toIndentedString(aiCardType)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

