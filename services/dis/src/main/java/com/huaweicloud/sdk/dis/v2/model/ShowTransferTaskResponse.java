package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTransferTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * 转储任务状态。  - ERROR：错误。 - STARTING：启动中。 - PAUSED：已停止。 - RUNNING：运行中。 - DELETE：已删除。 - ABNORMAL：异常。
     */
    public static final class StateEnum {

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StateEnum ERROR = new StateEnum("ERROR");

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StateEnum STARTING = new StateEnum("STARTING");

        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final StateEnum PAUSED = new StateEnum("PAUSED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final StateEnum DELETE = new StateEnum("DELETE");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StateEnum ABNORMAL = new StateEnum("ABNORMAL");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("ERROR", ERROR);
            map.put("STARTING", STARTING);
            map.put("PAUSED", PAUSED);
            map.put("RUNNING", RUNNING);
            map.put("DELETE", DELETE);
            map.put("ABNORMAL", ABNORMAL);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "state")

    private StateEnum state;

    /**
     * 转储任务类型。  - OBS：转储到OBS。 - MRS：转储到MRS。 - DLI：转储到DLI。 - CLOUDTABLE：转储到CloudTable。 - DWS：转储到DWS。
     */
    public static final class DestinationTypeEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final DestinationTypeEnum OBS = new DestinationTypeEnum("OBS");

        /**
         * Enum MRS for value: "MRS"
         */
        public static final DestinationTypeEnum MRS = new DestinationTypeEnum("MRS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final DestinationTypeEnum DLI = new DestinationTypeEnum("DLI");

        /**
         * Enum CLOUDTABLE for value: "CLOUDTABLE"
         */
        public static final DestinationTypeEnum CLOUDTABLE = new DestinationTypeEnum("CLOUDTABLE");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DestinationTypeEnum DWS = new DestinationTypeEnum("DWS");

        private static final Map<String, DestinationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DestinationTypeEnum> createStaticFields() {
            Map<String, DestinationTypeEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            map.put("MRS", MRS);
            map.put("DLI", DLI);
            map.put("CLOUDTABLE", CLOUDTABLE);
            map.put("DWS", DWS);
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
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_transfer_timestamp")

    private Long lastTransferTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<PartitionResult> partitions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_destination_description")

    private OBSDestinationDescriptorRequest obsDestinationDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_destination_descripton")

    private DWSDestinationDescriptorRequest dwsDestinationDescripton;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_destination_description")

    private MRSDestinationDescriptorRequest mrsDestinationDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dli_destination_description")

    private DliDestinationDescriptorRequest dliDestinationDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudtable_destination_descripton")

    private CloudtableDestinationDescriptorRequest cloudtableDestinationDescripton;

    public ShowTransferTaskResponse withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 该转储任务所属通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ShowTransferTaskResponse withTaskName(String taskName) {
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

    public ShowTransferTaskResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 转储任务状态。  - ERROR：错误。 - STARTING：启动中。 - PAUSED：已停止。 - RUNNING：运行中。 - DELETE：已删除。 - ABNORMAL：异常。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowTransferTaskResponse withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 转储任务类型。  - OBS：转储到OBS。 - MRS：转储到MRS。 - DLI：转储到DLI。 - CLOUDTABLE：转储到CloudTable。 - DWS：转储到DWS。
     * @return destinationType
     */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public ShowTransferTaskResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 转储任务创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowTransferTaskResponse withLastTransferTimestamp(Long lastTransferTimestamp) {
        this.lastTransferTimestamp = lastTransferTimestamp;
        return this;
    }

    /**
     * 转储任务最近一次转储时间。
     * @return lastTransferTimestamp
     */
    public Long getLastTransferTimestamp() {
        return lastTransferTimestamp;
    }

    public void setLastTransferTimestamp(Long lastTransferTimestamp) {
        this.lastTransferTimestamp = lastTransferTimestamp;
    }

    public ShowTransferTaskResponse withPartitions(List<PartitionResult> partitions) {
        this.partitions = partitions;
        return this;
    }

    public ShowTransferTaskResponse addPartitionsItem(PartitionResult partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public ShowTransferTaskResponse withPartitions(Consumer<List<PartitionResult>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 分区转储详情列表。
     * @return partitions
     */
    public List<PartitionResult> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<PartitionResult> partitions) {
        this.partitions = partitions;
    }

    public ShowTransferTaskResponse withObsDestinationDescription(
        OBSDestinationDescriptorRequest obsDestinationDescription) {
        this.obsDestinationDescription = obsDestinationDescription;
        return this;
    }

    public ShowTransferTaskResponse withObsDestinationDescription(
        Consumer<OBSDestinationDescriptorRequest> obsDestinationDescriptionSetter) {
        if (this.obsDestinationDescription == null) {
            this.obsDestinationDescription = new OBSDestinationDescriptorRequest();
            obsDestinationDescriptionSetter.accept(this.obsDestinationDescription);
        }

        return this;
    }

    /**
     * Get obsDestinationDescription
     * @return obsDestinationDescription
     */
    public OBSDestinationDescriptorRequest getObsDestinationDescription() {
        return obsDestinationDescription;
    }

    public void setObsDestinationDescription(OBSDestinationDescriptorRequest obsDestinationDescription) {
        this.obsDestinationDescription = obsDestinationDescription;
    }

    public ShowTransferTaskResponse withDwsDestinationDescripton(
        DWSDestinationDescriptorRequest dwsDestinationDescripton) {
        this.dwsDestinationDescripton = dwsDestinationDescripton;
        return this;
    }

    public ShowTransferTaskResponse withDwsDestinationDescripton(
        Consumer<DWSDestinationDescriptorRequest> dwsDestinationDescriptonSetter) {
        if (this.dwsDestinationDescripton == null) {
            this.dwsDestinationDescripton = new DWSDestinationDescriptorRequest();
            dwsDestinationDescriptonSetter.accept(this.dwsDestinationDescripton);
        }

        return this;
    }

    /**
     * Get dwsDestinationDescripton
     * @return dwsDestinationDescripton
     */
    public DWSDestinationDescriptorRequest getDwsDestinationDescripton() {
        return dwsDestinationDescripton;
    }

    public void setDwsDestinationDescripton(DWSDestinationDescriptorRequest dwsDestinationDescripton) {
        this.dwsDestinationDescripton = dwsDestinationDescripton;
    }

    public ShowTransferTaskResponse withMrsDestinationDescription(
        MRSDestinationDescriptorRequest mrsDestinationDescription) {
        this.mrsDestinationDescription = mrsDestinationDescription;
        return this;
    }

    public ShowTransferTaskResponse withMrsDestinationDescription(
        Consumer<MRSDestinationDescriptorRequest> mrsDestinationDescriptionSetter) {
        if (this.mrsDestinationDescription == null) {
            this.mrsDestinationDescription = new MRSDestinationDescriptorRequest();
            mrsDestinationDescriptionSetter.accept(this.mrsDestinationDescription);
        }

        return this;
    }

    /**
     * Get mrsDestinationDescription
     * @return mrsDestinationDescription
     */
    public MRSDestinationDescriptorRequest getMrsDestinationDescription() {
        return mrsDestinationDescription;
    }

    public void setMrsDestinationDescription(MRSDestinationDescriptorRequest mrsDestinationDescription) {
        this.mrsDestinationDescription = mrsDestinationDescription;
    }

    public ShowTransferTaskResponse withDliDestinationDescription(
        DliDestinationDescriptorRequest dliDestinationDescription) {
        this.dliDestinationDescription = dliDestinationDescription;
        return this;
    }

    public ShowTransferTaskResponse withDliDestinationDescription(
        Consumer<DliDestinationDescriptorRequest> dliDestinationDescriptionSetter) {
        if (this.dliDestinationDescription == null) {
            this.dliDestinationDescription = new DliDestinationDescriptorRequest();
            dliDestinationDescriptionSetter.accept(this.dliDestinationDescription);
        }

        return this;
    }

    /**
     * Get dliDestinationDescription
     * @return dliDestinationDescription
     */
    public DliDestinationDescriptorRequest getDliDestinationDescription() {
        return dliDestinationDescription;
    }

    public void setDliDestinationDescription(DliDestinationDescriptorRequest dliDestinationDescription) {
        this.dliDestinationDescription = dliDestinationDescription;
    }

    public ShowTransferTaskResponse withCloudtableDestinationDescripton(
        CloudtableDestinationDescriptorRequest cloudtableDestinationDescripton) {
        this.cloudtableDestinationDescripton = cloudtableDestinationDescripton;
        return this;
    }

    public ShowTransferTaskResponse withCloudtableDestinationDescripton(
        Consumer<CloudtableDestinationDescriptorRequest> cloudtableDestinationDescriptonSetter) {
        if (this.cloudtableDestinationDescripton == null) {
            this.cloudtableDestinationDescripton = new CloudtableDestinationDescriptorRequest();
            cloudtableDestinationDescriptonSetter.accept(this.cloudtableDestinationDescripton);
        }

        return this;
    }

    /**
     * Get cloudtableDestinationDescripton
     * @return cloudtableDestinationDescripton
     */
    public CloudtableDestinationDescriptorRequest getCloudtableDestinationDescripton() {
        return cloudtableDestinationDescripton;
    }

    public void setCloudtableDestinationDescripton(
        CloudtableDestinationDescriptorRequest cloudtableDestinationDescripton) {
        this.cloudtableDestinationDescripton = cloudtableDestinationDescripton;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTransferTaskResponse that = (ShowTransferTaskResponse) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.state, that.state) && Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastTransferTimestamp, that.lastTransferTimestamp)
            && Objects.equals(this.partitions, that.partitions)
            && Objects.equals(this.obsDestinationDescription, that.obsDestinationDescription)
            && Objects.equals(this.dwsDestinationDescripton, that.dwsDestinationDescripton)
            && Objects.equals(this.mrsDestinationDescription, that.mrsDestinationDescription)
            && Objects.equals(this.dliDestinationDescription, that.dliDestinationDescription)
            && Objects.equals(this.cloudtableDestinationDescripton, that.cloudtableDestinationDescripton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName,
            taskName,
            state,
            destinationType,
            createTime,
            lastTransferTimestamp,
            partitions,
            obsDestinationDescription,
            dwsDestinationDescripton,
            mrsDestinationDescription,
            dliDestinationDescription,
            cloudtableDestinationDescripton);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTransferTaskResponse {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastTransferTimestamp: ").append(toIndentedString(lastTransferTimestamp)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
        sb.append("    obsDestinationDescription: ").append(toIndentedString(obsDestinationDescription)).append("\n");
        sb.append("    dwsDestinationDescripton: ").append(toIndentedString(dwsDestinationDescripton)).append("\n");
        sb.append("    mrsDestinationDescription: ").append(toIndentedString(mrsDestinationDescription)).append("\n");
        sb.append("    dliDestinationDescription: ").append(toIndentedString(dliDestinationDescription)).append("\n");
        sb.append("    cloudtableDestinationDescripton: ")
            .append(toIndentedString(cloudtableDestinationDescripton))
            .append("\n");
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
