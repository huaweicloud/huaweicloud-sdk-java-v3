package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CancelAutoRenewalResourcesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;

    public CancelAutoRenewalResourcesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID。 您可以调用“查询客户包年/包月资源列表”接口获取资源ID。 设置主资源时会将从资源一起设置，主从关系为： 云主机为主资源，对应的从资源为云硬盘共享带宽的情况下，带宽为主资源，对应的从资源为弹性IP（可能包含多个IP）独享带宽的情况下，弹性IP为主资源，对应的从资源为带宽
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelAutoRenewalResourcesRequest cancelAutoRenewalResourcesRequest = (CancelAutoRenewalResourcesRequest) o;
        return Objects.equals(this.resourceId, cancelAutoRenewalResourcesRequest.resourceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelAutoRenewalResourcesRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

