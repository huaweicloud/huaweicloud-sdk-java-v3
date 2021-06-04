package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 条件中设备状态类型的信息，自定义结构。
 */
public class DeviceStatusCondition  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_list")
    
    private List<String> statusList = null;
    
    public DeviceStatusCondition withStatusList(List<String> statusList) {
        this.statusList = statusList;
        return this;
    }

    
    public DeviceStatusCondition addStatusListItem(String statusListItem) {
        if(this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public DeviceStatusCondition withStatusList(Consumer<List<String>> statusListSetter) {
        if(this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * **参数说明**：状态列表，设备状态条件携带该参数。
     * @return statusList
     */
    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceStatusCondition deviceStatusCondition = (DeviceStatusCondition) o;
        return Objects.equals(this.statusList, deviceStatusCondition.statusList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(statusList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceStatusCondition {\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
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

