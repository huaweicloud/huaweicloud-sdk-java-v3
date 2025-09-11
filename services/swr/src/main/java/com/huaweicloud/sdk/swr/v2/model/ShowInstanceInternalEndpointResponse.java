package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceInternalEndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_endpoint_id")

    private String vpcepEndpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_cidr")

    private String vpcCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_ip")

    private String endpointIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 访问控制的状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "Creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("Creating");

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("Running");

        /**
         * Enum CREATEERROR for value: "CreateError"
         */
        public static final StatusEnum CREATEERROR = new StatusEnum("CreateError");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("Deleting");

        /**
         * Enum DELETEERROR for value: "DeleteError"
         */
        public static final StatusEnum DELETEERROR = new StatusEnum("DeleteError");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Creating", CREATING);
            map.put("Running", RUNNING);
            map.put("CreateError", CREATEERROR);
            map.put("Deleting", DELETING);
            map.put("DeleteError", DELETEERROR);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_text")

    private String statusText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public ShowInstanceInternalEndpointResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 内网访问ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInstanceInternalEndpointResponse withVpcepEndpointId(String vpcepEndpointId) {
        this.vpcepEndpointId = vpcepEndpointId;
        return this;
    }

    /**
     * VPC端点的ID
     * @return vpcepEndpointId
     */
    public String getVpcepEndpointId() {
        return vpcepEndpointId;
    }

    public void setVpcepEndpointId(String vpcepEndpointId) {
        this.vpcepEndpointId = vpcepEndpointId;
    }

    public ShowInstanceInternalEndpointResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowInstanceInternalEndpointResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowInstanceInternalEndpointResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowInstanceInternalEndpointResponse withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * VPC的名称
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public ShowInstanceInternalEndpointResponse withVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    /**
     * VPC的CIDR范围
     * @return vpcCidr
     */
    public String getVpcCidr() {
        return vpcCidr;
    }

    public void setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
    }

    public ShowInstanceInternalEndpointResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowInstanceInternalEndpointResponse withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 子网的名称
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public ShowInstanceInternalEndpointResponse withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 子网的CIDR范围
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public ShowInstanceInternalEndpointResponse withEndpointIp(String endpointIp) {
        this.endpointIp = endpointIp;
        return this;
    }

    /**
     * 端点的IP地址
     * @return endpointIp
     */
    public String getEndpointIp() {
        return endpointIp;
    }

    public void setEndpointIp(String endpointIp) {
        this.endpointIp = endpointIp;
    }

    public ShowInstanceInternalEndpointResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 访问控制的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowInstanceInternalEndpointResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 访问控制的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowInstanceInternalEndpointResponse withStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    /**
     * 访问控制的状态信息
     * @return statusText
     */
    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public ShowInstanceInternalEndpointResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 访问控制的创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceInternalEndpointResponse that = (ShowInstanceInternalEndpointResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vpcepEndpointId, that.vpcepEndpointId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.vpcName, that.vpcName)
            && Objects.equals(this.vpcCidr, that.vpcCidr) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.subnetName, that.subnetName) && Objects.equals(this.subnetCidr, that.subnetCidr)
            && Objects.equals(this.endpointIp, that.endpointIp) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusText, that.statusText)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            vpcepEndpointId,
            projectId,
            projectName,
            vpcId,
            vpcName,
            vpcCidr,
            subnetId,
            subnetName,
            subnetCidr,
            endpointIp,
            description,
            status,
            statusText,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceInternalEndpointResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vpcepEndpointId: ").append(toIndentedString(vpcepEndpointId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    vpcCidr: ").append(toIndentedString(vpcCidr)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    endpointIp: ").append(toIndentedString(endpointIp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
