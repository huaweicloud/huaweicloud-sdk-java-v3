package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.RelativeResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Entity
 */
public class Entity  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceId")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceName")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloudServiceType")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceType")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceSpecCode")
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specType")
    
    private String specType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specSize")
    
    private BigDecimal specSize = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure")
    
    private Integer measure;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="processedTime")
    
    private String processedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isMainResource")
    
    private Integer isMainResource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mainResources")
    
    private List<RelativeResource> mainResources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subResources")
    
    private List<RelativeResource> subResources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParams")
    
    private String extendParams;

    public Entity withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源Id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Entity withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Entity withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * 云服务类型编码
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public Entity withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Entity withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * 资源规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public Entity withSpecType(String specType) {
        this.specType = specType;
        return this;
    }

    


    /**
     * 规格类型
     * @return specType
     */
    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType;
    }

    public Entity withSpecSize(BigDecimal specSize) {
        this.specSize = specSize;
        return this;
    }

    


    /**
     * 规格属性大小
     * minimum: 0
     * maximum: 2147483647
     * @return specSize
     */
    public BigDecimal getSpecSize() {
        return specSize;
    }

    public void setSpecSize(BigDecimal specSize) {
        this.specSize = specSize;
    }

    public Entity withMeasure(Integer measure) {
        this.measure = measure;
        return this;
    }

    


    /**
     * 规格属性的单位
     * minimum: 0
     * maximum: 2147483647
     * @return measure
     */
    public Integer getMeasure() {
        return measure;
    }

    public void setMeasure(Integer measure) {
        this.measure = measure;
    }

    public Entity withProcessedTime(String processedTime) {
        this.processedTime = processedTime;
        return this;
    }

    


    /**
     * 处理时间
     * @return processedTime
     */
    public String getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(String processedTime) {
        this.processedTime = processedTime;
    }

    public Entity withIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
        return this;
    }

    


    /**
     * 是否主要资源
     * minimum: 0
     * maximum: 2147483647
     * @return isMainResource
     */
    public Integer getIsMainResource() {
        return isMainResource;
    }

    public void setIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
    }

    public Entity withMainResources(List<RelativeResource> mainResources) {
        this.mainResources = mainResources;
        return this;
    }

    
    public Entity addMainResourcesItem(RelativeResource mainResourcesItem) {
        if (this.mainResources == null) {
            this.mainResources = new ArrayList<>();
        }
        this.mainResources.add(mainResourcesItem);
        return this;
    }

    public Entity withMainResources(Consumer<List<RelativeResource>> mainResourcesSetter) {
        if(this.mainResources == null ){
            this.mainResources = new ArrayList<>();
        }
        mainResourcesSetter.accept(this.mainResources);
        return this;
    }

    /**
     * 主要资源列表
     * @return mainResources
     */
    public List<RelativeResource> getMainResources() {
        return mainResources;
    }

    public void setMainResources(List<RelativeResource> mainResources) {
        this.mainResources = mainResources;
    }

    public Entity withSubResources(List<RelativeResource> subResources) {
        this.subResources = subResources;
        return this;
    }

    
    public Entity addSubResourcesItem(RelativeResource subResourcesItem) {
        if (this.subResources == null) {
            this.subResources = new ArrayList<>();
        }
        this.subResources.add(subResourcesItem);
        return this;
    }

    public Entity withSubResources(Consumer<List<RelativeResource>> subResourcesSetter) {
        if(this.subResources == null ){
            this.subResources = new ArrayList<>();
        }
        subResourcesSetter.accept(this.subResources);
        return this;
    }

    /**
     * 子资源列表
     * @return subResources
     */
    public List<RelativeResource> getSubResources() {
        return subResources;
    }

    public void setSubResources(List<RelativeResource> subResources) {
        this.subResources = subResources;
    }

    public Entity withExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    


    /**
     * 扩展参数
     * @return extendParams
     */
    public String getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(String extendParams) {
        this.extendParams = extendParams;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entity entity = (Entity) o;
        return Objects.equals(this.resourceId, entity.resourceId) &&
            Objects.equals(this.resourceName, entity.resourceName) &&
            Objects.equals(this.cloudServiceType, entity.cloudServiceType) &&
            Objects.equals(this.resourceType, entity.resourceType) &&
            Objects.equals(this.resourceSpecCode, entity.resourceSpecCode) &&
            Objects.equals(this.specType, entity.specType) &&
            Objects.equals(this.specSize, entity.specSize) &&
            Objects.equals(this.measure, entity.measure) &&
            Objects.equals(this.processedTime, entity.processedTime) &&
            Objects.equals(this.isMainResource, entity.isMainResource) &&
            Objects.equals(this.mainResources, entity.mainResources) &&
            Objects.equals(this.subResources, entity.subResources) &&
            Objects.equals(this.extendParams, entity.extendParams);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceName, cloudServiceType, resourceType, resourceSpecCode, specType, specSize, measure, processedTime, isMainResource, mainResources, subResources, extendParams);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entity {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    specSize: ").append(toIndentedString(specSize)).append("\n");
        sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
        sb.append("    processedTime: ").append(toIndentedString(processedTime)).append("\n");
        sb.append("    isMainResource: ").append(toIndentedString(isMainResource)).append("\n");
        sb.append("    mainResources: ").append(toIndentedString(mainResources)).append("\n");
        sb.append("    subResources: ").append(toIndentedString(subResources)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
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

