package com.huaweicloud.sdk.sdrs.v1.model;

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
 * 复制对元数据
 */
public class ReplicationRecordMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiattach")

    @JacksonXmlProperty(localName = "multiattach")

    private Boolean multiattach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootable")

    @JacksonXmlProperty(localName = "bootable")

    private Boolean bootable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    @JacksonXmlProperty(localName = "volume_size")

    private Integer volumeSize;

    /**
     * 复制对中的云硬盘类型。SATA：普通IO磁盘类型。SAS：高IO磁盘类型。SSD：超高IO磁盘类型。co-p1：高IO（性能优化I型）uh-l1：超高IO（时延优化）其中co-p1和uh-l1两种云硬盘只能使用在HANA云服务器、HL1型云服务器、HL2型云服务器上。
     */
    public static final class VolumeTypeEnum {

        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumeTypeEnum SATA = new VolumeTypeEnum("SATA");

        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumeTypeEnum SAS = new VolumeTypeEnum("SAS");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final VolumeTypeEnum SSD = new VolumeTypeEnum("SSD");

        /**
         * Enum CO_P1 for value: "co-p1"
         */
        public static final VolumeTypeEnum CO_P1 = new VolumeTypeEnum("co-p1");

        /**
         * Enum UH_L1 for value: "uh-l1"
         */
        public static final VolumeTypeEnum UH_L1 = new VolumeTypeEnum("uh-l1");

        private static final Map<String, VolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeTypeEnum> createStaticFields() {
            Map<String, VolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("co-p1", CO_P1);
            map.put("uh-l1", UH_L1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumeTypeEnum(String value) {
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
        public static VolumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumeTypeEnum(value);
            }
            return result;
        }

        public static VolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumeTypeEnum) {
                return this.value.equals(((VolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    @JacksonXmlProperty(localName = "volume_type")

    private VolumeTypeEnum volumeType;

    public ReplicationRecordMetadata withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    /**
     * 复制对中的云硬盘是否为共享云硬盘。
     * @return multiattach
     */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public ReplicationRecordMetadata withBootable(Boolean bootable) {
        this.bootable = bootable;
        return this;
    }

    /**
     * 复制对中的云硬盘是否为系统盘。
     * @return bootable
     */
    public Boolean getBootable() {
        return bootable;
    }

    public void setBootable(Boolean bootable) {
        this.bootable = bootable;
    }

    public ReplicationRecordMetadata withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 复制对中的云硬盘容量。单位：GB
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public ReplicationRecordMetadata withVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 复制对中的云硬盘类型。SATA：普通IO磁盘类型。SAS：高IO磁盘类型。SSD：超高IO磁盘类型。co-p1：高IO（性能优化I型）uh-l1：超高IO（时延优化）其中co-p1和uh-l1两种云硬盘只能使用在HANA云服务器、HL1型云服务器、HL2型云服务器上。
     * @return volumeType
     */
    public VolumeTypeEnum getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationRecordMetadata replicationRecordMetadata = (ReplicationRecordMetadata) o;
        return Objects.equals(this.multiattach, replicationRecordMetadata.multiattach)
            && Objects.equals(this.bootable, replicationRecordMetadata.bootable)
            && Objects.equals(this.volumeSize, replicationRecordMetadata.volumeSize)
            && Objects.equals(this.volumeType, replicationRecordMetadata.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiattach, bootable, volumeSize, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationRecordMetadata {\n");
        sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
        sb.append("    bootable: ").append(toIndentedString(bootable)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
