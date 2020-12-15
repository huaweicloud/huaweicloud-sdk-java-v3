package com.huaweicloud.sdk.cce.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.ResourceRequirements;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PersistentVolumeClaimSpec
 */
public class PersistentVolumeClaimSpec  {

    /**
     * Gets or Sets accessModes
     */
    public static final class AccessModesEnum {

        
        /**
         * Enum READONLYMANY for value: "ReadOnlyMany"
         */
        public static final AccessModesEnum READONLYMANY = new AccessModesEnum("ReadOnlyMany");
        
        /**
         * Enum READWRITEMANY for value: "ReadWriteMany"
         */
        public static final AccessModesEnum READWRITEMANY = new AccessModesEnum("ReadWriteMany");
        

        private static final Map<String, AccessModesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModesEnum> createStaticFields() {
            Map<String, AccessModesEnum> map = new HashMap<>();
            map.put("ReadOnlyMany", READONLYMANY);
            map.put("ReadWriteMany", READWRITEMANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModesEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AccessModesEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AccessModesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessModesEnum(value);
            }
            return result;
        }

        public static AccessModesEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AccessModesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AccessModesEnum) {
                return this.value.equals(((AccessModesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessModes")
    
    private List<AccessModesEnum> accessModes = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private ResourceRequirements resources = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storageClassName")
    
    private String storageClassName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storageType")
    
    private String storageType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeID")
    
    private String volumeID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeMode")
    
    private String volumeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeName")
    
    private String volumeName;

    public PersistentVolumeClaimSpec withAccessModes(List<AccessModesEnum> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    
    public PersistentVolumeClaimSpec addAccessModesItem(AccessModesEnum accessModesItem) {
        this.accessModes.add(accessModesItem);
        return this;
    }

    public PersistentVolumeClaimSpec withAccessModes(Consumer<List<AccessModesEnum>> accessModesSetter) {
        if(this.accessModes == null ){
            this.accessModes = new ArrayList<>();
        }
        accessModesSetter.accept(this.accessModes);
        return this;
    }

    /**
     * 指定volume应该具有的访问模式，列表中仅第一个配置参数有效。 - ReadWriteOnce：该卷可以被单个节点以读/写模式挂载   >集群版本为v1.13.10且storage-driver版本为1.0.19时，才支持此功能。 - ReadOnlyMany：该卷可以被多个节点以只读模式挂载（默认） - ReadWriteMany：该卷可以被多个节点以读/写模式挂载
     * @return accessModes
     */
    public List<AccessModesEnum> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(List<AccessModesEnum> accessModes) {
        this.accessModes = accessModes;
    }

    public PersistentVolumeClaimSpec withResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public PersistentVolumeClaimSpec withResources(Consumer<ResourceRequirements> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ResourceRequirements();
            resourcesSetter.accept(this.resources);
        }
        
        return this;
    }


    /**
     * Get resources
     * @return resources
     */
    public ResourceRequirements getResources() {
        return resources;
    }

    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    public PersistentVolumeClaimSpec withStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    


    /**
     * PVC的StorageClass名称
     * @return storageClassName
     */
    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public PersistentVolumeClaimSpec withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    


    /**
     * 云存储的类型，和volumeID搭配使用。即volumeID和storageType必须同时被配置。  - bs：EVS云存储，详情可参见[使用云硬盘存储卷](https://support.huaweicloud.com/usermanual-cce/cce_01_0044.html) 。 - nfs：SFS弹性文件存储，详情可参见[使用文件存储卷](https://support.huaweicloud.com/usermanual-cce/cce_01_0111.html) 。 - obs：OBS对象存储，详情可参见[使用对象存储卷](https://support.huaweicloud.com/usermanual-cce/cce_01_0160.html) 。 - efs：SFS Turbo极速文件存储，详情可参见[使用极速文件存储卷](https://support.huaweicloud.com/usermanual-cce/cce_01_0125.html)。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public PersistentVolumeClaimSpec withVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

    


    /**
     * 资源需为已经存在的存储资源 - 如果存储资源类型是SFS、EVS、SFS-Turbo，本参数需要填入对应资源的ID - 如果资源类型为OBS，本参数填入OBS名称
     * @return volumeID
     */
    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(String volumeID) {
        this.volumeID = volumeID;
    }

    public PersistentVolumeClaimSpec withVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
        return this;
    }

    


    /**
     * PVC指定的PV类型
     * @return volumeMode
     */
    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

    public PersistentVolumeClaimSpec withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    


    /**
     * PVC绑定的PV名称
     * @return volumeName
     */
    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistentVolumeClaimSpec persistentVolumeClaimSpec = (PersistentVolumeClaimSpec) o;
        return Objects.equals(this.accessModes, persistentVolumeClaimSpec.accessModes) &&
            Objects.equals(this.resources, persistentVolumeClaimSpec.resources) &&
            Objects.equals(this.storageClassName, persistentVolumeClaimSpec.storageClassName) &&
            Objects.equals(this.storageType, persistentVolumeClaimSpec.storageType) &&
            Objects.equals(this.volumeID, persistentVolumeClaimSpec.volumeID) &&
            Objects.equals(this.volumeMode, persistentVolumeClaimSpec.volumeMode) &&
            Objects.equals(this.volumeName, persistentVolumeClaimSpec.volumeName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accessModes, resources, storageClassName, storageType, volumeID, volumeMode, volumeName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentVolumeClaimSpec {\n");
        sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
        sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
        sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

