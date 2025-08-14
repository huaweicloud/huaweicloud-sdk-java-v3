package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class GetStackTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Client-Request-Id")

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_name")

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_id")

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_source_ips")

    private List<String> accessControlSourceIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_source_vpc_ids")

    private List<String> accessControlSourceVpcIds = null;

    public GetStackTemplateRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    public GetStackTemplateRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * 资源栈的名称。此名字在domain_id+区域+project_id下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public GetStackTemplateRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * 资源栈（stack）的唯一ID。  此ID由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给予的stack_id和当前资源栈的ID不一致，则返回400
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public GetStackTemplateRequest withAccessControlSourceIps(List<String> accessControlSourceIps) {
        this.accessControlSourceIps = accessControlSourceIps;
        return this;
    }

    public GetStackTemplateRequest addAccessControlSourceIpsItem(String accessControlSourceIpsItem) {
        if (this.accessControlSourceIps == null) {
            this.accessControlSourceIps = new ArrayList<>();
        }
        this.accessControlSourceIps.add(accessControlSourceIpsItem);
        return this;
    }

    public GetStackTemplateRequest withAccessControlSourceIps(Consumer<List<String>> accessControlSourceIpsSetter) {
        if (this.accessControlSourceIps == null) {
            this.accessControlSourceIps = new ArrayList<>();
        }
        accessControlSourceIpsSetter.accept(this.accessControlSourceIps);
        return this;
    }

    /**
     * 允许访问资源栈模板的source ip列表，source ip应是具有CIDR表示法且带有子网掩码的IPv4地址。
     * @return accessControlSourceIps
     */
    public List<String> getAccessControlSourceIps() {
        return accessControlSourceIps;
    }

    public void setAccessControlSourceIps(List<String> accessControlSourceIps) {
        this.accessControlSourceIps = accessControlSourceIps;
    }

    public GetStackTemplateRequest withAccessControlSourceVpcIds(List<String> accessControlSourceVpcIds) {
        this.accessControlSourceVpcIds = accessControlSourceVpcIds;
        return this;
    }

    public GetStackTemplateRequest addAccessControlSourceVpcIdsItem(String accessControlSourceVpcIdsItem) {
        if (this.accessControlSourceVpcIds == null) {
            this.accessControlSourceVpcIds = new ArrayList<>();
        }
        this.accessControlSourceVpcIds.add(accessControlSourceVpcIdsItem);
        return this;
    }

    public GetStackTemplateRequest withAccessControlSourceVpcIds(
        Consumer<List<String>> accessControlSourceVpcIdsSetter) {
        if (this.accessControlSourceVpcIds == null) {
            this.accessControlSourceVpcIds = new ArrayList<>();
        }
        accessControlSourceVpcIdsSetter.accept(this.accessControlSourceVpcIds);
        return this;
    }

    /**
     * 允许访问资源栈模板的source vpc id列表， source vpc id应仅包含小写字母、数字或中划线。
     * @return accessControlSourceVpcIds
     */
    public List<String> getAccessControlSourceVpcIds() {
        return accessControlSourceVpcIds;
    }

    public void setAccessControlSourceVpcIds(List<String> accessControlSourceVpcIds) {
        this.accessControlSourceVpcIds = accessControlSourceVpcIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetStackTemplateRequest that = (GetStackTemplateRequest) obj;
        return Objects.equals(this.clientRequestId, that.clientRequestId)
            && Objects.equals(this.stackName, that.stackName) && Objects.equals(this.stackId, that.stackId)
            && Objects.equals(this.accessControlSourceIps, that.accessControlSourceIps)
            && Objects.equals(this.accessControlSourceVpcIds, that.accessControlSourceVpcIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, stackName, stackId, accessControlSourceIps, accessControlSourceVpcIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetStackTemplateRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    accessControlSourceIps: ").append(toIndentedString(accessControlSourceIps)).append("\n");
        sb.append("    accessControlSourceVpcIds: ").append(toIndentedString(accessControlSourceVpcIds)).append("\n");
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
