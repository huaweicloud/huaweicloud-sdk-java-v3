package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PeriodToOnDemandReq
 */
public class PeriodToOnDemandReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private String operation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    private List<String> resourceIds = null;
    
    public PeriodToOnDemandReq withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * |参数名称：动作| |参数约束及描述：动作 动作SET_UP：设置CANCEL：取消|
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    

    public PeriodToOnDemandReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public PeriodToOnDemandReq addResourceIdsItem(String resourceIdsItem) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public PeriodToOnDemandReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * |参数名称：资源ID| |参数约束以及描述：资源ID 资源ID。您可以调用“2.1-查询客户包年/包月资源列表”接口获取资源ID。只支持传入主资源ID，最多100个资源ID。设置的时候，主资源和对应的子资源一起转按需。哪些资源是主资源请根据“2.1-查询客户包年/包月资源列表”接口响应参数中的“is_main_resource”来标识。|
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeriodToOnDemandReq periodToOnDemandReq = (PeriodToOnDemandReq) o;
        return Objects.equals(this.operation, periodToOnDemandReq.operation) &&
            Objects.equals(this.resourceIds, periodToOnDemandReq.resourceIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(operation, resourceIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodToOnDemandReq {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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

