package com.huaweicloud.sdk.dis.v2.model;

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
 * CreateTransferTaskReq
 */
public class CreateTransferTaskReq {

    /**
     * 转储任务类型。  - OBS：转储到OBS - MRS：转储到MRS - DLI：转储到DLI - CLOUDTABLE：转储到CloudTable - DWS：转储到DWS
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DestinationTypeEnum(value));
        }

        public static DestinationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private DestinationTypeEnum destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_destination_descriptor")

    private OBSDestinationDescriptorRequest obsDestinationDescriptor;

    public CreateTransferTaskReq withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 转储任务类型。  - OBS：转储到OBS - MRS：转储到MRS - DLI：转储到DLI - CLOUDTABLE：转储到CloudTable - DWS：转储到DWS
     * @return destinationType
     */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public CreateTransferTaskReq withObsDestinationDescriptor(
        OBSDestinationDescriptorRequest obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
        return this;
    }

    public CreateTransferTaskReq withObsDestinationDescriptor(
        Consumer<OBSDestinationDescriptorRequest> obsDestinationDescriptorSetter) {
        if (this.obsDestinationDescriptor == null) {
            this.obsDestinationDescriptor = new OBSDestinationDescriptorRequest();
            obsDestinationDescriptorSetter.accept(this.obsDestinationDescriptor);
        }

        return this;
    }

    /**
     * Get obsDestinationDescriptor
     * @return obsDestinationDescriptor
     */
    public OBSDestinationDescriptorRequest getObsDestinationDescriptor() {
        return obsDestinationDescriptor;
    }

    public void setObsDestinationDescriptor(OBSDestinationDescriptorRequest obsDestinationDescriptor) {
        this.obsDestinationDescriptor = obsDestinationDescriptor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTransferTaskReq that = (CreateTransferTaskReq) obj;
        return Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.obsDestinationDescriptor, that.obsDestinationDescriptor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationType, obsDestinationDescriptor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransferTaskReq {\n");
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
