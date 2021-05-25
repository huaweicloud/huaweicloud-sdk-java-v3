package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ImportMqsInstanceTopicRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ImportMqsInstanceTopicRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;
    /**
     * 导入topic的模式。 - AddNew：全量新增导入。 - Merge：合并导入。  默认为AddNew模式。
     */
    public static final class ModeEnum {

        
        /**
         * Enum ADDNEW for value: "AddNew"
         */
        public static final ModeEnum ADDNEW = new ModeEnum("AddNew");
        
        /**
         * Enum MERGE for value: "Merge"
         */
        public static final ModeEnum MERGE = new ModeEnum("Merge");
        

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("AddNew", ADDNEW);
            map.put("Merge", MERGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private ModeEnum mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="prefix")
    
    private String prefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ImportMqsInstanceTopicRequestBody body;

    public ImportMqsInstanceTopicRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ImportMqsInstanceTopicRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 导入topic的模式。 - AddNew：全量新增导入。 - Merge：合并导入。  默认为AddNew模式。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    

    public ImportMqsInstanceTopicRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    


    /**
     * App应用的前缀。  若加上前缀，导入Topic时会拼接前缀和已有的App应用，形成新的App应用名称，再根据新的App应用名称导入Topic。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    

    public ImportMqsInstanceTopicRequest withBody(ImportMqsInstanceTopicRequestBody body) {
        this.body = body;
        return this;
    }

    public ImportMqsInstanceTopicRequest withBody(Consumer<ImportMqsInstanceTopicRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ImportMqsInstanceTopicRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ImportMqsInstanceTopicRequestBody getBody() {
        return body;
    }

    public void setBody(ImportMqsInstanceTopicRequestBody body) {
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
        ImportMqsInstanceTopicRequest importMqsInstanceTopicRequest = (ImportMqsInstanceTopicRequest) o;
        return Objects.equals(this.instanceId, importMqsInstanceTopicRequest.instanceId) &&
            Objects.equals(this.mode, importMqsInstanceTopicRequest.mode) &&
            Objects.equals(this.prefix, importMqsInstanceTopicRequest.prefix) &&
            Objects.equals(this.body, importMqsInstanceTopicRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, mode, prefix, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportMqsInstanceTopicRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

