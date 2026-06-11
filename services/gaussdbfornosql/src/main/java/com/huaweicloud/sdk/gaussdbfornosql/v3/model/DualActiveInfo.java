package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DualActiveInfo
 */
public class DualActiveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_instance_id")

    private String destinationInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_instance_name")

    private String destinationInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_instance_node_num")

    private String destinationInstanceNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_instance_spec_code")

    private String destinationInstanceSpecCode;

    public DualActiveInfo withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释：** 双活角色。 **取值范围：** 不涉及。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DualActiveInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 双活状态。 **取值范围：** - normal：表示双活状态正常。 - abnormal：表示双活状态异常。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DualActiveInfo withDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }

    /**
     * **参数解释：** 双活对端实例id。 **取值范围：** 不涉及。
     * @return destinationInstanceId
     */
    public String getDestinationInstanceId() {
        return destinationInstanceId;
    }

    public void setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
    }

    public DualActiveInfo withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * **参数解释：** 双活对端region。 **取值范围：** 不涉及。
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public DualActiveInfo withDestinationInstanceName(String destinationInstanceName) {
        this.destinationInstanceName = destinationInstanceName;
        return this;
    }

    /**
     * **参数解释：** 双活对端实例名称。 **取值范围：** 不涉及。
     * @return destinationInstanceName
     */
    public String getDestinationInstanceName() {
        return destinationInstanceName;
    }

    public void setDestinationInstanceName(String destinationInstanceName) {
        this.destinationInstanceName = destinationInstanceName;
    }

    public DualActiveInfo withDestinationInstanceNodeNum(String destinationInstanceNodeNum) {
        this.destinationInstanceNodeNum = destinationInstanceNodeNum;
        return this;
    }

    /**
     * **参数解释：** 双活对端实例节点数量。 **取值范围：** 不涉及。
     * @return destinationInstanceNodeNum
     */
    public String getDestinationInstanceNodeNum() {
        return destinationInstanceNodeNum;
    }

    public void setDestinationInstanceNodeNum(String destinationInstanceNodeNum) {
        this.destinationInstanceNodeNum = destinationInstanceNodeNum;
    }

    public DualActiveInfo withDestinationInstanceSpecCode(String destinationInstanceSpecCode) {
        this.destinationInstanceSpecCode = destinationInstanceSpecCode;
        return this;
    }

    /**
     * **参数解释：** 双活对端实例规格。 **取值范围：** 不涉及。
     * @return destinationInstanceSpecCode
     */
    public String getDestinationInstanceSpecCode() {
        return destinationInstanceSpecCode;
    }

    public void setDestinationInstanceSpecCode(String destinationInstanceSpecCode) {
        this.destinationInstanceSpecCode = destinationInstanceSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DualActiveInfo that = (DualActiveInfo) obj;
        return Objects.equals(this.role, that.role) && Objects.equals(this.status, that.status)
            && Objects.equals(this.destinationInstanceId, that.destinationInstanceId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.destinationInstanceName, that.destinationInstanceName)
            && Objects.equals(this.destinationInstanceNodeNum, that.destinationInstanceNodeNum)
            && Objects.equals(this.destinationInstanceSpecCode, that.destinationInstanceSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role,
            status,
            destinationInstanceId,
            destinationRegion,
            destinationInstanceName,
            destinationInstanceNodeNum,
            destinationInstanceSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DualActiveInfo {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    destinationInstanceId: ").append(toIndentedString(destinationInstanceId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationInstanceName: ").append(toIndentedString(destinationInstanceName)).append("\n");
        sb.append("    destinationInstanceNodeNum: ").append(toIndentedString(destinationInstanceNodeNum)).append("\n");
        sb.append("    destinationInstanceSpecCode: ")
            .append(toIndentedString(destinationInstanceSpecCode))
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
