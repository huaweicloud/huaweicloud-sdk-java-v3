package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TenantInfoReq
 */
public class TenantInfoReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<Resource> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effect")
    
    private Integer effect;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scene")
    
    private String scene;

    public TenantInfoReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 租户状态。 - 0：解冻正常； - 1：冻结； - 2：删除/终止 
     * minimum: 0
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TenantInfoReq withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    
    public TenantInfoReq addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public TenantInfoReq withResources(Consumer<List<Resource>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源类型
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public TenantInfoReq withEffect(Integer effect) {
        this.effect = effect;
        return this;
    }

    


    /**
     * 云服务根据该字段，实现相应的效果。 - 1:冻结可释放； - 2：冻结不可释放； - 3：冻结后不可续费；  默认值：1 
     * minimum: 0
     * maximum: 2147483647
     * @return effect
     */
    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }

    public TenantInfoReq withScene(String scene) {
        this.scene = scene;
        return this;
    }

    


    /**
     * 云服务状态的业务场景。只作为场景描述，CBC不使用这个字段去控制云服务操作。 - ARREAR：欠费 - POLICE：公安冻结 - ILLEGAL：违规冻结 - VERIFY：客户未实名认证 - PARTNER：合作伙伴冻结  默认值：ARREAR 
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantInfoReq tenantInfoReq = (TenantInfoReq) o;
        return Objects.equals(this.status, tenantInfoReq.status) &&
            Objects.equals(this.resources, tenantInfoReq.resources) &&
            Objects.equals(this.effect, tenantInfoReq.effect) &&
            Objects.equals(this.scene, tenantInfoReq.scene);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, resources, effect, scene);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantInfoReq {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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

