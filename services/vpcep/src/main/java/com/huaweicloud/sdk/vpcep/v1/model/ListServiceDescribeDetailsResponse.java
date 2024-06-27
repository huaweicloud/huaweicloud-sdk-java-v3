package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ListServiceDescribeDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_charge")

    private Boolean isCharge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_policy")

    private Boolean enablePolicy;

    public ListServiceDescribeDetailsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点服务的ID，唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListServiceDescribeDetailsResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 终端节点服务的名称。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ListServiceDescribeDetailsResponse withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 终端节点服务类型。仅支持将用户私有服务创建为interface类型的终端节点服务。  - gateway：由运维人员配置。用户无需创建，可直接使用。  - interface：包括运维人员配置的云服务和用户自己创建的私有服务。 其中，运维人员配置的云服务无需创建，用户可直接使用。 您可以通过创建终端节点创建访问Gateway和Interface类型终端节点服务的终端节点。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ListServiceDescribeDetailsResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 终端节点服务的创建时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ListServiceDescribeDetailsResponse withIsCharge(Boolean isCharge) {
        this.isCharge = isCharge;
        return this;
    }

    /**
     * 连接该终端节点服务的终端节点是否计费。  - true：计费  - false：不计费
     * @return isCharge
     */
    public Boolean getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(Boolean isCharge) {
        this.isCharge = isCharge;
    }

    public ListServiceDescribeDetailsResponse withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 终端节点对应Pool的Public Border Group信息
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListServiceDescribeDetailsResponse withEnablePolicy(Boolean enablePolicy) {
        this.enablePolicy = enablePolicy;
        return this;
    }

    /**
     * 是否允许自定义终端节点策略。  - false：不支持设置终端节点策略  - true：支持设置终端节点策略 默认为false
     * @return enablePolicy
     */
    public Boolean getEnablePolicy() {
        return enablePolicy;
    }

    public void setEnablePolicy(Boolean enablePolicy) {
        this.enablePolicy = enablePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServiceDescribeDetailsResponse that = (ListServiceDescribeDetailsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.isCharge, that.isCharge)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.enablePolicy, that.enablePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceName, serviceType, createdAt, isCharge, publicBorderGroup, enablePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceDescribeDetailsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    isCharge: ").append(toIndentedString(isCharge)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    enablePolicy: ").append(toIndentedString(enablePolicy)).append("\n");
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
