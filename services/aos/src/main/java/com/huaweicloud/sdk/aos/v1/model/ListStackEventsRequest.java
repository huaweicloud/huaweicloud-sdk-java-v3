package com.huaweicloud.sdk.aos.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListStackEventsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Client-Request-Id")
    

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deployment_id")
    

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="filter")
    

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="field")
    

    private String field;

    public ListStackEventsRequest withClientRequestId(String clientRequestId) {
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

    

    public ListStackEventsRequest withStackName(String stackName) {
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

    

    public ListStackEventsRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 资源栈（stack）的唯一Id。  此Id由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给与的stack_id和当前资源栈的ID不一致，则返回400
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public ListStackEventsRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    


    /**
     * 标识部署的唯一Id，此Id由资源编排服务在触发部署、回滚等操作时生成，为UUID。
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    

    public ListStackEventsRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    


    /**
     * 过滤条件  * 与（AND）运算符使用逗号（，）定义 * 或（OR）运算符使用竖线（|）定义，OR运算符优先级高于AND运算符 * 不支持括号 * 过滤运算符仅支持等号（==） * 过滤参数名及其值仅支持包含大小写英文、数字和下划线 * 过滤条件中禁止使用分号，若有分号，则此条过滤会被忽略 * 一个过滤参数仅能与一个与条件相关，一个与条件中的多个或条件仅能与一个过滤参数相关
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    

    public ListStackEventsRequest withField(String field) {
        this.field = field;
        return this;
    }

    


    /**
     * 选择的属性名称  * 属性名仅支持包含大小写英文、数字和下划线 * 多个属性名称之间以逗号（，）分隔
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStackEventsRequest listStackEventsRequest = (ListStackEventsRequest) o;
        return Objects.equals(this.clientRequestId, listStackEventsRequest.clientRequestId) &&
            Objects.equals(this.stackName, listStackEventsRequest.stackName) &&
            Objects.equals(this.stackId, listStackEventsRequest.stackId) &&
            Objects.equals(this.deploymentId, listStackEventsRequest.deploymentId) &&
            Objects.equals(this.filter, listStackEventsRequest.filter) &&
            Objects.equals(this.field, listStackEventsRequest.field);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, stackName, stackId, deploymentId, filter, field);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackEventsRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

