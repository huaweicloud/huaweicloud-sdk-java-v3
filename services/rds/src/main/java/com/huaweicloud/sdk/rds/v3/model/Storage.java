package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例磁盘类型信息。
 */
public class Storage  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_status")
    
    private Map<String, String> azStatus = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="support_compute_group_type")
    
    private List<String> supportComputeGroupType = null;
    
    public Storage withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 磁盘类型名称，可能取值如下： - ULTRAHIGH，表示SSD。 - ULTRAHIGHPRO，表示SSD尊享版，仅支持超高性能型尊享版实例。 - NVMESSD，表示直通SSD，仅支持i3规格实例。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Storage withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    

    public Storage putAzStatusItem(String key, String azStatusItem) {
        if(this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public Storage withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if(this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }
    /**
     * 其中key是可用区编号，value是规格所在az的状态，包含以下状态： - normal，在售。 - unsupported，暂不支持该规格。 - sellout，售罄。
     * @return azStatus
     */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    

    public Storage withSupportComputeGroupType(List<String> supportComputeGroupType) {
        this.supportComputeGroupType = supportComputeGroupType;
        return this;
    }

    
    public Storage addSupportComputeGroupTypeItem(String supportComputeGroupTypeItem) {
        if(this.supportComputeGroupType == null) {
            this.supportComputeGroupType = new ArrayList<>();
        }
        this.supportComputeGroupType.add(supportComputeGroupTypeItem);
        return this;
    }

    public Storage withSupportComputeGroupType(Consumer<List<String>> supportComputeGroupTypeSetter) {
        if(this.supportComputeGroupType == null) {
            this.supportComputeGroupType = new ArrayList<>();
        }
        supportComputeGroupTypeSetter.accept(this.supportComputeGroupType);
        return this;
    }

    /**
     * 性能规格，包含以下状态： - normal：通用增强型。 - normal2：通用增强Ⅱ型。 - armFlavors：鲲鹏通用增强型。 - dedicicatenormal ：x86独享型。 - armlocalssd：鲲鹏通用型。 - normallocalssd：x86通用型。 - general：通用型。 - dedicated：独享型，仅云盘SSD支持。 - rapid：独享型，仅极速型SSD支持。
     * @return supportComputeGroupType
     */
    public List<String> getSupportComputeGroupType() {
        return supportComputeGroupType;
    }

    public void setSupportComputeGroupType(List<String> supportComputeGroupType) {
        this.supportComputeGroupType = supportComputeGroupType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Storage storage = (Storage) o;
        return Objects.equals(this.name, storage.name) &&
            Objects.equals(this.azStatus, storage.azStatus) &&
            Objects.equals(this.supportComputeGroupType, storage.supportComputeGroupType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, azStatus, supportComputeGroupType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Storage {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    supportComputeGroupType: ").append(toIndentedString(supportComputeGroupType)).append("\n");
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

