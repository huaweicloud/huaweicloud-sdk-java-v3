package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteScalingInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    /**
     * 实例移出伸缩组，是否删除云服务器实例。默认为no；可选值为yes或no。
     */
    public static final class InstanceDeleteEnum {

        /**
         * Enum YES for value: "yes"
         */
        public static final InstanceDeleteEnum YES = new InstanceDeleteEnum("yes");

        /**
         * Enum NO for value: "no"
         */
        public static final InstanceDeleteEnum NO = new InstanceDeleteEnum("no");

        private static final Map<String, InstanceDeleteEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceDeleteEnum> createStaticFields() {
            Map<String, InstanceDeleteEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceDeleteEnum(String value) {
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
        public static InstanceDeleteEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InstanceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceDeleteEnum(value);
            }
            return result;
        }

        public static InstanceDeleteEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InstanceDeleteEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceDeleteEnum) {
                return this.value.equals(((InstanceDeleteEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_delete")

    @JacksonXmlProperty(localName = "instance_delete")

    private InstanceDeleteEnum instanceDelete;

    public DeleteScalingInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，可参考[查询弹性伸缩组中的实例列表](https://support.huaweicloud.com/api-as/as_06_0301.html)获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteScalingInstanceRequest withInstanceDelete(InstanceDeleteEnum instanceDelete) {
        this.instanceDelete = instanceDelete;
        return this;
    }

    /**
     * 实例移出伸缩组，是否删除云服务器实例。默认为no；可选值为yes或no。
     * @return instanceDelete
     */
    public InstanceDeleteEnum getInstanceDelete() {
        return instanceDelete;
    }

    public void setInstanceDelete(InstanceDeleteEnum instanceDelete) {
        this.instanceDelete = instanceDelete;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteScalingInstanceRequest deleteScalingInstanceRequest = (DeleteScalingInstanceRequest) o;
        return Objects.equals(this.instanceId, deleteScalingInstanceRequest.instanceId)
            && Objects.equals(this.instanceDelete, deleteScalingInstanceRequest.instanceDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteScalingInstanceRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceDelete: ").append(toIndentedString(instanceDelete)).append("\n");
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
