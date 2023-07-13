package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UserVmrDTO
 */
public class UserVmrDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrId")

    private String vmrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrName")

    private String vmrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrMode")

    private Integer vmrMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgId")

    private String vmrPkgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgName")

    private String vmrPkgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgParties")

    private Integer vmrPkgParties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgLength")

    private Integer vmrPkgLength;

    /**
     * 云会议室状态。 * 0：正常 * 1：停用 * 2：未分配 
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(Integer value) {
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

    public UserVmrDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云会议室的ID。 > 对应[[创建会议](https://support.huaweicloud.com/api-meeting/meeting_21_0014.html)](tag:hws)[[创建会议](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0014.html)](tag:hk)接口中的vmrID。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserVmrDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    /**
     * 云会议室的固定会议ID。 > 对应[[创建会议](https://support.huaweicloud.com/api-meeting/meeting_21_0014.html)](tag:hws)[[创建会议](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0014.html)](tag:hk)接口返回数据的vmrConferenceID。 
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    public UserVmrDTO withVmrName(String vmrName) {
        this.vmrName = vmrName;
        return this;
    }

    /**
     * 云会议室名称。
     * @return vmrName
     */
    public String getVmrName() {
        return vmrName;
    }

    public void setVmrName(String vmrName) {
        this.vmrName = vmrName;
    }

    public UserVmrDTO withVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
        return this;
    }

    /**
     * VMR模式。 - 0：个人会议ID - 1: 云会议室 - 2: 网络研讨会 
     * @return vmrMode
     */
    public Integer getVmrMode() {
        return vmrMode;
    }

    public void setVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
    }

    public UserVmrDTO withVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
        return this;
    }

    /**
     * 云会议室套餐包的id，仅云会议室返回。
     * @return vmrPkgId
     */
    public String getVmrPkgId() {
        return vmrPkgId;
    }

    public void setVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
    }

    public UserVmrDTO withVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
        return this;
    }

    /**
     * 云会议室套餐包的名称，仅云会议室返回。
     * @return vmrPkgName
     */
    public String getVmrPkgName() {
        return vmrPkgName;
    }

    public void setVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
    }

    public UserVmrDTO withVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
        return this;
    }

    /**
     * 云会议室套餐包的会议并发方数，仅云会议室返回。
     * @return vmrPkgParties
     */
    public Integer getVmrPkgParties() {
        return vmrPkgParties;
    }

    public void setVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
    }

    public UserVmrDTO withVmrPkgLength(Integer vmrPkgLength) {
        this.vmrPkgLength = vmrPkgLength;
        return this;
    }

    /**
     * 云会议室套餐包的与会时间，若为0则代表无限时长，仅云会议室返回。
     * @return vmrPkgLength
     */
    public Integer getVmrPkgLength() {
        return vmrPkgLength;
    }

    public void setVmrPkgLength(Integer vmrPkgLength) {
        this.vmrPkgLength = vmrPkgLength;
    }

    public UserVmrDTO withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 云会议室状态。 * 0：正常 * 1：停用 * 2：未分配 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserVmrDTO that = (UserVmrDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vmrId, that.vmrId)
            && Objects.equals(this.vmrName, that.vmrName) && Objects.equals(this.vmrMode, that.vmrMode)
            && Objects.equals(this.vmrPkgId, that.vmrPkgId) && Objects.equals(this.vmrPkgName, that.vmrPkgName)
            && Objects.equals(this.vmrPkgParties, that.vmrPkgParties)
            && Objects.equals(this.vmrPkgLength, that.vmrPkgLength) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vmrId, vmrName, vmrMode, vmrPkgId, vmrPkgName, vmrPkgParties, vmrPkgLength, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserVmrDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    vmrName: ").append(toIndentedString(vmrName)).append("\n");
        sb.append("    vmrMode: ").append(toIndentedString(vmrMode)).append("\n");
        sb.append("    vmrPkgId: ").append(toIndentedString(vmrPkgId)).append("\n");
        sb.append("    vmrPkgName: ").append(toIndentedString(vmrPkgName)).append("\n");
        sb.append("    vmrPkgParties: ").append(toIndentedString(vmrPkgParties)).append("\n");
        sb.append("    vmrPkgLength: ").append(toIndentedString(vmrPkgLength)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
