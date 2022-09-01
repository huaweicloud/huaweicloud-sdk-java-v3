package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSinkTaskReq
 */
public class CreateSinkTaskReq {

    /**
     * 源数据类型，目前只支持BLOB。 
     */
    public static final class SourceTypeEnum {

        /**
         * Enum BLOB for value: "BLOB"
         */
        public static final SourceTypeEnum BLOB = new SourceTypeEnum("BLOB");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("BLOB", BLOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SourceTypeEnum(value);
            }
            return result;
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    @JacksonXmlProperty(localName = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    @JacksonXmlProperty(localName = "task_name")

    private String taskName;

    /**
     * 转存的目标类型，当前只支持OBS。 
     */
    public static final class DestinationTypeEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final DestinationTypeEnum OBS = new DestinationTypeEnum("OBS");

        private static final Map<String, DestinationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DestinationTypeEnum> createStaticFields() {
            Map<String, DestinationTypeEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DestinationTypeEnum(String value) {
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
        public static DestinationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DestinationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DestinationTypeEnum(value);
            }
            return result;
        }

        public static DestinationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DestinationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DestinationTypeEnum) {
                return this.value.equals(((DestinationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    @JacksonXmlProperty(localName = "destination_type")

    private DestinationTypeEnum destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_destination_descriptor")

    @JacksonXmlProperty(localName = "obs_destination_descriptor")

    private ObsDestinationDescriptor obsDestinationDescriptor;

    public CreateSinkTaskReq withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 源数据类型，目前只支持BLOB。 
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public CreateSinkTaskReq withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 转储任务名称。 
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateSinkTaskReq withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 转存的目标类型，当前只支持OBS。 
     * @return destinationType
     */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public CreateSinkTaskReq withObsDestinationDescriptor(ObsDestinationDescriptor obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
        return this;
    }

    public CreateSinkTaskReq withObsDestinationDescriptor(
        Consumer<ObsDestinationDescriptor> obsDestinationDescriptorSetter) {
        if (this.obsDestinationDescriptor == null) {
            this.obsDestinationDescriptor = new ObsDestinationDescriptor();
            obsDestinationDescriptorSetter.accept(this.obsDestinationDescriptor);
        }

        return this;
    }

    /**
     * Get obsDestinationDescriptor
     * @return obsDestinationDescriptor
     */
    public ObsDestinationDescriptor getObsDestinationDescriptor() {
        return obsDestinationDescriptor;
    }

    public void setObsDestinationDescriptor(ObsDestinationDescriptor obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSinkTaskReq createSinkTaskReq = (CreateSinkTaskReq) o;
        return Objects.equals(this.sourceType, createSinkTaskReq.sourceType)
            && Objects.equals(this.taskName, createSinkTaskReq.taskName)
            && Objects.equals(this.destinationType, createSinkTaskReq.destinationType)
            && Objects.equals(this.obsDestinationDescriptor, createSinkTaskReq.obsDestinationDescriptor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType, taskName, destinationType, obsDestinationDescriptor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSinkTaskReq {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    obsDestinationDescriptor: ").append(toIndentedString(obsDestinationDescriptor)).append("\n");
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
