package com.huaweicloud.sdk.das.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.das.v3.model.DbObjectSpaceInfo;
import com.huaweicloud.sdk.das.v3.model.InstanceSpaceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSpaceAnalysisResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Long total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_objects")
    
    private List<DbObjectSpaceInfo> dbObjects = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_info")
    
    private InstanceSpaceInfo instanceInfo;

    public ListSpaceAnalysisResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    


    /**
     * 记录总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    

    public ListSpaceAnalysisResponse withDbObjects(List<DbObjectSpaceInfo> dbObjects) {
        this.dbObjects = dbObjects;
        return this;
    }

    
    public ListSpaceAnalysisResponse addDbObjectsItem(DbObjectSpaceInfo dbObjectsItem) {
        if(this.dbObjects == null) {
            this.dbObjects = new ArrayList<>();
        }
        this.dbObjects.add(dbObjectsItem);
        return this;
    }

    public ListSpaceAnalysisResponse withDbObjects(Consumer<List<DbObjectSpaceInfo>> dbObjectsSetter) {
        if(this.dbObjects == null) {
            this.dbObjects = new ArrayList<>();
        }
        dbObjectsSetter.accept(this.dbObjects);
        return this;
    }

    /**
     * 数据库对象列表
     * @return dbObjects
     */
    public List<DbObjectSpaceInfo> getDbObjects() {
        return dbObjects;
    }

    public void setDbObjects(List<DbObjectSpaceInfo> dbObjects) {
        this.dbObjects = dbObjects;
    }

    

    public ListSpaceAnalysisResponse withInstanceInfo(InstanceSpaceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public ListSpaceAnalysisResponse withInstanceInfo(Consumer<InstanceSpaceInfo> instanceInfoSetter) {
        if(this.instanceInfo == null ){
            this.instanceInfo = new InstanceSpaceInfo();
            instanceInfoSetter.accept(this.instanceInfo);
        }
        
        return this;
    }


    /**
     * Get instanceInfo
     * @return instanceInfo
     */
    public InstanceSpaceInfo getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(InstanceSpaceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSpaceAnalysisResponse listSpaceAnalysisResponse = (ListSpaceAnalysisResponse) o;
        return Objects.equals(this.total, listSpaceAnalysisResponse.total) &&
            Objects.equals(this.dbObjects, listSpaceAnalysisResponse.dbObjects) &&
            Objects.equals(this.instanceInfo, listSpaceAnalysisResponse.instanceInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, dbObjects, instanceInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpaceAnalysisResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    dbObjects: ").append(toIndentedString(dbObjects)).append("\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
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

