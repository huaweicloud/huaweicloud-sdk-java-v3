package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UnsubscribeResourcesReq
 */
public class UnsubscribeResourcesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unsubscribe_type")
    
    private Integer unsubscribeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unsubscribe_reason_type")
    
    private Integer unsubscribeReasonType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unsubscribe_reason")
    
    private String unsubscribeReason;

    public UnsubscribeResourcesReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public UnsubscribeResourcesReq addResourceIdsItem(String resourceIdsItem) {
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public UnsubscribeResourcesReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null ){
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 资源ID列表。 最大支持1次性输入10个资源ID，只能输入主资源ID。 哪些资源是主资源请根据“查询客户包年/包月资源列表”接口响应参数中的“is_main_resource”来标识。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    

    public UnsubscribeResourcesReq withUnsubscribeType(Integer unsubscribeType) {
        this.unsubscribeType = unsubscribeType;
        return this;
    }

    


    /**
     * 退订类型，取值如下： 1：退订资源及其已续费周期。2：只退订资源已续费周期，不退订资源。
     * minimum: 1
     * maximum: 2
     * @return unsubscribeType
     */
    public Integer getUnsubscribeType() {
        return unsubscribeType;
    }

    public void setUnsubscribeType(Integer unsubscribeType) {
        this.unsubscribeType = unsubscribeType;
    }

    

    public UnsubscribeResourcesReq withUnsubscribeReasonType(Integer unsubscribeReasonType) {
        this.unsubscribeReasonType = unsubscribeReasonType;
        return this;
    }

    


    /**
     * 退订理由分类，取值如下： 1：产品不好用2：产品功能无法满足需求3：不会操作/操作过于复杂4：对服务不满意5：其他
     * minimum: 1
     * maximum: 5
     * @return unsubscribeReasonType
     */
    public Integer getUnsubscribeReasonType() {
        return unsubscribeReasonType;
    }

    public void setUnsubscribeReasonType(Integer unsubscribeReasonType) {
        this.unsubscribeReasonType = unsubscribeReasonType;
    }

    

    public UnsubscribeResourcesReq withUnsubscribeReason(String unsubscribeReason) {
        this.unsubscribeReason = unsubscribeReason;
        return this;
    }

    


    /**
     * 退订原因，一般由客户输入。
     * @return unsubscribeReason
     */
    public String getUnsubscribeReason() {
        return unsubscribeReason;
    }

    public void setUnsubscribeReason(String unsubscribeReason) {
        this.unsubscribeReason = unsubscribeReason;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnsubscribeResourcesReq unsubscribeResourcesReq = (UnsubscribeResourcesReq) o;
        return Objects.equals(this.resourceIds, unsubscribeResourcesReq.resourceIds) &&
            Objects.equals(this.unsubscribeType, unsubscribeResourcesReq.unsubscribeType) &&
            Objects.equals(this.unsubscribeReasonType, unsubscribeResourcesReq.unsubscribeReasonType) &&
            Objects.equals(this.unsubscribeReason, unsubscribeResourcesReq.unsubscribeReason);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceIds, unsubscribeType, unsubscribeReasonType, unsubscribeReason);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnsubscribeResourcesReq {\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    unsubscribeType: ").append(toIndentedString(unsubscribeType)).append("\n");
        sb.append("    unsubscribeReasonType: ").append(toIndentedString(unsubscribeReasonType)).append("\n");
        sb.append("    unsubscribeReason: ").append(toIndentedString(unsubscribeReason)).append("\n");
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

