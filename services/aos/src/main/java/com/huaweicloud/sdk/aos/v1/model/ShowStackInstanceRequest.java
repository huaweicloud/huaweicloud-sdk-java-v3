package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStackInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Client-Request-Id")

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_name")

    private String stackSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_instance_addr")

    private String stackInstanceAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    public ShowStackInstanceRequest withClientRequestId(String clientRequestId) {
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

    public ShowStackInstanceRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * 资源栈集的名称。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackSetName
     */
    public String getStackSetName() {
        return stackSetName;
    }

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    public ShowStackInstanceRequest withStackInstanceAddr(String stackInstanceAddr) {
        this.stackInstanceAddr = stackInstanceAddr;
        return this;
    }

    /**
     * 资源栈实例的唯一地址。该地址由region和stack_domain_id通过\"/\"（转义后为%2f或%2F）拼接而成。该地址在domain_id+region+stack_set_name下唯一。
     * @return stackInstanceAddr
     */
    public String getStackInstanceAddr() {
        return stackInstanceAddr;
    }

    public void setStackInstanceAddr(String stackInstanceAddr) {
        this.stackInstanceAddr = stackInstanceAddr;
    }

    public ShowStackInstanceRequest withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack-set）的唯一ID。  此ID由资源编排服务在生成资源栈集的时候生成，为UUID。  由于资源栈集名称仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，再重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我认为的那个，而不是其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给与的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStackInstanceRequest that = (ShowStackInstanceRequest) obj;
        return Objects.equals(this.clientRequestId, that.clientRequestId)
            && Objects.equals(this.stackSetName, that.stackSetName)
            && Objects.equals(this.stackInstanceAddr, that.stackInstanceAddr)
            && Objects.equals(this.stackSetId, that.stackSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, stackSetName, stackInstanceAddr, stackSetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStackInstanceRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    stackSetName: ").append(toIndentedString(stackSetName)).append("\n");
        sb.append("    stackInstanceAddr: ").append(toIndentedString(stackInstanceAddr)).append("\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
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
